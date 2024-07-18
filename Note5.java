import java.util.Scanner;

public class Note5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to pay: ");
        double amount = sc.nextDouble();
        int thousand = 0;
        int fiveHundred = 0;
        int hundred = 0;
        int fifty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
    if (amount >= 1000) {
        thousand = (int) amount / 1000;
        amount = amount % 1000;
        System.out.println(thousand);
    }
    if (amount >= 500) {
        fiveHundred = (int) amount / 500;
        amount = amount % 500;

        System.out.println(fiveHundred);
    }
    if (amount >= 100) {
        hundred = (int) amount / 100;
        amount = amount % 100;
        System.out.println(hundred);
    }
    if (amount >= 50) {
        fifty = (int) amount / 50;
        amount = amount % 50;
        System.out.println(fifty);
    }
    if (amount >= 10) {
        ten = (int) amount / 10;
        amount = amount % 10;
        System.out.println(ten);
    }
    if (amount >= 5) {
        five = (int) amount / 5;
        amount = amount % 5;
        System.out.println(five);
    }
    if (amount >= 1) {
        one = (int) amount / 1;
        amount = amount % 1;
        System.out.println(one);
    }
    }
}

