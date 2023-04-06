// Q. Given an Array 'a' consisting of integer. Return the first value that is repeating in this Array . if no value is being repeated , return -1;

import java.util.Scanner;

public class FirstRepeatingNumber {

    // Printing Array Elements.
    static void printArray(int[] arr, int n) {
        System.out.println("Elements of Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // Finding Repeating element in array.
    static int repeatingArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
                
            }
            
        }

        return -1;
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

        

       int ans = repeatingArray(arr,n);
       if (ans>0) {
        System.out.println("The repeating Element in Array: "+ans);
        
       } else {
        System.out.println("There is not Repeating Element: "+ans);
        
       }

        
        scan.close();
    }

}
