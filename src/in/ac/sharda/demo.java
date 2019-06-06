package in.ac.sharda;

public class demo {

	public static void main(String[] args) {
		Student s= new Student(1,"konark");
		System.out.println(s.getRollnumber());
		System.out.println(s.getName());
		Student s2= new Student(6,"kapil","kapilsharma@gmail.com");
		System.out.println(s2.getRollnumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
	
	}

}
