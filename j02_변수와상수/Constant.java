package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		// 'final' 상수 설정
		
		int number = 10;
		
		number = 30;
		//변수의 선언은 한번만 이루어져야 한다.
		
//		maxNumber = 70;
		// 상수는 값이 수정이 안된다.
		
		
		System.out.println("최댓값 : " + MAX_NUMBER);
		System.out.println("최솟값 : " + MIN_NUMBER);
		System.out.println("현재값 : " + number);

	}

}
