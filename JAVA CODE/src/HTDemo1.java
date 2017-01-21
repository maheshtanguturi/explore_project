import java.util.*; 
class HTDemo1 { 
public static void main(String args[]) { 
	Hashtable balance = new Hashtable(); 
	Enumeration names; 
String str; 
double bal; 
balance.put("John Doe", new Double(3434.34)); 
balance.put("Tom Smith", new Double(123.22)); 
balance.put("Jane Baker", new Double(1378.00)); 
names = balance.keys(); 
while(names.hasMoreElements()) { 
str = (String) names.nextElement(); 
System.out.println(str + ": " + 
	balance.get(str)); 
} 
} 
} 
