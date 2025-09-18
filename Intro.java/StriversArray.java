
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



// public static int linearSearch(int arr[], int key){
//         for (int i = 0; i < arr.length; i++){
//             if(arr[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     } 






public static int missing(int arr[]){
    int sum = 0;
    int n = arr.length + 1;
    int expected = n*(n+1)/2;
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    int miss = expected - sum;
    return miss;
}

    public static void main(String args[]){
        int[] arr = new int[9];
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
       
        arr[5] = 6;
        arr[6] = 8;
        arr[7] = 9;
        arr[8] = 10;

        // boolean result = sorted(arr);
         int result =missing(arr);

        //  for (int i = 0; i < arr.length; i++){
            System.out.print("The missing element is " +result); 
    }
}   
        

    
