package j09_클래스.생성자;

public class ConstructorEx {
	String name;
	int age;
	
	// NoArgsConstructor
	public ConstructorEx() {
		System.out.println("기본 생성자 호출");
	}
	
	//RequiredArgsConstructor
	public ConstructorEx(String name) {
		System.out.println("매개변수 : " + name);
		System.out.println("name을 매개변수로 받는 생성자");
		this.name = name;
	}
	
	//RequiredArgsConstructor
	public ConstructorEx(int age) {
		System.out.println("매개변수 : " + age);
		System.out.println("age을 매개변수로 받는 생성자");
		this.age = age;
	}
	
	//AllArgsConstructor
	public ConstructorEx(String name, int age) { // 생성자 오버로딩
		System.out.println("매개변수 : " + name);
		System.out.println("매개변수 : " + age);
		System.out.println("전체생성자");
		this.name = name;
		this.age = age;
		
	}
//	Args -> Arguments(인수, 매개변수)
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println();
	}
}
