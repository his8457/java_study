package array;

public class Prac1_TwoDimension2 {
	public static void main(String[] args) {
		int minNum = 5;
		int maxNum = 10;
		
		double dbNum = Math.random();
		int ranNum = maxNum - (int)(dbNum * minNum);
		
		/*
		System.out.println("random 소수 : " + dbNum);
		System.out.println("(int)(dbNum*minNum) : " + (int)(dbNum*minNum));
		System.out.println("최소 허용값 : " + minNum);
		System.out.println("최대 허용값 : " + maxNum);
		System.out.println("result : " + ranNum);
		*/
		
		int test = 0;
		for(int i = 0; i < 100; i++) {
			dbNum = Math.random();
			test = maxNum - (int)(dbNum * minNum);
			System.out.println("result : " + test);
		}
		
		
	}
}
