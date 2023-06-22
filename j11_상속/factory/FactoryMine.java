package j11_상속.factory;

public class FactoryMine {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LGFactory lgFactory = new LGFactory(1);
		
		/*
		 * 배열을 통해 
		 * 삼성 3개, LG 3개 만들기
		 * 공장 번호는 1, 2, 3
		 */
		
		SamsungFactory[] SFactory = new SamsungFactory[3];
		LGFactory[] LFactory = new LGFactory[3];
		
		SFactory[0] = new SamsungFactory(1);
		SFactory[1] = new SamsungFactory(2);
		SFactory[2] = new SamsungFactory(3);
		
		LFactory[0] = new LGFactory(1);
		LFactory[1] = new LGFactory(2);
		LFactory[2] = new LGFactory(3);
		
		System.out.println("삼성 공장 가동");
		for(int i = 0; i < 3; i++) {
			SFactory[i].start();
		}
		System.out.println("삼성 공장 중지");
		for(int i = 0; i < 3; i++) {
			SFactory[i].stop();
		}
		System.out.println("엘지 공장 가동");
		for(int i = 0; i < 3; i++) {
			LFactory[i].start();
		}
		System.out.println("엘지 공장 중지");
		for(int i = 0; i < 3; i++) {
			LFactory[i].stop();
		}
		
	}

}
