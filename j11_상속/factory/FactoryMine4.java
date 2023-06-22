package j11_상속.factory;

public class FactoryMine4 {

	public static void main(String[] args) {
		Factory[] factoeries = new Factory[4];
		factoeries[0] = new SamsungFactory(1);
		factoeries[1] = new LGFactory(1);
		factoeries[2] = new SamsungFactory(2);
		factoeries[3] = new LGFactory(2);
		
		//다운 캐스팅
		//instanceof : 객체의 원래 형태를 비교
		System.out.println(factoeries[0] instanceof LGFactory);
		
		for(int i = 0; i < factoeries.length; i++) {
			if(factoeries[i] instanceof SamsungFactory) { 
			// 'factoeries'[i](해당 객체) instanceof(객체 비교) 'SamsungFactory'(비교대상)
				SamsungFactory samsungFactory = (SamsungFactory) factoeries[i];
				samsungFactory.produceSmartPhone();
			}else if(factoeries[i] instanceof LGFactory) {
				LGFactory lgfactory = (LGFactory) factoeries[i];
				lgfactory.produceSmartTv();
			}else {
				System.out.println("형변환 불가");
			}
		}
		
	}

}
