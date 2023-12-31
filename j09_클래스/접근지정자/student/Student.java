package j09_클래스.접근지정자.student;

public class Student {
	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	
	public Student() {
		
	}
	
//	private 변수에 값을 주입하는 방법1
//	[생성자를 통한 값 주입]
	public Student(String name, int studentYear, int age, String address, String phone) {
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
//	private 변수에 값을 주입하는 방법2
//	[Setter를 통한 값 주입] Alt + Shift + s
	public String getName() {
		return name;
	}
	public int getstudentYear() {
		return studentYear;
	}
	public int getage() {
		return age;
	}
	public String getaddress() {
		return address;
	} 
	public String getphone() {
		return phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setstudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
