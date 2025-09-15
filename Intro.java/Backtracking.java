public class Backtracking {
    public static void firstProgram(int arr[], int val, int i){ 
        if(i == arr.length){
            return;
        }
        arr[i] = val;
        firstProgram(arr, val+1, i+1);
        arr[i] = arr[i] -2;
    }
    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[10];
        firstProgram(arr , 20, 0 );
        printArr(arr);
    }
    
}
