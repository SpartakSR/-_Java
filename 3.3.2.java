import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
        System.out.println("Введите 5 чисел");
        arr1.add(sc.nextInt());
        arr1.add(sc.nextInt());
        arr1.add(sc.nextInt());
        arr1.add(sc.nextInt());
        arr1.add(sc.nextInt());
        Collections.sort(arr1);
        System.out.print(arr1);
}
}
