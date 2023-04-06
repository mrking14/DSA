// Q. Find the Second largest element in array .

import java.util.Scanner;

public class SecondLargestElement {

    // printing Array 
    static void printArray(int[] arr, int n){
        System.out.print("Elements Of Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println();

    }


    // Finding the largest Element in Array
    static int findMax(int[] arr, int n){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    } 


    // Finding Second largest Element in Array.
    static int findSecondMax(int[] arr , int n){
        int max = findMax(arr,n);
        for (int i = 0; i < n; i++) {
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
            
        }

        int secondMax= findMax(arr, n);

        return secondMax;


    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements of Array: ");

        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();    
        }

        printArray(arr,n);

         int secondMax= findSecondMax(arr, n);

        System.out.println("Second Largest Elements in Array : "+secondMax);

        scan.close();

        
    }
    
}
