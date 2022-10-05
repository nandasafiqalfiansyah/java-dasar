import java.util.Scanner; 
public class Prak_202 {
public static void main (String[] args) { 
Scanner masukan = new Scanner(System.in); 
int nilai;
System.out.print("Masukkan nilai akhir mata kuliahnya :");
nilai = masukan.nextInt(); 
if (nilai < 55)
System.out.println("Mahasiwa tersebut tidak lulus");
else
System.out.println("Mahasiwa tersebut lulus");
}
}