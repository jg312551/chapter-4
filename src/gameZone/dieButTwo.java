package gameZone;

public class dieButTwo {
    public static void main(String[] args) {
        int value = ((int)(Math.random() *100)%6 + 1);
        twoDice once = new twoDice(value);
        twoDice twice = new twoDice();


        once.display();
        twice.display();


    }
}
