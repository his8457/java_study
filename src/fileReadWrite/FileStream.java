package fileReadWrite;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileStream {
	public static void main(String[] args) throws IOException {
		String str = "안녕하세요";
		
		FileWriter fw = new FileWriter("c:/test.txt");
		fw.append(str);
		fw.flush();
		fw.close();
		
		FileOutputStream fos = new FileOutputStream("c:/test1.txt");
		byte[] byteStr = str.getBytes();
		fos.write(byteStr);
		fos.flush();
		fos.close();
		
	}
}
