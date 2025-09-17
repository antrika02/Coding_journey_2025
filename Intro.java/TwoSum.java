import java.util.ArrayList;

public class TwoSum {
    // public static boolean two(ArrayList<Integer> a, int target){
    //     for (int i =0; i< a.size(); i++){
    //         for (int j = i+1; j<a.size(); j++){
    //             if (a.get(i)+ a.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean twoPointerApproach(ArrayList<Integer> a, int target){
        int lp =0;
        int rp = a.size() - 1;
        while ( lp < rp){
            if (a.get(lp) + a.get(rp) ==0){
                return true;
            }
            if(a.get(lp) + a.get(rp) < target){
                lp++;

            }
            else{
                rp-- ;
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
        System.out.println(twoPointerApproach(a, 9)) ;
    }
    
}
