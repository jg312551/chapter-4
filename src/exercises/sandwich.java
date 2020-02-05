package exercises;

public class sandwich {
    public static void main(String[] args){
        testSandwich first = new testSandwich("lettus","rye",600);
        testSandwich second = new testSandwich("nothing","wheat");
        testSandwich third = new testSandwich("turkey");

        first.display();
        second.display();
        third.display();
    }


}
