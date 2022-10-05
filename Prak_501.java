import java.util.Scanner;
public class Prak_501 {
    public static void main (String[]args){
        Scanner masukan =new Scanner (System.in);
        int jumbil, total=0;
        float rata2;
        System.out.print("Beberapa banyak bilangan ? ");
        jumbil = masukan.nextInt();
        int data []= new int [jumbil];
        for(int i=0; i<jumbil;i++){
            System.out.print("masukan data ke-"+(i+i) +" : ");
            data[i] = masukan.nextInt();
            total= total + data [i];
        }
        System.out.print (" nilai rata rata dari : ");
        for(int i=0;i<jumbil;i++)
            System.out.print(data[jumbil-1] + " adalah ");
            rata2=total/jumbil;
            System.out.print(rata2);
        

    }
    }

