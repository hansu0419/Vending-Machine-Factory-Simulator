package MCO2;
/** 
 * The Item class represents the Items that are placed in the vending machines.
 * The Item Class represents that Items that are being sold to customers.
 */
public class Item {
   protected String sName;
   protected float fCalories;

/**
 * This is Constructor that initializes the Item's
 * name and calories.
 * 
 * @param sName The Item's Name
 * @param fCalories The Item's calories
 */
   public Item(String sName, float fCalories) {
        this.sName = sName;
        this.fCalories = fCalories;
   }

    /**
     * This is Constructor that initializes the Item's
     * name and calories.
     * 
     * @param item The Item's Name
     */
   public Item(Item item) {
        this.sName = item.getsName();
        this.fCalories = item.getdCalories();
   }

/**
 * Returns the item's name
 * 
 * @return The Name
 */
   public String getsName() {
        return sName;
    }

/**
 * Returns the item's calories
 * 
 * @return The Calories
 */
    public float getdCalories() {
        return this.fCalories;
    }   

}