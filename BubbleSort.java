
import java.util.Scanner;

public class BubbleSort {

    private static Scanner sc= new Scanner(System.in);

    public static int[] getelements(int capacity){

        int[] array = new int[capacity];
        System.out.println("\nEnter "+capacity+" elements - \n");
        for(int i=0;i<capacity;i++){
            array[i]=sc.nextInt();
        }
        return array;

    }

    public static int[] sortelements(int[] array,int n){
        int[] sortedarr = new int[n];
        for(int i=0;i<n;i++)
            sortedarr[i]=array[i];
        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<n-1;i++){
                if(sortedarr[i]<sortedarr[i+1]){
                    temp=sortedarr[i];
                    sortedarr[i]=sortedarr[i+1];
                    sortedarr[i+1]=temp;
                    flag=true;
            }
            }
        }
        return sortedarr;
    }

    public static void printarray(int[] arr){

        System.out.println("\n");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\n");
    }

    public static void main(String[] args) {

        System.out.println("\nEnter the total number of elements in the array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr=getelements(n);
        System.out.println("\nInput Array - \n");
        printarray(arr);
        int[] sortedarr=sortelements(arr,n);
        System.out.println("\nSorted Array - \n");
        printarray(sortedarr);

    }

}