import java.util.Scanner;

// Q. Sort an Array consisting of only 0s and 1s.
public class SortArray0s1s {
    static void printArray(int[]arr){
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void sortZeros(int[] arr,int n){
        int left=0;
        int right=n-1;

        while (left<right) {
            if(arr[left]==1 && arr[right]==0){
                swapArray(arr, right,left);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

        System.out.println("Sorte Zeros Array ........");

        printArray(arr);
        
    }
     static void swapArray(int[] arr, int right, int left) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter the siza of Array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements of Array:");
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Elements of Array ........");
        printArray(arr);

        System.out.println("Sorting Zeros..........");

        sortZeros(arr,n);

        scan.close();
        
    }
}
