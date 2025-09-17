
import java.util.ArrayList;

public class ArrayListTutorial {
    public static void main (String args[]){
     ArrayList <Integer> myList = new ArrayList<> ();
    myList.add(10);
    myList.add(20);
    myList.add(30);
    myList.add(40);
    myList.add(50);
    myList.add(60);
    myList.add(70);
    System.out.println(myList);
    System.out.println(myList.get(3));
    System.out.println(myList.remove(4));
    System.out.println(myList.set(1,80));
    System.out.println(myList.contains(50));
    System.out.println(myList.size());
   }

}
    

