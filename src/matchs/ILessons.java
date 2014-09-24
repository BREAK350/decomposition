package matchs;

public interface ILessons {
	/**
	 * Визначає номер пари (від 0) в заданий час timeOfDay, або перерву.
	 * 
	 * @param timeOfDay
	 *            час в секундах від 00:00.
	 * @return номер пари або перерви
	 */
	public LessonsPeriod getNumberOfLesson(Time timeOfDay);
}
