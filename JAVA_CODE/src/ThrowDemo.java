class ThrowDemo
{
  static void demoproc()
  {
   try
   {
     throw new Exception("demo");
   } catch(Exception e) 
   {
     System.out.println("Caught inside demoproc.");
    
   }
 }
public static void main(String args[]) {
   demoproc();
 }
}

