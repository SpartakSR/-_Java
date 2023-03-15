import java.util.Scanner;
public class Main {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Введите число: ");
      int x;
      x = sc.nextInt();
      for (int i = 1; i <= 10; i++) {
          x++;
  System.out.print(x + " ");
	}
}
}
