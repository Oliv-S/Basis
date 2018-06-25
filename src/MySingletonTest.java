import java.util.Random;

public class MySingletonTest implements Runnable{

	MySingleton mySingletonInstance;
	Integer id;
	
	public MySingletonTest() {
		mySingletonInstance = MySingleton.getInstance();
		id=new Random().nextInt(10000);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Random rnd = new Random();
		int sleep=rnd.nextInt(100);
		for (int j = 0; j < 100; j++) {	
			int nextValue = rnd.nextInt(1000);
			mySingletonInstance.setCount(nextValue);
			if (mySingletonInstance.getCount()!=nextValue)
				System.out.println(this.id.toString() +" -> " + nextValue + " - " + mySingletonInstance.getCount());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			MySingletonTest tmp = new MySingletonTest();
			new Thread(tmp).start();
		}

	}

}
