package javaBasic.loop;

import java.util.Scanner;

public class TriangleLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		TriangleLoop.drawTriangleOf(num);
	}
	
	public static void drawTriangleOf(int num) {
		int dan = 1;
		
		//1 ~ 9 까지 피라미드
		for(int i = 1; i <= num; i++) {
			//앞공백
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			//본숫자
			for(int j = 1; j <= dan*2-1; j++) {
				//1:1, 2:3, 3:5, 4:7
				System.out.print(dan);
			}
			
			System.out.println("");
			dan++;
		}
	}
}
