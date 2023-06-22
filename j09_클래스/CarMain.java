package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * Car 라는 실습 만들기
		 * 변수
		 * 		company
		 * 		model
		 * 		color
		 * 
		 * 메소드
		 * 		showInfo()
		 * 			회사명 : 000
		 * 			모델명 : 000
		 * 			색상 : 000
		 * 
		 * 차 3대 만들기
		 * 현대
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아
		 * K5
		 * 블랙
		 * 
		 * 현대
		 * 아반떼
		 * 그레이
		 * 
		 * showInfo 찍으면 정보가 다 나오도록 만들기
		 * 
		 * colorChange 라는 메소드 만들기
		 * 1. 오렌지
		 * 2. 블루
		 * 3. 레드
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = " K5 ";
		car2.color = "블랙";
		
		car3.company = "현대";
		car3.model = "아반떼";
		car3.color = "그레이";
		
		car1.showInfo();
		car2.showInfo();
		car3.showInfo();
		
		car1.colorChange(1);
		car1.showInfo();
		car2.colorChange(2);
		car2.showInfo();
		car3.colorChange(3);
		car3.showInfo();
	}

}
