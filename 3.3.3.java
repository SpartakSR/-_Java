import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 

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
     int sum = 0;
     for(int i=0;i<arr1.size();i++){
         sum += arr1.get(i);}
     System.out.println("Сумма значений = " + sum);
}
}
