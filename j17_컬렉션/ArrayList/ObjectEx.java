package j17_컬렉션.ArrayList;

import java.util.ArrayList;

import j14_lombok.Student;

public class ObjectEx {

	public static void main(String[] args) {
		String hong = "studentCode : 20230001, name : 홍길동, studentYear : 3, age : 18";
		//실습! hong에서 이름이 홍길동 출력, 나이는 18출력
		System.out.println(hong.substring(31, 34));
		System.out.println(hong.substring(59, 61));
		
		Student hong2 = new Student(20230001,"홍길동", 3, 18);
		System.out.println(hong2.getName());
		System.out.println(hong2.getAge());

	}

}
