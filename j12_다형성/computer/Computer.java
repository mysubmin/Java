package j12_다형성.computer;

public abstract class Computer {
	
	public abstract void onKeypress(); // 키보드 입력
	public abstract void onDisplay(); // 화면표시
	
	public void onSound() {// 소리출력
		System.out.println("소리를 출력합니다.");
	}
	
}
