package gameZone;

public class Die {
        public static void main(String[] args){
           int value=((int)(Math.random() *100)%6 + 1);


            toDie one = new toDie(value);
            toDie two = new toDie();


        }
    }


