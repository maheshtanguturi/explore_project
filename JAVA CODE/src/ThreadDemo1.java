class NewThread implements Runnable { 
NewThread() { 
Thread t = new Thread(this, "Demo Thread"); 
System.out.println("Child thread: " + t); 
t.start();  
} 

public void run() { 
try { 
for(int i = 5; i > 0; i--) { 
System.out.println("Child Thread: " + i); 
Thread.sleep(500); 
} 
} catch (InterruptedException e) { 
System.out.println("Child interrupted."); 
} 
System.out.println("Exiting child thread.");
}
} 

class ThreadDemo1 { 
public static void main(String args[]) { 
	new NewThread();  

}
} 

