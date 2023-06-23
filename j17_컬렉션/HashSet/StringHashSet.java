package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StringHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("python");
		
		set.add("1");
		set.add("2");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
		
//		for(String str : set) {
//			System.out.println(ir.hasNext());
//			System.out.println(ir.next());
//		}
		
//		while (ir.hasNext()) {
//			System.out.println(ir.next());
//		}
		
		/*
		 * 실습. 반복문을 통해 set 안에 있는 java를 찾고 찾으면 그 값을 출력
		 */
		
//		while(ir.hasNext()) {
//			String str = ir.next();
//			if(str.equals("java")) {
//				System.out.println(str);
//			}
//		}
		
//		for(int i = 0; i < set.size(); i++) {
//			String str = ir.next();
//			if(str.equals("java")) {
//				System.out.println(str);
//			}
//		}
		
		for(String str : set) {
			if(str.equals("java")) {
				System.out.println(str);
			}
		}
		
		
		
	}

}
