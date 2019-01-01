import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Limit - ");
        int k = sc.nextInt();

        if (k >= 1) {
            for (int i = 1; i <= k; i++) {
                if (isPrime(i)) {
                    System.out.println("\n" + i);
                }
            }
        } else
            System.out.println("Wrong Limit");
    }
}
