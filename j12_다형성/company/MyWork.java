package j12_다형성.company;

public class MyWork extends Work{

	@Override
	public void workA() {
		System.out.println("A일을 합니다");
		
	}

	@Override
	public void workB() {
		System.out.println("B일을 합니다");
		
	}

	@Override
	public void workC() {
		System.out.println("C일을 합니다");
		
	}
	
	public void LevelUp() {
		System.out.println("자기계발을 합니다.");
	}

}
