import java.util.Scanner;
public class MinimumMaximum {
    public static void main(String[] args) {

        int min=0;
        int max=0;
        boolean first = true;

        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter The List of Numbers and mark the end by Entering a Character\n");

        while(true){

            System.out.println("\nEnter Number - ");
            boolean checkInt = sc.hasNextInt();

            if(checkInt){
               int n=sc.nextInt();
               if(first){
                   first=false;
                   min=n;
                   max=n;
               }
               if(n>max){
                   max=n;
               }
               if(n<min){
                   min=n;
               }
            }else{
                break;
            }
            sc.nextLine();
        }
        System.out.println("\nMinimum = "+min+"\t Maxmimum = "+max);
        sc.close();
    }
}
