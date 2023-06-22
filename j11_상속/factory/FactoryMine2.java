package j11_상속.factory;

public class FactoryMine2 {

	public static void main(String[] args) {
		Factory Factory1 = new SamsungFactory(1); //업 케스팅
		Factory Factory2 = new LGFactory(1);
		
		Factory[] factoeries = new Factory[4];
		factoeries[0] = new SamsungFactory(1);
		factoeries[1] = new LGFactory(1);
		factoeries[2] = new SamsungFactory(2);
		factoeries[3] = new LGFactory(2);
		
		System.out.println("모든 공장을 가동합니다.");
		for(int i = 0; i < factoeries.length; i++) {
			factoeries[i].start();
		}
		System.out.println("모든 공장을 멈춥니다.");
		for(int i = 0; i < factoeries.length; i++) {
			factoeries[i].stop();
		}
	}

}
