//proogram konversi suhu//

import java.util.Scanner;
public class Prak_106 {
	public static void main (String[] args) {
		String lagi = "Y";
        
		while(lagi.equals("Y")){
		System.out.println("----------------------------");
		Scanner masukan = new Scanner(System.in); 
		float celcius,reamur;
		System.out.print("masukan nilai suhu(celcius):");
		celcius = masukan.nextFloat();
		reamur=0.8f*celcius;System.out.println();
		System.out.print("nilai suhu reamur dari input :");
		
          System.out.println("Hasil :"+reamur);
		  System.out.print("apakah anda mau mengulang lagi (Y/T) ?");
          Scanner x = new Scanner(System.in);
          lagi = x.nextLine().toUpperCase();
        
          System.out.println("TERIMAKASIH BYE................");
		  }
	}
}
