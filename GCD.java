import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tEnter Two Positive Numbers\n");
        System.out.println("\n Enter No. 1 - ");
        n1=sc.nextInt();
        System.out.println("\n Enter No. 2 - ");
        n2=sc.nextInt();
        sc.close();
        n1 = ( n1 > 0 ) ? n1 : -n1 ;
        n2 = ( n2 > 0 ) ? n2 : -n2 ;
        while(n1 != n2){
            if(n1 > n2){
                n1 -= n2;
                            }
            else{
                n2 -= n1;
            }
        }
        System.out.println("\n G.C.D. of the two numbers entered = " +n1);
    }
}
