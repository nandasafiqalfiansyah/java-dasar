import java.util.Scanner; 
public class Prak_201 {
public static void main (String[] args) { 
Scanner masukan = new Scanner(System.in); 
int nilai;
System.out.print("Masukkan nilaiakhir mata kuliahnya :");
nilai = masukan.nextInt(); 
if (nilai < 55)
System.out.println("Mahasiwa  tersebut tidak lulus");
}
}