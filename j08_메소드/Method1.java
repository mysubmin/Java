package j08_메소드;

public class Method1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);// 함수명(인수)
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
		
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	/*
	 * 함수 기본
	 * 리턴(반환) 타입 / 메소드 이름/ (파라미터, 매개변수){
	 * 		return 반환 값(변수 or 상수)
	 * }
	 */
	
}
