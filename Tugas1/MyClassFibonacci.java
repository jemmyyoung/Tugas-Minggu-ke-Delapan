package Tugas1;

import java.util.Scanner;

public class MyClassFibonacci implements Runnable {
 
	
	
	    public void run() {
		Scanner scan = new Scanner(System.in);
		
		try {
		Thread.sleep(52000);
		}//try
		catch (InterruptedException e) {
		e.printStackTrace();
		}//catch
		
		
		System.out.println("INPUT angka untuk check apakah angka yang di input adalah angka"
				         + " fibonacci atau bukan [jangan lupa tekan ENTER setelah input]: ");
		int angkaC = scan.nextInt();
		System.out.println("Mohon tunggu...");
		
		scan.close();
		int angka1 = 0;
		int angka2 = 1;
		int angkaFibo = 0;
		
		while (angkaFibo < angkaC) {
		angkaFibo = angka1 + angka2;
			
		angka1 = angka2;
		angka2 = angkaFibo;
		                           }//while
		
		if (angkaC == angkaFibo) {
		try {
		Thread.sleep(30000); //30 detik
			 }//try
		catch (InterruptedException e) {
		e.printStackTrace();
			                           }//catch
		System.out.println("Angka yang di input adalah bilangan fibonacci !!!");
		                          }//if} 
	    else {
		try {
		Thread.sleep(30000); //30 detik
			 }//try 
		catch (InterruptedException e) {
		e.printStackTrace();
			                           }//catch
		System.out.println("Angka yang di input bukan bilangan fibonacci !!!");
		      }//else
		
	}//void run

}//class