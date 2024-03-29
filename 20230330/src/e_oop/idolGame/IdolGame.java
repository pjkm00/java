package e_oop.idolGame;

import java.util.Arrays;
import java.util.Scanner;

public class IdolGame {

	public static void main(String[] args) {
		/*
		 * 아이돌키우기게임
		 */
		
		TraineeAll TA = new TraineeAll();
		Scanner sc = new Scanner(System.in);
		System.out.println("회사명을 입력하세요.");
		String companyName = sc.nextLine();
		Company cp = new Company(companyName);
		
		TraineeAll[] trainA = new TraineeAll[5];
		for(int i = 0; i < trainA.length; i++) {
			TraineeAll trainee = new TraineeAll(i);
			trainA[i] = trainee; 
		}
		
		
		while(true) {
			System.out.println("1.회사 상황 확인  2.연습생 뽑기  3.연습생 관리   4.데뷔하기  0.종료 ");
			int input = Integer.parseInt(sc.nextLine());
			switch(input){
			case 1:
				cp.companyInfo();
				break;
			case 2:
				TA.RandomTn(trainA);
				break;
			case 3:
				TA.traineeList(trainA);
				break;
			case 4:
				Debut d = new Debut();
				System.out.println("몇 인조 그룹을 만드시겠습니까? 0.뒤로가기");
				int memNum = Integer.parseInt(sc.nextLine());
				Member[] mA = new Member[memNum];
				for(int i = 0; i < mA.length; i++) {
					Member m = new Member(i);
					mA[i] = m;
				}
				d.selMember(trainA, mA);
				System.out.println("데뷔시키시겠습니까? 예(1) 아니오(2)");
				input = Integer.parseInt(sc.nextLine());
				switch(input) {
				case 1:
					System.out.println("축하합니다. 그룹이 데뷔하였습니다.");
					while(true) {
						System.out.println("1.회사 상황 확인  2.그룹 정보  3.스케줄하기  4.멤버관리  0.종료하기");
						input = Integer.parseInt(sc.nextLine());
						switch(input) {
						case 1:
							cp.companyInfo();
							break;
						case 2:
							d.groupStats(mA);
							break;
						case 3:
							Schedule s = new Schedule();
							s.selSc(d, mA);
							for(int i = 0; i < mA.length; i++) {
								if(mA[i].hp <= 0) {
									System.out.println(mA[i].stageName + "(이)가 과로로 쓰러져 게임오버 되었습니다.");
									System.exit(0);
								}
							}
							break;
						case 4:
							Member m = new Member();
							m.memberManage(mA);
							break;
			
						case 0:
							System.out.println("게임을 종료합니다.");
							System.exit(0);
							break;
						}
					}
				case 2: 
					break;
				}
				break;
			case 0:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		
	}

}
