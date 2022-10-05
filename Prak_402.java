import java.util.Scanner; 
public class Prak_402 {
public static void main (String[] args) { 
Scanner masukan = new Scanner(System.in); 
int pertama, kedua, ketiga, terbesar , terkecil;
System.out.println("Program Menjumlahkan 2 bilangan"); 
System.out.print("Masukkan bilangan 1 : ");
pertama = masukan.nextInt(); 
System.out.print("Masukkan bilangan 2 : "); 
kedua = masukan.nextInt(); 
System.out.print("Masukkan bilangan 3 : ");
ketiga = masukan.nextInt();

if(pertama>kedua && pertama>ketiga){
   terbesar = pertama;
}
else{
if(kedua>ketiga){
terbesar=kedua;
}
else{
terbesar=ketiga;
    }
}
if(pertama<kedua && pertama<ketiga){
    terkecil = pertama;
}
else{
if(kedua<ketiga){
    terkecil=kedua;
}else{
    terkecil=ketiga;
    }
 }
     
System.out.println("Bilangan terbesar adalah "+terbesar);
System.out.println("Bilangan terkecil adalah "+terkecil);
    }
}


