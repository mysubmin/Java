package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("이름을 입력하세요");
//		String str = scanner.next();
		
		
		System.out.print("주소지를 입력하세요 : ");
		String address = scanner.nextLine();
		// 띄워쓰기 nextLine
		
//		System.out.println("출력 : " + str);
		System.out.println("주소지 : " + address);
		
	}

}
