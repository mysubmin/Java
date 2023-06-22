package j13_최상위클래스;

import java.lang.reflect.Method;

public class ClassMain {

	public static void main(String[] args) {
		Student student = new Student(20230001, "홍길동");
		
		Class c = student.getClass();
		
		Class c2 = Student.class;
		
		System.out.println("클래스명(모든 경로 포함)" + c.getName());
		System.out.println("클래스명(클래스명만)" + c.getSimpleName());
		
		Method[] methods = c.getMethods();
		
		System.out.println(methods[0].getName());
		
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
		System.out.println();
		
		Test test = new Test();
		Class t = test.getClass();
		Method[] methods2 = t.getMethods();
		
		for(int i = 0; i < methods2.length; i++) {
			System.out.println(methods2[i].getName());
		}
		
	}

}
