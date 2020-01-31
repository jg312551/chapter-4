package youDoIt;

public class createPolicy {
    public static void main(String args){
        carInsurancePolicy first = new carInsurancePolicy(123);
        carInsurancePolicy second = new carInsurancePolicy(456,4);
        carInsurancePolicy third = new carInsurancePolicy(789,12,"new castle");

        first.display();
        second.display();
        third.display();

    }

}
