import java.util.*;
class HS1
{
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
		hs.add("india");
		hs.add("america");
		hs.add("japan");
		hs.add("china");
		hs.add("america");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}
