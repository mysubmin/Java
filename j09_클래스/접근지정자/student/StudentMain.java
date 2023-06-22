package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
//		Student student = new Student(null, 0, 0, null, null);
		
		Student student2 = new Student();
		
		student2.setName("홍길동");
		System.out.println(student2.getName()); 
		
		student2.setstudentYear(3);
		System.out.println(student2.getstudentYear()); 
		
		student2.setage(18);
		System.out.println(student2.getage()); 
		
		student2.setaddress("부산");
		System.out.println(student2.getaddress()); 
		
		student2.setphone("010-0000-0000");
		System.out.println(student2.getphone()); 
		
	}

}
