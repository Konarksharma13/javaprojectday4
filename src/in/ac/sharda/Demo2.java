package in.ac.sharda;

public class Demo2 {

	public static void main(String[] args) {
		IResultArrivedListener iral = new Student(1,"konark");
		iral.resultDeclared();
		iral = new department(1);
		iral.resultDeclared();
	}
}
