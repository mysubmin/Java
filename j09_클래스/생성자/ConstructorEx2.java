package j09_클래스.생성자;

public class ConstructorEx2 {
	String name;
	int age;
	
	public ConstructorEx2() {
		// TODO Auto-generated constructor stub
	}

	// Alt + Shift + s - Generate Constructor UsingFields 클릭하여 생성자 만들기
	public ConstructorEx2(String name) {
		super();
		this.name = name;
	}

	public ConstructorEx2(int age) {
		super();
		this.age = age;
	}

	public ConstructorEx2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
