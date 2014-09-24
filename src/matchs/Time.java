package matchs;

import java.util.Calendar;

public class Time implements Comparable<Time> {
	public final static int HOUR_OF_DAY = 24;
	public final static int MINUTE_OF_HOUR = 60;
	public final static int MINUTE_OF_DAY = HOUR_OF_DAY * MINUTE_OF_HOUR;

	private int minutes = 0;

	public Time() {
		super();
	}

	public Time(int minutes) {
		super();
		setMinutes(minutes);
	}

	public Time(int hour, int minute) {
		super();
		setTime(hour, minute);
	}

	public Time(Calendar calendar) {
		this(calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = getCorrectMinutes(minutes);
	}

	public void setTime(int hour, int minute) {
		this.minutes = toMinutes(hour, minute);
	}

	public static int toMinutes(int hour, int minute) {
		int ch = getCorrectHour(hour);
		int cm = getCorrectMinute(minute);
		return ch * MINUTE_OF_HOUR + cm;
	}

	public static int getCorrectHour(int hour) {
		return getcorrectWithPeriod(hour, HOUR_OF_DAY);
	}

	public static int getCorrectMinute(int minute) {
		return getcorrectWithPeriod(minute, MINUTE_OF_HOUR);
	}

	public static int getCorrectMinutes(int minutes) {
		return getcorrectWithPeriod(minutes, MINUTE_OF_DAY);
	}

	public static int getcorrectWithPeriod(int value, int period) {
		int v = value % period;
		return (value >= 0) ? (v) : (-v);
	}

	public int getHour() {
		return minutes / MINUTE_OF_HOUR;
	}

	public int getMinute() {
		return minutes % MINUTE_OF_HOUR;
	}

	public Time add(Time time) {
		return new Time(minutes + time.minutes);
	}

	public Time add(int hour, int minute) {
		return add(new Time(hour, minute));
	}

	@Override
	public String toString() {
		int h = getHour();
		int m = getMinute();
		return (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m);
	}

	@Override
	public int compareTo(Time o) {
		return minutes - o.minutes;
	}

}
