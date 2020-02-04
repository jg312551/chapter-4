package exercises;

public class testBread {
    public final static String motto= "the staff of life";
    private String breadType;
    private int calories;



    public testBread(String type, int cal){
    breadType = type;
    calories = cal;

    }
    public testBread(String type){
       this(type,5000);

    }

   public void display()
   {
       System.out.println("the bread is "+breadType+" and it has "+calories+" per slice. our motto is "+motto);
   }
}
