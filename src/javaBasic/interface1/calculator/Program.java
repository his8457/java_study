package javaBasic.interface1.calculator;

public class Program {
	public static void main(String[] args) {
		
		Calculator1 cal2 = new Calculator2();
		int result = cal2.division(0, 0);
		double a = cal2.PIE;
		System.out.println(a);
		System.out.println(result);
		
		
		Calculator2 cal = new Calculator2();
		cal.showInfo();
	}
}
