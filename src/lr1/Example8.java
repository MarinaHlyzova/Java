package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input день недели: ");
        String деньнедели = in.nextLine();

        System.out.println("Input дата: ");
        String дата = in.nextLine();

        System.out.println("Input месяц: ");
        String месяц = in.nextLine();

        System.out.println("" + деньнедели + ", " + дата + ", " + месяц);
        in.close();
    }
}
