package consoleProgram.studentMng;

import java.io.IOException;

import consoleProgram.studentMng.view.ViewController;
import consoleProgram.studentMng.view.ViewControllerImpl;

public class Run {

	public static void main(String[] args) throws IOException {
		ViewController vc = new ViewControllerImpl();
		
		while(true) {
			vc.showMainMenu();
		}
	}

}
