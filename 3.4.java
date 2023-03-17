import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        ArrayList<Double> arr1 = new ArrayList<Double>(5);
        System.out.println("Введите 5 чисел");
        arr1.add(sc.nextDouble());
        arr1.add(sc.nextDouble());
        arr1.add(sc.nextDouble());
        arr1.add(sc.nextDouble());
        arr1.add(sc.nextDouble());
        System.out.print("Список - " + arr1);
        
    Double sum = 0.0;
     for(int i=0;i<arr1.size();i++){
         sum += arr1.get(i);}
     System.out.println("\nСумма значений = " + sum);
     
    Collections.sort(arr1);
     System.out.println("По возрастанию = " + arr1);
     
    Collections.sort(arr1, Collections.reverseOrder());
     System.out.println("По убыванию = " + arr1);
     
     System.out.println("Максимальное значение = " + Collections.max(arr1));
    }
}

