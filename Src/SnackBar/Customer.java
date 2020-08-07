package SnackBar;

public class Customer {
    private int maxId = 0;
    private int id = maxId++;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand){

        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // methods

    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        name = this.name;
    }
    public void addCash(double cash){
        this.cashOnHand = cash;
    }
    public double getCash(){
        return cashOnHand;
    }
    public void buySnacks(double totalCost){
        this.cashOnHand = this.cashOnHand - totalCost;
    }
    @Override
    public String toString(){
        return "Customer: " + name + "cash " + cashOnHand;
    }
}