import java.util.Scanner;

public class EvenOdd_Position_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mainnum;
        String evenpositions="";
        String oddpositions="";
        int evendigits;
        int odddigits;
        int evensum=0;
        int oddsum=0;

        System.out.println("\nEnter The Number - ");
        mainnum=sc.nextLine();
        sc.close();

        for(int i=0;i<mainnum.length();i+=2)
            oddpositions+=mainnum.charAt(i);
        for(int i=1;i<mainnum.length();i+=2)
            evenpositions+=mainnum.charAt(i);

        evendigits=Integer.parseInt(evenpositions);
        odddigits = Integer.parseInt(oddpositions);

        while(evendigits>0){
            int ld=evendigits%10;
            evensum+=ld;
            evendigits=evendigits/10;
        }
        while(odddigits>0){
            int ld=odddigits%10;
            oddsum+=ld;
            odddigits=odddigits/10;
        }
        System.out.println("\nThe Sum of Even Positioned Digits = "+evensum);
        System.out.println("\nThe Sum of Odd Positioned Digits = "+oddsum);

    }
}
