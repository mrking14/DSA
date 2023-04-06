// Q. Reverse an Array.

public class ReverseArray {

    static int[] reverseArray(int[]array){  
        int n=array.length;
        int[] ans = new int[n];
        int j=0;
        for (int i = n-1; i >=0; i--) {
            ans[j++]=array[i];   
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] array ={25,20,87,48,29,12,45};

        System.out.println("Elements of Array .......");
        printArray(array);

        int[] ans = reverseArray(array);
        
        System.out.println("Elements of Reversed Array... ");
        printArray(ans);


    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
