import java.util.ArrayList;

/**
 * @author ADsquared on 2020-10-04.
 * @project AutoboxingAndUnboxingChallenge
 */
public class Branch {

    private String name;
    private ArrayList<Customer> customerList;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customerList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customerList.size(); i++) {
            Customer checkedCustomer = this.customerList.get(i);
            if (this.customerList.get(i).getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }


    //
    //    private String name;
    //    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    //
    //
    //    public Branch(String name) {
    //        this.name = name;
    //
    //    }
    //
    //    public void addNewCustomer(String name, double initialDeposit) {
    //
    //        Customer newCustomer = new Customer(name, initialDeposit);
    //        if (exists(newCustomer)) {
    //            System.out.println("A customer with this name already exists within our system.");
    //        }
    //        customerList.add(newCustomer);
    //    }
    //
    //    public boolean exists(Customer customer) {
    //
    //        if (customerList.indexOf(customer) > 0) {
    //            return true;
    //        }
    //        return false;
    //    }
    //
    //    public void getCustomerList() {
    //        for (int i = 0; i < customerList.size(); i++) {
    //            System.out.println(customerList.get(i).toString());
    //        }
    //    }
    //
    //    public void printCustomerList() {
    //        for(int i = 0; i < this.customerList.size(); i++) {
    //            System.out.println(customerList.get(i).getName() + " with balance of " + customerList.get(i)
    //            .getCustomerBalance());
    //        }
    //    }
    //
    //    public void addCustomerTransaction(String name, double transactionAmount) {
    //        if (getCustomerNumber(name) >= 0) {
    //            System.out.println("Transaction in the amount of: " + transactionAmount + " successfully added.");
    //            int accountNumber = getCustomerNumber(name);
    //            Customer customer = customerList.get(accountNumber);
    //            customer.addTransaction(transactionAmount);
    //        } else {
    //            System.out.println("Could not find customer.");
    //        }
    //    }
    //
    //    public int getCustomerNumber(String name) {
    //        for (int i = 0; i < this.customerList.size(); i++) {
    //            Customer customer = customerList.get(i);
    //            if (customer.getName().equals(name)) {
    //                return i;
    //            }
    //        }
    //        return -1;
    //    }

}
