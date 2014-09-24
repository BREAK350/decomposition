package test;

import java.util.Calendar;

import matchs.Lessons;
import matchs.Time;

public class Main {

	public Main() {
		Calendar calendar = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.set(2014, Calendar.SEPTEMBER, 23, 14, 50);
		
		System.out.println(calendar);
		System.out.println(c2.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY);
		System.out.println(calendar.compareTo(c2));

		/*
		 * Lessons lessons = new Lessons(); lessons.setBegins(new Time[] { new
		 * Time(8, 20), new Time(9, 50), new Time(11, 30), new Time(13, 0), new
		 * Time(14, 40) }); lessons.setLength(new Time(1, 20));
		 * 
		 * System.out.println(lessons); Time time = new Time(calendar);
		 * System.out.println("in " + time + ": " +
		 * lessons.getNumberOfLesson(time).getFormally());
		 * 
		 * System.out.println(lessons.getDetailOfLessons());
		 */

	}

	public static void main(String[] args) {
		new Main();
	}

}
