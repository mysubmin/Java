package j12_다형성;

public class AnimalMine {

	public static void main(String[] args) {
//		추상 클래스 생성이 안됨
//		Animal animal = new Animal();
		
		Animal animal = new Human();
		
		animal.move();
		
		
	}

}
