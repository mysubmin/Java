package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		//업캐스팅(묵시적 형변환)
		char a = 'A';
		int b = a;
		System.out.println(b);
		double c = b;
		
		System.out.println(c);
		
		char x = 'A';
		double y = x;
		System.out.println(y);
		
		// 다운캐스팅(명시적 형변환)
		int d = (int)c;
		System.out.println(d);
		
		//실습 d를 문자로 다운캐스팅
		char e = (char)d;
		System.out.println(e);
	}

}
