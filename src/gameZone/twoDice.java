package gameZone;

public class twoDice {
   private int die;


    public twoDice(int di) {
        die=di;
    }

    public twoDice() {
        die=((int)(Math.random() *100)%6 + 1);
    }


    public  void display(){

        System.out.println("the die is "+ die );
    }
}





