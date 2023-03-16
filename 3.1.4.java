public class Main {
  public static void main(String[] args) {
    int[] list = { 4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17 };
    int max = list[0];
    for (int i = 1; i < list.length; i++) {
    if (list[i] > max) 
    max = list[i];}
    System.out.print("\nМаксимальное значение = " + max);
}
}
