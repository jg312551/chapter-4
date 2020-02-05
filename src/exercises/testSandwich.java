package exercises;

public class testSandwich {
    private String filling;
    private String breadType;
    private int totalCal;


    public testSandwich(String fill,String type,int cal){
        filling = fill;
        breadType = type;
        totalCal=cal;

    }
    public testSandwich(String fill,String type){
        this(fill,type,1);

    }
    public testSandwich(String fill){
       this(fill,"garlic",1100);

    }
    public void display(){
        System.out.println("the sandwich ordered has "+filling+" filling with "+breadType+
                " bread and "+totalCal+" total calories");
    }

}
