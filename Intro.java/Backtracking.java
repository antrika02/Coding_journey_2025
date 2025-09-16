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
    // public static void main(String args[]){
    //     int arr[] = new int[10];
    //     firstProgram(arr , 20, 0 );
    //     printArr(arr);
    // }


    public static void findSubsets(String str, String ans, int i){
        if(i == string.lenght()){
            System.out.println(ans);
            return;
        }
        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
    }
    // public static void main(String args[]){
    //     String str = new String[5];
    //     findSubstring(str, a, 0);
    // }


    public static void permutation(String str, String ans){
        if(i == str.length()){
            System.out.println(and);
            return;
        }
        for(a = 0, a <= str.lenght() ; a++){
            char curr = str.charAt(i);
            String newString = subString(0,i) + str.String(i+"1");
            find 
        }
    }


    
}
