// public class DivNdConq {
//     public static void mergerSort(int arr[], int si, int ei){
//         int temp[] = new int [ei - si + 1];
//         int  mid = si + (ei - si)/2;
//         int i = si;
//         int j = mid + 1;
//         int k = 0;
//         while ( i <= mid && j <= ei ){
//             if (arr[i] < arr[j] ){
//                 temp[k] = arr[i];
//                 i++;
//                 k++;
//             }else{
//                 temp[k] = arr[j];
//                 j++ ;
//             }
//             k++;
//         }
//         while (i<=mid){
//             temp[k+1] = arr[ i+1];
//         }
//         while (j<= ei){
//             temp [k++] = arr[j++];
//         }
//         for(k=0, i=si; k < temp.length; k++, i++){
//             arr[i] = temp[k];
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {6,3,9,5,2,8};
//         mergeSort ( arr, 0, arr.length-1);
//         printArr(arr);
//     }
    
// }

public class DivNdConq {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) return; // Base condition

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        int temp[] = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // public static void printArr(int arr[]) {
    //     for (int val : arr) {
    //         System.out.print(val + " ");
    //     }
    //     System.out.println();
    // }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

//Quick Sort Code 



    public static void printArr(int arr[]){
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
        int pIdx = partition( arr, si, ei);
        quickSort(arr, si, pIdx -1);
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1;
        for(int j = si; j< ei; j++){
            if (arr[j] <=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}

