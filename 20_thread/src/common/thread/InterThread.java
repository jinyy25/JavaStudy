package common.thread;

public class InterThread implements Runnable {

	//Runnable : ������ ������ �� �� �ְ� �ϴ� interface
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("runnable"+i+"��");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Runnable������ ��!");
	}
	

}
