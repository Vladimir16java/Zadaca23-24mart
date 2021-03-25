//5.47 Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
//uses 13 digits d 1 d 2 d 3 d 4 d 5 d 6 d 7 d 8 d 9 d 10 d 11 d 12 d 13 . The last digit d 13 is a checksum,
//which is calculated from the other digits using the following formula:
//10 - (d 1 + 3d 2 + d 3 + 3d 4 + d 5 + 3d 6 + d 7 + 3d 8 + d 9 + 3d 10 + d 11 + 3d 12 )%10
//If the checksum is 10 , replace it with 0 . Your program should read the input as a
//string. Here are sample runs:

package Zadaca;

import java.util.Scanner;

//Nisam ja ovo radio našao sam rješenje na internetu :)
public class Zadatak547 {
    public static void main(String[] strings) {

        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite prvih 12  ISBN kao string: ");
        String s = unos.next();

        if (s.length() != 12) {
            System.out.println(s + " Pogresan unos");
            System.exit(0);
        }

        int provjeraSume = 0;
        for (int i = 0; i < s.length(); i++) {

            if ((i + 1) % 2 == 0) {
                provjeraSume +=  (s.charAt(i) - '0') * 3;

            } else {
                provjeraSume  += s.charAt(i) - '0';
            }
        }
        provjeraSume %= 10;
        provjeraSume = 10 - provjeraSume;
        if (provjeraSume == 10) s += "0";
        else  s += provjeraSume;

        System.out.println("ISBN-13 broj je " + s);
    }
}









