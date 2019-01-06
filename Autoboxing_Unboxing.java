import java.util.ArrayList;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {

        ArrayList<String> mystringarray = new ArrayList<String>();

        ArrayList<Integer> myintegerarray = new ArrayList<Integer>();

        for (int i=0;i<=10;i++)
            myintegerarray.add(Integer.valueOf(i)); //Autoboxing
        for (int i=0;i<=10;i++)
            System.out.println(i+"->"+myintegerarray.get(i).intValue());//Unboxing

        Integer myIntValue = 56 ; //Integer.valueOf(56);
        int myInt = myIntValue;//myIntValue.intValue();

        ArrayList<Double> myDoubleArray = new ArrayList<Double>();

        for (double i=0.0;i<=10.0;i+=0.5)
            myDoubleArray.add(i);

        System.out.println("\n");

        for (int i=0;i<myDoubleArray.size();i++)
            System.out.println(i+" -> "+myDoubleArray.get(i));



    }
}
