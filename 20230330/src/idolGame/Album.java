package idolGame;

import java.util.Scanner;

public class Album {
	
	String albumName;
	String songgrade;
	String dancegrade;
	
	
	Debut d = new Debut();
	Scanner sc = new Scanner(System.in);
	
	void cAn(Debut d) {
		System.out.println("앨범 이름을 정해주세요.");
		albumName = sc.nextLine();
		System.out.println("곡을 어떻게 하시겠습니까? 1.자작곡(그룹 능력치에 따라 곡의 등급이 결정됩니다. F ~ S)  2.작곡가 고용(곡 등급 C ~ A, 돈 - 50000)");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int	i1 = Integer.parseInt(input);
			switch(i1) {
			case 1:
				this.selfsong();
				break;
			case 2:
				if(Company.commoney < 50000) {
					System.out.println("돈이 부족하여 작곡가를 고용할 수 없습니다. 자동으로 자작곡으로 선택됩니다.");
					this.selfsong();
				}else {
					this.composer();
					Company.commoney -= 50000;
				}
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
		}else {
			System.out.println("숫자를 입력해주세요.");
		}
		
		System.out.println("안무를 어떻게 하시겠습니까? 1.창작안무(그룹 능력치에 따라 안무의 등급이 결정됩니다. F ~ S)  2.안무가 고용(안무 등급 C ~ A, 돈 - 50000)");
		String input2 = sc.nextLine();
		boolean B2 = input2.matches("[0-9]+");
		if(B2) {
			int	i2 = Integer.parseInt(input);
			switch(i2) {
			case 1:
				this.selfdance();
				break;
			case 2:
				if(Company.commoney < 50000) {
					System.out.println("돈이 부족하여 안무가를 고용할 수 없습니다. 자동으로 창작안무로 선택됩니다.");
					this.selfdance();
				}else {
					this.dancer();
					Company.commoney -= 50000;
				}
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
		}else {
			System.out.println("숫자를 입력해주세요.");
		}
		System.out.println("앨범이름 : " + albumName);
		System.out.println("곡 등급 : " + songgrade);
		System.out.println("안무 등급 : " + dancegrade);
		System.out.println("그룹 등급 : " + Debut.ggrade);
		System.out.println("등급에 따라 팬 수와 수익이 달라집니다.");
	}
	

	void selfsong() {
		if(Debut.gcomposeAvg > 90) {
			songgrade = "S";
		}else if(Debut.gcomposeAvg > 80) {
			songgrade = "A";
		}else if(Debut.gcomposeAvg > 70) {
			songgrade = "B";
		}else if(Debut.gcomposeAvg > 60) {
			songgrade = "C";
		}else if(Debut.gcomposeAvg > 50) {
			songgrade = "D";
		}else {
			songgrade = "F";
		}
	}
	
	void composer() {
		int c = (int)(Math.random()*10)+1;
		if(c >= 9) {
			songgrade = "A";
		}else if(c >= 5) {
			songgrade = "B";
		}else {
			songgrade = "C";
		}
	}
	
	void selfdance() {
		if(Debut.gdanceAvg > 90) {
			dancegrade = "S";
		}else if(Debut.gdanceAvg > 80) {
			dancegrade = "A";
		}else if(Debut.gdanceAvg > 70) {
			dancegrade = "B";
		}else if(Debut.gdanceAvg > 60) {
			dancegrade = "C";
		}else if(Debut.gdanceAvg > 50) {
			dancegrade = "D";
		}else {
			dancegrade = "F";
		}
	}
	
	void dancer() {
		int d = (int)(Math.random()*10)+1;
		if(d >= 9) {
			dancegrade = "A";
		}else if(d >= 5) {
			dancegrade = "B";
		}else {
			dancegrade = "C";
		}
	}
	
	void albumresult(Member[] m) {
		if(songgrade == "S") {
			Debut.gfan += 5000;
		}else if(songgrade == "A"){
			Debut.gfan += 3000;
		}else if(songgrade == "B"){
			Debut.gfan += 2000;
		}else if(songgrade == "C"){
			Debut.gfan += 1000;
		}else if(songgrade == "D"){
			Debut.gfan += 500;
		}else {
			Debut.gfan += 100;
		}
		if(dancegrade == "S") {
			Debut.gfan += 5000;
		}else if(dancegrade == "A"){
			Debut.gfan += 3000;
		}else if(dancegrade == "B"){
			Debut.gfan += 2000;
		}else if(dancegrade == "C"){
			Debut.gfan += 1000;
		}else if(dancegrade == "D"){
			Debut.gfan += 500;
		}else {
			Debut.gfan += 100;
		}
		
		if(Debut.ggrade == "SSR") {
			Debut.gfan += 10000;
		}else if(Debut.ggrade == "SR"){
			Debut.gfan += 5000;
		}else if(Debut.ggrade == "R"){
			Debut.gfan += 2000;
		}else{
			Debut.gfan += 500;
		}
		
		for(int i = 0; i < m.length; i++) {
			m[i].hp -= 30;
		}
		
		Company.commoney += 10*Debut.gfan;
		System.out.println("앨범을 내어 팬이 " + Debut.gfan + "명 되었습니다.");
		System.out.println("돈을 " + 10*Debut.gfan + "원 벌었습니다.");
		
	}
	
}
