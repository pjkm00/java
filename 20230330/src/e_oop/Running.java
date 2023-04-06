package e_oop;

import java.util.Scanner;

public class Running {
	
	boolean power;
	double speed; 
	int time;
	int incline;
	int temp;
	double cal;
	double weight;
	static String wtf;
	
	static Scanner sc = new Scanner(System.in);
	
	Running() {
		speed = 1;
		time = 0;
		wtf = wtf;
		incline = 0;
	}
	
	
	
	
	boolean power() {
		if(wtf.equals("on")) {
			this.power = true;
		}else {
			this.power = false;
		}
		 return this.power;
	}
	
	void speed() {
		if(speed >= 10) {
			System.out.println("최대속도입니다.");
			speed = 9.5;
		}else if(wtf.equals("spup")){
			speed += 0.5;
			System.out.println("현재속도 : " + speed);
		}else if(wtf.equals("spdown")) {
			speed -= 0.5;
			System.out.println("현재속도 : " + speed);
		}
	}
	
	void speedAuto(){
		System.out.println("속도를 입력하세요.(2, 4, 6, 8, 10)");
		speed = Integer.parseInt(sc.nextLine());
		System.out.println("현재속도 : " + speed);
		System.out.print("[");
		for(int i = 0; i < speed; i++) {
			System.out.print("■");
		}
		for(int i = 0; i < 10 - speed; i++) {
			System.out.print(" ");
		}		
		System.out.println("]");
	}
	
	void incline() {
		if(incline >= 10) {
			System.out.println("최대각도입니다.");
			incline = 9;
		}else if(wtf.equals("incup")) {
			incline += 1;
			System.out.println("현재 각도 : " + incline);
		}else {
			incline -= 1;
			System.out.println("현재 각도 : " + incline);
			
		}
	}

	public static void main(String[] args) {
		
		Running run = new Running();
		
		String option = "[전원켜기 : on / 전원끄기 : off / 속도조절 : spup OR spdown OR \"속도입력\" 입력 / 각도 조절 : incup OR incdown]";
		
//		System.out.println(option);
		
		while(true) {
			System.out.println(option);
			wtf = sc.nextLine();
			
			if(wtf.equals("on") || wtf.equals("off")) {
				if(run.power()) {
					System.out.println("런닝머신이 시작되었습니다.");
					
				}else {
					System.out.println("런닝머신이 종료되었습니다. 감사합니다.");
					break;
				}
			}else if(wtf.equals("spup") || wtf.equals("spdown")) {
				run.speed();
			}else if(wtf.equals("속도입력")) {
				run.speedAuto();
			}else if(wtf.equals("incup") || wtf.equals("incdown")) {
				run.incline();
			}
		}
		
		
	}

}
