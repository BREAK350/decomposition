package map;

public class LessonValue {
	private String name;
	private String type;
	private String teacher;
	private String auditory;

	public LessonValue() {
		super();
	}

	public LessonValue(String name, String type, String teacher, String auditory) {
		super();
		this.name = name;
		this.type = type;
		this.teacher = teacher;
		this.auditory = auditory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getAuditory() {
		return auditory;
	}

	public void setAuditory(String auditory) {
		this.auditory = auditory;
	}

	@Override
	public String toString() {
		return "LessonValue [name=" + name + ", type=" + type + ", teacher="
				+ teacher + ", auditory=" + auditory + "]";
	}

}
