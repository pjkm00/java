package idolGame;

import java.util.Scanner;

public class Debut {
	
	int gvocal;
	int gdance;
	int grap;
	int gcompose;
	static int gvocalAvg;
	static int gdanceAvg;
	static int grapAvg;
	static int gcomposeAvg;
	
	static int maxhp = 100;
	static int gfan;
	static String ggrade;
	
	static String groupName;
	String member;
	
	Scanner sc = new Scanner(System.in);
	
	Debut(){
		
	}
	
	
	
	
	void selMember(TraineeAll[] TA, Member[] mA) {
		for(int i = 0; i < mA.length; i++) {
			System.out.println("몇 번째 연습생을 데뷔시키시겠습니까? (한 번호씩 입력해주세요.)");
			int input = Integer.parseInt(sc.nextLine());
			if(input < 1 || input > 5 || TA[input-1].grade == null) {
				System.out.println(input + "번 연습생이 없습니다.");
			}else {
				mA[i].vocal = TA[input - 1].vocal;
				mA[i].dance = TA[input - 1].dance;
				mA[i].rap = TA[input - 1].rap;
				mA[i].compose = TA[input - 1].compose;
				mA[i].hp = TA[input - 1].hp;
				mA[i].grade = TA[input - 1].grade;
				System.out.println("예명을 지어주세요");
				String stageName = sc.nextLine();
				mA[i].stageName = stageName;
			}
		}
		
		this.groupName(mA);
	}
	
	void groupName(Member[] mA) {
		System.out.println("그룹이름을 정해주세요.");
		String gName = sc.nextLine();
		groupName = gName;
		groupStats(mA);
	}
	
	
	
	void groupStats(Member[] mA){
		gvocal = 0;
		gdance = 0;
		grap = 0;
		gcompose = 0;
		for(int i = 0; i < mA.length; i++) {
			gvocal += mA[i].vocal;
			gdance += mA[i].dance;
			grap += mA[i].rap;
			gcompose += mA[i].compose;
		}
		gvocalAvg = gvocal / mA.length;
		gdanceAvg = gdance / mA.length;
		grapAvg = grap / mA.length;
		gcomposeAvg = gcompose / mA.length;
		if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 350) {
				ggrade = "SSR";
			}else if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 250) {
				ggrade = "SR";
			}else if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 200) {
				ggrade = "R";
			}else {
				ggrade = "N";
			}
		member = "";
		for(int i = 0; i < mA.length; i++) {
			member += mA[i].stageName + "  ";
		}
		
		System.out.println("==============" + groupName + "======================");
		System.out.println("멤버 : " + member);
		System.out.println("그룹보컬능력 : " + gvocalAvg);
		System.out.println("그룹댄스능력 : " + gdanceAvg);
		System.out.println("그룹랩능력 : " + grapAvg);
		System.out.println("그룹작사작곡능력 : " + gcomposeAvg);
		System.out.println("팬 수 : " + gfan);
		System.out.println("그룹등급 : " + ggrade);
		System.out.println("==============================================");
	
	}
	
	void groupend(Member[] mA){
		gvocal = 0;
		gdance = 0;
		grap = 0;
		gcompose = 0;
		for(int i = 0; i < mA.length; i++) {
			gvocal += mA[i].vocal;
			gdance += mA[i].dance;
			grap += mA[i].rap;
			gcompose += mA[i].compose;
		}
		gvocalAvg = gvocal / mA.length;
		gdanceAvg = gdance / mA.length;
		grapAvg = grap / mA.length;
		gcomposeAvg = gcompose / mA.length;
		if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 350) {
				ggrade = "SSR";
			}else if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 250) {
				ggrade = "SR";
			}else if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 200) {
				ggrade = "R";
			}else {
				ggrade = "N";
			}
		member = "";
		for(int i = 0; i < mA.length; i++) {
			member += mA[i].stageName + "  ";
		}
		
		System.out.println("그룹명 : " + groupName);
		System.out.println("멤버 : " + member);
		System.out.println("그룹보컬능력 : " + gvocalAvg);
		System.out.println("그룹댄스능력 : " + gdanceAvg);
		System.out.println("그룹랩능력 : " + grapAvg);
		System.out.println("그룹작사작곡능력 : " + gcomposeAvg);
		System.out.println("팬 수 : " + gfan);
		System.out.println("그룹등급 : " + ggrade);

	
	}

	
	
	
}
