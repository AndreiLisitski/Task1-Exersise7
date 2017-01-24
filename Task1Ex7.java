import java.util.InputMismatchException;
import java.util.Scanner;
public class Task1Ex7 {

    public static double getFunc( double a){
        double func = Math.pow(Math.sin(a), 2) - Math.cos(2 * a);
        return func;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double h = 0.0;
        try {
            System.out.println("Enter fild A = ");
            a = sc.nextDouble();
            System.out.println("Enter fild B = ");
            b = sc.nextDouble();
            System.out.println("Enter fild H = ");
            h = sc.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Please enter a number!");
        }
        for (double i = a; i <= b; i += h){
                System.out.println("Argument = " + i + " Function = " + getFunc(i) + " ");
            }
            System.out.println();
        }

    }


