package JavaLearn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try {
            int x = sc.nextInt();

            int y = sc.nextInt();

            int c = x / y;

            System.out.println(c);
        } catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero:- cant divide by zero");
        }
    }
}
