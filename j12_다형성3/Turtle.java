package j12_다형성3;

public class Turtle extends Animal implements Swimable{

	public Turtle(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printInfo() {
		System.out.println("Turtle -> " + toString());		
	}

	@Override
	public void swimDown(int yDistance) {
		setY(getY() - yDistance);	
	}
}
