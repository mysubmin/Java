package j09_클래스.생성자;

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorEx constructorEx1 = new ConstructorEx();
		ConstructorEx constructorEx2 = new ConstructorEx("가나다", 20); // 생성자 오버로딩
		ConstructorEx constructorEx3 = new ConstructorEx("홍길동");
		ConstructorEx constructorEx4 = new ConstructorEx(25);
		System.out.println();
		
		constructorEx1.name = "홍길동"; // 주소참조
		constructorEx1.age = 18;
		
		constructorEx1.showInfo();
		constructorEx2.showInfo();
		constructorEx3.showInfo();
		constructorEx4.showInfo();
	}

}
