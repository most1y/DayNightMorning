package org.code;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose the time in the day (example: '9' or '24')");
        Scanner time = new Scanner(System.in);
        if (time.nextInt() > 3 && time.nextInt() < 13) {
            System.out.println("It's a morning!");
        } else if (time.nextInt() > 12 && time.nextInt() < 18) {
            System.out.println("It's a day!");
        } else if ((time.nextInt() > 0 && time.nextInt() < 4) || (time.nextInt() > 18 && time.nextInt() < 25)) {
            System.out.println("It's a night!");
        } else {
        System.out.println("Wrong time!");
        }
    }
}