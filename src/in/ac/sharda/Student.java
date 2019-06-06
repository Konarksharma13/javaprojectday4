package in.ac.sharda;

public class Student implements IResultArrivedListener {
	
	public final int rollnumber;
	private final String name;
	private String email;
	
	public Student(int rn,String n) {
		this.rollnumber=rn;
		this.name=n;
	}
	public Student(int rn,String n,String em) {
		this.rollnumber=rn;
		this.name=n;
		this.email=em;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
		
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return ((Student)obj)
					.getRollnumber()==rollnumber;
		}
		return false;
	}
	public void attendance() {
		System.out.println("Attendance Present");
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	
	@Override
	public void resultDeclared() {
		System.out.println("Result is out------Go check it!!"+name);
	}
}
