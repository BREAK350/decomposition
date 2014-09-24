package decomp;

import map.LessonKey;
import map.LessonValue;

public interface IDecomposition {
	/**
	 * Повертає інформацію про пару за ключем lessonKey.
	 * 
	 * @param lessonKey
	 *            ключ, що визначає пару.
	 * @return інформацію про пару.
	 * @see LessonValue
	 */
	public LessonValue get(LessonKey lessonKey);

	/**
	 * Додає інформацію про пару за ключем. Якщо такий ключ існує, то заміняє
	 * значення на передане, а старе повертає, інакше повертає null.
	 * 
	 * @param lessonKey
	 *            ключ про пару.
	 * @param lessonValue
	 *            інформація про пару.
	 * @return null, якщо такого ключа не було, інакше старе значення, що було.
	 */
	public LessonValue put(LessonKey lessonKey, LessonValue lessonValue);

	/**
	 * Повертає кількість різних тижнів.
	 * 
	 * @return кількість різних тижнів.
	 */
	public int getCountOfWeek();

	/**
	 * Повертає кількість днів в тиждень з номером numberOfWeek.
	 * 
	 * @param numberOfWeek
	 *            номер тижня.
	 * @return кількість днів в тиждень з номером numberOfWeek.
	 */
	public int getCountOfDays(int numberOfWeek);

	/**
	 * Повертає кількість пар в день з номером numberOfDays в тиждень з номером
	 * numberOfWeek.
	 * 
	 * @param numberOfWeek
	 *            номер тижня.
	 * @param numberOfDays
	 *            номер дня.
	 * @return кількість пар в день з номером numberOfDays в тиждень з номером
	 *         numberOfWeek.
	 */
	public int getCountOfLesson(int numberOfWeek, int numberOfDays);

	public void clear();

}
