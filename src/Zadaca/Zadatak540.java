//5.40 (Simulation: heads or tails) Write a program that simulates flipping a coin one
//million times and displays the number of heads and tails.


package Zadaca;

public class Zadatak540 {
        public static void main(String[] args) {
            int brojacGlave = 0;
            int brojacPisma = 0;


            for (int i = 0; i < 1000000; i++) {
                int simulator = (int) (Math.random() * 1000000) + 1;
                if (simulator < 500000) {

                    brojacGlave++;
                } else {

                    brojacPisma++;
                }
            }
            System.out.println("Novcic je na glavu pao:" + brojacGlave);
            System.out.println("Novcic je na pismo pao:" + brojacPisma);


        }
    }

