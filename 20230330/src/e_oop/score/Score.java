package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		
		String[] stName = {"기상호", "박병찬", "최종수", "성준수", "정희찬", "공태성", "진재유", "주찬양", "허창현", "전영중"};
		
		for(int i = 0; i < students.length; i++) {
			Student student = new Student(i, stName);
			students[i] = student;

		}
		
		Student st = new Student();
		students = st.ranking(students);
		st.print(students);

	}

}
