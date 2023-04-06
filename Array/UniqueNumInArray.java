// Q. Find Unique Number in Array Where all the elements Are being Repeated Twice.

import java.util.Scanner;

public class UniqueNumInArray {
    static void findUnique(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
                
            }
            
        }

        int ans = -1;

        for(int a:arr){
            if(a!=-1)
             ans = a;
        }
        System.out.println("\nThe Unique Element is : "+ans);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i <n; i++) {
            arr[i] = scan.nextInt();
            
        }

        System.out.println("Elements of Array .......");
        for (int i : arr) {
            System.out.print(i+", ");
            
        }

        findUnique(arr, n);

        scan.close();
    }

    
}
