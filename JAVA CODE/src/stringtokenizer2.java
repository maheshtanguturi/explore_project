import java.util.*;
class  stringtokenizer2                                       
{
   public static void main(String args[])
   {
      String s="HELLO HOW R U";
      StringTokenizer st=new StringTokenizer(s,"L");
      while(st.hasMoreTokens())
      System.out.print(st.nextToken());
   }
}

