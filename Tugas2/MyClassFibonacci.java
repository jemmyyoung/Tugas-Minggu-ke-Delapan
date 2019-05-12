package Tugas2;
public class MyClassFibonacci{
public static void main(String[] args) throws InterruptedException {
	
	Integer fibo[] = {
	0,1,1,2,3,5,8,13,21,34,55,89,144,
	233,377,610,987,1597,2584,4181
	};//integer bilanganFibo
	
	for(int i = 0; i<fibo.length; i++){
	Thread.sleep(2000); 
	System.out.println(fibo[i]);
	}//for
	
}//static
}//class
