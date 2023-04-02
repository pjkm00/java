package c_statement;

public class RepetitiveStatement {

	public static void main(String[] args) {
		
		/*
		 * <<for문>>
		 * - for(int i = 0; i < 10; i++){}
		 * - for(1부터 10까지 1씩 증가하면서 반복){}
		 */
		
//		for(int i = 0; i <= 10; i++) {
//			//for(초기화; 조건식; 증감식){}
//			//초기화 : 조건식과 증감식에 사용할 변수 초기화
//			//조건식 : 연산결과가 true이면 블럭 안의 내용을 수정한다.
//			//증감식 : 변수를 증가/감소 시켜 반복문을 제어한다.
//			System.out.println(i + "번째 반복");//초기화한 변수를 블럭 안에서 사용할 수 있다.
//		}

//		int i;
//		for(i = 0; i < 3; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("==============================");
		
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		
//		for(int i = 0; i < 10; i += 2) {
//			System.out.println(i);
//		}

//		for(int i = 0; ; i++) {
//			System.out.println(i*1000);
//		}//무한루프
		
//		for(;;) {
//			System.out.println("무한루프");
//		}
		
//		for(int i = 0; ; i++) {
//			if(i > 10) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("무한루프 탈출");
		
		//1부터 100까지 짝수의 합을 구해보세요.
//		int sum = 0;
//		for(int i = 0; i <= 100; i += 2) {
//			sum = sum + i;
//		}
//		System.out.println("1부터 100까지 짝수의 합은 " + sum);
		
		//구구단 출력하기
		//구구단 2단을 출력해주세요.
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 */
//		for(int i = 1; i < 10; i++) {
//			int mul = 2 * i;
//			System.out.println("2 X " + i + " = " + mul);
//		}
		
		//구구단을 1단부터 9단까지 출력해주세요.
		//각 단을 구분하기 위해 단이 끝나면 "============"로 구분해주세요.
//		for(int i = 1; i < 10; i++) {
//			System.out.println(i +"단");
//			for(int j = 1; j < 10; j++) {
//				int mul = i * j;
//				System.out.println(i + " X " + j + " = " + mul);
//			}
//			System.out.println("=========================================");
//		}

		/*
		 * 아래와 같은 삼각형을 출력해주세요.
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
//		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
//		for (int i = 0; i < 5; i++) {
//			for(int j = 4; j > i; j--) {
//				System.out.print(" ");
//				}
//			for(int k = 0; k <= i; k++ ) {
//					System.out.print("*");
//				}
//			System.out.println("");
//		}
		
		for (int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
				}
			for(int k = 0; k <= i; k++ ) {
					System.out.print("*");
				}
			for(int k = 0; k <= i; k++ ) {
				if(k == 0) {
					continue;
				}
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
	}

}
