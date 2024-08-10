package MCO2;
/**
 * The SummaryReceipt class represents a Receipt which contains
 * the transactions, sales, and inventory.
 */
public class SummaryReceipt {
    private int sales;
    private Slot[] endingInventory;
    private Slot[] startingInventory;

    /**
     * This is a Constructor that initializes
     * sales to zero, startingInventory and endingInventory's arraysize.
     * @param arraysize the maximum number of quantity of adding items.
     */
    SummaryReceipt(int arraysize) {
        this.sales = 0;
        this.startingInventory = new Slot[arraysize];
        this.endingInventory = new Slot[arraysize];
    }

    /**
     * Adds past sales to the current sales.
     * @param sales Represents revenue
     */
    public void AppendSales(int sales) {
        this.sales += sales;
    }

    /**
     * Sets the latest/current inventory informations.
     * @param endingInventory
     */
    public void setEndingInventory(Slot[] endingInventory) {
        for(int i = 0; i < endingInventory.length; i++) {
            if(startingInventory[i] != null)
                this.endingInventory[i] = new Slot(endingInventory[i].getItem(), endingInventory[i].getnQuantity(), endingInventory[i].getnPrice());
        }
    }

    /**
     * This method adds another inventory.
     * @param nIndex
     * @param slots
     */
    public void addInventory(int nIndex, Slot slots) {
        this.startingInventory[nIndex] = new Slot(slots.getItem(), slots.getnQuantity(), slots.getnPrice());
        this.endingInventory[nIndex] = slots;
    }
    
    public Slot[] getStartingInventory() {
        return startingInventory;
    }

    public Slot[] getEndingInventory() {
        return endingInventory;
    }

    public int getSales() {
        return sales;
    }

    /**
     * This method sets the starting inventory of the vending machine
     * @param startingInventory
     */
    public void setStartingInventory(Slot[] startingInventory) {
        for(int i = 0; i < startingInventory.length; i++) {
            if(startingInventory[i] != null) {
                this.startingInventory[i] = new Slot(startingInventory[i].getItem(), startingInventory[i].getnQuantity(), startingInventory[i].getnPrice());
                setEndingInventory(startingInventory);
                sales = 0;
            }
        }
    }

    /**
     * Displays A Vending Machine's Receipt
     */
    public void displayReceipt() {
        boolean nItems = false;
        int sold;

        System.out.println("===================================");
        System.out.println("Vending Machine History");
        System.out.println("===================================");
        
        System.out.println("Inventory History");
        System.out.println("");

        for(int i = 0; i < this.startingInventory.length; i++) {
            if(this.startingInventory[i] != null) {
                sold = 0;
                System.out.println("===================================");
                System.out.println("Item: " + this.startingInventory[i].getItem().getsName());
                System.out.println("Before: " + this.startingInventory[i].getnQuantity());
                System.out.println("After: " + this.endingInventory[i].getnQuantity());
                sold = this.startingInventory[i].getnQuantity() - this.endingInventory[i].getnQuantity();
                System.out.println("Total Sold: " + sold);

                System.out.println("===================================");
                nItems = true;
            }
        }

        if(!nItems) {
            System.out.println("No Items");
        }


        System.out.println("===================================");
        System.out.println("Total Sales: " + sales + " php");
        
    }
}
