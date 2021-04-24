package test;

public class Student {

	int id;
	String namea;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamea() {
		return namea;
	}

	public void setNamea(String namea) {
		this.namea = namea;
	}

	public Student(int id, String namea) {
		super();
		this.id = id;
		this.namea = namea;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", namea=" + namea + "]";
	}

}
