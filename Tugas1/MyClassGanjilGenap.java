package Tugas1;
import java.util.Scanner;
public class MyClassGanjilGenap implements Runnable{
	
	
		int angkaGG;
		String ganjilGenap= "Tunggu beberapa detik sampai menu untuk input bilangan fibonacci akan muncul !!! ";
	
		Scanner scan=new Scanner(System.in);

	
		public void run() {
		System.out.println("INPUT angka Ganjil atau Genap "
				          +"[jangan lupa tekan ENTER setelah input]:");
		angkaGG= scan.nextInt(); 
		System.out.println("Mohon tunggu...");
		
		scan.nextLine();
		if(angkaGG % 2 == 0){
			try {
			Thread.sleep(30000); //30 detik
			}//try
			catch (InterruptedException e) {
			e.printStackTrace();
											}//catch
			System.out.println("Angka yang di input adalah GENAP");
			System.out.println(ganjilGenap);
			System.out.println();
		    				}//if
		
			else{
			try {
			Thread.sleep(30000); // 30 detik
			}//try
			catch (InterruptedException e) {
			e.printStackTrace();
			}//catch 
			System.out.println("Angka yang di input adalah GANJIL");
			System.out.println(ganjilGenap);
			System.out.println();
		    }//else
		}//void run
}//class