/*
 * This source file was generated by the Gradle 'init' task
 */
package q1;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int P = scanIn.nextInt();
        int Q = scanIn.nextInt();
        if (P > 1 || Q > 1) {
            if(P == Q) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }   
        } else {
            System.out.println("Error");
        }
    }
}
