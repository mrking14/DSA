// Q. Count the number of triple whose sum is equal to the given target.

import java.util.Scanner;
public class TripleSum {


    static void printArray(int[] arr){

        System.out.println("Elements of Array .....");
        for (int element : arr) {
            System.out.print(element+", ");
            
        }

    }

    static void findTripleSum(int [] arr, int n, int target){
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == target) {
                        ans++;   
                    } 
                    
                }
                
            }
            
        }
        if (ans>0) {
            System.out.println("The number of Triplets in Array is : "+ans );
            
        } else {
            System.out.println(" There is no Triplets.");
            
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of element in Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Element of array at index "+i +": ");
            arr[i]=scan.nextInt();
            
        }
        printArray(arr);

        System.out.println("Enter the Target for finding Triplets: ");
        int target = scan.nextInt();

        findTripleSum(arr, n, target);



        scan.close();
    }
    
}
