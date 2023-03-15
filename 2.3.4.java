import java.util.Scanner;
public class Main {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Введите числа: ");
      int a,b,c,d;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = b*b-4*a*c;
      if (d>0)
      System.out.println("Два корня ");
      if (d==0)
      System.out.println("Один корень ");
      if (d<0)
      System.out.println("Корней нет ");
	}
}

