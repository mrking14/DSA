 //  Q.  Find the total number of pairs in the Array whose sum is equal to the given value X;


import java.util.Scanner;

public class PairSum {

    static void printArray(int[] arr){

        System.out.println("Elements of Array .....");
        for (int element : arr) {
            System.out.print(element+", ");
            
        }

    }
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of Array....");
        for (int i = 0; i < n; i++) {
            arr[i ]=scan.nextInt();    
        }
        
        printArray(arr);

        System.out.println("/n Enter the target : ");
        int target = scan.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==target) {
                    ans++;
                }
                
            }
            
        }

        System.out.println("no. of pairs are : "+ans);

        scan.close();
    }

    
}
