import java.util.Scanner;

public class FeetInchesCentimetres {
    public static void convert(double feet,double inches){
        double centimetres;
        if((feet<0) ||((inches<0)|| (inches>12))) {
            System.out.println("\n Invalid Inputs...The result Cannot be calculated\n");
        }
        else {
            centimetres=(feet*12)*2.54;
            centimetres += (inches*2.54);
            System.out.println("\nFeet = "+feet+"\tInches = "+inches+"\n\nCentimetres = "+centimetres);
        }


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double feet,inches;
        System.out.println("\nEnter the Feet Value : ");
        feet=sc.nextDouble();
        System.out.println("\n Enter the Inches Value : ");
        inches=sc.nextDouble();
        convert(feet,inches);
    }
}
