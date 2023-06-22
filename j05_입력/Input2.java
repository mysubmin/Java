package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 입력
		 * 
		 * 이름 : 홍길동		next()		변수명 : name
		 * 나이 : 18			nextInt()	변수명 : age
		 * 주소 : 부산 진구 가야동		nextLine()	변수명 : address
		 * 연락처 : 010-3300-4698		next()		변수명 : phone
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.next();
		
		System.out.print("나이을 입력하세요 : ");
		age = scanner.nextInt();
		
		System.out.print("주소지를 입력하세요 : ");
		scanner.nextLine();
		address = scanner.nextLine();
		
		System.out.print("핸드폰 번호를 입력하세요 : ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
		System.out.println("주소는 " + address +"입니다.");
		System.out.println("연락처는 " + phone +" 입니다.");
		
	}

}
