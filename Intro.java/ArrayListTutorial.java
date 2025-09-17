// import java.util.Collections;
import java.util.ArrayList;

public class ArrayListTutorial {
    // public static void swap(ArrayList<Integer> myList, int indx1, int indx2){
    //      int temp = myList.get(indx1);
    //      myList.set(indx1, myList.get(indx2));
    //      myList.set(indx2, temp);
    // }
//     public static void main (String args[]){
//     ArrayList <Integer> myList = new ArrayList<> ();
//     myList.add(90);
//     myList.add(20);
//     myList.add(70);
//     myList.add(40);
//     myList.add(100);
//     myList.add(60);
//     myList.add(20);
//     System.out.println(myList);
//     // System.out.println(myList.get(3));
//     // System.out.println(myList.remove(4));
//     // System.out.println(myList.set(1,80));
//     // System.out.println(myList.contains(50));
//     // System.out.println(myList.size());
//     // for (int i = myList.size() - 1; i>=0; i--){
//     //     System.out.print(myList.get(i) + " ");
//     // }
//     //   swap(myList, 3,4);
//     //   System.out.println(myList);
//     // int max = Integer.MIN_VALUE;
//     // for (int i =0; i< myList.size(); i++){
//     //     if (myList.get(i)>max){
//     //         max = myList.get(i);
//     //     }
//     // }
//     Collections.sort(myList);
//     System.out.println(myList);
//     //  System.out.println("maximum element of the arraylist is " +max);
//    }

// public static void main(String args[]){
//     ArrayList<ArrayList<Integer>> mainList = new ArrayList<> ();
//     ArrayList<ArrayList<Integer>> list1 = new ArrayList<> ();
//     ArrayList<ArrayList<Integer>> list2 = new ArrayList<> ();
//     for (int i =1; i<=5; i++){
//         list1.add(i*i);
//         list2.add(i*2);
//         list3.add(i*3);
//     } 
// }


public static void main(String args[]) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    
    for (int i = 1; i <= 5; i++) {
        list1.add(i * i);
        list2.add(i * 2);
        list3.add(i * 3);
    }

    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
}

}
    

