//3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
//Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
//the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0 , report
//that “The equation has no solution.”

package Zadaca;

import java.util.Scanner;

public class Zadatak33 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, f: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
    double f = scanner.nextDouble();
    double x = 0;
    double y = 0;
    double ad = a + d;
    double bc = b + c;

        if (ad - bc == 0) {
        System.out.print("The equation has no solution.");
    } else {
        x = ((e + d) - (b + f)) / ((a + d) - (b + c));
        y = ((a + f) - (e + c)) / ((a + d) - (b + c));
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
}

