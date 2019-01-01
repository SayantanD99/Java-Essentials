import java.util.Scanner;
public class PositiveNegativeZero {
    public static void check(int n)
    {
        if(n>0)
            System.out.println("\nThe Entered Number is a Positive one.");
        if(n<0)
            System.out.println("\nThe Entered Number is a Negative one.");
        if(n==0)
            System.out.println("\nThe Entered Number is equal to Zero.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number -");
        int n= sc.nextInt();
        check(n);
    }
}
