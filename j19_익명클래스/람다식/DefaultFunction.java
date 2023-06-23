package j19_익명클래스.람다식;

public class DefaultFunction {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("runnable인터페이스를 활용한 람다식");
			System.out.println("중괄호 안에 여러 실행문 작성 가능");
		};
		
		runnable.run();
		
		
		
	}

}
