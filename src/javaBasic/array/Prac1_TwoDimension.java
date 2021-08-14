package javaBasic.array;

public class Prac1_TwoDimension {
	public static void main(String[] args) {
		char[][] twoDs = new char[13][2];
		
		char ch1 = 'a';
		char ch2 = 'z';
		char charResult = ' ';
		
		int minNum = (int)ch1;
		int maxNum = (int)ch2;
		String result = "";
		
		for(int i = 0; i < twoDs.length; i++) {
			for(int j = 0; j < twoDs[i].length; j++) {
				double dbNum = Math.random();
				int ranNum = minNum + (int)(Math.round(dbNum * (maxNum-minNum)));
				twoDs[i][j] = (char) ranNum;
				
				charResult = twoDs[i][j];
				if(j == 0) {
					result = Character.toString(charResult);
				}else {
					result += ", " + Character.toString(charResult);
					System.out.println("result[" + (i + 1) + "] : " + result);
				}
			}
		}
	}
}
