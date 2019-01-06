import java.util.Scanner;

public class MinimumElementinanARRAY {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getdata(int capacity){

        int[] array = new int[capacity];
        System.out.println("\nEnter "+capacity+" elements - \n");
        for(int i=0;i<capacity;i++){
            array[i]=sc.nextInt();
        }
        return array;

    }

    public static void printarray(int[] arr){

        System.out.println("\n");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\n");
    }

    public static int findmin(int[] arr){

        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;

    }

    public static void main(String[] args) {

        System.out.println("\nEnter the total number of elements in the array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr=getdata(n);
        System.out.println("\nInput Array - \n");
        printarray(arr);
        System.out.println("\nThe minimum element in the array = "+findmin(arr));

    }
}
