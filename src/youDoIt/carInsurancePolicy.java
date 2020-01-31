package youDoIt;

public class carInsurancePolicy {
    private int policyNum;
    private int numPayments;
    private String residentCity;
    public carInsurancePolicy( int num, int payment,String city){

        policyNum= num;
        numPayments= payment;
        residentCity = city;

    }
    public carInsurancePolicy(int num, int Payments){
        policyNum= num;
        numPayments=  Payments;
        residentCity = "mayfeild";
    }
    public carInsurancePolicy(int num){
        policyNum= num;
        numPayments=  2;
        residentCity = "mayfeild";
    }
    public void display(){

        System.out.println("policy #"+ policyNum+". "+numPayments + " payments annually." +
        "driver resides in" + residentCity +".");
    }

}
