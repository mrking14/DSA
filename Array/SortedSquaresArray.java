// Q. Given an integer array 'a' sorted in non-decresing order. return a array of the squares of each number sorted inn non-decresing order.
// (Given Array could have negative numbers )

import java.util.Scanner;

public class SortedSquaresArray {

    static void swapArray(int[] ans, int i, int j){
        int temp = ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }


    static void reverseArray(int[] ans , int n){
        int i =0;
        int j=n-1;
        while (i<j) {
            swapArray(ans,i,j);
            i++;
            j--;

            
        }
    }

    static int[] sortSquare(int[] arr, int n){
        int left=0;
        int right=n-1;
        int[] ans = new int[n];
        int k=0;

        while (left <=right ) {
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=ans[right]*ans[right];
                right--;
            }
            
        }

        reverseArray(ans,n);

        return ans;
    }

    
    static void printArray(int[] arr) {
        System.out.println("Elements of Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the Size of Array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in Array: "); 
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();     //Initialing Elemnts in Array.
        }

        printArray(arr);


        int[] ans = sortSquare(arr,n);

        
        printArray(ans);



        scan.close();
    }
}
