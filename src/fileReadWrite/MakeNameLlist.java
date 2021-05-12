package fileReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeNameLlist {

	public static void main(String[] args) {
		//1. 파일로 내보낼 사람이름 램덤 100명
		
		//char a = 0xAC00; // 0xAC00가 ~ 0xD7A3힣
		char[] lastNames = {'김','이','박','최','고','황','오','정','조','백'};
		
		StringBuffer strNames = new StringBuffer();
		char lastName = ' ';
		char firstName = ' ';
		String fullName = "";
		
		for(int i = 0; i < 10; i++) {
			lastName = lastNames[i];
			for(int j = 0; j < 10; j++) {
				fullName = Character.toString(lastName);
				fullName += "*";
				firstName = (char)((Math.random() * 11172) + 0xAC00);
				
				fullName += Character.toString(firstName);
				//System.out.println(j + " : " + fullName);
				
				strNames.append(fullName);
				
				if(i != 9 || j != 9) {
					strNames.append("\n");
				}
			}
		}
		
		File file = new File("src/fileReadWrite/hundredNames.txt");
		System.out.println(file.getAbsolutePath());
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(strNames.toString());
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
