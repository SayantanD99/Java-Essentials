import java.util.Scanner;

public class EvenOddSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter The Number - ");
        int num=sc.nextInt();
        sc.close();
        int d,evensum=0,oddum=0;
        while(num>0){
            d=num%10;
            if((d%2)==0) {
                evensum += d;
            }
            else {
                oddum += d;
            }
            num=num/10;
        }
        System.out.println("\nSum of the Even Digit Numbers = "+evensum);
        System.out.println("\nSum of the Odd Digit Numbers = "+oddum);
    }
}
