import java.util.Scanner;

// Q. Reverse an Array without creating anothier Array.

public class ReverseArrayInPlace {

    static void printArray(int[] arr){
        for(int i:arr)
         System.out.print(i+ "  " );

        System.out.println();
    }

    static void reverseInPlace(int[] arr, int n){
        int i=0,j=n-1;
        while(i<j){
            swapArray(arr , i , j);
            i++;
            j--;

        }


    }


    static void  swapArray(int []arr , int i , int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter th Elements on Array: ");

        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
            
        }

        System.out.println("Elemnts of Array..... ");
        printArray(arr);

        System.out.println("Elements of Reversed Array: .....");

        reverseInPlace(arr,n);
        printArray(arr);



        scan.close();
        
    }
}
