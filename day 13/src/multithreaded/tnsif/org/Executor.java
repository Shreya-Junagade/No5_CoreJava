package multithreaded.tnsif.org;

public class Executor extends ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main method"+Thread.currentThread());
		ChildThread t1 = new ChildThread();
		t1.run();
		t1.run();

	}


	}

