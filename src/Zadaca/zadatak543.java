//5.43(Math: combinations) Write a program that displays all possible combinations
//for picking two numbers from integers 1 to 7 . Also display the total number of
//all combinations.


package Zadaca;

public class zadatak543 {
    public static void main(String[] args) {
        int brojac = 0; //


        for (int broj1 = 1; broj1 < 7; broj1++) {
            for (int broj2 = broj1 + 1; broj2 <= 7; broj2++) {
                System.out.println(broj1 + " " + broj2);
                brojac++;
            }
        }


        System.out.println("Broj svih kombinacija je " + brojac);
    }
}

