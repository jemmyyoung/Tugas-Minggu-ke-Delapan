package Tugas1;

public class Demo {
	
public static void main(String[] args) {
Thread myThread = new Thread
(new MyClassGanjilGenap());
		
Thread myThread1 = new Thread
(new MyClassFibonacci());
		
myThread.start();
myThread1.start();
		
		
		
	              }//DEMO
		
	                                     }//STATIC VOID

	

