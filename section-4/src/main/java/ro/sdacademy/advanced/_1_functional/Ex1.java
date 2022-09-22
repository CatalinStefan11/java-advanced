package ro.sdacademy.advanced._1_functional;

public class Ex1 {

    public static void main(String[] args) {
        /*
        Write the following anonymous class as a lambda expression:
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };
        */
        Runnable lambda = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        
        Thread thread = new Thread(lambda);
        
        thread.start();
    }
}
