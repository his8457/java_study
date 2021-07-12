package sort;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 1, 4};
		
		int tempNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] >= arr[j]) {
					tempNum = arr[i];
					arr[i] = arr[j];
					arr[j] = tempNum;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				System.out.print("int[] arr = {" + arr[i]);
			}
			
			if(i != 0 && i != arr.length) {
				System.out.print("," + arr[i]);
			}
			
			if(i == arr.length-1) {
				System.out.print("};");
			}
		}
	}
}
