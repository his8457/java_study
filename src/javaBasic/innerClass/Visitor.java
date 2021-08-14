package javaBasic.innerClass;

public class Visitor {//정적 내부 클레스
	
	private String name;
	private int age;
	
	public Visitor() {}
	
	public Visitor(Item item, String itemName, String itemType) {
		item.name = itemName;
		item.type = itemType;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String result = "";
		
		if(Item.name != null) {
			result = "Visitor [name=" + name + ", age=" + age + "] , Item [name=" + Item.name + ", type=" + Item.type + "]";
		}else {
			result = "Visitor [name=" + name + ", age=" + age + "]";
		}
		
		return result;
	}
	
	/**
	 * inner class ITEM
	 * */
	public static class Item {
		public static String name;
		public static String type;
		
		public Item() {}
		
		@Override
		public String toString() {
			return "name : " + this.name + ", type : " + this.type;
		}
	}
	
	
}
