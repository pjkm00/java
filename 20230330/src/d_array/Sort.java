package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		//석차구하기
		//처음에는 다 1등으로 시작해서 비교
//		int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; //등수를 저장할 배열
//		int min = arr[0];
//		for(int i = 0; i <= arr.length; i++) {
//			for(int j = i + 1; j <= arr.length - 1; j++) {
//				if(arr[i] > arr[j]) {
//					arr2[j]++;
//				}else if(arr[i] < arr[j]) {
//					arr2[i]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr2));
		
		
//		int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};	// 등수를 저장할 배열
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] > arr[i]) arr2[i]++;
//			}
//		}
//		System.out.println(Arrays.toString(arr2));
		
		
		
		//선택정렬
//		int temp = 0;
	
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}else if(arr[i] == arr[j]) {
//					arr[i] = arr[j];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//선생님꺼
//		System.out.println("===========");
//		System.out.println("선택정렬");
//		System.out.println("===========");
//		int temp = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			int minIdx = i;
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[j] < arr[minIdx]) {
//					minIdx = j;
//				}
//			}
//			temp = arr[i];
//			arr[i] = arr[minIdx];
//			arr[minIdx] = temp;
//			
//			System.out.println(Arrays.toString(arr));
//		}
		
		
		//삽입정렬
//		int temp = 0;
//		for(int i = 1; i < arr.length; i++) {
//			for(int j = i - 1; j >= 0; j--) {
//				if(arr[i] < arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					i--;
//				}else {
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int temp = 0;
//		for(int i = 1; i < arr.length; i++) {
//			for(int j = i; j >= 1; j--) {
//				if(arr[j] < arr[j - 1]) {
//					temp = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j - 1] = temp;
//				}else {
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));

		//버블정렬
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean changed = false;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		

	}

}
