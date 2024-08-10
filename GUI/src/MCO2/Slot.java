package MCO2;

import java.util.ArrayList;
/**
 * The Slot Class represents a Slot you would see in a vending machine.
 * This is where a specific item and its quantity is located for customers
 * to check what items are available. 
 * It has common characteristics that any social media post might have.
 * The Tweet provides a tweet's information.
 */
public class Slot {
    private Item item;
    private ArrayList <Item> items;
    private int nQuantity;
    private int nPrice;
/**
 * This is a Constructor that initializes a Slot's appropriate item, 
 * the Quantity of that item, and the Price.
 * 
 * @param item The Slot's designated Item
 * @param nQuantity The quantity of that item
 * @param nPrice The Price of the item
 */
    public Slot(Item item, int nQuantity, int nPrice) {
        this.item = item;
        this.nQuantity = nQuantity;
        this.items = new ArrayList<>();
        
        for(int i = 0; i < nQuantity; i++) {
            items.add(new Item(item));
        }
            

        
        this.nPrice = nPrice;
    }

/**
 * This is a Constructor that automatically initializes a Slot's 
 * appropriate item, the Quantity of that item, and the Price when
 * it is not manually intialized.
 */
    public Slot() {
        this.items = new ArrayList<>();
        this.items.add(null);
        this.nQuantity = 0;
        this.nPrice = 0;
    }



/**
 * destroys a instance of an item
 */
public void destroyItem() {
    this.items.remove(this.items.size() - 1);
}



/**
 * A slot's item parameter will be updated to the new item.
 * 
 * @param item the name and calories of the item
 */
    public void setItem(Item item) {
        //this.item = item;
        this.items.clear();
        for(int i = 0; i < this.nQuantity; i++) {
            this.items.add(new Item(item));
        }
    }

/**
 * A slot's Price parameter will be updated.
 * 
 * @param nPrice the price of the item
 */
    public void setnPrice(int nPrice) {
        this.nPrice = nPrice;
    }

/**
 * A slot's Quantity will be updated.
 * 
 * @param nQuantity the quantity of the item
 */
    public void setnQuantity(int nQuantity) {
        this.nQuantity = nQuantity;

        for(int i = 0; i < this.nQuantity; i++) {
            this.items.add(new Item(item));
        }
    }

/**
 * Returns the slot's item
 * 
 * @return the item
 */
    public Item getItem() {
        return this.items.get(0);
    }

/**
 * Returns the slot's item's price
 * 
 * @return the price of that specific item
 */
    public int getnPrice() {
        return this.nPrice;
    }

/**
 * Returns the Item it is selling
 * 
 * @return the Item
 */
    public Item sellItem() {
        
        return this.items.get(0);
    }

/**
 * Returns the quantity of the item
 * 
 * @return the quantity
 */
    public int getnQuantity() {
        return this.nQuantity;
    }
}

