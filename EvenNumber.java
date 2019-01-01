import java.util.Scanner;

public class EvenNumber {
    public static boolean isEven(int n){
        if((n%2)==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Limit - ");
        int k = sc.nextInt();
        if (k >= 1) {
            for (int i = 1; i <= k; i++) {
                if (isEven(i)) {
                    System.out.println("\n" + i);
                }
            }
        } else
            System.out.println("Wrong Limit");
    }
}