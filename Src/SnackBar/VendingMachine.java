package SnackBar;

public class VendingMachine {
    // fields

    private int maxId = 0;
    private int id = maxId++;
    private String name;
    // constructor

    public VendingMachine(String name){

        maxId++;
        id = maxId;
        this.name = name;
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
}