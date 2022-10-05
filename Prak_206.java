import java.util.Scanner; 
public class Prak_206 {
public static void main (String[] args) { 
Scanner masukan = new Scanner(System.in);
Double IMT,b,t;

System.out.print("ALAT UKUR KEGEMUKAN "); 

System.out.print("Masukkan Berat anda(kg):");
b = masukan.nextDouble();
System.out.print("Masukkan Tinggi anda(m) : ");
t = masukan.nextDouble();

IMT = (b /( t * t ));

if (IMT <= 18.5 ) {
System.out.println("KURUS");
}
else if  ( (IMT<= 25) && (IMT > 18.5 )) {
System.out.println("NORMAL");
}
else if ( (IMT<= 30 )&& (IMT > 25 )) {
System.out.println("GEMUK");
}
else if ( IMT <= 30 ) {
System.out.println("KEGEMUKAN");
}
}
}