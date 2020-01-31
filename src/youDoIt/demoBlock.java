package youDoIt;

public class demoBlock {
    public static void main(String[] args){

        int x= 1939;
        System.out.println("in this block x is " + x);
        {
            int y = 1337;
            System.out.println("in this block x is " + x);
            System.out.println("in this block y is " + y);
        }

        {
            int y= 7482;
            System.out.println("in this block x is " + x);
            System.out.println("in this block y is " + y);
            demoMethod();
            System.out.println("after method x is " + x);
            System.out.println("after method block y is " + y);
        }
        System.out.println("at the end x is "+ x );
    }
    public static void demoMethod(){
     int x = 80085;
     int y = 5276;
        System.out.println("after method x is " + x);
        System.out.println("after method block y is " + y);

    }

}
