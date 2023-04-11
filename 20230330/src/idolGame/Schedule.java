package idolGame;

import java.util.Scanner;

public class Schedule {
	
	Scanner sc = new Scanner(System.in);
	
	void selSc(Debut d, Member[] m){
		System.out.println("어떤 스케줄을 진행하시겠습니까?");
		System.out.println("1.앨범내기(hp -30)  2.콘서트(hp -20)  3. 팬사인회(hp -5)   4.해외투어(hp -30)  5.개인예능    0.뒤로가기");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int	i1 = Integer.parseInt(input);
			switch(i1) {
			case 1:
				Album a = new Album();
				a.cAn(d);
				System.out.println("앨범을 발매 하시겠습니까? 예(1) 아니오(2) (작곡가와 안무가 고용에 든 비용은 회수되지 않습니다.)");
				String input2 = sc.nextLine();
				boolean B2 = input.matches("[0-9]+");
				if(B2) {
					int	i2 = Integer.parseInt(input2);
					switch(i2) {
					case 1:
						a.albumresult(m);
						Company.day++;
						break;
					case 2:
						break;
					default:
						System.out.println("지원되지 않는 키입니다.");
						break;
					}
				}else {
					System.out.println("숫자를 입력하세요.");
				}
				break;
			case 2:
				concert(m);
				Company.day++;
				break;
			case 3:
				fansign(m);
				Company.day++;
				break;
			case 4:
				tour(m);
				Company.day++;
				break;
			case 5:
				TVShow TV = new TVShow();
				TV.selShow(m);
				Company.day++;
				break;
			case 0:
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
		}else {
			System.out.println("숫자를 입력하세요.");
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
			m[i].hp -= 2;
		}
		Company.commoney += Debut.gfan*5;
		System.out.println("팬사인회를 진행하여 돈을 " + Debut.gfan*2 + "원 벌었습니다.");
	}
	

	
	void tour(Member[] m) {
		for(int i = 0; i < m.length; i++) {
			m[i].hp -= 30;
		}
		Company.commoney += Debut.gfan*30;
		System.out.println("해외투어를 진행하여 돈을 " + Debut.gfan*30 + "원 벌었습니다.");
		System.out.println("그러나 해외투어기간동안 국내팬들이 " + Debut.gfan*0.1 + "만큼 줄었습니다.");
		Debut.gfan -= Debut.gfan*0.1;
		
	}
	
	
}
