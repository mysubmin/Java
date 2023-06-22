package j03_연산자;

public class Operation2 {

	public static void main(String[] args) {
		
		boolean result = 10 > 5;
		System.out.println(result);		
		
		boolean result2 = 10 == 5;
		System.out.println(result2);
		
		boolean result3 = 10 != 5;
		System.out.println(result3);
		
		boolean k = !(true);
		System.out.println(k);
		
		int a = 5;
		System.out.println(7 < a);
		System.out.println(a > 7); //기준은 윈쪽!
		
		int b =  7;
		int c = 8;
		System.out.println(a < b);	
		System.out.println(a < c);
		
		System.out.println(b > a);
		System.out.println(c > a);
		System.out.println();
		
		System.out.println("" + result2 + result3);
		
		/*
		 * 논리 연산 : boolean끼리 연산하는 것
		 * AND연산(&&) - 곱
		 * true && true => true
		 * true && false => false
		 * false && false => false
		 * 
		 * OR연산(||) - 합
		 * true || true => true
		 * true || false => true
		 * false || false => false
		 * 
		 * NOT연산(!) - 부정
		 * !true => false
		 * !false => true 
		 */
		
		System.out.println((2000 % 4 == 0 || 2000 % 100 == 1) && 2000 % 2 != 0);
		
	}

}
