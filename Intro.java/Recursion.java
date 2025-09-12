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

    public static void main(String args[]) {
        int result = sumN(1, 10);
        System.out.println("Sum of first 10 numbers is: " + result);
    }
}



