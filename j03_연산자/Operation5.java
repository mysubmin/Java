package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * 
		 * 89점보다 크면 (A학점)
		 * 79점보다 크면 (B학점)
		 * 69점보다 크면 (C학점)
		 * 59점보다 크면 (D학점)
		 * 나머지는 F학점
		 * * 점수는 0보다 작거나 100보다 크면 '계산불가'
		 * 
		 * 출력 : B학점
		 */
		
		int score = 80;
		String result = null;
		
		result = score < 0 || score > 100 ? "계산불가"
				:score > 89 ? "A학점" 
				: score > 79 ? "B학점" 
				: score > 69 ? "C학점"
				: score > 59 ? "D학점"
				: "F학점";
		
		System.out.println("출력 : " + result);

	}

}
