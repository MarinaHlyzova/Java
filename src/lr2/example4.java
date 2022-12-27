package lr2;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int num = in.nextInt();

        if (num>4 && num<11)
        {
            System.out.println("Входит в диапазон");
        }
        else
        {
            System.out.println("Не входит в диапазон");
        }
    }
}
