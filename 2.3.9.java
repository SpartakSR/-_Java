import java.util.Scanner;
public class Main {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Введите трехзначное число: ");
      int x,x1,x2,x3, count = 0;
      x = sc.nextInt();
      x1 = x/100;
      x2 = (x%100)/10;
      x3 = x%10;
      if (x1==x2)
      count = count+2;
      if (x1==x3 && x1==x2)
      count = count++;
      if (x1==x3 && x1!=x2)
      count = count+2;
      if (x2==x3 && x1==x2 && x1==x3)
      count++;
      if (x2==x3 && x1!=x2 && x1!=x3)
      count = count+2;
     System.out.println(count);
	}
}
