package j13_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		String name4 = name3;
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name3 : " + name3);
		System.out.println("name4 : " + name4);
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name3 == name4);
		System.out.println();
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name3.equals(name4));
	}

}
