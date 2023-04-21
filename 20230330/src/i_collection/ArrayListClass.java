package i_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {

		/*
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가후 성공 여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.(한 칸씩 뒤로 민다.)
		 * Object set(int index, Object) : 지정된 위치에 객체를 저장 후 기존 객체를 반환함
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * int size() : 리스트의 길이, 저장된 객체수를 반환한다.
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		// <> 제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다. 따라서 제네릭 타입의 사용이 권장된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
//		list.add("abc");
		list.add(20);
		System.out.println(list.add(30)); 	//잘 저장되었는지 확인. 참이나 거짓으로 나옴
		System.out.println(list);
		
		list.add(1, 40);  			//1번 인덱스부터 뒤로 밀고 40 값을 저장
		System.out.println(list);
		
//		list.add(7, 50);   			순서대로만 저장할 수 있다.
		Integer before = list.set(2, 50);	//2번 인덱스에 50을 넣고 기존 2번 인덱스 값을 반환
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.get(i));
//			list.remove(i);
//			
//		}
//		System.out.println(list);
		
		//list의 객체 모두 삭제
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.get(i));
//			list.remove(i);
//			i--;
//		}
		
//		list.clear();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		System.out.println(list);
		
		//list에 1부터 100까지 랜덤값을 10개 저장해주세요
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합과 평균을 구해주세요.
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("합계는 " + sum + ", 평균은 " + (double)sum / 10);
		
		
		//list에서 최솟값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("최댓값 : " + max + ", 최솟값 : " + min);
		
		
		//오름차순으로 정리하세요
		int temp = 0;
		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j >= 1; j--) {
				int k = j - 1;
				if(list.get(j) < list.get(k)) {
					temp = list.get(j);
					list.set(j, list.get(k));
					list.set(k, temp);
				}else {
					break;
				}
			}
			
		}
		
		System.out.println(list);
		
		
	}

}
