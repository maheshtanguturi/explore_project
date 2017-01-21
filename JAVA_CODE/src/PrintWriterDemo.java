import java.io.*; 
public class PrintWriterDemo { 
public static void main(String args[]) { 
PrintWriter pw = new PrintWriter(System.out, true); 
pw.println("This is a string"); 
double d = 4.5; 
pw.println(d); 
 } 
} 


