public class Main {
 
	public static void main(String[] args) {
 int [] mas1 = new int[100];
 
        for (int i = 0; i < mas1.length; i++) {
             mas1[i] = (int)(Math.random()*21 - 10);
            }
        
        int [] mas2 = new int[10];
        for (int i = 0; i < mas2.length; i++) {
             if(mas1[i] != 0){
                mas2[i] = mas1[i];
            }
        System.out.print(mas2[i] + " ");
    

	}
}
}
