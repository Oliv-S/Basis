public class MySingleton {
	private int count=0;
	
	private static volatile MySingleton instance;

	private MySingleton() {};
	
	public static MySingleton getInstance() {
		// Double lock for thread safety.
		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}
		}
		return instance;
	}
	
	public synchronized void setCount(int newCount) {
		this.count=newCount;
	}
	
	public synchronized int getCount() {
		return this.count;
	}
}


