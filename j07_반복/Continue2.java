package j07_반복;

public class Continue2 {

	public static void main(String[] args) {
		String address = "부산 동래구 사직동 중앙대로";
		/*
		 * 1. for 반복
		 * 2. if 조건문 - substring을 사용해서 공백이면
		 * 	  조건문이 실행되고 Continue
		 * 3. 새로운 문장열에 넣어주기
		 */
		String tempAddess = null;
		for(int i = 0; i < address.length(); i++) {
			String subaddress = address.substring(i, i + 1);
			if(subaddress.equals(" ")) {
				continue;
			}
			if(i == 0) {
				tempAddess = subaddress;
			}else {
				tempAddess += subaddress;
			}
		}
		System.out.println(tempAddess);
	}

}
