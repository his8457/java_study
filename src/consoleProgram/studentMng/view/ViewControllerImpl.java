package consoleProgram.studentMng.view;

import java.io.IOException;

import consoleProgram.studentMng.module.common.Util;
import consoleProgram.studentMng.module.school.School;
import consoleProgram.studentMng.module.school.SchoolService;

public class ViewControllerImpl implements ViewController {
	
	/**
	 * 성적관리 프로그램의 메인 메뉴를 화면에 출력한다.
	 * @throws IOException 
	 * */
	@Override
	public void showMainMenu() throws IOException {
		System.out.println("─────────────────── 성적관리 프로그램 ───────────────────");
		System.out.println("1.학교 조회/설정");
		System.out.println("2.학생 조회/설정");
		System.out.println("3.과목 조회/설정");
		System.out.println("4.시스템 설정");
		System.out.println("─────────────────────────────────────────────────────");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int inputNum = Util.getInputMenu();
		
		switch (inputNum) 
		{
			case 1: {
					this.showSchoolMenu();
					break;
			}
			case 2: {
					this.showStudentMenu();
					break;
			}
			case 3: {
					this.showSubjectMenu();
					break;
			}
		}	
	}
	
	/**
	 * 학교 조회/등록/수정/삭제 메뉴를 화면에 출력한다.
	 * @throws IOException 
	 * */
	public void showSchoolMenu() throws IOException {
		int inputNum = 0;
		SchoolService service = new SchoolService();
		while(true) {
			System.out.println("                                                   ");
			System.out.println("─────────────────── 학교 조회/설정 ───────────────────");
			System.out.println("1.학교 조회");
			System.out.println("2.학교 등록");
			System.out.println("3.학교 수정");
			System.out.println("4.학교 삭제");
			System.out.println("5.메인메뉴로 돌아가기");
			System.out.println("───────────────────────────────────────────────────");
			System.out.print("메뉴 번호를 입력하세요 : ");
			inputNum = Util.getInputMenu();
			
			if(inputNum == 1) {
				service.getList();
			}else if(inputNum == 2) {
				try {
					service.add();
				} catch (IOException e) {
					System.out.println("학교 등록에 실패하였습니다.");
				}
			}else if(inputNum == 3) {
				service.update();
			}else if (inputNum == 4) {
				service.delete();
			}else if(inputNum == 5){
				System.out.println("5");
				break;
			}
		}
	}

	public void showStudentMenu() {
		System.out.println("                                                   ");
		System.out.println("─────────────────── 학생 조회/설정 ───────────────────");
		System.out.println("1.학생 조회");
		System.out.println("2.학생 등록");
		System.out.println("3.학생 수정");
		System.out.println("4.학생 삭제");
		System.out.println("5.메인메뉴로 돌아가기");
		System.out.println("───────────────────────────────────────────────────");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int result = Util.getInputMenu();
	}
	
	public void showSubjectMenu() {
		System.out.println("                                                   ");
		System.out.println("─────────────────── 과목 조회/설정 ───────────────────");
		System.out.println("1.과목 조회");
		System.out.println("2.과목 등록");
		System.out.println("3.과목 수정");
		System.out.println("4.과목 삭제");
		System.out.println("5.메인메뉴로 돌아가기");
		System.out.println("───────────────────────────────────────────────────");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int result = Util.getInputMenu();
	}
	
	public void showSystemMenu() {
		System.out.println("                                                   ");
		System.out.println("─────────────────── 시스템 설정 ───────────────────");
		System.out.println("5.메인메뉴로 돌아가기");
		System.out.println("─────────────────────────────────────────────────");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int result = Util.getInputMenu();
	}
}
