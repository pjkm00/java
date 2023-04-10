package idolGame;

import java.util.Scanner;

public class Training {
	Scanner sc = new Scanner(System.in);
	int input;
	

	
	void training(int a, TraineeAll[] TA) {
		System.out.println("어떤 연습을 시키시겠습니까?");
		System.out.println("1.보컬연습  2.댄스연습  3.랩 연습  4.작사작곡 연습   0.뒤로가기");
		input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			vocalTraining(a, TA);
			break;
		case 2:
			danceTraining(a, TA);
			break;
		case 3:
			rapTraining(a, TA);
			break;
		case 4: 
			comTraining(a, TA);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
	}
	
	void vocalTraining(int a, TraineeAll[] TA) {
		System.out.println("어떤 방식으로 하시겠습니까?");
		System.out.println("1.개인연습(보컬능력치 +1, hp -1)  2.트레이너 고용(보컬능력치 +5, 돈 -1000, hp -5)   0.뒤로가기");
		input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			voTr1(a, TA);
			break;
		case 2:
			if(Company.commoney < 1000) {
				System.out.println("돈이 부족하여 연습을 진행할 수 없습니다.");
				break;
			}
			voTr2(a, TA);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
	}
	
	void voTr1(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 보컬능력치가 1 상승하였습니다.");
		TA[a].vocal++;
		TA[a].hp--;
	}
	
	void voTr2(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 보컬능력치가 5 상승하였습니다.");
		TA[a].vocal += 5;
		Company.commoney -= 1000;
		TA[a].hp -= 5;
	}
	
	
	void danceTraining(int a, TraineeAll[] TA) {
		System.out.println("어떤 방식으로 하시겠습니까?");
		System.out.println("1.개인연습(댄스능력치 +1, hp -1)  2.트레이너 고용(댄스능력치 +5, 돈 -1000, hp -5)   0.뒤로가기");
		input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			daTr1(a, TA);
			break;
		case 2:
			if(Company.commoney < 1000) {
				System.out.println("돈이 부족하여 연습을 진행할 수 없습니다.");
				break;
			}
			daTr2(a, TA);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
		
	}
	
	void daTr1(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 댄스능력치가 1 상승하였습니다.");
		TA[a].dance++;
		TA[a].hp--;
	}
	
	void daTr2(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 댄스능력치가 5 상승하였습니다.");
		TA[a].dance += 5;
		Company.commoney -= 1000;
		TA[a].hp -= 5;
	}
	
	
	void rapTraining(int a, TraineeAll[] TA) {
		System.out.println("어떤 방식으로 하시겠습니까?");
		System.out.println("1.개인연습(랩능력치 +1, hp -1)  2.트레이너 고용(랩능력치 +5, 돈 -1000, hp -5)   0.뒤로가기");
		input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			raTr1(a, TA);
			break;
		case 2:
			if(Company.commoney < 1000) {
				System.out.println("돈이 부족하여 연습을 진행할 수 없습니다.");
				break;
			}
			raTr2(a, TA);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
		
	}
	
	void raTr1(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 랩능력치가 1 상승하였습니다.");
		TA[a].rap++;
		TA[a].hp--;
	}
	
	void raTr2(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 랩능력치가 5 상승하였습니다.");
		TA[a].rap += 5;
		Company.commoney -= 1000;
		TA[a].hp -= 5;
	}
	
	
	
	void comTraining(int a, TraineeAll[] TA) {
		System.out.println("어떤 방식으로 하시겠습니까?");
		System.out.println("1.개인연습(작사작곡능력치 +1, hp -1)  2.트레이너 고용(작사작곡능력치 +5, 돈 -1000, hp -5)   0.뒤로가기");
		input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			coTr1(a, TA);
			break;
		case 2:
			if(Company.commoney < 1000) {
				System.out.println("돈이 부족하여 연습을 진행할 수 없습니다.");
				break;
			}
			coTr2(a, TA);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
		
	}
	
	void coTr1(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 작사작곡능력치가 1 상승하였습니다.");
		TA[a].compose++;
		TA[a].hp--;
	}
	
	void coTr2(int a, TraineeAll[] TA) {
		System.out.println(TA[a].traineeName + "의 작사작곡능력치가 5 상승하였습니다.");
		TA[a].compose += 5;
		Company.commoney -= 1000;
		TA[a].hp -= 5;
	}
	
	
}
