import java.util.Scanner;

// Q. Swap an Element 
public class Swapping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr={25,20,54,15,10,12,65};
        int n=arr.length;

        System.out.println("Elemnts of Array.....");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");   
        }
        System.out.println();

        System.out.println("Enter first index: ");
        int a=scan.nextInt();

        System.out.println("Enter Second index: ");
        int b=scan.nextInt();

        swapElement(arr, a, b);

        System.out.println("Elemnts of Array after Swapping .....");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");   
        }

        scan.close();
    }

    // Swapping Element of index (a) with index (b).
    static void swapElement(int[]arr , int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
 
    }

    
}
