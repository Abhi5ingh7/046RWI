class NewThread extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("in NewThread run " + i);
    }
  }
}

public class MyThread extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("in MyThread run " + i);
    }
  }

  public static void main(String[] args) {
    MyThread th = new MyThread();
    NewThread th1 = new NewThread();

    // Starting MyThread first
    th.start();

    try {
      // Waiting for MyThread to complete for at most 10 seconds
      th.join(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Starting NewThread after MyThread
    th1.start();
  }
}

