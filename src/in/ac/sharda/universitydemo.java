package in.ac.sharda;

public class universitydemo {

	public static void main(String[] args) {
		university u= new university();
		for(int i=1;i<5;i++) {
			department d =new department(i);
			boolean added = u.addDepartment(d); 
		if(added) {
			System.out.println("Department added");
			for(int j=1;j<5;j++) {
				d.addStudent(new Student(i, "name"+i+j));
			}
		}
		else {
			System.out.println("Not added");
		}
	}
	u.printDepartment();
	u.resultDeclared();
	}
}