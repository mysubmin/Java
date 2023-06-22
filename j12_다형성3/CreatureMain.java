package j12_다형성3;

public class CreatureMain {

	public static void main(String[] args) {
		Pigeon p  = new Pigeon(5, 0, 3);
		p.printInfo();
		p.age();
		p.move(100);
		p.fly(100);
		
		p.printInfo();
		
		Kevin k = new Kevin(50, 10, 18);
		k.printInfo();
		
		
		
		k.swimDown(20);
		k.swimDown(5);
		k.printInfo();
	}

}
