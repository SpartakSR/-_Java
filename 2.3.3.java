import java.util.Scanner;
public class Main {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Введите двухзначное число: ");
      int x,x1,x2,y1,y2;
      x = sc.nextInt();
      x1 = x/10;
      x2 = x%10;
      y1 = x1+x2;
      y2 = x1*x2;
      if (y1>y2)
      System.out.println("Сумма ");
      if (y1<y2)
      System.out.println("Произведение ");
      if (y1==y2)
      System.out.println("Равно ");
	}
}
