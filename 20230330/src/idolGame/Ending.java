package idolGame;

public class Ending {

	
	
	void end(Member[] mA){
		System.out.println();
		System.out.println("365일이 지나 게임이 끝났습니다.");
		System.out.println("=========최종결과========");
		System.out.println("회사명 : " + Company.comName);
		System.out.println("돈 : " + Company.commoney);
		System.out.println("------------------------");
		Debut d = new Debut();
		d.groupend(mA);
		System.out.println("========================");
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                    게임오버              ");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");
		
		
		
		
	}
	
	void end2(){
		System.out.println();
		System.out.println("365일이 지나 게임이 끝났습니다.");
		System.out.println("=========최종결과========");
		System.out.println("회사명 : " + Company.comName);
		System.out.println("돈 : " + Company.commoney);
		System.out.println("------------------------");
		System.out.println("데뷔시킨 아이돌이 없습니다.");
		System.out.println("========================");
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("                    게임오버              ");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━┛");
		
		
	}
	
	
}
