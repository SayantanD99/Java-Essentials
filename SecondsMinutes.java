import java.util.Scanner;

public class SecondsMinutes {

    public static void check_calculate(int min, int sec) {
        int hrs,remmin;
        if((min<0) || ((sec<0)||(sec>59))){
            System.out.println("\nInvalid Inputs !! ");
        }
        else{
            hrs=min/60;
            remmin=min%60;
            System.out.println("\nOutput in XXh YYm ZZs format - \n");
            System.out.println(hrs+"h "+remmin+"m "+sec+"s");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,sec;
        System.out.println("\nEnter the Minutes Value - ");
        min=sc.nextInt();
        System.out.println("\nEnter the Seconds Value - ");
        sec=sc.nextInt();
        check_calculate(min,sec);
    }
}
