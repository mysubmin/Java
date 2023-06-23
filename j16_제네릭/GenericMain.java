package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
		
		GenericTest genericTest = new GenericTest();
		
		genericTest.setNumber(100);
		genericTest.setData("200");
		
//		System.out.println(genericTest.getNumber() + genericTest.getData());
//		
//		GenericTest<String> genericTest2 = new GenericTest<>();
//		genericTest2.setData("300");
//		System.out.println(genericTest2.getData());
//		
//		GenericTest<Integer> genericTest3 = new GenericTest<>();
//		genericTest3.setData(300);
//		System.out.println(genericTest3.getData());
		
		GenericTest<String, String> genericTest4 = new GenericTest<>();
		

	}

}
