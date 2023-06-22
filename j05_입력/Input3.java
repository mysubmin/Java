package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력해 주세요 : (여러명 입력가능)
		 * names : 최연호 김연경 박수민 임채현 최규하  (nextLine)
		 * 연락처를 입력해 주세요 : (여러명 입력가능)
		 * phones : 3300 4698, 1234 5678, 1111 2222, 3333 4444, 5555 6666 (nextLine)
		 * 
		 * 출력
		 * 최연호님, 김연경님, 박수민님, 임채현님, 최규하님
		 * 010-3300-4698/010-1234-5678/010-1111-2222/010-3333-4444/010-5555-6666
		 */
		
		Scanner scanner = new Scanner(System.in);
				
		String names = null;
		String phones = null;
		
		System.out.print("이름을 입력해 주세요(여러명 입력가능) : ");
		names = scanner.nextLine();
		
		System.out.print("연락처를 입력해 주세요(여러명 입력가능) : ");
		phones = scanner.nextLine();
		
		names = names.replaceAll(" ", "님, ") + "님";
		phones = "010-" + phones.replace(' ', '-').replaceAll(",", "/010");		
		
		System.out.println(names);
		System.out.println(phones);

	}

}
