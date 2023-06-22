package j06_조건;

import java.util.Scanner;

public class If2_3 {

	public static void main(String[] args) {
		/*
		 * 입력
		 * 단어를 입력하세요 : 축구
		 * 농구
		 * 야구
		 * 골프
		 * 
		 * 출력
		 * soccer
		 * basketball
		 * baseball
		 * golf
		 * 
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		String hobby = null;
		
		System.out.print("단어를 입력하세요 : ");
		hobby = scanner.nextLine();
		
		if (hobby.equals("축구")) 
			System.out.println("soccer");
		else if(hobby.equals("농구"))
			System.out.println("basketball");
		else if(hobby.equals("야구"))
			System.out.println("baseball");
		else if(hobby.equals("골프"))
			System.out.println("golf");
		
	}

}
