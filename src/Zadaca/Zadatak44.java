//4.4(Geometry: area of a hexagon) The area of a hexagon can be computed using the
//following formula ( s is the length of a side):
//Area =
//6 * s 2
//p
//4 * tan¢ ≤
//6
//Write a program that prompts the user to enter the side of a hexagon and displays
//its area. Here is a sample run:


package Zadaca;

import java.util.Scanner;

public class Zadatak44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu ");
        double s = scanner.nextDouble();

        double area = (6 * Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / 6)));

        System.out.println("Povrsina = " + area);
    }
}
