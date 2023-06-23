package j15_스태틱;

public class StaticTestMain {

	public static void main(String[] args) {
//		StaticTest staticTest = new StaticTest();
//		staticTest.name = "홍길동";
//		
//		System.out.println(staticTest.name);
//		
//		StaticTest staticTest2 = new StaticTest();
//		System.out.println(staticTest2.name);
//		
//		staticTest2.name = "이순신";
//		System.out.println(staticTest2.name);
//		System.out.println(staticTest.name);
		
		StaticTest.name = "박수민";
		StaticTest staticTest = new StaticTest();
		System.out.println(staticTest.name);
		
		StaticTest.printTest();
		staticTest.printTest();

	}

}
