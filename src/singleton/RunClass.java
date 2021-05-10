package singleton;

public class RunClass {

	public static void main(String[] args) {
		SingletonObj ins1 = SingletonObj.getInstance();
		SingletonObj ins2 = SingletonObj.getInstance();
		
		System.out.println(ins1 == ins2);
	}

}
