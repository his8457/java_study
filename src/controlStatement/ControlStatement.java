package controlStatement;

public class ControlStatement {
	public static void main(String[] args) {
		
		// 1.if  
		if(ControlStatement.run1("test1", false)) {//모든 조건절 중 조건에 맞는 코드 하나만 실행
			
		}else if(ControlStatement.run1("test2", true)) {
			
		}else {
			ControlStatement.run1("test3", true);
		}
		
		// 2.switch
		int num = 20;
		switch(num) {
			case 10 ://브레이크문 없을 경우 true 인 case 부터 그 아래의 코드 모두 실행 함.
				System.out.println("case 10 : " + num);
				//break;
			case 20 : 
				System.out.println("case 20 : " + num);
				//break;
			default : 
				System.out.println("run default case!");
		}
	}
	
	public static boolean run1(String str, boolean boo) {
		if(boo) {
			System.out.println(str);
		}
		return boo;
	}
}
