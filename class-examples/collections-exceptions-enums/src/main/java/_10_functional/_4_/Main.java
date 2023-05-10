package _10_functional._4_;

public class Main {


  public static void main(String[] args) {
    
    Runnable anonymous = new Runnable() {
      @Override
      public void run() {
        System.out.println("I'm an anonymous class that implements run method");
      }
    };

    Runnable runnableLambda = () -> System.out.println("I'm the shorthand for anonymous classes. I'm a lambda expression");
    
    Runnable subclass = new MyRunnable();
    
    
    Thread t1 = new Thread(anonymous);
    Thread t2 = new Thread(runnableLambda);
    Thread t3 = new Thread(subclass);
    
    t1.start();
    t2.start();
    t3.start();
    
  }
  
  static class MyRunnable implements Runnable{
    @Override
    public void run() {
      System.out.println("I'm a class that implements Runnable");
    }
  }


}
