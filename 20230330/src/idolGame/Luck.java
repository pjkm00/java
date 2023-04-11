package idolGame;

import java.util.Scanner;

public class Luck {
	
	Scanner sc = new Scanner(System.in);
	
	
	void luck() {
		System.out.println("5000원을 지불하여 행운뽑기를 진행하시겠습니까?(5000원보다 적은 상품이 나올 수 있습니다.) 예(1) 아니오(2)");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			switch(i1) {
			case 1:
				Company.commoney -= 5000;
				int random = (int)(Math.random()*10)+1;
				switch(random) {
				case 1:
					System.out.println("꽝! 다음기회에...");
					break;
				case 2:
				case 3:
					System.out.println("1000원 획득");
					Company.commoney += 1000;
					break;
				case 4:
				case 5:
					System.out.println("3000원 획득");
					Company.commoney += 3000;
					break;
				case 6:
				case 7:
					System.out.println("5000원 획득");
					Company.commoney += 5000;
					break;
				case 8:
					System.out.println("10000원 획득");
					Company.commoney += 10000;
					break;
				case 9:
					System.out.println("20000원 획득");
					Company.commoney += 20000;
					break;
				case 10:
					System.out.println("30000원 획득");
					Company.commoney += 30000;
					break;
				}
				break;
			case 2:
				break;
			}
		}else {
			System.out.println("숫자를 입력해주세요.");
		}
	}
}
