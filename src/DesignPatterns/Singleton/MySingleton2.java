package DesignPatterns.Singleton;

public class MySingleton2 {
	private static volatile MySingleton2 instance;
	
	private MySingleton2() {
		// TODO Auto-generated constructor stub
	}
	
	public MySingleton2 getInstance() {
		if (instance==null) {
			synchronized (MySingleton2.class) {
				if (instance==null) {
					instance = new MySingleton2();
				}				
			}
		}
		return instance;		
	}

}

