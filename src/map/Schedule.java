package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Schedule {
	public final static int FIRST_WEEK = 0;
	public final static int SECOND_WEEK = 1;
	public final static int MONDAY = Calendar.MONDAY;
	public final static int TUESDAY = Calendar.TUESDAY;
	public final static int WEDNESDAY = Calendar.WEDNESDAY;
	public final static int THURSDAY = Calendar.THURSDAY;
	public final static int FRIDAY = Calendar.FRIDAY;
	public final static int FIRST_LESSON = 0;
	public final static int SECOND_LESSON = 1;
	public final static int THIRD_LESSON = 2;
	public final static int FOURTH_LESSON = 3;
	public final static int FIFTH_LESSON = 4;
	public final static int SIXTH_LESSON = 5;
	public final static int SEVENTH_LESSON = 6;

	private static void exists(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		if (!file.exists()) {
			throw new FileNotFoundException(file.getName());
		}
	}

	private Map<LessonKey, LessonValue> map = new HashMap<LessonKey, LessonValue>();

	public void loadFromFile(String fileName) throws FileNotFoundException {
		map.clear();
		// exists(fileName);
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(
					fileName)));
			try {
				String s = in.readLine();
				if (s != null && s.length() > 0) {
					int countOfWeek = Integer.parseInt(s);
					for (int i = 0; i < countOfWeek; i++) {
						readWeek(i, in);
					}
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void readWeek(int numberOfWeek, BufferedReader in)
			throws NumberFormatException, IOException {
		int countOfDay = Integer.parseInt(in.readLine());
		for (int i = 0; i < countOfDay; i++) {
			readDay(numberOfWeek, in);
		}
	}

	private void readDay(int numberOfWeek, BufferedReader in)
			throws NumberFormatException, IOException {
		int numberOfDay = Integer.parseInt(in.readLine());
		int countOfLesson = Integer.parseInt(in.readLine());
		for (int i = 0; i < countOfLesson; i++) {
			readLesson(numberOfWeek, numberOfDay, in);
		}
	}

	private void readLesson(int numberOfWeek, int numberOfDay, BufferedReader in)
			throws NumberFormatException, IOException {
		LessonKey lessonKey = new LessonKey();
		String lesson = in.readLine();
		String[] fields = lesson.split("\t");
		int numberOfLesson = Integer.parseInt(fields[0]);
		lessonKey.setNumberOfWeek(numberOfWeek);
		lessonKey.setNumberOfDay(numberOfDay);
		lessonKey.setNumberOfLesson(numberOfLesson);

		LessonValue lessonValue = new LessonValue(fields[1], fields[2],
				fields[3], fields[4]);
		map.put(lessonKey, lessonValue);
	}

}
