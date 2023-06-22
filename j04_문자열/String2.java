package j04_문자열;

public class String2 {

	public static void main(String[] args) {
		String phoneNumbers = "010/3300/4698, 010/1234/5678, 010/1111/2222";
		/*
		 * 실습
		 * 011-3300-4698/011-1234-5678/011-1111-2222
		 * 
		 * rePhone 변수에 담아서 출력
		 */
		
		String rePhone = phoneNumbers.replace('/', '-');
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		String rePhone2 = phoneNumbers.replace('/', '-')
				.replaceAll("010", "011")
				.replaceAll(", ", "/");
		System.out.println(rePhone2);

	}

}
