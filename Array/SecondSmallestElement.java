// Q. Find the Second Smallest Elements in Araay.

import java.util.Scanner;

public class SecondSmallestElement {


   // Printing Array Elements.
   static void printArray(int[] arr, int n) {
    System.out.println("Elements of Array: ");
    for (int i : arr) 
        System.out.print(i+" ");

    System.out.println();
    }
        

    // Findind second smallest Element in This Array .
    static int secondSmallest(int[]arr , int n) {

         int ans= smallestElement(arr,n);
         for (int i = 0; i < n; i++) {
            if (arr[i]==ans) {
                arr[i]=Integer.MAX_VALUE;
                
            }
            
         }
         ans=smallestElement(arr,n);
         return ans;
    }
    
    // Finding Smallest Element in Array. 
    static int smallestElement(int[] arr, int n) {
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
            
        }
        return ans;
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

    printArray(arr, n);

    int ans=secondSmallest(arr, n);
    System.out.println(" Second Smallest Element in Array is : "+ans);



    
    scan.close();
    }
    
}
