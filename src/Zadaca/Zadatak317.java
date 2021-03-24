//3.17(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
//paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
//wrap a rock.) The program randomly generates a number 0 , 1 , or 2 representing
//scissor, rock, and paper. The program prompts the user to enter a number 0 , 1 , or
//2 and displays a message indicating whether the user or the computer wins, loses,
//or draws. Here are sample runs:

package Zadaca;

import java.util.Scanner;

public class Zadatak317 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 3);
        System.out.print("scissor (0), rock(1), paper(2): ");
        int guess = scanner.nextInt();

        if (randomNumber == 0 && guess == 0) {
            System.out.println("Nerijeseno");
        }
        else if (randomNumber == 0 && guess == 1) {
            System.out.println("Pobijedio si!");
        }
        else if (randomNumber == 0 && guess == 2) {
            System.out.println("Izgubio si!");
        }
        else if (randomNumber == 1 && guess == 0) {
            System.out.println("Izgubio si!");
        }
        else if (randomNumber == 1 && guess == 1) {
            System.out.println("Draw!");
        }
        else if (randomNumber == 1 && guess == 2) {
            System.out.println("Pobijedio si!");
        }
        else if (randomNumber == 2 && guess == 0) {
            System.out.println("Pobijedio si!");
        }
        else if (randomNumber == 2 && guess == 1) {
            System.out.println("Izgubio si!");
        }
        else if (randomNumber == 2 && guess == 2) {
            System.out.println("Nerijeseno");
        }

    }
}

