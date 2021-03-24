//3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip of
//a coin results in heads or tails. The program randomly generates an integer 0 or 1 ,
//which represents head or tail. The program prompts the user to enter a guess and
//reports whether the guess is correct or incorrect.


package Zadaca;

import java.util.Scanner;

public class Zadatak314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double randomNumber = Math.random();
        int guess = scanner.nextInt();

        if (randomNumber < 0.5) {
            randomNumber = 0;
        } else if (randomNumber >= 0.5) {
            randomNumber = 1;
        }
        if (guess == randomNumber) {
            System.out.println("Vasa predpostavka je bila tacna!");
        } else {
            System.out.println("Vasa predpostavka je nije bila tacna!");
        }
    }
}

