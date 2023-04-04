package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열>>
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 */

		int[] array;        //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 주소가 저장된다.
		
		
//		int[] array2 = new int[5];
		
//		array = new int[] {1, 2, 3, 4, 5};
//		array = {1, 2, 3, 4, 5};      //이 방법은 변수의 선언과 동시에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5};
		
//		System.out.println(array2[0]);
//		System.out.println(array2[1]);
//		System.out.println(array2[2]);
//		System.out.println(array2[3]);
//		System.out.println(array2[4]);
//		
//		int sum = 0;
//		for(int i = 0; i < array2.length; i++) {
//			sum += array2[i];
//		}
//		System.out.println("합계 : " + sum);
		
//		int[] arrayx;
//		arrayx = new int[10];
//		
//		for(int i = 0; i < arrayx.length; i++) {
//			arrayx[i] = (int)(Math.random() * 100) + 1;
//		}
//		
//		System.out.println(Arrays.toString(arrayx));
		
		//위에서 만든 임의의 숫자 10개 배열에서 최대값과 최소값을 구해주세요.
		
//		int max = arrayx[0];
//		int min = arrayx[0];
//		for(int i = 0; i < arrayx.length; i++) {
//			max = Math.max(max, arrayx[i]);
//			min = Math.min(min, arrayx[i]);
//		}
//		
//		System.out.println(max);
//		System.out.println(min);
//		
//		
//		for(int i = 0; i < arrayx.length; i++) {
//			if(min > arrayx[i]) {
//				min = arrayx[i];
//			}
//			if(max < arrayx[i]){
//				max = arrayx[i];
//			}	
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		//1~10까지의 숫자를 배열 x에 랜덤하게 배치하세요.
		
//		int[] x = new int[10];
//		int a = 0;
//		
//		random : do {
//			int ran = (int)(Math.random()*10) + 1;
//			for(int i = 0; i < x.length; i++) {
//				if(x[i] == ran) {
//					continue random;
//				}
//			}
//			x[a] = ran;
//			a++;
//		}while(a < x.length);
//		
//		System.out.println(Arrays.toString(x));
		
		
		
//		int[] x = new int[10];
//		
//		for(int i = 0; i < x.length; i++) {
//			x[i] = (int)(Math.random()*10 + 1);
//			for(int j = 0; j < i; j++) {
//				if(x[i] == x[j]) {
//					i--;
//				}
//			}
//
//		}
//		System.out.println(Arrays.toString(x));
		
		
		
//		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int temp = 0;
//	
//		for(int i = 0; i < x.length; i++) {
//			int r = (int)(Math.random()*x.length);
//			temp = x[i];
//			x[i] = x[r];
//			x[r] = temp;
//		}
//		System.out.println(Arrays.toString(x));
		
		//0에서 9사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 배열에 담아 출력해주세요.
		
//		int[] Num = new int[10];
//		
//		for(int i = 0; i < 500; i++) {
//			int ran = (int)(Math.random()*Num.length);
//			Num[ran] = Num[ran] + 1;
//		}
//		System.out.println(Arrays.toString(Num));
//		
//		int a = 0;
//		for(int i = 0; i < ; i++) {
//			a= a + Num[i];
//		}
//		System.out.println(a);
		
		//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.println("최소값을 입력해주세요.");
		int min = Integer.parseInt(s.nextLine());
		System.out.println("최대값을 입력해주세요.");
		int max = Integer.parseInt(s.nextLine());
		System.out.println("반복횟수를 입력해주세요.");
		int repet = Integer.parseInt(s.nextLine());
		
		int[] Num2 = new int[max - min + 1];
		for(int i = 0; i < repet; i++) {
			int ran = (int)(Math.random()*(max - min + 1) + min);
			Num2[ran - min] = Num2[ran - min] + 1;
		}
		System.out.println(Arrays.toString(Num2));
		
		
		
		
		
		
		
		
	}
	

}
