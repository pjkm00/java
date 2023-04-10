package e_oop.idolGame;

import java.util.Scanner;

public class RestT {
Scanner sc = new Scanner(System.in);

	
	void selRest(TraineeAll[] TA, int i) {
		System.out.println("1.하루휴식(hp+1)  2.휴가(hp+10, 돈-10000)  3.체력회복음료(hp+50, 돈-50000)  0.뒤로가기");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			this.one(TA, i);
			break;
		case 2:
			if(Company.commoney < 10000) {
				System.out.println("돈이 부족하여 휴가를 보낼 수 없습니다.");
				break;
			}
			this.holiday(TA, i);
			break;
		case 3:
			if(Company.commoney < 50000) {
				System.out.println("돈이 부족하여 음료를 구매할 수 없습니다.");
				break;
			}
			this.hpdrink(TA, i);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
		if(TA[i].hp >= Debut.maxhp) {
			TA[i].hp = 100;
		}
	}
	
	void one(TraineeAll[] TA, int i) {
		TA[i].hp += 1;
		System.out.println("하루 휴식을 취하여 " + TA[i].traineeName + "의 hp가 1 증가하였습니다.");
	}
	
	void holiday(TraineeAll[] TA, int i) {
		TA[i].hp += 10;
		Company.commoney -= 10000;
		System.out.println("휴가를 가서 " + TA[i].traineeName + "의 hp가 10 증가하였습니다.");
	}
	
	void hpdrink(TraineeAll[] TA, int i) {
		TA[i].hp += 50;
		Company.commoney -= 50000;
		System.out.println("회복음료를 마셔 " + TA[i].traineeName + "의 hp가 50 증가하였습니다.");
	}
}
