package i_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Board_p2 {

	ArrayList<Integer> num = new ArrayList<>();
	ArrayList<HashMap<String, String>> table = new ArrayList<>();
	HashMap<String, String> board = new HashMap<>();
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd a hh:mm");
	String day = sdf.format(d);
	Scanner sc = new Scanner(System.in);
	int count = 0;

	
	void read() {
		System.out.println("조회할 글의 번호를 입력해주세요>");
		int input = Integer.parseInt(sc.nextLine());
		int b = 0;
		for(int i = 0; i < num.size(); i++) {
			if(num.get(i) == input) {
				b = i + 1;
				break;
			}else if(num.get(i) != input) {
				b = - 1;
			}
		}
		if(b == - 1) {
			System.out.println("조회할 글이 없습니다.");
			return;
		}
		System.out.println("내용 : " + table.get(b - 1).get("내용"));
		System.out.println("1. 수정\t2. 삭제\t3. 뒤로가기");
		int input2 = Integer.parseInt(sc.nextLine());
		switch(input2) {
		case 1:
			modify(b);
			break;
		case 2:
			delete(b);
			break;
		default:
			break;
						
			}
				
		
		
	}
		

	
//	void modify(int a) {
//		System.out.println("수정 전 내용 : " + table.get(a - 1).get("내용"));
////		table.get(input - 1).remove("내용");
//		System.out.println("수정할 내용을 입력하세요>");
//		String input2 = sc.nextLine();
//		board.put("제목", table.get(a - 1).get("제목"));
//		board.put("내용", input2);
//		board.put("작성자", table.get(a - 1).get("작성자"));
//		d = new Date();
//		day = sdf.format(d);
//		board.put("작성일", day);
//		table.set(a - 1, board);
//		board = new HashMap<>();
//		
//	}
	
	void modify(int a) {
		System.out.println("수정 전 내용 : " + table.get(a - 1).get("내용"));
//		table.get(input - 1).remove("내용");
		System.out.println("수정할 내용을 입력하세요>");
		String input2 = sc.nextLine();
		table.get(a - 1).put("내용", input2);
		d = new Date();
		day = sdf.format(d);
		table.get(a - 1).put("작성일", day);
		
		
		
	}
	
	void delete(int a) {
		System.out.println("정말로 삭제하시겠습니까? 1. 예\t2. 아니오");
		int input = Integer.parseInt(sc.nextLine());
		switch(input) {
		case 1:
			ArrayList<HashMap<String, String>> temp = new ArrayList<>();
			ArrayList<Integer> tempNum = new ArrayList<>();
			for(int i = a; i < table.size(); i++) {
				temp.add(table.get(i));
				tempNum.add(num.get(i));
			}
			for(int i = table.size() - 1; i >= a - 1; i--) {
				table.remove(i);
				num.remove(i);
			}
			for(int i = 0; i < temp.size(); i++) {
				table.add(temp.get(i));
				num.add(tempNum.get(i));
			}
			System.out.println("삭제되었습니다.");
			break;
		default:
			break;
		}
	}
	
	void write() {
		System.out.println("글 제목을 입력하세요>");
		String input2 = sc.nextLine();
		board.put("제목", input2);
		System.out.println("글 내용을 입력하세요>");
		input2 = sc.nextLine();
		board.put("내용", input2);
		System.out.println("작성자를 입력하세요>");
		input2 = sc.nextLine();
		board.put("작성자", input2);
		d = new Date();
		day = sdf.format(d);
		board.put("작성일", day);
		
		table.add(board);
		
		count++;
		num.add(count);
		board = new HashMap();
		System.out.println("글이 작성되었습니다.");
	}
	
	void def() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		for(int i = 0; i < table.size(); i++) {
			System.out.print(num.get(i) + "\t");
			System.out.print(table.get(i).get("제목") + "\t");
			System.out.print(table.get(i).get("작성자") + "\t");
			System.out.print(table.get(i).get("작성일") + "\t");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board_p2 b = new Board_p2();
		while(true) {
			b.def();
			
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1. 조회\t2. 글작성\t3. 종료");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			int input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				b.read();
				break;
			case 2:
				b.write();
				break;
			case 3:
				System.out.println("게시판을 종료합니다.");
				System.exit(3);
				break;
			}
		}
	}

}

