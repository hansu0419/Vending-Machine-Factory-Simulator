package MCO2;
/**
 * The RegularVM class represents the Regular Vending Machine which contains
 * all of the features of a Regular Machine. This includes the slot,
 * items that can be stored in a slot and the changebox.
 * This 
 */
public class RegularVM {
    protected int nSlotCapacity;
    protected Slot[] slots;
    protected int nItemCapacity;
    protected ChangeBox money;
    protected SummaryReceipt summaryReceipt;

    /**
     * This is a Constructor which initializes 
     * the Slot Capacity and Item Capacity of a Regular Vending Machine
     * @param nSlotCapacity represents the no. of slots
     * @param nItemCapacity represents the no. of items allowed to be added
     */
    RegularVM(int nSlotCapacity, int nItemCapacity) {
        this.nSlotCapacity = nSlotCapacity;
        this.nItemCapacity = nItemCapacity;
        this.slots = new Slot[nSlotCapacity];
        this.money = new ChangeBox();
        this.summaryReceipt = new SummaryReceipt(nSlotCapacity);
    }

    /**
     * This is a Constructor which initializes 
     * the Slot Capacity and item Capacity of a Regular Vending Machine
     * to its default settings.
     */
    RegularVM() {
        this.nSlotCapacity = 11;
        this.nItemCapacity = 10;
        this.slots = new Slot[11];
        this.money = new ChangeBox();
        this.summaryReceipt = new SummaryReceipt(nSlotCapacity);
    }

    /**
     * Returns the Summary Receipt of the current Vending Machine's attributes.
     * @return the Summary Receipt
     */
    public SummaryReceipt getSummaryReceipt() {
        return summaryReceipt;
    }

    /**
     * Returns Slots
     * @return Slots Array (Each and every slot in a Regular Vending Machine in a form of an Array)
     */
    public Slot[] getSlotClass() {
        return this.slots;
    }

    /**
     * Returns the current total money of the Vending Machine
     * @return Total change
     */
    public int getTotalMoney() {
        return this.money.getTotal();
    }

    /**
     * Returns the Changebox class 
     * @return Changebox class
     */
    public ChangeBox getMoneyBox() {
        return this.money;
    }

    // public ChangeBox collectMoney(int money) {
    //     return this.getMoneyBox().giveChange();
    // }

    /**
     * Updates the quantity of items in a specific slot
     * @param nIndex The item's location
     * @param nQuantity The quantity
     */
    public void updateQuantity(int nIndex, int nQuantity) {
        this.slots[nIndex].setnQuantity(nQuantity);
    }

    /**
     * Updates the price of a specific item
     * @param nIndex The item's location in the slots
     * @param nPrice The price
     */
    public void updatePrice(int nIndex, int nPrice) {
        this.slots[nIndex].setnPrice(nPrice);
    }

    /**
     * Replenishes the change box of a vending machine
     * @param nOnes represents One peso
     * @param nFives represents Five pesos
     * @param nTens represents Ten pesos
     * @param nTwenties represents Twenty pesos
     * @param nFifties represents Fifty pesos
     * @param nHundreds represents One Hundred pesos
     */
    public void replenishChange(int nOnes, int nFives, int nTens, int nTwenties, int nFifties, int nHundreds) {
        this.getMoneyBox().replenishChange(nOnes, nFives, nTens, nTwenties, nFifties, nHundreds);
    }

    /**
     * Returns the location of a specific slot 
     * @param nIndex Index
     * @return The location of the slot
     */
    public Slot getSlots(int nIndex) {
        return slots[nIndex];
    }

    /**
     * Set's a slot's item, location, quantity, and price.
     * @param nIndex The index
     * @param item The item name and calories
     * @param nQuantity The quantity of item
     * @param nPrice The price of item
     */
    public void setSlots(int nIndex, Item item, int nQuantity, int nPrice) {
        this.slots[nIndex] = new Slot(item, nQuantity, nPrice);
    }
    
    /**
     * Returns the Vending Machine's Item Capacity
     * @return The Item Capacity
     */
    public int getnItemCapacity() {
        return nItemCapacity;
    }

    /**
     * Returns the Vending Machine's Slot Capacity
     * @return The Slot Capacity
     */
    public int getnSlotCapacity() {
        return nSlotCapacity;
    }

    /**
     * Returns a specific slot's quantity
     * @param nIndex Location of a slot
     * @return Current Quantity of a specific slot
     */
    public int getItemQuantity(int nIndex) {
        return this.slots[nIndex].getnQuantity();
    }

    /**
     * Returns a specific slot's price
     * @param nIndex Location of a slot
     * @return Current Price of a specific slot
     */
    public int getItemPrice(int nIndex) {
        return this.slots[nIndex].getnPrice();
    }

    /**
     * Returns a specific slot's Item Name
     * @param nIndex Location of a slot
     * @return Current Item Name of a specific slot
     */
    public String getItemName(int nIndex) {
        return this.slots[nIndex].getItem().getsName();
    }
    
    /**
     * Returns true if it is allowed to restock a slot depending on the Item Capacity
     * Returns false if it is not allowed to restock.
     * @param nAmount
     * @param nSlotIndex
     * @return True || False
     */
    public boolean ReStock(int nAmount, int nSlotIndex) {
        if (nAmount >= 0 && nAmount <= (this.getnItemCapacity() - this.getItemQuantity(nSlotIndex))) {
            this.updateQuantity(nSlotIndex, (nAmount + this.getItemQuantity(nSlotIndex)));
            return true;
        }
        else 
            return false;
    }

    /**
     * Sets a Slot's Item, nQuantity, and nPrice on a specific slot
     * @param nIndex Location of the Slot
     * @param item Item's name and calories
     * @param nQuantity Item's Quantity
     * @param nPrice Item's Price
     */
    public void stocking(int nIndex, Item item, int nQuantity, int nPrice) {
        this.setSlots(nIndex, item, nQuantity, nPrice); 
    }

    /* Everything Below is for Testing the Vending Machine (Customer Service) */
    
    /**
     * Returns the possible change a Vending Machine can provide with the current money it contains
     * @param money Customer's initial deposit
     * @param currentmoney Customer's needed change
     * @return The possible change a Vending Machine can provide with the current money it contains
     */
    public int getChangeforCustomer(int money, int currentmoney) {
        //int change = money - this.slots[nIndex].getnPrice();
        int change = money - currentmoney;
        int tempchange = 0;                 //used to compare the money to the current change
        int nOnes;
        int nFives;
        int nTens;
        int nTwenties;
        int nFifties;
        int nHundreds;

        if(change > getTotalMoney()) {
            tempchange = -1;
        }
        else if (change == 0) {
            tempchange = 0;
        }
        else {
            
            if ((change / 100) <= getMoneyBox().getnHundreds()) {
                nHundreds = change / 100;
                tempchange += nHundreds * 100;
                change %= 100;
                getMoneyBox().setnHundreds(getMoneyBox().getnHundreds() - nHundreds);
            }
            else {
                change -= (getMoneyBox().getnHundreds() * 100);
                getMoneyBox().setnHundreds(0);
            }
            
            if((change / 50) <= getMoneyBox().getnFifties()) {
                nFifties = change / 50;
                tempchange += nFifties * 50;
                change %= 50;
               getMoneyBox().setnFifties(getMoneyBox().getnFifties() - nFifties);
            }
            else {
                change -= (getMoneyBox().getnFifties() * 50);
                getMoneyBox().setnFifties(0);
            }

            if((change / 20) <= getMoneyBox().getnTwenties()) {
                nTwenties = change / 20;
                tempchange += nTwenties * 20;
                change %= 20;
                getMoneyBox().setnTwenties(getMoneyBox().getnTwenties() - nTwenties);
            }
            else {
                change -= (getMoneyBox().getnTwenties() * 20);
                getMoneyBox().setnTwenties(0);
            }

            if((change / 10) <= getMoneyBox().getnTens()) {
                nTens = change / 10;
                tempchange += nTens * 10;
                change %= 10;
                getMoneyBox().setnTens(getMoneyBox().getnTens() - nTens);
            }
            else {
                change -= (getMoneyBox().getnTens() * 10);
                getMoneyBox().setnTens(0);
            }

            if((change / 5) <= getMoneyBox().getnFives()) {
                nFives = change / 5;
                tempchange += nFives * 5;
                change %= 5;
                getMoneyBox().setnFives(getMoneyBox().getnFives() - nFives);
            }
            else {
                change -= (getMoneyBox().getnFives() * 5);
                getMoneyBox().setnFives(0);
            }

            if(change <= getMoneyBox().getnOnes()) {
                nOnes = change;
                tempchange += nOnes;
                getMoneyBox().setnOnes(getMoneyBox().getnOnes() - nOnes);
            }

        }

        return tempchange; 
    }

    /**
     * Returns the current money a customer can spend
     * @param nIndex The location of the slot
     * @param money Customer's current money not spent
     * @return The difference of the Current money and Price
     */
    public int decrement(int nIndex, int money) {
        return money -= this.slots[nIndex].getnPrice();
    }
 
    /**
     * Returns whether the item being bought is
     * Sold out, the customer's current money is invalid, available, 
     * or there is no item at all in the specific slot.
     * @param nIndex location of the slot
     * @param money Customer's current money
     * @return -1, -2, -3, current money after payment
     */
    public int Dispense(int nIndex, int money) {
        if (getItemName(nIndex) != null && this.slots[nIndex].getnPrice() <= money && this.slots[nIndex] != null) {
            if(this.slots[nIndex].getnQuantity() > 0) {
                this.slots[nIndex].setnQuantity(getItemQuantity(nIndex) - 1);
                return decrement(nIndex, money);
            }
            else {
                return -1;
            }
        }
        else if(this.slots[nIndex].getnPrice() >= money) {
                return -2;
        }
        else {
            return -3;
        }
        
    }

    /**
     * Displays the receipt of the Vending Machine
     */
    public void displayReceipt() {
        this.summaryReceipt.displayReceipt();
    }

} 