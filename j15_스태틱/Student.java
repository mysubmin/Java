package j15_스태틱;

import lombok.Data;

@Data
public class Student {
	
	public static int autodCode = 202300000;
	
	private int  studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autodCode;
		this.name = name;
	}

}
