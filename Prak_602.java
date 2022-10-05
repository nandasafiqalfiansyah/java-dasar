import java.io.*; 
public class Prak_602 {
public static void main (String[] args) throws Exception { 
File fileIn = new File("Prak_602.java");
File fileOut = new File("hasil.txt");
if (!fileIn.exists() || !fileIn.canRead()){ 
System.out.println("teks pada file tidak terbaca" + fileIn); 
return;
}
try {
int i=0;
BufferedReader fIn=new BufferedReader(new FileReader(fileIn)); 
BufferedWriter fOut=new BufferedWriter(new FileWriter(fileOut)); 
String line;
while((line = fIn.readLine()) != null){ 
i++;
if (i<10) fOut.write(" "); 
else if (i<100) fOut.write(" "); 
fOut.write(i+" : "+line); 
fOut.newLine();
}
fOut.close(); 
fIn.close();
}
catch (FileNotFoundException e){ 
System.out.println("File tidak ditemukan");
}
}
}