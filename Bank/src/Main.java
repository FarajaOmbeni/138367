import java.util.Scanner;
public class Main {
    public static void main(String[] args){ //main method

        Account firstCustomer = new Account(0.000); //object
        firstCustomer.setAccountDetails("Kevin Otieno");

        Account secondCustomer = new Account(0.000); //object
        secondCustomer.setAccountDetails("Titus Oyugi");

        Account thirdCustomer = new Account(0.000); //object
        thirdCustomer.setAccountDetails("Mark Chege");

       /* firstCustomer.residence="Madaraka";
        secondCustomer.residence="LAng'ata";
        System.out.printf("First customer lives in %s%nSecond Customer lives in %s",firstCustomer.residence, secondCustomer.residence);*/

        firstCustomer.showAccountDetails();
        secondCustomer.showAccountDetails();
        thirdCustomer.showAccountDetails();

    }
}
