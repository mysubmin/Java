package j04_문자열;

public class StringBuilder2 {
	
	public static void main(String[] args) {
		String names = "김병철님, 김보현님, 김연경님, 문보배님";
		StringBuilder stringBuilder = new StringBuilder();
		
		System.out.println(stringBuilder);
		/*
		 * 실습 
		 * 김병철/김보현/김연경/문보배
		 * 으로 변경
		 */
		
//		stringBuilder.append(names.substring(0, 3));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(6, 9));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(12, 15));
//		stringBuilder.append("/");
//		stringBuilder.append(names.substring(18, 21));
//		System.out.println(stringBuilder);
// 		index 활용 전
		
		int index = names.indexOf("님");
		System.out.println(index);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		// index 활용 중요 (반복문)
		
		System.out.println(stringBuilder);
		
//		names = names.replaceAll("님, ", "/");
//		stringBuilder.append(names);
//		System.out.println(stringBuilder);
		
	}

}
