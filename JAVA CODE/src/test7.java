class sample
{
  void  test()
  {
     System.out.println("no parameters");
  }
  void test(int a)
  {
     System.out.println("a:"+a);
  }
  void test(int a,int b)
  {
     System.out.println(" a & b:"+a+"  "+b);
  }
  double test(double a)
  {
     System.out.println("double a:"+a);
     return a*a;
  }
}
class test7
{
 public static void main(String args[])
 {
    sample s=new sample();
    double result;
    s.test();
    s.test(2);
    s.test(10,20);
    result =s.test(12.3);
    System.out.println("result"+result);
 }
}

