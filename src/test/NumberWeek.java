package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NumberWeek {
	private int firstWeek = 0;

	public NumberWeek(int firstWeek) {
		this.firstWeek = firstWeek;
	}

	/**
	 * Задайте дату першого тижня.
	 * 
	 * @param year
	 *            from 2000 to ...
	 * @param month
	 *            from 1 to 12
	 * @param day
	 *            from 1 to 28 - 31
	 */
	public NumberWeek(int year, int month, int day) {
		GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
		firstWeek = gc.get(Calendar.WEEK_OF_YEAR);
	}

	public NumberWeek(Calendar calendar) {

	}

	public int getFirstWeek() {
		return firstWeek;
	}

	public int getNumberWeek(int week) {
		return (week - firstWeek) % 2;
	}

	public int getNumberWeek(int year, int month, int day) {
		GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
		return getNumberWeek(gc.get(Calendar.WEEK_OF_YEAR));
	}

	public int getNumberWeekFromNow() {
		Calendar cl = Calendar.getInstance();
		return getNumberWeek(cl.get(Calendar.WEEK_OF_YEAR));
	}

}
