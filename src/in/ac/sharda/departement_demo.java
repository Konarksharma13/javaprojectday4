package in.ac.sharda;

public class departement_demo {

	public static void main(String[] args) {
		department d= new department(0);
		for(int i=1;i<5;i++) {
		d.addStudent(new Student(i,"Konark"+i));
		}
	d.printStudents();
	}
}
