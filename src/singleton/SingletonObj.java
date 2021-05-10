package singleton;

public class SingletonObj {
	
	private static SingletonObj instance = new SingletonObj();
	
	private SingletonObj() {
		
	}
	
	public static SingletonObj getInstance() {
		if(instance == null) {
			instance = new SingletonObj();
		}
		return instance;
	}
}
