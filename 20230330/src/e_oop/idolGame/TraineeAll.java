package e_oop.idolGame;

import java.util.Scanner;

public class TraineeAll {
	String traineeName = "연습생";
	int vocal;
	int dance;
	int rap;
	int hp;
	int fan;
	String grade;
	
	Scanner sc = new Scanner(System.in);
	
	TraineeAll(){
		
	}
	
	TraineeAll(int i) {
		traineeName = "연습생" + (i + 1);
		vocal = 0;
		dance = 0;
		rap = 0;
		hp = 100;
		fan = 0;
		grade = null;
	}
	
	
	
	void RandomTn(TraineeAll[] TA) {
		
		random : while(true) {
			System.out.println("어떤 방식으로 연습생을 뽑으시겠습니까?");
			System.out.println("1. 길거리 캐스팅(0원)  2. 오디션(10000원)  0. 뒤로가기");
			
			int input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				this.geRandomTn(TA);
				break;
			case 2:
				this.sPRandomTn(TA);
				break;
			case 0:
				break random;
			default:
			    System.out.println("지원하지 않는 키입니다.");
			    break;
			}
		}
	}
	
	void geRandomTn(TraineeAll[] TA) {
		
		traineeName = "연습생";
		vocal = (int)(Math.random()*70)+1;
		dance= (int)(Math.random()*70)+1;;
		rap = (int)(Math.random()*70)+1;;
		hp = 100;
		fan = 0;
		if(vocal + dance + rap >= 250) {
			grade = "SSR";
		}else if(vocal + dance + rap >= 200) {
			grade = "SR";
		}else if(vocal + dance + rap >= 150) {
			grade = "R";
		}else {
			grade = "N";
		}
		this.scout(TA);
		
	}
	
	void sPRandomTn(TraineeAll[] TA) {
		traineeName = "연습생";
		vocal = (int)(Math.random()*50)+30;
		dance= (int)(Math.random()*50)+30;
		rap = (int)(Math.random()*50)+30;
		hp = 100;
		fan = 0;
		if(vocal + dance + rap >= 250) {
			grade = "SSR";
		}else if(vocal + dance + rap >= 200) {
			grade = "SR";
		}else if(vocal + dance + rap >= 150) {
			grade = "R";
		}else {
			grade = "N";
		}
		Company.commoney = Company.commoney - 10000;
		this.scout(TA);
	}
	
	void scout(TraineeAll[] TA) {
		System.out.println("뽑기 성공!");
		System.out.println("=============연습생 정보=============");
		System.out.println("보컬능력 : " + vocal);
		System.out.println("댄스능력 : " + dance);
		System.out.println("랩능력 : " + rap);
		System.out.println("등급 : " + grade);
		System.out.println("=================================");
		System.out.println("영입 하시겠습니까? 예(1) 아니오(2)");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			System.out.println("몇 번째 연습생으로 영입하시겠습니까?(연습생은 5명까지 영입가능합니다.)");
			int a = Integer.parseInt(sc.nextLine());
			this.tnNum(a - 1, TA, vocal, dance, rap, grade);
			System.out.println("영입되었습니다. 연습생 관리에서 확인하세요.");
			break;
		case 2:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
	}
	
	void tnNum(int a, TraineeAll[] TA, int v, int d, int r, String g) {
			TA[a].vocal = v;
			TA[a].dance = d;
			TA[a].rap = r;
			TA[a].grade = g;
		
	}
	
	void traineeList(TraineeAll[] TA) {
		System.out.println("연습생은 최대 5명까지 영입할 수 있습니다.");
		System.out.println("몇 번 연습생을 관리하시겠습니까?");
		int input = Integer.parseInt(sc.nextLine());
		traineeInfo(input - 1, TA);
		
	}
	
	void traineeInfo(int a, TraineeAll[] TA) {
		traineeName = TA[a].traineeName;
		vocal = TA[a].vocal;
		dance = TA[a].dance;
		rap = TA[a].rap;
		grade = TA[a].grade;
		System.out.println("==========" + traineeName + "==========");
		System.out.println("보컬능력 : " + vocal);
		System.out.println("댄스능력 : " + dance);
		System.out.println("랩능력 : " + rap);
		System.out.println("체력 : " + hp);
		System.out.println("팬 수 : " + fan);
		System.out.println("등급 : " + grade);
		System.out.println("=============================");
		System.out.println("연습시키겠습니까? 예(1) 아니오(2)");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			Training tr = new Training();
			tr.training(a, TA);
			break;
		case 2:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
	}
	
	
	
	
	
}
