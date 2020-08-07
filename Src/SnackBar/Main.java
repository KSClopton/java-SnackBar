package SnackBar;

public class Main {
    private static void workWithSnacks(){


        Snack chips = new Snack("Chips", 36, 1.75);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00);
        Snack pretzel = new Snack("Pretzel", 30, 2.00);

        Snack soda = new Snack("Soda", 24, 2.50);
        Snack water = new Snack("Water", 20, 2.75);

        // vending machines
        // * [ ] Instantiate 3 Vending Machines
        // * [ ] Food
        // * [ ] Drink
        // * [ ] Office
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        // customers
        // public Customer(String name, double cashOnHand)
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Print Customer 1 (Jane) Cash on hand. 
        jane.buySnacks(7.50);
        System.out.println( jane.getCash());
        // Print Soda quantity
        soda.buySnack(3);
        System.out.println(soda.getQuantity());

        // Customer 1 cash on hand 35.75
        jane.buySnacks(2);
        System.out.println(jane.getCash());
        // Quanity of snack 3 is 29
        pretzel.buySnack(1);
        System.out.println(pretzel.getQuantity());
        // Customer 2 cash on hand 28.14
        bob.buySnacks(5.00);
        System.out.println(bob.getCash());
        // Quantity of snack 4 is 19
        soda.buySnack(2);
        System.out.println(soda.getQuantity());
        // Customer 1 cash on hand 45.75
        jane.addCash(10.00);
        System.out.println(jane.getCash());
        // Customer 1 cash on hand 44.75
        jane.buySnacks(1);
        System.out.println(jane.getCash());
        // Quantity of snack 2 is 35
        chocolateBar.buySnack(1);
        System.out.println(chocolateBar.getQuantity());
        // Quantity of snack 3 is 41
        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());
        // customer 2 cash on hand 22.14
        bob.buySnacks(6);
        System.out.println(bob.getCash());
        // Quantity of snack 3 is 38
        pretzel.buySnack(3);
        System.out.println(pretzel.getQuantity());
            }



        
    public static void main(String[] args) {
        workWithSnacks();
    }
}