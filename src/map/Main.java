package map;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<LessonKey, LessonValue> map = new HashMap<LessonKey, LessonValue>();
		map.put(new LessonKey(Schedule.FIRST_WEEK, Schedule.TUESDAY, 3),
				new LessonValue("омм та са", "", "", "18"));
		map.put(new LessonKey(0, Calendar.TUESDAY, 4), new LessonValue("c#",
				"", "", "19"));

		System.out.println(map);

		LessonKey s = new LessonKey(0, Calendar.TUESDAY, 4);
		System.out.println(map.get(s));
	}

}
