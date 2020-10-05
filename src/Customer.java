import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ADsquared on 2020-10-04.
 * @project AutoboxingAndUnboxingChallenge
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    //    private String name;
//    private ArrayList<Double> transactions = new ArrayList<>();
//    private double initialTransaction;
//
//
//    public Customer(String name, double initialTransaction) {
//        this.name = name;
//        this.initialTransaction = initialTransaction;
//        Double initialT = new Double(initialTransaction);
//        if(initialTransaction < 0){
//            System.out.println("Invalid first deposit.");
//        } else {
//            transactions.add(initialT);
//            System.out.println("Customer " + name + " successfully created with initial deposit of " + initialT);
//        }
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public ArrayList<Double> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(ArrayList<Double> transactions) {
//        this.transactions = transactions;
//    }
//
//    public void addTransaction(double amount) {
//        transactions.add(amount);
//    }
//
//    public double getCustomerBalance() {
//        double sum = 0;
//        for(int i = 0; i < transactions.size(); i++) {
//            System.out.println(transactions.get(i));
//            sum += transactions.get(i);
//        }
//        return sum;
//    }

}
