package multithreaded.tnsif.org;

public class ThreadDemo {
static void printhello() {
	System.out.println();
	for(int i=0;i<=2;i++) {
		System.out.println("in main method"+Thread.currentThread()+" "+"hello");
	
	}
}
static void printodd() {
	for(int i=1;i<=10;i+=2) {
		System.out.println();
	}
		System.out.println("print odd"+Thread.currentThread());	
	
}
		public static void main(String[] args) {
			System.out.println("in main method"+Thread.currentThread());
			ChildThread t1=new ChildThread();
			ChildThread t2=new ChildThread();
			ChildThread t3=new ChildThread();
			t1.start();
			t2.start();
			t3.start();
		
		
	}
	
}

