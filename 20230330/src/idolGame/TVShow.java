package idolGame;

import java.util.Scanner;

public class TVShow {
	
	Scanner sc = new Scanner(System.in);
	
	void selShow(Member[] mA) {
		System.out.println("어떤 프로를 선택하시겠습니까? 1.복면가왕(hp -10)  2.쇼미더머니(hp -10)  3.스맨파/스우파(hp -10)  0.뒤로가기");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			switch(i1) {
			case 1:
				this.vocalshow(mA);
				break;
			case 2:
				this.showmethemoney(mA);
				break;
			case 3:
				this.streetfighter(mA);
				break;
			case 0:
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
		}else {
			System.out.println("숫자를 입력하세요");
		}
	}
	
	
	void vocalshow(Member[] mA){
		System.out.println("어떤 멤버를 출연시키시겠습니까? 해당 멤버의 보컬 능력치에 따라 결과가 달라집니다.(번호나 예명 입력)");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			if(i1 < 1 || mA.length < i1) {
				System.out.println("해당하는 멤버가 없습니다.");
			}else {
				System.out.println(mA[i1 - 1].stageName + "(이)가 복면가왕에 출연합니다.");
				if(mA[i1 - 1].vocal >= 90) {
					System.out.println(mA[i1 - 1].stageName + "의 환상적인 노래실력으로 최종 우승하였습니다.");
					System.out.println("팬이 10000명 증가하고 우승 상금으로 100000원 벌었습니다.");
					Debut.gfan += 10000;
					Company.commoney += 100000;
				}else if(mA[i1 - 1].vocal >= 80){
					System.out.println(mA[i1 - 1].stageName + "의 훌륭한 노래실력으로 최종 준우승하였습니다.");
					System.out.println("팬이 5000명 증가하고 돈을 10000원 벌었습니다.");
					Debut.gfan += 5000;
					Company.commoney += 10000;
				}else if(mA[i1 - 1].vocal >= 65){
					System.out.println(mA[i1 - 1].stageName + "의 노래실력으로 본선까지 진출하였습니다.");
					System.out.println("팬이 2000명 증가하고 돈을 10000원 벌었습니다.");
					Debut.gfan += 2000;
					Company.commoney += 10000;
				}else if(mA[i1 - 1].vocal >= 50){
					System.out.println(mA[i1 - 1].stageName + "(이)가 예선에서 탈락하였습니다.");
					System.out.println("돈을 10000원 벌었습니다.");
					Company.commoney += 10000;
				}else {
					System.out.println(mA[i1 - 1].stageName + "의 노래실력 논란 기사가 뜨며 팬 수가 1000명 하락하였습니다.");
					System.out.println("돈을 10000원 벌었습니다.");
					Debut.gfan -= 1000;
					Company.commoney += 10000;
				}
				mA[i1 - 1].hp -= 10;
			}
		}else {
			for(int i = 0; i < mA.length; i++) {
				if(input.equals(mA[i].stageName)) {
					System.out.println(mA[i].stageName + "(이)가 복면가왕에 출연합니다.");
					if(mA[i].vocal >= 90) {
						System.out.println(mA[i].stageName + "의 환상적인 노래실력으로 최종 우승하였습니다.");
						System.out.println("팬이 10000명 증가하고 우승상금으로 100000원 벌었습니다.");
						Debut.gfan += 10000;
						Company.commoney += 100000;
					}else if(mA[i].vocal >= 80){
						System.out.println(mA[i].stageName + "의 훌륭한 노래실력으로 최종 준우승하였습니다.");
						System.out.println("팬이 5000명 증가하고 돈을 10000원 벌었습니다.");
						Debut.gfan += 5000;
						Company.commoney += 10000;
					}else if(mA[i].vocal >= 70){
						System.out.println(mA[i].stageName + "의 노래실력으로 본선까지 진출하였습니다.");
						System.out.println("팬이 2000명 증가하고 돈을 10000원 벌었습니다.");
						Debut.gfan += 2000;
						Company.commoney += 10000;
					}else if(mA[i].vocal >= 50){
						System.out.println(mA[i].stageName + "(이)가 예선에서 탈락하였습니다.");
						System.out.println("돈을 10000원 벌었습니다.");
						Company.commoney += 10000;
					}else {
						System.out.println(mA[i].stageName + "의 노래실력 논란 기사가 뜨며 팬 수가 1000명 하락하였습니다.");
						System.out.println("돈을 10000원 벌었습니다.");
						Debut.gfan -= 1000;
						Company.commoney += 10000;
					}
					mA[i].hp -= 10;
				}
			}
		}
		
	}
	
	void showmethemoney(Member[] mA) {
		System.out.println("어떤 멤버를 출연시키시겠습니까? 해당 멤버의 랩 능력치에 따라 결과가 달라집니다.(번호나 예명 입력)");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			if(i1 < 1 || mA.length < i1) {
				System.out.println("해당하는 멤버가 없습니다.");
			}else {
				System.out.println(mA[i1 - 1].stageName + "(이)가 쇼미더머니에 출연합니다.");
				if(mA[i1 - 1].rap >= 90) {
					System.out.println(mA[i1 - 1].stageName + "의 환상적인 랩실력으로 최종 우승하였습니다.");
					System.out.println("팬이 10000명 증가하고 우승상금으로 100000원 벌었습니다.");
					Debut.gfan += 10000;
					Company.commoney += 100000;
				}else if(mA[i1 - 1].rap >= 80){
					System.out.println(mA[i1 - 1].stageName + "의 훌륭한 랩실력으로 최종 준우승하였습니다.");
					System.out.println("팬이 5000명 증가하고 돈을 10000원 벌었습니다.");
					Debut.gfan += 5000;
					Company.commoney += 10000;
				}else if(mA[i1 - 1].rap >= 65){
					System.out.println(mA[i1 - 1].stageName + "의 랩실력으로 본선까지 진출하였습니다.");
					System.out.println("팬이 2000명 증가하고 돈을 10000원 벌었습니다.");
					Debut.gfan += 2000;
					Company.commoney += 10000;
				}else if(mA[i1 - 1].rap >= 50){
					System.out.println(mA[i1 - 1].stageName + "(이)가 예선에서 탈락하였습니다.");
					System.out.println("돈을 10000원 벌었습니다.");
					Company.commoney += 10000;
				}else {
					System.out.println(mA[i1 - 1].stageName + "의 랩실력 논란 기사가 뜨며 팬 수가 1000명 하락하였습니다.");
					System.out.println("돈을 10000원 벌었습니다.");
					Debut.gfan -= 1000;
					Company.commoney += 10000;
				}
				mA[i1 - 1].hp -= 10;
			}
		}else {
			for(int i = 0; i < mA.length; i++) {
				if(input.equals(mA[i].stageName)) {
					System.out.println(mA[i].stageName + "(이)가 쇼미더머니에 출연합니다.");
					if(mA[i].rap >= 90) {
						System.out.println(mA[i].stageName + "의 환상적인 랩실력으로 최종 우승하였습니다.");
						System.out.println("팬이 10000명 증가하고 우승상금으로 100000원 벌었습니다.");
						Debut.gfan += 10000;
						Company.commoney += 100000;
					}else if(mA[i].rap >= 80){
						System.out.println(mA[i].stageName + "의 훌륭한 랩실력으로 최종 준우승하였습니다.");
						System.out.println("팬이 5000명 증가하고 돈을 10000원 벌었습니다.");
						Debut.gfan += 5000;
						Company.commoney += 10000;
					}else if(mA[i].rap >= 70){
						System.out.println(mA[i].stageName + "의 랩실력으로 본선까지 진출하였습니다.");
						System.out.println("팬이 2000명 증가하고 돈을 10000원 벌었습니다.");
						Debut.gfan += 2000;
						Company.commoney += 10000;
					}else if(mA[i].rap >= 50){
						System.out.println(mA[i].stageName + "(이)가 예선에서 탈락하였습니다.");
						System.out.println("돈을 10000원 벌었습니다.");
						Company.commoney += 10000;
					}else {
						System.out.println(mA[i].stageName + "의 랩실력 논란 기사가 뜨며 팬 수가 1000명 하락하였습니다.");
						System.out.println("돈을 10000원 벌었습니다.");
						Debut.gfan -= 1000;
						Company.commoney += 10000;
					}
					mA[i].hp -= 10;
				}
			}
		}
	}
	
	
	
	void streetfighter(Member[] mA) {
		System.out.println("어떤 멤버를 출연시키시겠습니까? 해당 멤버의 댄스 능력치에 따라 결과가 달라집니다.(번호나 예명 입력)");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			if(i1 < 1 || mA.length < i1) {
				System.out.println("해당하는 멤버가 없습니다.");
			}else {
				System.out.println(mA[i1 - 1].stageName + "(이)가 스우파/스맨파에 출연합니다.");
				if(mA[i1 - 1].dance >= 90) {
					System.out.println(mA[i1 - 1].stageName + "의 환상적인 댄스실력으로 최종 우승하였습니다.");
					System.out.println("팬이 10000명 증가하고 우승상금으로 100000원 벌었습니다.");
					Debut.gfan += 10000;
					Company.commoney += 100000;
				}else if(mA[i1 - 1].dance >= 80){
					System.out.println(mA[i1 - 1].stageName + "의 훌륭한 댄스실력으로 최종 준우승하였습니다.");
					System.out.println("팬이 5000명 증가하고 돈을 10000원 벌었습니다.");
					Debut.gfan += 5000;
					Company.commoney += 10000;
				}else if(mA[i1 - 1].dance >= 65){
					System.out.println(mA[i1 - 1].stageName + "의 댄스실력으로 본선까지 진출하였습니다.");
					System.out.println("팬이 2000명 증가하고 돈을 10000원 벌었습니다.");
					Debut.gfan += 2000;
					Company.commoney += 10000;
				}else if(mA[i1 - 1].dance >= 50){
					System.out.println(mA[i1 - 1].stageName + "(이)가 예선에서 탈락하였습니다.");
					System.out.println("돈을 10000원 벌었습니다.");
					Company.commoney += 10000;
				}else {
					System.out.println(mA[i1 - 1].stageName + "의 댄스실력 논란 기사가 뜨며 팬 수가 1000명 하락하였습니다.");
					System.out.println("돈을 10000원 벌었습니다.");
					Debut.gfan -= 1000;
					Company.commoney += 10000;
				}
				mA[i1 - 1].hp -= 10;
			}
		}else {
			for(int i = 0; i < mA.length; i++) {
				if(input.equals(mA[i].stageName)) {
					System.out.println(mA[i].stageName + "(이)가 스우파/스맨파에 출연합니다.");
					if(mA[i].dance >= 90) {
						System.out.println(mA[i].stageName + "의 환상적인 댄스실력으로 최종 우승하였습니다.");
						System.out.println("팬이 10000명 증가하고 우승상금으로 100000원 벌었습니다.");
						Debut.gfan += 10000;
						Company.commoney += 100000;
					}else if(mA[i].dance >= 80){
						System.out.println(mA[i].stageName + "의 훌륭한 댄스실력으로 최종 준우승하였습니다.");
						System.out.println("팬이 5000명 증가하고 돈을 10000원 벌었습니다.");
						Debut.gfan += 5000;
						Company.commoney += 10000;
					}else if(mA[i].dance >= 70){
						System.out.println(mA[i].stageName + "의 댄스실력으로 본선까지 진출하였습니다.");
						System.out.println("팬이 2000명 증가하고 돈을 10000원 벌었습니다.");
						Debut.gfan += 2000;
						Company.commoney += 10000;
					}else if(mA[i].dance >= 50){
						System.out.println(mA[i].stageName + "(이)가 예선에서 탈락하였습니다.");
						System.out.println("돈을 10000원 벌었습니다.");
						Company.commoney += 10000;
					}else {
						System.out.println(mA[i].stageName + "의 댄스실력 논란 기사가 뜨며 팬 수가 1000명 하락하였습니다.");
						System.out.println("돈을 10000원 벌었습니다.");
						Debut.gfan -= 1000;
						Company.commoney += 10000;
					}
					mA[i].hp -= 10;
				}
			}
		}
	}
	
	
	void idolsports(Member[] mA) {
		System.out.println("어떤 멤버를 출연시키시겠습니까?");
		
	}
	
	
	
	
	
}
