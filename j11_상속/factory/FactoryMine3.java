package j11_상속.factory;

public class FactoryMine3 {

	public static void main(String[] args) {
		Factory[] factoeries = new Factory[4];
		factoeries[0] = new SamsungFactory(1);
		factoeries[1] = new LGFactory(1);
		factoeries[2] = new SamsungFactory(2);
		factoeries[3] = new LGFactory(2);
		
		SamsungFactory sfactory = new SamsungFactory(1);
		System.out.println(sfactory);
		
		System.out.println((Factory)sfactory);
		
		Factory f = sfactory;
		SamsungFactory sf = (SamsungFactory)f;
		System.out.println(sf);
		
	}

}

