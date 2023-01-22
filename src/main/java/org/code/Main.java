package org.code;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose the time in the day (example: '9' or '24')");
        Scanner time = new Scanner(System.in);
        if (time.hasNextInt()) {
            int number = time.nextInt();
            if (number > 3 && number < 13) {
                System.out.println("It's a morning!");
            } else if (number > 12 && number < 18) {
                System.out.println("It's a day!");
            } else if ((number > 0 && number < 4) || (number > 18 && number < 25)) {
                System.out.println("It's a night!");
            } else {
                System.out.println("Wrong time!");
            }
        }
    }
}