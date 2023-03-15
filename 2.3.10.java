import java.util.Scanner;
public class Main {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Введите число: ");
      int x = sc.nextInt();
      if (x<0)
      System.out.println(-x);
      else
      System.out.println(0);
	}
}
