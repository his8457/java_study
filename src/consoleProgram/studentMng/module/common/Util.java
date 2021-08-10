package consoleProgram.studentMng.module.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
	
	/**
	 * 
	 * */
	@SuppressWarnings("finally")
	public static int getInputMenu() {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		
		try {
			inputNum = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("메뉴 입력은 숫자만 가능합니다.!");
		}finally {
			return inputNum;
		}
	}
	
	/**
	 * key를 파라미터로 파일에서 id를 가져온 후 id를 생성하고, 생성된 id로 파일을 업데이트 한다.
	 * studentMng.data의 id.text 파일
	 * */
	public static String getId(String key) throws IOException {
		File file = new File("src/consoleProgram/studentMng/data/id.text");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String content = "";
		String id = "";
		String reWriteContents = "";
		
		while((content = br.readLine()) != null) {
			if(content.contains(key)) {
				String[] idTemp = content.split("=");
				id = Integer.toString((Integer.parseInt(idTemp[1]) + 1));
				reWriteContents += key + "=" + id + "\n";
			}else {
				reWriteContents += content + "\n";
			}
		}
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(reWriteContents, 0, reWriteContents.length());
		bw.flush();
		bw.close();
		
		return id;
	}
}
