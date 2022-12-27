package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0;
        String MonthOfName ="Unknown";
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                MonthOfName ="Январь";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName ="Февраль";
                number_Of_DaysInMonth = 28;
                break;
            case 3:
                MonthOfName ="Март";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName ="Апрель";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName ="Май";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName ="Июнь";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName ="Июль";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName ="Август";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName ="Сентябрь";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName ="Октябрь";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName ="Ноябрь";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName ="Декабрь";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + number_Of_DaysInMonth);
    }
}
