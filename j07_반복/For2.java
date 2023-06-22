package j07_반복;

public class For2 {

	public static void main(String[] args) {
		//구구단 
		int dan =2;
		for(int i = 0; i < 9; i++) {
			int num = i + 1;
			System.out.println(dan + "x" + num + "=" + (dan * num) );
		}
		System.out.println();
		
		/*
		 * 실습
		 * 2단
		 * 2 * 1 = 2
		 * ....
		 * 2 * 9 = 18
		 * 3단
		 * 3 * 1 = 3
		 * ....
		 * ....
		 * 9단
		 * ....
		 * 9 * 9 = 81
		 */
		
		for(int num = 0; num < 8; num++) {
			int dan2 = num + 2;
			System.out.println(dan2 + "단");
			for(int i = 0; i < 9; i++) {
				int num2 = i + 1;
				System.out.println(dan2 + " x " + num2 + " = " + (dan2 * num2) );
			}
		}
		
	}

}
