import java.util.Scanner;

public class RotateArrStepInplace {

    static void swapArr(int[]arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    static void reverseArr(int[]arr, int start, int end){
        while(start<end){
            swapArr(arr, start,end);
            start++ ;
             end--;
        }
    }

    static void rotateInPlace(int[] arr, int n,int k){
        k=k%n;
        reverseArr(arr, 0, n-k-1);
        reverseArr(arr, n-k, n-1);
        reverseArr(arr, 0, n-1);
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

        System.out.println("Elements of Array........");
        printArray(arr);

        System.out.println("Enter the steps for rotation: ");
        int k = scan.nextInt();

        rotateInPlace(arr,n,k);
        System.out.println("Elements of Array after Rotation...");
        printArray(arr);




        scan.close();


        
    }
}
