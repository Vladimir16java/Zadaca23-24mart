//5.48(Process string) Write a program that prompts the user to enter a string and dis-
//plays the characters at odd positions. Here is a sample run:


package Zadaca;

import java.util.Scanner;

public class Zadatak548 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);


        System.out.print("Unesi string: ");
        String string = unos.nextLine();

        String pozicijaStringa = "";


        for (int i = 0; i < string.length(); i+=2) {
            pozicijaStringa += string.charAt(i);
        }


        System.out.println(pozicijaStringa);
    }
}

