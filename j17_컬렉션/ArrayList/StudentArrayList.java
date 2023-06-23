package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		
		Student student1 = new Student("최연호");
		Student student2 = new Student("박수민");
		Student student3 = new Student("김연경");
		Student student4 = new Student("우주영");
		Student student5 = new Student("문보배");
		
		/*
		 * Student 배열을 생성하고 그 배열을 list로 변환 후
		 * 새로운 ArrayList(studentList)를 생성하여 전체를 추가
		 */
		
		Student[] students = new Student[5];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		
		Arrays.asList(students);
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.addAll(Arrays.asList(students));
		
		System.out.println(studentList);
		
		//실습! 반복문을 통해 객체를 하나씩 출력
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		/*
		 * 반복문을 통해 "김연경"을 찾고 찾은 객체를 삭제
		 */
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals("김연경")) {
				studentList.remove(i);
			}
		}
		
		System.out.println(studentList);

		for(Student student : studentList) {
			if(student.getName().equals("문보배")) {
				studentList.remove(student);
				break; //
			}
		}
		
		System.out.println(studentList);
		
	}
}