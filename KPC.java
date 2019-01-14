import java.util.Scanner;
public class KPC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p,kg;
        System.out.println("\nEnter Value in Pounds :");
        p=sc.nextDouble();
        kg=(p*0.45359237d);
        System.out.println("\nIn Pounds = " + p);
        System.out.println("\nIn Kilograms = " + kg);
    }
}
