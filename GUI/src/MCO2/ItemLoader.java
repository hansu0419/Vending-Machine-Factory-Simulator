package MCO2;
/**
 * The ItemLoader class represents our chosen items for MCO1 and MCO2.
 * It contains items we will sell and use for the Special Vending Machine
 */
public class ItemLoader {
    /**
     * Prints out the default items that are going to be used for MCO2
     */
    public void displayCoffeeItems() {
        System.out.println("===================================");
        System.out.println("Coffee Ingredients");
        System.out.println("===================================");
        System.out.println("+Coffee");
        System.out.println("  [1] Espresso shot");
        System.out.println("+Types of Milk");
        System  .out.println("  [2] Almond Milk");
        System.out.println("  [3] Normal Milk");
        System.out.println("  [4] Soy Milk");
        System.out.println("  [5] Oat Milk");
        System.out.println("+Toppings");
        System.out.println("  [6] Oreo");
        System.out.println("  [7] Icecream");
        System.out.println("  [8] Chocolate");
        System.out.println("+Flavorings Syrup(not for sale)");
        System.out.println("   -Strawberry");
        System.out.println("   -Caramel");
        System.out.println("   -Chocolate");
    }

    /**
     * Makes a default vending machine which contains the items that
     * will be sold in the Vending Machine. It includes the item names,
     * calories, quantity, and price.
     * @param slot represent's a vending machine's slots
     */
    public void loadCoffeeItems(Slot[] slot) {
        slot[0] = new Slot(new Item("Espresso", 5), 10, 50);
        slot[1] = new Slot(new Item("Almond_Milk", 40), 10, 55);
        slot[2] = new Slot(new Item("Normal_Milk", 42), 10, 40);
        slot[3] = new Slot(new Item("Soy_Milk", 54), 10, 30);
        slot[4] = new Slot(new Item("Oat_Milk", 120), 10, 50);
        slot[5] = new Slot(new Item("Oreo", 160), 10, 15);
        slot[6] = new Slot(new Item("Icecream", 137), 10, 30);
        slot[7] = new Slot(new Item("Chocolate", 155), 10, 15);
        slot[8] = new Slot(new Item("Strawberry_Syrup", 93), 10, 10);
        slot[9] = new Slot(new Item("Caramel_Syrup", 110), 10, 10);
        slot[10] = new Slot(new Item("Chocolate_Syrup", 93), 10, 10);
    }
}
