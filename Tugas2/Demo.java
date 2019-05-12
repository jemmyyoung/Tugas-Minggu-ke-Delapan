package Tugas2;

public class Demo extends Thread{

	@Override
	public void run() {
		
		int i;
		System.out.println(Thread.currentThread().getId());
	
		
		try{
		Thread.sleep(60000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
}//public
