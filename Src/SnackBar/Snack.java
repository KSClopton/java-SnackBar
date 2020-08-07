package SnackBar;

public class Snack {
 // data types
    private int maxId = 0;
    private int id = maxId++;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor
    public Snack(String name, int quantity, double cost){

        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        // this.vendingMachineId = vendingMachineId;
    }
    // methods

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public int getVendingId(){
        return vendingMachineId;
    }
    public void setVendingId(int vendingMachineId){
        this.vendingMachineId = vendingMachineId;
    }
    public int getQuantity(){
        return quantity;
    }
    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }
    public void buySnack(int quantity){
        this.quantity = this.quantity - quantity;
    }
    public void totalCost(double quantity){
        this.cost = this.cost * quantity;
    }
    @Override
    public String toString(){
        return "Snacks: " + name + "Quantity: " + quantity;
    }

}