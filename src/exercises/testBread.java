package exercises;

public class testBread {
    private final static String motto= "the staff of life";
    private String breadType;
    private int calories;



    public testBread(String type, int cal){
    breadType = type;
    calories = cal;

    }
    public testBread(String type){
       this(type,500);

    }

   public void display()
   {
       System.out.println("the bread is "+breadType+" and it has "+calories+" calories per slice. our motto is "+motto);
   }
}
