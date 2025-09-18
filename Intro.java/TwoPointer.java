public class TwoPointer {
    public static int maxSum(int arr[], int k){
        int n = arr.length - 1;
        int l = 0;
        int r = k - 1;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
    for(int i = l; i <= r; i++){
        sum = sum + arr[i];
        maxSum = Math.max(sum, maxSum);
    }
    while ( r < n){
        sum = sum - arr[l];
        l++;
        r++;
        sum = sum + arr[r];
        maxSum = Math.max(sum, maxSum);
    }
    return maxSum;
    }
    public static void main (String args[]){
        int[] arr = new int[7];
        arr[0] = 6;
        arr[1] = 0;
        arr[2] = 78;
        arr[3] = 65;
        arr[4] = 76;
        arr[5] = 54;
        arr[6] = 23;

        int result = maxSum(arr, 3);
        System.out.println("The maximum sum is " +result);

    }
}
