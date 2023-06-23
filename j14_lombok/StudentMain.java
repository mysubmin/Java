package j14_lombok;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student(20230001, "홍길동", 2023, 18);
		student.getName();
		
		Student student2 = Student.builder()
								.age(20)
								.studentCode(20230002)
								.studentYear(3)
								.name("박수민")
								.build();
		
		System.out.println(student2);
		

	}

}