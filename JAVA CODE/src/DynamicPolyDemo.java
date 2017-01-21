class Test
{
	public void show()
	{
		System.out.println("from superclass");
	}
}
public class DynamicPolyDemo extends Test
{
	public void show()
	{
		System.out.println("from subclass");
	}
	public static void main(String args[])
	{
		DynamicPolyDemo dpd=new DynamicPolyDemo();
		dpd.show();
	}
}
