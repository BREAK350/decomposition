package matchs;

public class LessonsPeriod {
	public enum What {
		ERROR, // помилка.
		BEFORE_LESSON, // період перед першою парою.
		LESSON, // період під час пари.
		BETWEEN_LESSON, // період між парами (перерва).
		AFTER_LESSON // період після пар.
	}

	private What what;
	private int number;

	public LessonsPeriod() {
		super();
		what = What.ERROR;
		number = 0;
	}

	public LessonsPeriod(What what, int number) {
		super();
		setWhat(what);
		setNumber(number);
	}

	public What getWhat() {
		return what;
	}

	public void setWhat(What what) {
		this.what = what;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = (number > 0) ? (number) : (0);
	}

	@Override
	public String toString() {
		return "LessonsPeriod [what=" + what + ", number=" + number + "]";
	}

	public String getFormally() {
		return what + " " + (number + 1);
	}

}
