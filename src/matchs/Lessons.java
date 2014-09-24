package matchs;

import java.util.Arrays;

public class Lessons implements ILessons {
	private Time[] begins = null;
	private Time length = new Time(0);

	public Lessons() {
		super();
	}

	public Lessons(Time[] begins, Time length) {
		super();
		setBegins(begins);
		this.length = length;
	}

	public Time[] getBegins() {
		return begins;
	}

	public void setBegins(Time[] begin) {
		if (begin != null && begin.length > 0) {
			this.begins = begin;
			Arrays.sort(this.begins);
		} else {
			this.begins = null;
		}
	}

	public Time getLength() {
		return length;
	}

	public void setLength(Time length) {
		this.length = length;
	}

	@Override
	public LessonsPeriod getNumberOfLesson(Time timeOfDay) {
		LessonsPeriod period = new LessonsPeriod();
		if (begins != null) {
			int i = 0;
			while (i < begins.length
					&& timeOfDay.getMinutes() >= begins[i].getMinutes()) {
				i++;
			}
			if (i == begins.length) {
				period.setNumber(i - 1);
				if (timeOfDay.getMinutes() < begins[i - 1].getMinutes()
						+ length.getMinutes()) {
					period.setWhat(LessonsPeriod.What.LESSON);
				} else {
					period.setWhat(LessonsPeriod.What.AFTER_LESSON);
				}
			} else {
				if (i == 0) {
					period.setNumber(0);
					if (timeOfDay == begins[0]) {
						period.setWhat(LessonsPeriod.What.LESSON);
					} else {
						period.setWhat(LessonsPeriod.What.BEFORE_LESSON);
					}
				} else {
					i--;
					period.setNumber(i);
					if (timeOfDay.getMinutes() < begins[i].getMinutes()
							+ length.getMinutes()) {
						period.setWhat(LessonsPeriod.What.LESSON);
					} else {
						period.setWhat(LessonsPeriod.What.BETWEEN_LESSON);
					}
				}
			}
		}
		return period;
	}

	@Override
	public String toString() {
		return "Lessons [begins=" + Arrays.toString(begins) + ", length="
				+ length + "]";
	}

	public String getDetailOfLessons() {
		String dt = null;
		if (begins.length == 0) {
			dt = "Unknown";
		} else {
			dt = "[";
			int i = 0;
			for (i = 0; i < begins.length - 1; i++) {
				dt += begins[i] + " - " + begins[i].add(length) + ", ";
			}
			dt += begins[i] + " - " + begins[i].add(length) + "]";
		}
		return dt;
	}
}
