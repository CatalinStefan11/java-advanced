package _8_multithreading;

import java.util.HashMap;
import java.util.Map;

public class SecondExample {
  static Map<String, String> sharedMap = new HashMap<>();
  
  static {
    sharedMap.put("key", "something");
  }


  static class MyRunnable implements Runnable {
    
    @Override
    public void run(){
      System.out.println("Thread: " + Thread.currentThread().getName());
      try {
        checkThenAct(sharedMap);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    public void checkThenAct(Map<String, String> sharedMap) throws InterruptedException {
      
      // synchronized on sharedMap
      
      if (sharedMap.containsKey("key")) {
        // heavy work
        Thread.sleep(100);
        
        String val = sharedMap.remove("key");
        
        if (val == null) {
          System.out.println("Value for 'key' was null");
        }
      } else {
        System.out.println("Condition was false.");
      }
    }
  }



  public static void main(String[] args) throws InterruptedException {

    Thread t1 = new Thread(new MyRunnable());
    Thread t2 = new Thread(new MyRunnable());
    Thread t3 = new Thread(new MyRunnable());
    
    t1.start();
    t2.start();
    t3.start();;
    
    Thread.sleep(1000);

    System.out.println(sharedMap.entrySet());
  }

}
