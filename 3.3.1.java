import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 

public class Main  {
    public static void main(String[] args) {
     ArrayList <Integer> arr2 = new ArrayList <Integer> ();
     if(arr2.isEmpty() == true || arr2.size() == 0){
                System.out.println("null" );}
     Collections.addAll(arr2,3, 5, 95, 4, 15, 34, 3, 6, 5);
     System.out.println("Максимальное значение = " + Collections.max(arr2));
     if(arr2.isEmpty() == false || arr2.size() != 0){
                System.out.println("no null" );}
}
}
