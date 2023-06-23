package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
	
		Math<Integer, Integer> pluMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				// TODO Auto-generated method stub
				return value1 + value2;
			}
		};
		
		System.out.println(pluMath.calc(10, 20));
		
		/*
		 * pluMath2 객체 만들고
		 * 10.5 + 20.5를 주기
		 */
		
		Math<Double, Double> pluMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				// TODO Auto-generated method stub
				return value1 + value2;
			}
		};
		
		System.out.println(pluMath2.calc(10.5, 20.5));
		
		Math<Double, Double> pluMath3 = (v1, v2) -> v1 + v2;
		System.out.println(pluMath3.calc(100.5, 200.5));
		
		Math<Double, Double> pluMath4 = (v1, v2) -> {
			System.out.println("v1 : " + v1);
			System.out.println("v2 : " + v2);
			return v1 + v2;
		};
		
		System.out.println(pluMath4.calc(30.5, 20.5));
		
	}
}
