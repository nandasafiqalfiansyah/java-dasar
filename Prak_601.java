import java.io.*; 
public class Prak_601 {
public static void main (String[] args) throws Exception { 
File file = new File("Prak_601.java");
if (!file.exists() || !file.canRead()){ 
System.out.println("Can’t read " + file); 
return;
}
try {
int i=0;
BufferedReader fIn = new BufferedReader(new FileReader(file)); 
String line;
while((line = fIn.readLine()) != null){ i++;
System.out.println(i+" : "+line);
}
}
catch (FileNotFoundException e){ 
System.out.println("File tidak ditemukan");
}
}
}
