import java.util.*;
class HashMapExample1 { 
public static void main(String args[]) { 
HashMap hm = new HashMap(); 
hm.put("John Doe", new Double(3434.34)); 
hm.put("Tom Smith", new Double(123.22)); 
hm.put("Jane Baker", new Double(1378.00)); 
Set set = hm.entrySet(); 
Iterator i = set.iterator(); 
while(i.hasNext()) { 
Map.Entry me = (Map.Entry)i.next(); 
System.out.print(me.getKey() + ": "); 
System.out.println(me.getValue()); 
} 
} 
}