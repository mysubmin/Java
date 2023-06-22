package j12_다형성.computer;

public class Laptop extends Computer{

	@Override
	public void onKeypress() {
		System.out.println("노트북에서 키보드 입력을 받습니다.");
		
	}

	@Override
	public void onDisplay() {
		System.out.println("노트북 화면을 출력합니다.");
		
	}
	

}
