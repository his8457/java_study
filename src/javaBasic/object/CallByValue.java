package javaBasic.object;

import javaBasic.innerClass.Visitor;

public class CallByValue {//원래값이 영향을 받지 않음.
	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		visitor.setName("홍길동");
		visitor.setAge(55);
		System.out.println("before run : " + visitor.hashCode());
		
		Visitor changedVisitor = CallByValue.changeVisitor(visitor);
		
		System.out.println("after run : " + visitor.hashCode() + ", age: " + visitor.getAge() + ", name : " + visitor.getName());
		System.out.println("after run changed : " + changedVisitor.hashCode() + ", age: " + changedVisitor.getAge() + ", name : " + changedVisitor.getName());
	}
	
	public static Visitor changeVisitor(Visitor visitor) {
		System.out.println("in method : " + visitor.hashCode());
		
		Visitor newVisitor = new Visitor();
		visitor = newVisitor;
		visitor.setAge(80);
		visitor.setName("퉁퉁이");
		System.out.println("new Visitor : " + visitor.hashCode());
		return visitor;
	}
}
