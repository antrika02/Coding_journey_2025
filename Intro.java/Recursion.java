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
    public static void main(String args[]){
       nToOne(1,50);
    }
}

