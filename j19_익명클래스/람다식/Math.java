package j19_익명클래스.람다식;

@FunctionalInterface // 메소드가 한개만 아니면 오류
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);
	
//	public double printName(String firstName, String lastName);
}
