package lr2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x % 5;
        int result1 = x % 7;
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);
        if (result == 2) {
            System.out.println("Введенное число делится на пять с остатком 2");
        } else {
            System.out.println("Введенное число не делится на пять с остатком 2");
            if (result1 == 1) {
                System.out.println("Введенное число делится на семь с остатком 1");
            } else {
                System.out.println("Введенное число не делится на семь с остатком 1");
            }
        }
    }
}