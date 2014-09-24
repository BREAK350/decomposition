package matchs;

public interface ILessons {
	/**
	 * ������� ����� ���� (�� 0) � ������� ��� timeOfDay, ��� �������.
	 * 
	 * @param timeOfDay
	 *            ��� � �������� �� 00:00.
	 * @return ����� ���� ��� �������
	 */
	public LessonsPeriod getNumberOfLesson(Time timeOfDay);
}
