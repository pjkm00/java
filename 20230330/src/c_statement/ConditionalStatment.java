package c_statement;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String[] args) {
		/*
		 * <<if문>>
		 * - if : 조건식의 결과가 true이면 블럭 안의 문장을 수행한다.
		 * - else if : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */

//		int a = 10;
//		if(a < 100) {
//			System.out.println("조건식의 연산결과가 true이면 수행된다.");
//		}
//		
//		if(a < 10){
//			System.out.println("조건식의 연산결과가 false 이면 수행되지 않는다.");
//		}
		
		//주민등록번호 앞자리에 따른 성별확인 코드(if문)
		int regNo = 4; //주민등록번호 첫자리
		String gender = null; //성별
		
		//조건문
//		if(regNo == 1 || regNo == 3) {
//			gender = "남자";
//		}else if(regNo == 2 || regNo == 4) {
//			gender = "여자";
//		}else {
//			gender = "확인불가";
//		}
//		
//		System.out.println("당신의 성별은 " + gender + "입니다.");
//		
//		Scanner s = new Scanner(System.in);
		
//		System.out.println("주민등록번호 뒷자리의 첫번째 숫자를 입력해주세요.");
//		String input = s.nextLine();
//		boolean result = input.matches("[0-9]");
//		
//		if(result) {
//			int inputNum = Integer.parseInt(input);
//			if(inputNum == 1 || inputNum == 3) {
//				gender = "남자";
//			}else if(inputNum == 2 || inputNum == 4) {
//				gender = "여자";
//			}else {
//				gender = "확인불가";
//			}
//		System.out.println("당신의 성별은 " + gender + "입니다.");	
//		}else {
//			System.out.println("숫자를 입력해주세요.");
//		}
//		
//		s.close();
		
		//성적에 등급을 부여하는 프로그램을 작성하세요.
//		System.out.println("점수를 입력하세요.");
//		String input1 = s.nextLine();
//		boolean result1 = input1.matches("[0-9]+");
//		
//		if(result1) {
//			int score = Integer.parseInt(input1);
//			String grade = "";
//			if(score <= 100 && score >= 90) {
//				grade = "A";
//			}else if(score < 90 && score >= 80) {
//				grade = "B";
//			}else if(score < 80 && score >= 70) {
//				grade = "C";
//			}else if(score < 70 && score >= 60) {
//				grade = "D";
//			}else if (score < 60 && score >= 0){
//				grade = "F";
//			}else {
//				grade = "확인 불가";
//			}
//			System.out.println("당신의 등급은 " + grade + "입니다.");
//		}else {
//			System.out.println("숫자를 입력해주세요.");
//		}
		//숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요.
//		System.out.println("숫자를 입력해주세요.");
//		Scanner s = new Scanner(System.in);
//		int num = Integer.parseInt(s.nextLine()); //값이 String으로 들어오기 때문에 int타입으로 형변환 해줘야함		
//		switch (num) {
//		case 0:
//			System.out.println("입력한 숫자는 0입니다.");
//			break;
//		default:
//			System.out.println("입력한 숫자는 0이 아닙니다.");
//			break;
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		System.out.println("숫자를 입력해주세요.");
		Scanner s = new Scanner(System.in);
//		int num = Integer.parseInt(s.nextLine());
//		if(num % 2 == 0) {
//			System.out.println(num + "은 짝수입니다.");
//		}else {
//			System.out.println(num + "은 홀수입니다.");
//		}
		//두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요.
//		System.out.println("숫자를 입력해주세요.");
//		int num1 = Integer.parseInt(s.nextLine());
//		System.out.println("숫자를 입력해주세요.");
//		int num2 = Integer.parseInt(s.nextLine());
//		if(num1 > num2) {
//			System.out.println(num1 + "이 더 큰 수입니다.");
//		}else if(num1 < num2) {
//			System.out.println(num2 + "이 더 큰 수입니다.");
//		}else {
//			System.out.println("두 수가 같습니다.");
//		}
		
		//세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = Integer.parseInt(s.nextLine());
		System.out.println("세번째 숫자를 입력해주세요.");
		int num3 = Integer.parseInt(s.nextLine());
//		if(num1 >= num2) {
//			if(num1 > num3) {
//				System.out.println("가장 큰 숫자는 " + num1 + "입니다.");
//			}else {
//				System.out.println("가장 큰 숫자는 " + num3 + "입니다.");
//			}
//		}else if(num1 < num2) {
//			if(num2 > num3) {
//				System.out.println("가장 큰 숫자는 " + num2 + "입니다.");
//			}else {
//				System.out.println("가장 큰 숫자는 " + num3 + "입니다.");
//			}
//		}
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 숫자는 " + num1 + "입니다.");
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 숫자는 " + num2 + "입니다.");
		}else {
			System.out.println("가장 큰 숫자는 " + num3 + "입니다.");
		}
		
		
		
	}

}
