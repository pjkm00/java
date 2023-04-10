package idolGame;

import java.util.Scanner;

public class Debut {
	
	int gvocal = 0;
	int gdance= 0;
	int grap = 0;
	int gcompose;
	int gvocalAvg = 0;
	int gdanceAvg= 0;
	int grapAvg = 0;
	int gcomposeAvg;
	
	static int maxhp = 100;
	
	static int gfan = 0;
	static String ggrade;
	String groupName = null;
	String member;
	
	Scanner sc = new Scanner(System.in);
	
	Debut(){
		
	}
	
	
	void debutNum(TraineeAll[] TA) {
		System.out.println("몇 인조 그룹을 만드시겠습니까? 0. 뒤로가기");
		int input = Integer.parseInt(sc.nextLine());
		Member[] mA = new Member[input];
		for(int i = 0; i < mA.length; i++) {
			Member m = new Member(i);
			mA[i] = m;
		}
		this.selMember(TA, mA);
	}
	
	void selMember(TraineeAll[] TA, Member[] mA) {
		for(int i = 0; i < mA.length; i++) {
			System.out.println("몇 번째 연습생을 데뷔시키시겠습니까? (한 번호씩 입력해주세요.)");
			int input = Integer.parseInt(sc.nextLine());
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
		if(gvocalAvg + gdanceAvg + grapAvg + gcomposeAvg>= 300) {
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
	


	
	
	
}
