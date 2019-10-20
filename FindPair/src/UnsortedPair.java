/***********************************************************************************************************
 * Purpose/Description: Count the pairs in an unsorted array whose sum is less than X
 ***********************************************************************************************************/

import java.util.Scanner;

public class UnsortedPair {

    static int findPairs(int arr[], int x, int n){
        int pairs = 0;
        int low = 0;
        int high = n -1;

        while(low < high){
            //

            return pairs;
        }

        return pairs;
    }

    public static void main(String[] args){
        int arr[] = {2, 5, 7, 9, 10, 1, 3, 4};
        int arrayLength = arr.length;
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter number");
        int numberX = Integer.parseInt(input.nextLine());

        findPairs(arr, numberX, arrayLength);

    }
}
