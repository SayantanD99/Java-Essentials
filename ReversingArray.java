
import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getdata(int capacity){

        int[] array = new int[capacity];
        System.out.println("\nEnter "+capacity+" elements - \n");
        for(int i=0;i<capacity;i++){
            array[i]=sc.nextInt();
        }
        return array;

    }

    public static void reverse(int[] arr){

        int maxindex=(arr.length)-1;
        int halfway=(arr.length)/2;
        for(int i=0;i<halfway;i++){
            int temp=arr[i];
            arr[i]=arr[maxindex-i];
            arr[maxindex-i]=temp;
        }

    }

    public static void main(String[] args) {
        System.out.println("\nEnter the total number of elements in the array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr=getdata(n);
        System.out.println("\nInput Array - "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("\nReversed Array - "+Arrays.toString(arr));


    }
}
