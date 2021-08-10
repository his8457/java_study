package interface_.calculator;

public class Calculator2 extends Calculator1{

	@Override
	public int muliplication(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int division(int num1, int num2) {
		int result = 0;
		
		try {
			result = num1 / num2;
		}catch(Exception e){
			System.out.println("나누기 실행중 에러 발생");
		}
		
		return result;
	}
	
	public void showInfo() {
		System.out.println("추가 구현 코드");
	}
}
