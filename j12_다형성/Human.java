package j12_다형성;

public class Human extends Animal{
	

	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");		
	}
	
}
