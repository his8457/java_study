package consoleProgram.studentMng.module.school;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import consoleProgram.studentMng.module.common.Util;

public class SchoolService {
	
	public void getList() throws IOException{
		File file = new File("src/consoleProgram/studentMng/data/schoolInfo.text");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String content = "";
		School school = null;
		String[] contentArr = null;
		List<School> schoolList = new ArrayList<School>();
		
		while((content = br.readLine()) != null) {
			contentArr = content.split("=");
			school = new School(contentArr[0], contentArr[1]);
			schoolList.add(school);
		}
		
		System.out.println("                                                 ");
		System.out.println("-------------------- 학교 목록 --------------------");
		for(School s : schoolList) {
			System.out.println("아이디 : " + s.getId() + "    |   " + "학교명 : " + s.getName());
		}
		System.out.println("                                                 ");
	}
	
	public boolean add() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 학교의 이름을 입력하세요 : ");
		String name = sc.next();
		String id = Util.getId("School.id");
		String addContent = id+"="+name;
		
		File file = new File("src/consoleProgram/studentMng/data/schoolInfo.text");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String content = "";
		String reWriteContent = "";
		while((content = br.readLine()) != null) {
			reWriteContent += content + "\n";
		}
		reWriteContent += addContent + "\n";
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(reWriteContent);
		bw.flush();
		bw.close();
		
		return true;
	}
	
	public boolean update() {
		return true;
	}
	
	public boolean delete() {
		return true;
	}
}
