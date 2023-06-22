package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		/*
		 * 중첩반복 실습
		 * 1교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 * 
		 *		...
		 *
		 * 4교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분쉬는시간
		 * 		1분
		 * 		...
		 * 		10분
		 */
		
		int a = 0;
		int b = 0;
		
		while(a < 4) {
			System.out.println((a+1) + "교시");
			b = 0;
//			while(b < 60) {									
//				if(b < 50) {
//					System.out.println("\t" + (b+1) + "분");
//				}else if(b > 50) {
//					System.out.println("\t" + (b-49) + "분");
//				}else {
//					System.out.println("\t10분 쉬는시간");
//					System.out.println("\t" + (b-49) + "분"); 
//				}
//				b++;
//			}
			while(b < 60) {
				int time = 0;
				if(b < 50) {
					time = b +1;
					System.out.println("\t" + time + "분");
				}else {
					if(b == 50) {
						System.out.println("\t10분 쉬는시간");
					}
					time = b - 50 + 1;
					System.out.println("\t" + time + "분");
				}
				b++;
			}
			a++;
			System.out.println();
		}
		
		/*
		 * 힌트
		 * 1. 교시에 관해서 반복(4번)
		 * 2. 시간에 관해서 반복(60번)
		 * 3. 조건문 사용하여 60번째 반복을 구간나눠어 작성
		 */

	}

}
