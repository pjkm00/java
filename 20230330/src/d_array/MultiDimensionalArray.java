package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * <<다차원배열>>
		 * - 배열 안에 배열이 저장되어 있는 형태이다.
		 */
		
		
		int[][] numbers = new int[2][3]; //2칸 짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		int numbers2[][] = new int[][] { {1, 2, 3}, {4, 5, 6} }; //값의 개수로 배열의 길이가 정해진다.
		
		int[][] numbers3 = new int[3][]; //가변배열
		//numbers3배열의 각각 인덱스에 (0, 1, 2) 크기가  3, 4, 10인 배열들을 생성해보세요.
		numbers3[0] = new int[3];
		numbers3[1] = new int[4];
		numbers3[2] = new int[10];
		
//		numbers3 = 10;    //1차원에 값을 저장할 수 없다.
		numbers3[0][0] = 10;
		numbers3[0][1] = 20;
		numbers3[1][0] = 100; 
		
//		System.out.println(Arrays.deepToString(numbers3));
		
		//numbers 배열에 1~100의 숫자 중 임의의 숫자를 입력해주세요.
		
//		for(int i = 0; i < numbers.length; i++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				int ran = (int)(Math.random()*100)+1;
//				numbers[i][j] = ran;
//			}
//		}
//
//		System.out.println(Arrays.deepToString(numbers));
		
		//1차원의 길이는 3이고 2차원의 길이는 5인 배열을 만들고,
		//모든 인덱스에 1~100 사이의 랜덤한 값을 저장하세요.
		//그리고 그 2차원 배열에 들어간 값들의 합과 평균을 저장할 배열을 각각 만들어 출력해주세요.
		int[][] num4 = new int[3][5];
		int[] sumA = new int[num4.length];
		double[] avgA = new double[num4.length];
		
		
		for(int i = 0; i < num4.length; i++) {
			for(int j = 0; j < num4[i].length; j++) {
				int ran = (int)(Math.random()*100)+1;
				num4[i][j] = ran;
			}
		}
		
		
		for(int i = 0; i < num4.length; i++) {
			for(int j = 0; j < num4[i].length; j++) {
				sumA[i] += num4[i][j];
			}
		}
		
		for(int i = 0; i < sumA.length; i++) {
			avgA[i] = (double)sumA[i]/sumA.length;
		}
		
		
		System.out.println("배열 : " + Arrays.deepToString(num4));
		System.out.println("합계 : " + Arrays.toString(sumA));
		System.out.println("평균 : " + Arrays.toString(avgA));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
