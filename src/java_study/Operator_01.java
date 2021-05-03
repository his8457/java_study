package java_study;

public class Operator_01 {

	public static void main(String[] args) {
		//전위 후위 연산
		int score = 100;
		int wrongScore = 20;
		
		int totalScore = score - wrongScore;
		System.out.println("점수1 : " + totalScore++);
		System.out.println("점수2 : " + totalScore);
		System.out.println("점수3 : " + ++totalScore);
		
	}

}
