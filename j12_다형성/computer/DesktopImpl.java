package j12_다형성.computer;

public class DesktopImpl extends Desktop{

	@Override
	public void onDisplay() {
		System.out.println("컴퓨터 화면을 출력합니다.");
		
	}

	@Override
	public void onMouseClick() {
		System.out.println("컴퓨터에서 마우스 클릭을 받습니다.");
		
	}
	

}
