package idolGame;

import java.util.Scanner;

public class Rest {

	
	Scanner sc = new Scanner(System.in);

	
	void selRest(Member[] m, int i) {
		System.out.println("1.하루휴식(hp +5)  2.휴가(hp +20, 돈 -5000, Day +3)  3.체력회복음료(hp +50, 돈 -50000)  0.뒤로가기");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int	i1 = Integer.parseInt(input);
			switch(i1) {
			case 1:
				this.one(m, i);
				Company.day++;
				break;
			case 2:
				if(Company.commoney < 5000) {
					System.out.println("돈이 부족하여 휴가를 보낼 수 없습니다.");
					break;
				}
				this.holiday(m, i);
				Company.day += 3;
				break;
			case 3:
				if(Company.commoney < 50000) {
					System.out.println("돈이 부족하여 음료를 구매할 수 없습니다.");
					break;
				}
				this.hpdrink(m, i);
				Company.day++;
				break;
			case 0:
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
			if(m[i].hp >= Debut.maxhp) {
				m[i].hp = 100;
			}
		}else {
			System.out.println("숫자를 입력하세요.");
		}
	}
	
	void one(Member[] m, int i) {
		m[i].hp += 5;
		System.out.println("하루 휴식을 취하여 " + m[i].stageName + "의 hp가 5 증가하였습니다.");
	}
	
	void holiday(Member[] m, int i) {
		m[i].hp += 20;
		Company.commoney -= 5000;
		System.out.println("휴가를 가서 " + m[i].stageName + "의  hp가 20 증가하였습니다.");
	}
	
	void hpdrink(Member[] m, int i) {
		m[i].hp += 50;
		Company.commoney -= 50000;
		System.out.println("회복음료를 마셔 " + m[i].stageName + "의 hp가 50 증가하였습니다.");
	}
}
