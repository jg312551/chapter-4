package exercises;

public class testSandwichFilling {
    private String filling;
    private int calories;

    public testSandwichFilling(String fill,int cal){
        filling= fill;
        calories=cal;
    }
    public testSandwichFilling(String fill){
       this(fill,69);
    }
    public testSandwichFilling(){
       this("nothing",900);
    }
    public  void display(){
        System.out.println("the fillings are "+filling +" and the calories are "+ calories+".");
    }
}
