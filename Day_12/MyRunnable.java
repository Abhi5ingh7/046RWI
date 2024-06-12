// b. By Implementing the Runnable Interface
// Another way to create a thread is by implementing the Runnable interface and passing an instance of the class to a Thread object:

public class MyRunnable implements Runnable {
  public void run() {
      System.out.println("Thread is running...");
  }

  public static void main(String[] args) {
      MyRunnable myRunnable = new MyRunnable();
      Thread t1 = new Thread(myRunnable);
      t1.start();  // Start the thread
  }
}

