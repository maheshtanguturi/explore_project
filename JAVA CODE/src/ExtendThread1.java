class 
NewThread1 extends Thread { 

NewThread1(){ 
start();  
} 

public void run() { 
try { 
for(int i = 5; i > 0; i--) { 
System.out.println("Child Thread1: " + i); 
Thread.sleep(500); 
} 
} catch (InterruptedException e) { 
System.out.println("Child interrupted."); 
} 
System.out.println("Exiting child thread1.");
}
} 
class 
NewThread2 extends Thread { 

NewThread2() { 
start(); 
} 

public void run() { 
try { 
for(int i = 5; i > 0; i--) { 
System.out.println("Child Thread2: " + i); 
Thread.sleep(1000); 
} 
} catch (InterruptedException e) { 
System.out.println("Child interrupted."); 
} 
System.out.println("Exiting child thread2.");
}
} 

class ExtendThread1 { 
public static void main(String args[]) { 
	new NewThread1();  
	new NewThread2();
}
} 

