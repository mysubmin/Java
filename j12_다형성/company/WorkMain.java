package j12_다형성.company;

public class WorkMain {

	public static void main(String[] args) {
		Work work = new MyWork();
		
		work.workB();
		((MyWork)work).LevelUp();
	}

}
