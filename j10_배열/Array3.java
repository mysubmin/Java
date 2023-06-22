package j10_배열;

import j09_클래스.접근지정자.student.Student; //중요

public class Array3 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * names 배열 5개
		 * studentYears 5개
		 * scores 배열 5개
		 * 
		 * 문보배 3 75.9
		 * 박수민 2 80.5
		 * 우주영 4 85.7
		 * 임채현 3 88.3
		 * 최유정 4 78.5
		 * 
		 * 
		 * 출력!
		 * 문보배 \t3학년 \t75.9점
		 * 박수민 \t2학년 \t80.5점
		 * 우주영 \t4학년 \t85.7점
		 * 임채현 \t3학년 \t88.3점
		 * 최유정 \t4학년 \t78.5점
		 */
		
		String[] names = {"문보배", "박수민", "우주영", "임채현", "최유정"};
		int[] studentYears = {3, 2, 4, 3, 4};
		double [] scores = {75.9, 80.5, 85.7, 88.3, 78.5};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i] + "\t" +studentYears[i] + "학년\t" +scores[i] + "점");
		}
		
		/*
		 * j09_클래스.접근지정자.student의 Student
		 * 
		 * Student 배열, 크기 3
		 * 홍길동, 3, 15, 부산, 010-3300-4698
		 * 가나다, 2, 14, 서울, 010-1111-2222
		 * 최연호, 1, 13, 대구, 010-1234-1234
		 */
		
		Student[] student = new Student[3];
		
		student[0] = new Student("홍길동", 3, 15, "부산", "010-3300-4698");
		student[1] = new Student("가나다", 2, 14, "서울", "010-1111-2222");
		student[2] = new Student("최연호", 1, 13, "대구", "010-1234-1234");
		
		/*
		 * 반복문을 돌려
		 * 
		 * 이름 : 홍길동
		 * 이름 : 가나다
		 * 이름 : 최연호
		 */
		
		for(int i = 0; i < 3; i++) {
			System.out.println("이름 : " + student[i].getName());
		}
		
	}

}
