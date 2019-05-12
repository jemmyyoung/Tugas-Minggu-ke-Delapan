package Tugas2;
public class MyClassPrime{
public static void main(String[] args) throws InterruptedException {
	
	Integer bilanganPrima[] = {
	2,3,5,7,11,13,17,19,23,29
	};//integer bilanganPrima
	
	for(int i = 0; i<bilanganPrima.length; i++){
	Thread.sleep(2000); 
	System.out.println(bilanganPrima[i]);
	}//for
	
}//static
}//class
