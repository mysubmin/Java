package j07_반복;

public class Continue1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10 ; i++) {
			if(i % 2 == 0) {
				System.out.println("continue 전");
				continue;
			}
			System.out.println("i : " + i);
		}
		
//		실습! continue를 사용하여 1부터 100까지 수 중 홀수의 합를 구하시오.
		
		int han1 = 0;
//		int han2 = 0;
		
		for(int i = 0; i < 100 ; i++) {
			int j = i + 1;
			if(j % 2 == 0) {
//				han2 += j;
//				System.out.println("짝수 : " + j);
				continue;
			}
//			System.out.println("홀수 : " + j);
			han1 += j;
		}
		System.out.println("홀수 합 : " + han1);
//		System.out.println("짝수 합 : " + han2);
		
	}

}
