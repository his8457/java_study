package javaBasic.array.string;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		
		/* 문자열, 배열, 리스트 길이 또는 크기 구할 때 */
		
		String str1 = "abcde";
		String[] strArr = {"a", "b", "c"};
		
		List<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		
		System.out.println(str1.length());  //문자열 길이
		System.out.println(strArr.length);  //배열 길이
		System.out.println(strList.size()); //리스트 크기
		
		
		/* concat : 대상 문자열과 매개변수 문자열을 붙인다. */
		String conStr1 = "딸기";
		String conStr2 = "바나나";
		System.out.println("result : " + conStr1 + ", " + conStr2);
		
		String strResult = (conStr1 + ", ").concat(conStr2);
		System.out.println("result : " + strResult);
		
		
		
				
	}

}
