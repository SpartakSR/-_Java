public class Main {
    
    public static void main(String [] args) {
    int [] Mylist = { 4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17 };
    
    System.out.print("По возрастанию: ");
    sortArr(Mylist);
    for (int i = 0; i < Mylist.length; i++)
    System.out.print(Mylist[i] + " ");
    
    System.out.print("\nПо убыванию: ");
    sortReserv(Mylist);
    for (int i = 0; i < Mylist.length; i++)
    System.out.print(Mylist[i] + " ");
    
    System.out.print("\nМаксимальное значение = " + getMax(Mylist));
    
    System.out.print("\nМинимальное значение = " + getMin(Mylist));
    
    
  }  
  
  public static int getMax(int [] list) {
    int maxValue = list[0];
    for (int i = 1; i < list.length; i++) {
    if (list[i] > maxValue) 
    maxValue = list[i];}
    return maxValue;
    }
    
  public static int getMin(int [] list) {
    int minValue = list[0];
    for (int i = 1; i < list.length; i++) {
    if (list[i] < minValue) 
    minValue = list[i];}
    return minValue;
    }
       //   Сортирует массив методом выбора
  public static void sortArr(int [] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Найти наименьшее значение в list[i..list.length-1]
      int currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Переставить list[i] и list[currentMinIndex], если необходимо
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
      //Сортирует массив методом выбора
  public static void sortReserv(int [] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Найти наименьшее значение в list[i..list.length-1]
      int currentMax = list[i];
      int currentMaxIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }

      // Переставить list[i] и list[currentMinIndex], если необходимо
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
    
    
}
