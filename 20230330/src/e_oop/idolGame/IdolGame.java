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
			System.out.println("1. 회사 상황 확인  2. 연습생 뽑기  3. 연습생 관리   4.데뷔하기  0. 종료 ");
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
				
			}
		}
	}

}
