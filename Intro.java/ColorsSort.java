import java.util.ArrayList;
import java.util.Arrays;
public class ColorsSort {
    public static void sortColors( ArrayList<Integer> arr, int n ){
        int low = 0; 
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1){
                mid++ ;
            }else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
            
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,2,1,2,0,0,2,1,1,0,2,3));
        int n = arr.size();
        sortColors(arr, n);
        System.out.println("After sorting: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    
}
