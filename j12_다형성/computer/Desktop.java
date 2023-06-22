package j12_다형성.computer;

public abstract class Desktop extends Computer{
	
	@Override
	public void onKeypress() {
		System.out.println("컴퓨터의 키보드 입력을 받는다.");
		
	}
	
	public abstract void onMouseClick();

}
