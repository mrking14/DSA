import java.util.Scanner;

// Q. Rotate the given Array "a" by k steps where k is non-negative.

public class RotateArrBySteps {

    static int[] rotateArraySteps(int[] arr, int k, int n){
        k=k%n;
        int []ans = new int[n];
        int j=0;

        for (int i = n-k; i <n; i++) {
            ans[j++]=arr[i];
            
        }

        for (int i = 0; i <n-k; i++) {
            ans[j++]=arr[i];
            
        }


        return ans;
    }


    static void printArray(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Size of Array:  ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in Array...");
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();    
        }

        printArray(arr);

        System.out.println("Enter steps less then size of Array... ");
        System.out.println("Enter the step for Rotating: ");

        int k = scan.nextInt();

        int[] ans =rotateArraySteps(arr,k,n);
        printArray(ans);


        scan.close();


        
    }
}
