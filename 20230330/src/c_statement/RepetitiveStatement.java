package c_statement;

import java.util.Scanner;

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
		
//		for (int i = 1; i <= 5; i++) {
//			for(int j = 5; j > i; j--) {
//				System.out.print(" ");
//				}
//			for(int k = 1; k <= i; k++ ) {
//					System.out.print("*");
//				}
//			System.out.println("");
//		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
//		for(int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--){
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 5; j >= i; j--){
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		
	
//		for (int i = 0; i < 5; i++) {
//			for(int j = 4; j > i; j--) {
//				System.out.print(" ");
//				}
//			for(int k = 0; k <= i*2; k++ ) {
//					System.out.print("*");
//				}
//			System.out.println("");
//		}
//	
//		for (int i = 0; i < 5; i++) {
//			for(int j = 4; j > i; j--) {
//				System.out.print(" ");
//				}
//			for(int k = 0; k <= i; k++ ) {
//					System.out.print("*");
//				}
//			for(int k = 0; k <= i; k++ ) {
//				if(k == 0) {
//					continue;
//				}
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	
		
		/* 
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i; j++){
//				System.out.print(" ");
//			}
//			for(int j = 9; j > i*2; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println("");
//		}
		
	     
//		for (int i = 0; i < 5; i++) {
//			for(int j = 4; j > i; j--) {
//				System.out.print(" ");
//				}
//			for(int k = 0; k <= i*2; k++ ) {
//					System.out.print("*");
//				}
//			System.out.println("");
//		}
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++){
//				System.out.print(" ");
//			}
//			for(int j = 7; j > i*2; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println("");
//		}
		
		/*
		 * <<while>>
		 * - while(조건식){}
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을 때 사용
		 */
	
//		int a = 0;
//		while(a < 10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println("");
//		for(int i = 0; i < 10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("");
//		int b = 0;
//		while(true) {
//			if(b > 10) {
//				break;
//			}
//			System.out.print(b + " ");
//			b++;
//		}
		
		//사용자가 입력한 단의 구구단을 출력하는 프로그램을 만들어주세요.
		//특정 값을 입력했을 때 종료가 되게 만들어주세요.
//		Scanner s = new Scanner(System.in);
//		System.out.println("구구단 출력 프로그램");
//		while(true) {
//			System.out.println("몇단을 출력할까요? (0 : 종료)");
//			String input1 = s.nextLine();
//			boolean result1 = input1.matches("[0-9]+");
//			if(result1) {
//				int num = Integer.parseInt(input1);
//				
//				if(num == 0) {
//					System.out.println("종료되었습니다.");
//					break;
//				}else if(num > 9){
//					System.out.println("1~9까지의 숫자를 입력하세요");
//					continue;
//				}
//				
//				int a = 1;
//				while(a <= 9) {
//					System.out.println(num + " X " + a + " = " + num*a);
//					a++;
//				}
//			}else {
//				System.out.println("숫자를 입력하세요.");
//			}
//		}
		
		
			//while문과 do-while문 비교
//		int a = 0;
//		while(a < 0) {
//			System.out.println(a + " ");
//			a++;
//		}
//		System.out.println();
		
		
//		a = 0;
//		do {System.out.print(a + " ");
//			a++;
//		}while(a < 0);
//		System.out.println();
//			
//		a = 0;
//		while(a < 10) {
//			System.out.print(a + " ");
//			a++;
//		}
//		System.out.println();
//		
//		
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		}while(a < 10);
//		System.out.println();
	
//		int a = 0;
//		do {
//			System.out.print(a + " ");
//			++a;
//		}while(a < 10);
		
		//숫자 맞추기 게임을 만들어 봅시다.
		Scanner s = new Scanner(System.in);
		System.out.println("숫자맞추기게임");
		int ranNum = (int)(Math.random() * 100 + 1);
		int inNum = 0;
//		System.out.println("1부터 100사이의 숫자를 입력해주세요.(기회는 10번)");
//		
//		
//		numGame : do {
//			for(int i = 9; i >= 0; i--) {
//				String input = s.nextLine();
//				boolean res = input.matches("[0-9]+");
//				if(i == 0) {
//					System.out.println("정답은 " + ranNum + " 당신이 졌습니다.");
//					break numGame;
//				}
//				if(res) {
//					inNum = Integer.parseInt(input);
//					if(inNum > 100 || inNum < 1) {
//						System.out.println("1부터 100 사이의 숫자를 입력해주세요");
//					}else if(inNum < ranNum) {
//						System.out.println("Up");
//					}else if(inNum > ranNum){
//						System.out.println("Down");
//					}else {
//						System.out.println("정답입니다.");
//						break;
//					}
//				}else {
//					System.out.println("숫자를 입력해주세요.");
//				}
//				System.out.println(i + "번 남았습니다.");
//			}
//		}while(inNum != ranNum);
		
		
		
		
		System.out.println("정답을 맞출 횟수를 정하세요.");
		int userRepet = Integer.parseInt(s.nextLine());
		System.out.println("1부터 100사이의 숫자를 입력해주세요.");
		int repet = 0;
		do {
			if(userRepet == repet) {
				System.out.println(userRepet + "회의 기회가 모두 끝났습니다. 게임을 종료합니다.");
				break;
			}
				String input = s.nextLine();
				boolean res = input.matches("[0-9]+");
				if(res) {
					inNum = Integer.parseInt(input);
					if(inNum > 100 || inNum < 1) {
						System.out.println("1부터 100 사이의 숫자를 입력해주세요");
					}else if(inNum < ranNum) {
						System.out.println("Up");
					}else if(inNum > ranNum){
						System.out.println("Down");
					}else {
						System.out.println("정답입니다.");
						break;
					}
				}else {
					System.out.println("숫자를 입력해주세요.");
				}
			repet++;
		}while(inNum != ranNum);
		
		
		
		
		
		
		
	}

}
