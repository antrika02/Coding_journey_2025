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

    public static int longestSubarraySum(int arr[] , int k){
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        while (r < arr.length){
            sum += arr[r];
        while ( sum > k && l <= r){
            sum -= arr[l];
            l++;
        }
        if ( sum == k){
            maxLen = Math.max(maxLen, r-l+1);
        }
        r++;
        }
   return maxLen;
    }


    public static int maximumCards(int cardPoints[], int k){
           
       int n = cardPoints.length;
        int currentSum = 0;
        

        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }

        int maxSum = currentSum;
        

        for (int i = 1; i <= k; i++) {
            currentSum = currentSum - cardPoints[k - i] + cardPoints[n - i];
            maxSum = Math.max(maxSum, currentSum);
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

        int result = maximumCards(arr, 195);
        System.out.println("The maximum sum is " +result);

    }
}
