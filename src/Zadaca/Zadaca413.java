//4.14(Vowel or consonant?) Write a program that prompts the user to enter a letter and
//check whether the letter is a vowel or consonant. Here is a sample run:

package Zadaca;

import java.util.Scanner;

public class Zadaca413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a letter: ");
        String character = scanner.next();

        if (!Character.isLetter(character.charAt(0))) {
            System.out.println("That is an invalid input");
        }
        else {

            switch (character.charAt(0)) {
                case 'a', 'A':
                    System.out.println("The letter is a vowel");
                    break;
                case 'e', 'E':
                    System.out.println("The letter is a vowel");
                    break;
                case 'i', 'I':
                    System.out.println("The letter is a vowel");
                    break;
                case 'o', 'O':
                    System.out.println("The letter is a vowel");
                    break;
                case 'u', 'U':
                    System.out.println("The letter is a vowel");
                    break;
                default:
                    System.out.println("The letter is a consonant");
            }
        }
    }
}

