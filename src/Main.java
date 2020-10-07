/**
 * @author ADsquared on 2020-10-04.
 * @project AutoboxingAndUnboxingChallenge
 */
public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Royal Bank of Canada");

        bank.addBranch("Val d'Or");
        bank.addCustomer("Val d'Or", "Michael Dostie", 50.05);
        bank.addCustomer("Val d'Or", "Renaud Touzin", 175.34);
        bank.addCustomer("Val d'Or", "Cynthia Tremblay", 220.12);

        bank.addBranch("Amos");
        bank.addCustomer("Amos", "Arnaud Dostie", 150.54);

        bank.addCustomerTransaction("Val d'Or", "Michael Dostie", 44.22);
        bank.addCustomerTransaction("Val d'Or", "Michael Dostie", 12.44);
        bank.addCustomerTransaction("Val d'Or", "Renaud Touzin", 1.65);

        bank.listCustomer("Val d'Or", true);

        bank.listCustomer("Amos", true);

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exists.");
        }

        if(!bank.addBranch("Amos")) {
            System.out.println("Already exists");
        }

        if(!bank.addCustomerTransaction("Amos", "Anna", 52.33)) {
            System.out.println("No such customer.");
        }

        if(!bank.addCustomer("Amos", "Arnaud Dostie", 1451)) {
            System.out.println("Already exists.");
        }












//        Customer tim = new Customer("Tim", 10.0);
//        tim.addTransaction(-10.1);
//        tim.addTransaction(78.5);
//        tim.addTransaction(.05);
//        tim.addTransaction(100.00);
//        tim.addTransaction(-65.1);
//
//        Branch newBranch = new Branch("Toronto Domonion");
//        newBranch.addNewCustomer("Roger", 100000.00);
//        newBranch.addNewCustomer("Paul", 1234.44);
//        newBranch.addNewCustomer("Tim", 767676.22);
//
//        newBranch.printCustomerList();
    }
}
