package j11_상속.factory;

public class FactoryMine5 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * Factories 배열 만들기(크기 20)
		 * 
		 * 배열의 인덱스가
		 * 짝수이면 SamsungFactory 생성해서 대입
		 * 홀수이면 LGFactory 생성해서 대입
		 * 
		 * 삼성공장 1 ~ 10
		 * 엘지공장 1 ~ 10
		 * 
		 * 배열전체를 반복을 돌림.
		 * 가동
		 * 생산
		 * 중지
		 */
		
		Factory[] factoeries = new Factory[20];
		for(int i = 0; i < factoeries.length; i++) {
			if(i % 2 == 0) {
				factoeries[i] = new SamsungFactory(i);
			}else {
				factoeries[i] = new LGFactory(i);
			}
			
		}
		
		
		for(int i = 0; i < factoeries.length; i++) {
			if(factoeries[i] instanceof SamsungFactory) {
				SamsungFactory sfactory = (SamsungFactory)factoeries[i];
				sfactory.start();
				sfactory.produceSmartPhone();
				sfactory.stop();
			}else if(factoeries[i] instanceof LGFactory) {
				LGFactory lfactory = (LGFactory)factoeries[i];
				lfactory.start();
				lfactory.produceSmartTv();
				lfactory.stop();
			}else {
				System.out.println("지정된 공장이 없습니다.");
			}
		}
	}
}
