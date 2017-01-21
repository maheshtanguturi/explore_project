class AA extends Thread
{
    public void run()
    {
        System.out.println("threadA started");
        for(int i=1;i<=40;i++)
        {
			System.out.println("from thread A:i="+i);
       }
       System.out.println("exit from A");
    }
}
class BB extends Thread
{
   public void run()
   {
       System.out.println("threadB started");
       for(int j=1;j<=40;j++)
       {
          System.out.println("from thread B:j="+j);
       }
       System.out.println("exit from B");
  }
}
class ThreadPriority1
{
    public static void main(String args[])
    {
        AA a  =new AA();
        BB b = new BB();
		b.setPriority(Thread.MAX_PRIORITY);
		a.setPriority(Thread.MIN_PRIORITY);
        System.out.println("start thread A");
        a.start();
        System.out.println("start thread B");
        b.start();
   }
}





