import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();
        int thousand = 0;
        int fiveHundred = 0;
        int hundred = 0;
        int fifty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;

    if (amount >= 1000) {
        thousand = (int) (amount / 1000);
        amount = amount % 1000;
        System.out.println("1000 * " + thousand);
    }
    if (amount >= 500) {
        fiveHundred = (int) (amount / 500);
        amount = amount % 500;
    }
    if (amount >= 100) {
        hundred = (int) (amount / 100);
        amount = amount % 100;
    }
    if (amount >= 50) {
        fifty = (int) (amount / 50);
        amount = amount % 50;
    }
    if (amount >= 10) {
        ten = (int) (amount / 10);
        amount = amount % 10;
    }
    if (amount >= 5) {
        five = (int) (amount / 5);
        amount = amount % 5;
    }
    if (amount >= 1) {
        one = (int) (amount);
        amount = amount % 1;
    }
    System.out.println("Amount to given: ");
    System.out.println("500 * " + fiveHundred);
    System.out.println("100 * " + hundred);
    System.out.println("50 * " + fifty);
    System.out.println("10 * " + ten);
    System.out.println("5 * " + five);
    System.out.println("1 * " + one);
    }
}


