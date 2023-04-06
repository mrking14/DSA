// Q. Given an Array of integer 'a' move all the even intergers at the begining of the arry follwed by all Odd integers . the Relative order of odd or even integer does not matter. Return any Array that satisfies that condition.

import java.util.Scanner;

public class SortEvenOdd {

    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void swapArray(int[]arr, int left, int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
    }

    static void sortArrayParity(int[] arr, int n){
        int left =0;
        int right = n-1;
        while(left<right){
            if (arr[left]%2==1 && arr[right]%2==0) {
                swapArray(arr, left, right);
                left++;
                right--;
                
            }

            if(arr[left]%2==0){
                left++;
            }

            if(arr[right]%2==1){
                right--;
            }
        }

        System.out.println("Sorted Array ........");

        printArray(arr);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        int n = scan.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter the Elements of Array ");
        for(int i=0; i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Elements of Array .......");
        printArray(arr);

        
        sortArrayParity(arr, n);


        scan.close();
    }
    
}
