import java.util.ArrayList;

public class TwoSum2 {
    public static boolean twoPointer(ArrayList<Integer> a, int target){
        int bp = -1;
        int n = a.size();
        for (int i =0; i< a.size(); i++){
            if (a.get(i)> a.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;  
        int rp = bp;

        while (lp != rp ){
            if (a.get(lp) + a.get(rp) == target){
                return true;
            }
            if(a.get(lp) + a.get(rp) < target){
              lp = (lp+1)% n;
            }
            else{
                rp = (n+rp-1)%n;
            }

        }
        return false;
    }
    public static void main(String args[]){
        ArrayList <Integer> a = new ArrayList<>();
        a.add(1);
        a.add(8);
        a.add(6);
        a.add(2);
        System.out.println(a);
        System.out.println(twoPointer(a, 9)) ; 
    }
    
}
