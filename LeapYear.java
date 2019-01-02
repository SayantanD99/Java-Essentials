
import java.util.Scanner;

public class LeapYear {
    public static boolean LeapCheck(int year){
        if(year%4==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Year : ");
        int year=sc.nextInt();
        sc.close();
        if(LeapCheck(year))
            System.out.println("Yes !! It is a Leap Year");
        else
            System.out.println("No !! It is not a Leap year");
    }
}
