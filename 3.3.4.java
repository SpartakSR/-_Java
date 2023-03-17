import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

			
		// генерируем строку, заданой длины
		 public static String getRandomString(int length){
		     String str="АБВГДЕЁЖЗИКЛМНОПРСТУФХЧШЩЦУФХЬЪЭЮЯ";
		     Random random=new Random();
		     StringBuffer sb=new StringBuffer();
		     for(int i=0;i<length;i++){
		       int number=random.nextInt(34);
		       sb.append(str.charAt(number));
		     }
		     return sb.toString();
		 }

		// генерируем пол М или Ж
			 public static String getRandomSex(){
			     String str="МЖ";
			     Random random=new Random();
			     StringBuffer sb=new StringBuffer();
			       int number=random.nextInt(2);
			       sb.append(str.charAt(number));
			     
			     return sb.toString();
			 }
		
	    public static void main(String[] args) throws InstantiationException, IllegalAccessException  {

	      //создаем список объектов        
	        List<Stud> listt = new ArrayList<Stud>();
	        Random random=new Random();
	        
	      System.out.println("СПИСОК СТУДЕНТОВ:");  
	      for(int i=0; i<100; i++) 
	    	  {
	    	      //добавляем объекты в список
	    	  listt.add(new Stud(getRandomString(random.nextInt(7)+3),random.nextInt(8)+17,getRandomSex()));
	    	      	  }
	        
	      for(Stud mc : listt) {
		        System.out.println("Item:" + mc);
		    }
	    
	    
	    int max = 0;
	    double max_sr = 0;

	    
	    for(int i=0;i<listt.size();i++){
	        //определяем максимальный возраст
	        if (max<listt.get(i).getAge())
	            max=listt.get(i).getAge();
	        max_sr +=listt.get(i).getAge();//суммируем возраст для определения среднего
	    }
	    
	    // определяем средний возраст
	    max_sr /= listt.size();
	   

	    System.out.println("\n////////////////////////////////////////////\nСамый старший = "+max);
	    System.out.println("Средний возраст = "+max_sr);
	    
	    List<Stud> listm = new ArrayList<Stud>();//список мальчиков
	    List<Stud> listw = new ArrayList<Stud>();//список девочек
	    for(int i=0;i<listt.size();i++){
	    	
	           if(listt.get(i).getGender().equals("М")){
	        	     listm.add(listt.get(i));
	            
	        }
	           else  listw.add(listt.get(i));
	    }
	    
	    System.out.println("\nСПИСОК МАЛЬЧИКОВ:");
	    for(Stud mc : listm) {
	        System.out.println("Item-m:" + mc);
	    }
	    
	    int maxm = 0;
	    double max_srm = 0;

	    
	    for(int i=0;i<listm.size();i++){
	        //определяем максимальный возраст мальчиков
	        if (maxm<listm.get(i).getAge())
	            maxm=listm.get(i).getAge();
	        max_srm +=listm.get(i).getAge();//суммируем возраст для определения среднего
	    }
	    
	    // определяем средний возраст мальчиков
	    max_srm /= listm.size();
	    
	    System.out.println("\n////////////////////////////////////////////\nСамый старший мальчик = "+maxm);
	    System.out.println("Средний возраст мальчиков = "+max_srm);
	    
	    System.out.println("\nСПИСОК ДЕВОЧЕК:");
	    for(Stud mc : listw) {
	        System.out.println("Item-w:" + mc);
	    }
	    
	    int maxw = 0;
	    double max_srw = 0;

	    
	    for(int i=0;i<listw.size();i++){
	        //определяем максимальный возраст девочек
	        if (maxw<listw.get(i).getAge())
	            maxw=listw.get(i).getAge();
	        max_srw +=listw.get(i).getAge();//суммируем возраст для определения среднего
	    }
	    
	    // определяем средний возраст девочек
	    max_srw /= listw.size();
	    
	    System.out.println("\n////////////////////////////////////////////\nСамая старшая девочка = "+maxw);
	    System.out.println("Средний возраст девочек = "+max_srw);

	}

}
