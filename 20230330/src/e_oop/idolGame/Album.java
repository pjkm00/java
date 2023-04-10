package e_oop.idolGame;

import java.util.Scanner;

public class Album {
	String albumName;
	String songName;
	String songgrade;
	String dancegrade;
	
	
	Debut d = new Debut();
	Scanner sc = new Scanner(System.in);
	
	void cAn(Debut d) {
		System.out.println("앨범 이름을 정해주세요.");
		albumName = sc.nextLine();
		System.out.println("곡을 어떻게 하시겠습니까? 1.자작곡(그룹 능력치에 따라 곡의 등급이 결정됩니다.)  2.작곡가 고용(곡 등급 B ~ S, 돈 - 50000)");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			this.selfsong(d);
			break;
		case 2:
			this.composer();
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
		
		System.out.println("안무를 어떻게 하시겠습니까? 1.창작안무(그룹 능력치에 따라 안무의 등급이 결정됩니다.)  2.안무가 고용(안무 등급 B ~ S, 돈 - 50000)");
		input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			this.selfdance(d);
			break;
		case 2:
			this.dancer();
			break;
		default:
			System.out.println("지원되지 않는 키입니다.");
			break;
		}
		System.out.println("앨범이름 : " + albumName);
		System.out.println("곡 등급 : " + songgrade);
		System.out.println("안무 등급 : " + dancegrade);
		System.out.println("그룹 등급 : " + Debut.ggrade);
	}
	

	void selfsong(Debut d) {
		if(d.gcompose > 90) {
			songgrade = "S";
		}else if(d.gcompose > 80) {
			songgrade = "A";
		}else if(d.gcompose > 70) {
			songgrade = "B";
		}else if(d.gcompose > 60) {
			songgrade = "C";
		}else if(d.gcompose > 50) {
			songgrade = "D";
		}else {
			songgrade = "F";
		}
	}
	
	void composer() {
		int c = (int)(Math.random()*10)+1;
		if(c >= 9) {
			songgrade = "S";
		}else if(c >= 5) {
			songgrade = "A";
		}else {
			songgrade = "B";
		}
	}
	
	void selfdance(Debut d) {
		if(d.gdance > 90) {
			dancegrade = "S";
		}else if(d.gdance > 80) {
			dancegrade = "A";
		}else if(d.gdance > 70) {
			dancegrade = "B";
		}else if(d.gdance > 60) {
			dancegrade = "C";
		}else if(d.gdance > 50) {
			dancegrade = "D";
		}else {
			dancegrade = "F";
		}
	}
	
	void dancer() {
		int d = (int)(Math.random()*10)+1;
		if(d >= 9) {
			dancegrade = "S";
		}else if(d >= 5) {
			dancegrade = "A";
		}else {
			dancegrade = "B";
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
