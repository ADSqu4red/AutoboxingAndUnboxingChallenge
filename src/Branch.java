import java.util.ArrayList;

/**
 * @author ADsquared on 2020-10-04.
 * @project AutoboxingAndUnboxingChallenge
 */
public class Branch {

    private String name;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

//    public Branch(String name) {
//        this.name = name;
//        this.customerList = customerList;
//    }


    public Branch(String name) {
        this.name = name;

    }

    public void addNewCustomer(String name, double initialDeposit) {

        Customer newCustomer = new Customer(name, initialDeposit);
        if (exists(newCustomer)) {
            System.out.println("A customer with this name already exists within our system.");
        }
        customerList.add(newCustomer);
    }

    public boolean exists(Customer customer) {

        if (customerList.indexOf(customer) > 0) {
            return true;
        }
        return false;
    }

    public void getCustomerList() {
        for(int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i).toString());
        }
    }
}
