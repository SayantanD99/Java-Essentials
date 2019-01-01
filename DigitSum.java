import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int sum = 0;
        int n, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Your Number - ");
        n = sc.nextInt();
        sc.close();
        if (n < 10) {
            System.out.println("\nCannot Add the Digits as the input is a Single Digit Number !");
        } else {
            while (n > 0) {
                d = n % 10;
                sum = sum + d;
                n = n / 10;
            }
            System.out.println("\nSum of the Digits = " + sum);
        }
    }
}