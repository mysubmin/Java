package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * n값을 입력하세요 : 3
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * 
		 * i = 3
		 * i = 2
		 * i = 1
		 * 
		 * 
		 * n값을 입력하세요 : 7
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * ...
		 * i = 7
		 * 
		 * i = 7
		 * ...
		 * i = 3
		 * i = 2
		 * i = 1
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;		
		System.out.print("n값을 입력하세요 :");
		n = scanner.nextInt();
		
		int i = 0;
		while(i < n) {
			System.out.println("i = " + (i + 1));
			i++;
		}
		
		i = 0;
		System.out.println();
		while(i < n) {
			System.out.println("i = " + (n-i));
			i++;
		}
		
		
	}

}
