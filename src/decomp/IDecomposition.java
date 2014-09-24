package decomp;

import map.LessonKey;
import map.LessonValue;

public interface IDecomposition {
	/**
	 * ������� ���������� ��� ���� �� ������ lessonKey.
	 * 
	 * @param lessonKey
	 *            ����, �� ������� ����.
	 * @return ���������� ��� ����.
	 * @see LessonValue
	 */
	public LessonValue get(LessonKey lessonKey);

	/**
	 * ���� ���������� ��� ���� �� ������. ���� ����� ���� ����, �� ������
	 * �������� �� ��������, � ����� �������, ������ ������� null.
	 * 
	 * @param lessonKey
	 *            ���� ��� ����.
	 * @param lessonValue
	 *            ���������� ��� ����.
	 * @return null, ���� ������ ����� �� ����, ������ ����� ��������, �� ����.
	 */
	public LessonValue put(LessonKey lessonKey, LessonValue lessonValue);

	/**
	 * ������� ������� ����� �����.
	 * 
	 * @return ������� ����� �����.
	 */
	public int getCountOfWeek();

	/**
	 * ������� ������� ��� � ������� � ������� numberOfWeek.
	 * 
	 * @param numberOfWeek
	 *            ����� �����.
	 * @return ������� ��� � ������� � ������� numberOfWeek.
	 */
	public int getCountOfDays(int numberOfWeek);

	/**
	 * ������� ������� ��� � ���� � ������� numberOfDays � ������� � �������
	 * numberOfWeek.
	 * 
	 * @param numberOfWeek
	 *            ����� �����.
	 * @param numberOfDays
	 *            ����� ���.
	 * @return ������� ��� � ���� � ������� numberOfDays � ������� � �������
	 *         numberOfWeek.
	 */
	public int getCountOfLesson(int numberOfWeek, int numberOfDays);

	public void clear();

}
