package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * str = "abcdefghijk"
		 * 
		 * 출력
		 * a
		 * b
		 * c
		 * ....
		 * k
		 * 
		 */
		
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) {
			String substr = str.substring(i ,i + 1);
			System.out.println(substr);
		}

	}

}
