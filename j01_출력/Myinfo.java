package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		/*
		 * 자동완성 단축기 -> ctrl + soace
		 */
		char name1 ='홍';
		char name2 ='길';
		char name3 ='동';
		
		int age = 18;
		String address = "부산 진구 범천동";
				
//		System.out.println("이름 : ");
//		System.out.println("홍길동");
		
		System.out.print("이름: ");
		System.out.println("홍길동");
		System.out.print("나이: ");
		System.out.println(18);
		System.out.print("주소: ");
		System.out.println("부산 진구 범천동");
				
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		// 문자을 '+' 할 경우 아스키코드값으로 더한다
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		
	}

}
