package MCO2;

/**
 * The SpecialVM class represents the Regular Vending Machine which contains
 * all of the features of a Regular Machine. Which means that the SpecialVM is
 * inherited from the RegularVM class. This includes the slot,
 * items that can be stored in a slot and the changebox.
 */
public class SpecialVM extends RegularVM {
    
    /**
     * This is a Constructor which initializes 
     * the Slot Capacity and Item Capacity of a Special Vending Machine
     * @param nSlotCapacity represents the no. of slots
     * @param nItemCapacity represents the no. of items allowed to be added
     */
    SpecialVM(int nSlotCapacity, int nItemCapacity) {
        super(nSlotCapacity, nItemCapacity);
    }

    /**
     * This is a Constructor which initializes 
     * the Slot Capacity and item Capacity of a Special Vending Machine
     * to its default settings.
     */
    SpecialVM() {
        super();
    }
}

 