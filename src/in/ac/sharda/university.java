package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class university {

	private Set<department> departments = new TreeSet<>();
	
	public boolean addDepartment(department d) {
		return departments.add(d);
	}
	
	public void printDepartment() {
		departments.parallelStream()
		.forEach(
				d->System.out.println(
						d.getId()));
	
	}

	public void resultDeclared() {
	//	for(department d : departments) {
		//	d.resultDeclared();
	//	}
		
		departments.parallelStream().forEach(
				d -> d.resultDeclared());
	}

}

