package j11_상속;

public class Human extends Animal{
	
	public Human() {
		super(); //부모 호출
		System.out.println("Human 객채 생성");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	

//	 * 오버라이딩 : 부모랑 이름이 같은메소드*재정의*, @ -> 어노테이션
	@Override
	public void move() {
		super.move();
		System.out.println("사람이 두발로 걷습니다.");
		
	}
}
