
import java.util.Scanner;

public class PerfectNumber {

    public static boolean PerfectCheck(int number)
    {
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if((number%i)==0)
                sum=sum+i;
        }
        if(sum==number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Your Number for Checking - ");
        int n=sc.nextInt();
        sc.close();
        if (PerfectCheck(n)){
            System.out.println("\n Yes !! It is a Perfect Number");
                    }
        else
            System.out.println("\n No !! It is not a Perfect Number");
    }
}
