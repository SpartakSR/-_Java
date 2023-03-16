public class Main {
  public static void main(String[] args) {
    int[] list = new int [10];
      for (int i = 0; i < list.length; i++){
      list[i] = ((1 + (int)(Math.random() * 49)) * 2) + 1;
      System.out.print(list[i] + " ");
}
}
}
