
import java.util.*;
public class StriversArray {
    // public static int firstQues(int arr[]){
    //     int max =Integer.MIN_VALUE;
    //     for (int i =0; i< arr.length; i++){
    //         int largest = Math.max(arr[i], max);
    //         max = largest;
    //     }
        
    //      return max;
    // }
    // public static int secondlargest(int arr[]){
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     int largest = arr[n-1];
    //     int second_largest= Integer.MIN_VALUE;
    //     for (int i = n-2; i >= 0; i--){
    //         second_largest = arr[n-2];
    //         if (arr[i] < largest){
    //             second_largest = arr[i];
    //             break;
    //         }

    //     }
    //     return second_largest;
    // }

    // public static boolean sorted(int arr[]){
    //     for (int i = 0; i< arr.length; i++){
    //         if (arr[i] < arr[i+1]){
    //             return true;
    //         }

    //     }
    //     return false;
    // }

    // public static int removeDuplicates(int arr[]){
    //     if(arr.length == 0){
    //         return 0;
    //     }
    //     int k = 1;
    //     for(int i = 1; i<arr.length; i++){
    //         if(arr[i] == arr[i-1]){
    //             arr[k] = arr[i];
    //             k++;
    //         }
           
    //     }
    //     System.out.print(arr[k] + " ");
    //     return k;
    // }






// public static void movesZeroToEnd(int arr[]){
//     int pos = 0;
//     for (int i =0; i < arr.length; i++){
//         if ( arr[i] != 0){
//             arr[pos] = arr[i];
//             pos++;
//         }
//     }
//     for (int i = pos; i < arr.length; i++){
//         arr[i] = 0;
//     }
// }



public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        int[] arr = new int[10];
        
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 0;
        arr[3] = 25;
        arr[4] = 0;
        arr[5] = 95;
        arr[6] = 0;
        arr[7] = 19;
        arr[8] = 40;
        arr[9] = 98;

        // boolean result = sorted(arr);
         int result = linearSearch(arr,25);

        //  for (int i = 0; i < arr.length; i++){
            System.out.print("The target is at index " +result); 
    }
}   
        

    
