package common.thread;

public class InheritThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"��");			
			try {
				sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������ ����!");
	}		
}
