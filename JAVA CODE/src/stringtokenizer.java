import java.util.*;
class  stringtokenizer                                       
{
   public static void main(String args[])
   {
      String s="HELLO HOW R U";
      StringTokenizer st=new StringTokenizer(s);
      while(st.hasMoreTokens())
      System.out.print(st.nextToken());
   }
}

