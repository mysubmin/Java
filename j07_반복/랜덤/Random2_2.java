package j07_반복.랜덤;

import java.util.Random;

public class Random2_2 {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 
		 * 랜덤으로 0 ~ 9까지의 수를 10개의 값을 뽑고 그 수 중 가장 큰 값을 출력
		 */
		Random random = new Random();
		
		int i = 0;
		int temp = 0;
		
		while(i < 10) {
			int rNum = random.nextInt(10);
			System.out.print(rNum + " ");
//			if(rNum > temp) {
//				temp = rNum;
//			}
			if(i == 0) { 		//초기값 출처 초기화
				temp = rNum;
			}else {
				if(temp < rNum) {
					temp = rNum;
				}
			}
			System.out.println("새로 생성된 값 : " + rNum); // 값 확인
			System.out.println("기준값 : " + temp);
			
			i++;
		}
		System.out.println("\n가장 큰 수 : " + temp);

	}

}
