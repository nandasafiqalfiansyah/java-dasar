import java.util.Scanner; 
public class Prak_306 {
public static void main (String[] args) { 
Scanner masukan = new Scanner(System.in); 
int n=0, total=0, bil=9;
do 
{ 
n++;
System.out.println("Masukkan bilangan ke-" +n+ " : ");
bil = masukan.nextInt(); 
total += bil;
}
while (bil!=0);
System.out.print("Total jumlah "+(n-1)+" bilangan tsb : "); 
System.out.println(total);
}
}
