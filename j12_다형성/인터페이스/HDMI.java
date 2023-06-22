package j12_다형성.인터페이스;

/*
 * 인터페이스 특징(상속이라고 하지 않고 구현이라고 한다.) 
 * 1. 모든 메소드는 기본적으로 추상메소드로 정의한다.
 * 2. 생성을 할 수 없다.
 * 3. 일반 변수는 선언할 수 없다.
 * 4. 무조건 스태틱 상수를 사용한다.
 * 5. 일반 메소드를 정의하기 위해서는 변환 자료형 앞에 default를 입력해야한다.
 * (ex. public default void disConnect();)
 * 6. 인터페이스 다중구현이 가능하다.
 * 
 */

public interface HDMI {
	
	public void connect();
	public void disConnect();
	
//	public int number;
	
	public int NUMBER = 10;
	
}
