package multithreaded.tnsif.org;

public class ChildThread extends Thread {
public void run() {
	System.out.println("this is task of child class");
	System.out.println(Thread.currentThread());
	ThreadDemo.printhello();
	
}


	}


