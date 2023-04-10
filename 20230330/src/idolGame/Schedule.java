package idolGame;

import java.util.Scanner;

public class Schedule {
	int fan;
	int hp;
	Scanner sc = new Scanner(System.in);
	
	void selSc(Debut d, Member[] m){
		System.out.println("어떤 스케줄을 진행하시겠습니까?");
		System.out.println("1.앨범내기(hp -30)  2.콘서트(hp -20)  3. 팬사인회(hp -5)   4.해외투어(hp -30)  5.예능(hp -10)  0.뒤로가기");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			Album a = new Album();
			a.cAn(d);
			System.out.println("앨범을 발매 하시겠습니까? 예(1) 아니오(2)");
			input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				a.albumresult(m);
				break;
			case 2:
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
			break;
		case 2:
			concert(m);
			break;
		case 3:
			fansign(m);
			break;
		case 4:
			tour(m);
			break;
		case 5:
			tvShow(m);
			break;
		case 0:
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
	}
	
	
	
	void concert(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i].hp -= 20;
		}
		
		Company.commoney += Debut.gfan*10;
		System.out.println("콘서트를 진행하여 돈을 " + Debut.gfan*10 + "원 벌었습니다.");
	}
	
	void fansign(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i].hp -= 20;
		}
		Company.commoney += Debut.gfan*5;
		System.out.println("팬사인회를 진행하여 돈을 " + Debut.gfan*5 + "원 벌었습니다.");
	}
	

	
	void tour(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i].hp -= 20;
		}
		Company.commoney += Debut.gfan*50;
		System.out.println("해외투어를 진행하여 돈을 " + Debut.gfan*50 + "원 벌었습니다.");
		System.out.println("그러나 해외투어기간동안 국내팬들이 " + Debut.gfan*0.1 + "만큼 줄었습니다.");
		Debut.gfan -= Debut.gfan*0.1;
		
	}
	
	void tvShow(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i].hp -= 20;
		}
		Company.commoney += 10000;
		Debut.gfan += 3000;
		System.out.println("예능에 나가 " + 10000 + "원 벌었습니다.");
		System.out.println("인지도가 올라 팬이 " + 3000 + "명 늘었습니다.");
	}
}
