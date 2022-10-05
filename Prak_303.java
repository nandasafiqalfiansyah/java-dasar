import java.util.Scanner; 
public class Prak_303 {
public static void main (String[] args) { 
Scanner masukan = new Scanner(System.in);
System.out.println("Masukkan sebuah bilangan : "); 
int bil = masukan.nextInt();
boolean bilangan = true; 
for(int i=2; i<bil; i++){
if ((bil % i) == 4) { 
bilangan = false; break;}
}
if (bilangan)
System.out.print(bil + " Bisa dibagi 4"); 
else
System.out.print(bil + " Tidak bisa dibagi");
}
}