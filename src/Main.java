/**
 * @author ADsquared on 2020-10-04.
 * @project AutoboxingAndUnboxingChallenge
 */
public class Main {

    public static void main(String[] args) {

        Customer tim = new Customer("Tim", 10.0);
        tim.addTransaction(-10.1);
        tim.addTransaction(78.5);
        tim.addTransaction(.05);
        tim.addTransaction(100.00);
        tim.addTransaction(-65.1);
        System.out.println(tim.getTransactions());
        System.out.println(tim.getCustomerBalance());

        Branch newBranch = new Branch("Toronto Domonion");
        newBranch.addNewCustomer("Roger", 100000.00);
        newBranch.getCustomerList();
    }
}
