import java.util.*; 
class PropDemo1 { 
public static void main(String args[]) { 
	Properties capitals = new Properties(); 
	Set states; 
String str; 
capitals.put("Illinois", "Springfield"); 
capitals.put("Missouri", "Jefferson City"); 
capitals.put("Washington", "Olympia"); 
states = capitals.keySet(); 
Iterator itr = states.iterator(); 
while(itr.hasNext()) { 
str = (String) itr.next(); 
System.out.println(str + "  " + capitals.getProperty(str)); 
} 
} 
} 

