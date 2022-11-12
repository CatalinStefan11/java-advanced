package _1_functional;

import java.util.function.Function;

public class Ex2 {

    public static void main(String[] args) {
        /*
        Write the following method as a lambda expression:
        public static String everySecondChar(String source) {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        }
        
        Right now, the function doesn't do anything.
        Write the code that will execute the function with an argument of "1234567890"
        */
        Function<String, String> lambda = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };


        System.out.println(lambda.apply("1234567890"));
    }
}
