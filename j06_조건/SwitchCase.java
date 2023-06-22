package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		switch (30) {
		case 10:
			System.out.println("10입니다.");
		case 20:
			System.out.println("20입니다.");
		case 30:
			System.out.println("30입니다.");
		case 40:
			System.out.println("40입니다.");
		case 50:
			System.out.println("50입니다.");
		}
		
		String str = "10";
		switch (str) {
		case "10":
			System.out.println("10입니다.");
		case "20":
			System.out.println("20입니다.");
		case "30":
			System.out.println("30입니다.");
			break;
		case "40":
			System.out.println("40입니다.");
		case "50":
			System.out.println("50입니다.");
		default:
			System.out.println("그 외에 실행");
		}
//		break는 멈추는 기능 + switch_case 문을 나와버림
//		default 해당 조건에 안맞아도 실행

	}

}
