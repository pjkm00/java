package idolGame;

import java.util.Scanner;

public class TraineeAll {
	String traineeName;
	int vocal;
	int dance;
	int rap;
	int compose;
	int hp = 100;
	String grade;
	
	Scanner sc = new Scanner(System.in);
	
	TraineeAll(){
		
	}
	
	TraineeAll(int i) {
		traineeName = "연습생" + (i + 1);
		vocal = 0;
		dance = 0;
		rap = 0;
		compose = 0;
		hp = 100;
		grade = null;
	}
	
	
	
	void RandomTn(TraineeAll[] TA) {
		random : while(true) {
			System.out.println("어떤 방식으로 연습생을 뽑으시겠습니까?");
			System.out.println("1.길거리 캐스팅(0원)  2.오디션(10000원) 3.타기획사 연습생 스카우트(50000원) 0. 뒤로가기");
				
			String input = sc.nextLine();
			boolean B1 = input.matches("[0-9]+");
			if(B1) {
				int i1 = Integer.parseInt(input);
				switch(i1) {
				case 1:
					this.geRandomTn(TA);
					Company.day++;
					break;
				case 2:
					if(Company.commoney < 10000) {
						System.out.println("돈이 부족하여 연습생을 뽑을 수 없습니다.");
						break;
					}
					this.sPRandomTn(TA);
					Company.day++;
					break;
				case 3:
					if(Company.commoney < 50000) {
						System.out.println("돈이 부족하여 연습생을 뽑을 수 없습니다.");
						break;
					}
					this.sSPRandomTn(TA);
					Company.day++;
					break;
				case 0:
					break random;
				default:
				    System.out.println("지원하지 않는 키입니다.");
				    break;
				}
			}else {
				System.out.println("숫자를 입력하세요.");
			}
		}
	}
	
	void geRandomTn(TraineeAll[] TA) {
		
		traineeName = "연습생";
		vocal = (int)(Math.random()*70)+1;
		dance= (int)(Math.random()*70)+1;
		rap = (int)(Math.random()*70)+1;
		compose = (int)(Math.random()*70)+1;
		if(vocal + dance + rap + compose >= 350) {
			grade = "SSR";
		}else if(vocal + dance + rap + compose >= 250) {
			grade = "SR";
		}else if(vocal + dance + rap + compose >= 200) {
			grade = "R";
		}else {
			grade = "N";
		}
		this.scout(TA);
		
	}
	
	void sPRandomTn(TraineeAll[] TA) {
		traineeName = "연습생";
		vocal = (int)(Math.random()*50)+30;
		dance= (int)(Math.random()*50)+30;
		rap = (int)(Math.random()*50)+30;
		compose = (int)(Math.random()*50)+30;
	
		if(vocal + dance + rap + compose >= 350) {
			grade = "SSR";
		}else if(vocal + dance + rap + compose >= 250) {
			grade = "SR";
		}else if(vocal + dance + rap + compose >= 200) {
			grade = "R";
		}else {
			grade = "N";
		}
		Company.commoney = Company.commoney - 10000;
		this.scout(TA);
	}
	
	void sSPRandomTn(TraineeAll[] TA) {
		traineeName = "연습생";
		vocal = (int)(Math.random()*60)+40;
		dance= (int)(Math.random()*60)+40;
		rap = (int)(Math.random()*60)+40;
		compose = (int)(Math.random()*60)+40;
	
		if(vocal + dance + rap + compose >= 350) {
			grade = "SSR";
		}else if(vocal + dance + rap + compose >= 250) {
			grade = "SR";
		}else if(vocal + dance + rap + compose >= 200) {
			grade = "R";
		}else {
			grade = "N";
		}
		Company.commoney = Company.commoney - 50000;
		this.scout(TA);
	}
	
	void scout(TraineeAll[] TA) {
		System.out.println("뽑기 성공!");
		System.out.println("=============연습생 정보=============");
		System.out.println("보컬능력 : " + vocal);
		System.out.println("댄스능력 : " + dance);
		System.out.println("랩능력 : " + rap);
		System.out.println("작사작곡능력 : " + compose);
		System.out.println("HP : " + hp);
		System.out.println("등급 : " + grade);
		System.out.println("=================================");
		System.out.println("영입 하시겠습니까? 예(1) 아니오(2)");
		
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			selTr : switch(i1) {
			case 1:
				System.out.println("몇 번째 연습생으로 영입하시겠습니까?(연습생은 5명까지 영입가능합니다.)");
				int a = Integer.parseInt(sc.nextLine());
				if(a == 0 || a > 5) {
					System.out.println("지원되지 않는 키입니다.");
					break;
				}
				if(TA[a-1].grade != null) {
					System.out.println(a + "번째 연습생이 있습니다. 덮어쓰시겠습니까? 예(1) 아니오(2)");
					String input2 = sc.nextLine();
					boolean B2 = input2.matches("[0-9]+");
					if(B2) {
						int i2 = Integer.parseInt(input2);
						switch(i2) {
						case 1:
							break;
						case 2:
							break selTr;
						}
					}else {
						System.out.println("숫자를 입력하세요.");
					}
				}
				this.tnNum(a - 1, TA, vocal, dance, rap, compose, grade);
				System.out.println("영입되었습니다. 연습생 관리에서 확인하세요.");
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
	}
	
	void tnNum(int a, TraineeAll[] TA, int v, int d, int r, int c, String g) {
			TA[a].vocal = v;
			TA[a].dance = d;
			TA[a].rap = r;
			TA[a].compose = c;
			TA[a].grade = g;
		
	}
	
	void traineeList(TraineeAll[] TA) {
		System.out.println("연습생은 최대 5명까지 영입할 수 있습니다.");
		System.out.println("몇 번 연습생을 관리하시겠습니까?");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			if(i1 > 5 || i1 < 1 || TA[i1 - 1].grade == null) {
				System.out.println("존재하지 않습니다.");
			}else {
				traineeInfo(i1 - 1, TA);
			}
		}else {
			System.out.println("숫자를 입력해주세요.");
		}
	}
	
	void traineeInfo(int a, TraineeAll[] TA) {
		traineeName = TA[a].traineeName;
		vocal = TA[a].vocal;
		dance = TA[a].dance;
		rap = TA[a].rap;
		compose = TA[a].compose;
		hp = TA[a].hp;
		grade = TA[a].grade;
		System.out.println("==========" + traineeName + "==========");
		System.out.println("보컬능력 : " + vocal);
		System.out.println("댄스능력 : " + dance);
		System.out.println("랩능력 : " + rap);
		System.out.println("작사작곡능력 : " + compose);
		System.out.println("HP : " + hp);
		System.out.println("등급 : " + grade);
		System.out.println("=============================");
		System.out.println("1.연습하기  2.휴식하기  0.뒤로가기");
		String input = sc.nextLine();
		boolean B1 = input.matches("[0-9]+");
		if(B1) {
			int i1 = Integer.parseInt(input);
			switch(i1) {
			case 1:
				Training tr = new Training();
				tr.training(a, TA);
				if(TA[a].hp <= 0) {
					System.out.println(TA[a].traineeName + "(이)가 과로로 쓰러져 게임오버 되었습니다.");
					System.exit(0);
				}
				break;
			case 2:
				RestT RT = new RestT();
				RT.selRest(TA, a);
				break;
			case 0:
				break;
			default:
				System.out.println("지원되지 않는 키입니다.");
				break;
			}
		}else {
			System.out.println("숫자를 입력해주세요.");
		}
	}
	
	
	
	
	
}
