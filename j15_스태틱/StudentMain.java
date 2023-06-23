package j15_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * 학생 10명이 들어가는 배열 만들기
		 * 반복문을 통해
		 * 학생 10명을 생성
		 * 생성할때 이름은
		 * 홍길동1
		 * 홍길동2
		 * ....
		 * 홍길동10
		 * 으로 줘서 생성
		 * 
		 * 10명의 학생객체를 반복문을 통해 출력
		 */
		
		Student[] studnets = new Student[10];
		
		for(int i = 0; i < studnets.length; i++) {
			studnets[i] = new Student("홍길동" + (i + 1));
		}
		
		for(int i = 0; i < studnets.length; i++) {
			System.out.println(studnets[i]);
		}
		

	}

}
