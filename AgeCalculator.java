import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Your Year of Birth - ");
        int yob = sc.nextInt();
        System.out.println("\nEnter The Current Year - ");
        int cy = sc.nextInt();
        sc.close();
        if ((((yob > 1)) && (yob < cy))) {
            int age = cy - yob;
            System.out.println("\nAge = " + age);
        } else
            System.out.println("\nInvalid Inputs");
    }
}
