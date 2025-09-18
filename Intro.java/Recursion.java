public class Recursion {
    public static void namePrinting(int i,int n){
        if (i>n){
            return;
        }
        else{
            System.out.println("Neha");
            namePrinting(i+1,n);
        }
    }

    public static void counting(int i,int n){
        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            counting(i+1,n);
        }
    }

    public static void backwardCounting(int n,int i){
        if(n<i){
            return;
        }
        else{
            System.out.println(n);
            backwardCounting(n-1,i);
        }
    }
    public static void backtrackingCounting(int n, int i){
        if(n<i){
            return;
        }
        else{
            backtrackingCounting(n-1,i);
            System.out.println(n);
        }
    }
    public static void nToOne(int i, int n){
        if (n<i){
            return;
        }
        else{
            nToOne(i+1,n);
            System.out.println(i);
        }
    }
    public static int factorial(int i){
        int f;
        int sec;
        if(i==0){
            return 1;
        }
        else{
            sec = factorial(i-1);
             return f = i * sec;

            //  return i * factorial(i - 1);

        }
    }
    // public static int sumN(int i, int n){
    //     int sum =0;
    //     int add;
    //     if(i>n){
    //         return 0 ;
    //     }
    //     else{
    //         add = sumN(i+1,n);
    //         return (sum + add);
            
    //     }
    // }
    // public static void main(String args[]){
    //    int result = sumN(1,10); 
    //     System.out.println("Sum of first n numbers is: " + result); 
    // }
    public static int sumN(int i, int n) {
        if (i > n) {
            return 0; // base case
        } else {
            return i + sumN(i + 1, n); // recursive case
        }
    }
    public static int fibonacciNumber(int n){
        if (n==0 || n==1){
            return n;
        }
        int nm1 = fibonacciNumber(n-1);
        int nm2 = fibonacciNumber(n-2);
        return nm1+nm2;
    }
    public static boolean sortedArray(int arr[] , int i){
        if (i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedArray(arr, i+1);
        
    }



//     public static boolean sortedArray(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true;
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false;
//         }
//         return sortedArray(arr, i + 1);
//     }

//     public static void main(String args[]) {
//         int arr[] = {3, 6, 7, 9, 10, 14};
//         System.out.println(sortedArray(arr, 0));
//     }
// }
public static int firstOccurence(int arr[], int key, int i){
    if (i == arr.length-1){
        return -1;
    }
    if (arr[i] == key){
        return i;
    }
    return firstOccurence(arr, key, i+1);
    
}
public static int lastOccurence(int arr[], int key, int i){
    if(i == 0){
        return -1;
    }
    if (arr[i]==key){
        return i;
    }
     i = arr.length - 1;
     return lastOccurence(arr, key, i-1);
}
public static int square(int x, int n){
    if (n == 0){
        return 1;
    }
    int nm1 = square(x, n-1);
    int nm2;
    return nm2 = x * nm1;

}

public static int tilingProblem(int n){
    if (n == 0 || n==1){
        return n;
    }
    int verticalTiles = tilingProblem(n-1);
    int horizontalTiles =   tilingProblem(n-2);

    int totWays = verticalTiles + horizontalTiles;
    return totWays;
}
// public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//     if(idx == str.length());
//     {
//         System.out.println(newStr);
//         return;
//     }
//     char currchar = str.charAt(idx);
//     if (map[currchar - 'a']== true){
//         removeDuplicates(str, idx+1, newStr.append(currchar),map);
//     }
// }
 public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == false) { // If character not yet encountered
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        } else {
            removeDuplicates(str, idx + 1, newStr, map); // Skip duplicate
        }
    }
    public static void main(String args[]) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

   
    // public static void main(String args[]) {
    //    String str = "appnnacollege";
    //    removeDuplicates(str, 0, new StringBuilder(" "), new boolean [26]);
    // }
}

// public static void main (String args[]){
//     int a = 37;
//     int b = 84;
//     int c = 90;
//     int d = 75;
}



