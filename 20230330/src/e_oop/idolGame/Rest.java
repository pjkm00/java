package e_oop.idolGame;

import java.util.Scanner;

public class Rest {

	
	Scanner sc = new Scanner(System.in);

	
	void selRest(Member[] m, int i) {
		System.out.println("1.하루휴식(hp+1)  2.휴가(hp+10, 돈-10000)  3.체력회복음료(hp+50, 돈-100000)  0.뒤로가기");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			this.one(m, i);
			break;
		case 2:
			if(Company.commoney < 10000) {
				System.out.println("돈이 부족하여 휴가를 보낼 수 없습니다.");
				break;
			}
			this.holiday(m, i);
			break;
		case 3:
			if(Company.commoney < 100000) {
				System.out.println("돈이 부족하여 음료를 구매할 수 없습니다.");
				break;
			}
			this.hpdrink(m, i);
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
	}
	
	void one(Member[] m, int i) {
		m[i].hp += 1;
		System.out.println("하루 휴식을 취하여 " + m[i].stageName + "의 hp가 1 증가하였습니다.");
	}
	
	void holiday(Member[] m, int i) {
		m[i].hp += 10;
		Company.commoney -= 10000;
		System.out.println("휴가를 가서 " + m[i].stageName + "의  hp가 10 증가하였습니다.");
	}
	
	void hpdrink(Member[] m, int i) {
		m[i].hp += 50;
		Company.commoney -= 100000;
		System.out.println("회복음료를 마셔 " + m[i].stageName + "의 hp가 50 증가하였습니다.");
	}
}
