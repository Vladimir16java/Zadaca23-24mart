//3. 26(Use the && , || and ^ operators) Write a program that prompts the user to enter
//an integer and determines whether it is divisible by 5 and 6, whether it is divisible
//by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
//of this program:


package Zadaca;

import java.util.Scanner;

public class Zadatak326 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % 5 == 0 && input % 6 == 0) {
            System.out.println("Broj " + input + " je dijeljiv sa 5 i 6");
        }
        if (input % 5 == 0 || input % 6 == 0) {
            System.out.println("Broj" + input + " je djeljiv sa 5 ili 6");
        }
        if (input % 5 == 0 ^ input % 6 == 0) {
            System.out.println("Broj " + input + " je dijeljiv sa 5 ili 6 ali ne sa obadva ");
        }
    }
}