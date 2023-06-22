package j12_다형성.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop(); // Computer -> Laptop
		Computer c2 = new DesktopImpl(); // Computer -> DesktopImpl
		
		c1.onKeypress();
		c1.onDisplay();
		
		c2.onKeypress();
		c2.onDisplay();
		((Desktop)c2).onMouseClick(); // Computer -> DesktopImpl -> Desktop -> onMouseClick
		
		/*
		 * c1.onSound();
		 * 소리를 출력합니다.
		 * c2.onSound();
		 * 소리를 출력합니다.
		 */
		
		c1.onSound();
		c2.onSound();
	}

}
