package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class department implements Comparable<department>, IResultArrivedListener{
	
	private List<Student> students= new ArrayList<>();
	public void addStudent(Student student) {
		this.students.add(student);
	
	}
	public void printStudents() {
		students.parallelStream()
		.forEach(
				s->System.out.println(
						s.getRollnumber()));
		/*for(Student s:students) {
			System.out.println(s.getRollnumber()); for one cpu core only and it will
			 print in sequence order but above will print in random manner
		}*/
	}
	public final int id;
	public department(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return ((department)obj)
					.getId()==id;
			}
		return false;
	}
	
	@Override
	public int compareTo(department d) {
		return d.getId()-id;
	}
	@Override
	public void resultDeclared() {
		//sequential	
//		for(Student s : students) {
//			s.resultDeclared();
//		}
		
		//parallel
		students.parallelStream().forEach(
				s -> s.resultDeclared());
	}

}