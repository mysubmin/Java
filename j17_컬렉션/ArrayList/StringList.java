package j17_컬렉션.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j09_클래스.접근지정자.student.Student;

public class StringList {

	public static void main(String[] args) {
		
		//ArrayList 순서가 정해지고 중복 허용
		//배열의 차이 = 크기 초기화
		ArrayList<String> list = new ArrayList<String>();
		
		//값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("C");
		
		//원하는 위치에 값 추가 add( , )
		list.add(1, "html");
		list.add(3, "css");
		
		//list의 toString
		System.out.println(list);
		
		//list의 크기 : size()
		System.out.println("list의 크기" + list.size());
		
		//list에서 해당 index로 값 찾기 : get()
		String subject = list.get(0);
		System.out.println("0번 index의 값 : " + subject);
		
		//list에서 index 찾는 방법 : indexOf()
		int findOdex = list.indexOf("python");
		System.out.println("python이 있는 위치 : " + findOdex);
		
		//해당 index 위치에 값을 수정 : set( , )
		list.set(4, "c++");
		System.out.println(list);
		
		//list에 값의 존제 유무 : contains()
		boolean contains = list.contains("java");
		System.out.println("contains : " + contains);
		boolean contains2 = list.contains("spring");
		System.out.println("contains2 : " + contains2);
		
		ArrayList<String> tempList = new ArrayList<String>();
		//실습! tempList에 python, c++ 값 추가
		tempList.add("python");
		tempList.add("c++");
		tempList.add("spring");
		
		System.out.println("tempList : " + tempList);
		
		//list끼리 요소가 값으면 true, 다른거 하나라도 있으면 false : containsAll()
		boolean containsAll =  list.containsAll(tempList);
		System.out.println("containsAll : " + containsAll);
		
		System.out.println();
		System.out.println("list : " + list);
		System.out.println("tempList : " + tempList);
		
		//다른 컬렉션의 데이터를 모두 추가 : addAll(tempList)
		list.addAll(tempList);
		System.out.println("list : " + list);
		
		//찾으려는 값을 찾으면 첫번째꺼 지움 : remove(요소)
		list.remove("python");
		System.out.println("list : " + list);
		
		//index 위치로 삭제 : remove(숫자)
		list.remove(2);
		System.out.println("list + " + list);
		
		//list에서 tempList이랑 곂치는거 값 다 삭제 : list.removeAll(tempList)
//		list.removeAll(tempList);
//		System.out.println("list + " + list);
		
		//list에서 tempList이랑 곂치는거 값 제외 삭제 : list.retainAll(tempList)
		list.retainAll(tempList);
		System.out.println("list + " + list);
		
		//list가 비었는지 확인 : isEmpty()
		System.out.println(list.isEmpty());
		
		//list 전체 비우기
		list.clear();
		System.out.println("list : " + list);
		System.out.println(list.isEmpty());
		
		
		Arrays.asList(new String[] {"java", "python", "c++", "html"});
		
		List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"});
		
		System.out.println(asList);
		
		list.addAll(asList);
		System.out.println("list : " + list);
		
		//실습! list의 요솟값들을 반복문을 통해 하나씩 출력
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//foreach
		System.out.println("<<<foreach>>>");
		for(String str : list) {
			System.out.println(str);
		}
		
		String roles = "USER,ADMIN,TEST_USER";
		/*
		 * 실습!
		 * 쉼표로 구분해서 배열에 넣기
		 * 배열이름은 rolesArray
		 * 배열을 list로 만들어서 반복을 통해 하나씩 출력
		 */
		
		
		String[] rolesArray = new String[3];
		rolesArray[0] = roles.substring(0, roles.indexOf(","));
		rolesArray[1] = roles.substring(roles.indexOf(",") + 1, roles.lastIndexOf(","));
		rolesArray[2] = roles.substring(roles.lastIndexOf(",") + 1, roles.length());
		
		System.out.println(rolesArray[0]);
		System.out.println(rolesArray[1]);
		System.out.println(rolesArray[2]);
		System.out.println("<<<반복문으로 출력>>>");
		List<String> roleList = Arrays.asList(rolesArray);	
		for(int i = 0; i < roleList.size(); i++) {
			System.out.println(roleList.get(i));
		}
		
		for(String str : roleList) {
			System.out.println(str);
		}
		
		//splist 함수 활용
		System.out.println();
		String[] roleArray2 = roles.split(",");
		System.out.println(roleArray2[0]);
		System.out.println(roleArray2[1]);
		System.out.println(roleArray2[2]);
		
		//람다식
		Arrays.asList(roleArray2).forEach(arg ->{
			System.out.println("role : " + arg);
		});
		
		

		
	}

}
