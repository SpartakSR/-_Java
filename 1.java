import java.util.Scanner;
 
public class Main {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = in.nextLine();
        System.out.printf("Здравтсвуйте, %s! \n", name);
        System.out.printf("%s, введите ваш возраст:", name);
        int age = in.nextInt();
        System.out.printf("ФИО: %s.  Возраст: %d лет. \n", name, age);
        in.close();
    }
}
