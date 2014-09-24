package map;

public class LessonKey {
	private int numberOfWeek;
	private int numberOfDay; // Calendar.someOfDay
	private int numberOfLesson;

	public LessonKey() {
		super();
	}

	public LessonKey(int numberOfWeek, int numberOfDay, int numberOfLesson) {
		super();
		this.numberOfWeek = numberOfWeek;
		this.numberOfDay = numberOfDay;
		this.numberOfLesson = numberOfLesson;
	}

	public int getNumberOfWeek() {
		return numberOfWeek;
	}

	public void setNumberOfWeek(int numberOfWeek) {
		this.numberOfWeek = numberOfWeek;
	}

	public int getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(int numberOfDay) {
		this.numberOfDay = numberOfDay;
	}

	public int getNumberOfLesson() {
		return numberOfLesson;
	}

	public void setNumberOfLesson(int numberOfLesson) {
		this.numberOfLesson = numberOfLesson;
	}

	@Override
	public String toString() {
		return "LessonKey [numberOfWeek=" + numberOfWeek + ", numberOfDay="
				+ numberOfDay + ", numberOfLesson=" + numberOfLesson + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfDay;
		result = prime * result + numberOfLesson;
		result = prime * result + numberOfWeek;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LessonKey other = (LessonKey) obj;
		if (numberOfDay != other.numberOfDay)
			return false;
		if (numberOfLesson != other.numberOfLesson)
			return false;
		if (numberOfWeek != other.numberOfWeek)
			return false;
		return true;
	}

}
