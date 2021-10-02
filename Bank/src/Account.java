import java.util.Scanner;

public class Account {
    private String customerName; //instance variable
    public String residence;
    private double accountBalance;

    public Account(double balance){ //constructor
        this.accountBalance=balance;
    }

    public void setAccountDetails(String name){ //set method
        this.customerName=name;
        }

    public String getCustomerName(){ //get method
        return this.customerName;
    } //method

    public double getAccountBalance(){
        return this.accountBalance;
    } //method

    public void showAccountDetails(){ //method
        System.out.printf("Customer Name is %s and balance ksh. %f %n", getCustomerName(),getAccountBalance());
    }
}
