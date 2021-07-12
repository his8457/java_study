package inner_class;

public class MainRun {
	public static void main(String[] args) {
		
		//1. 정적 내부 클래스
		Visitor.Item item =  new Visitor.Item();
		item.name = "USB";
		item.type = "external Storage";
		
		Visitor visitor = new Visitor(new Visitor.Item(), "HDD", "external Storage");
		System.out.println("visitor ===== : " + visitor.toString());
		
		System.out.println("item ==== : " + item.toString());
	}
}
