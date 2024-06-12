// a. By Extending the Thread Class
// You can create a new class that extends Thread and override its run method. Here's an example:

public class MyThread extends Thread {
  public void run() {
      System.out.println("Thread is running...");
  }

  public static void main(String[] args) {
      MyThread t1 = new MyThread();
      t1.start();  // Start the thread
  }
}
