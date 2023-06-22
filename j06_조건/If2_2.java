package j06_조건;

public class If2_2 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * "돈이 3000원이상 있고 카드가 있다면 택시르 타고, 돈이 3000원미만이고
		 *  카드만 있다면 버스를 타라, 그렇지 않으면 걸어가라"
		 *  
		 */
		
		int money = 3000;
		boolean card = false;
		
		if(money >= 3000 && card) {
			System.out.println("택시를 타고 가라");
		}else if(money < 3000 && card){
			System.out.println("버스를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
	}

}
