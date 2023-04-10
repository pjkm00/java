package idolGame;

import java.util.Scanner;

public class Member {
	String stageName;
	int vocal = 0;
	int dance = 0;
	int rap = 0;
	int compose;
	int hp = 100;
	int maxHp = 100;
	
	String grade = null;
	Scanner sc = new Scanner(System.in);
	
	Member() {
		
	}
	
	Member(int i) {
		stageName = "멤버" + (i + 1);
		vocal = 0;
		dance = 0;
		rap = 0;
		compose = 0;
		hp = 100;
		
		grade = null;
	}
	
	void memberManage(Member[] m) {
		System.out.println("몇 번째 멤버를 보시겠습니까?");
		int input = Integer.parseInt(sc.nextLine());
		if(input > m.length) {
			System.out.println("없는 멤버입니다.");
		}else {
			this.memberInfo(m, input - 1);
		}
		
	}
	
	void memberInfo(Member[] m, int i) {
		System.out.println("============" + m[i].stageName + "============");
		System.out.println("보컬능력 : " + m[i].vocal);
		System.out.println("댄스능력 : " + m[i].dance);
		System.out.println("랩능력 : " + m[i].rap);
		System.out.println("작사작곡능력 : " + m[i].compose);
		System.out.println("HP : " + m[i].hp);
		System.out.println("==========================================");
		System.out.println("1.연습하기  2.휴식하기  0.뒤로가기");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			DTraining dT = new DTraining();
			dT.training(i, m);
			if(m[i].hp <= 0) {
				System.out.println("과로로 게임오버 되었습니다.");
				System.exit(0);
			}
			break;
		case 2:
			Rest r = new Rest();
			r.selRest(m, i);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
	}
	
	
	
	
	
	
	
	
}
