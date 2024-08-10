package MCO2;


/**
 * This program Simulates a Vending Machine Factory where the user can create a
 * Vending machine of their choice. User Can create and add their own Items in
 * the vending Machine. Users can do several maintenance features like 
 * stocking/ Restocking items, collecting money, replenish money and view the vending
 * machine sale history. Users can also test their vending machine, which jst simulates
 * the user buying.
 * 
 * The factory contains the maintenance, 
 * the Regular and Special Vending Machine,
 * and the Beta Testing of the created vending machine. 
 * 
 * @author Ford Ainstein Tan Chung
 * ID = 12205826
 * @author Johans Venedict Loyola Cipriano 
 * ID = 12205540
 */
public class Factory {

    /**
     * The main class where the GUI is called
     * @param args the command line arguments
     */
    public static void main(String args[]) {

            new MainPage().setVisible(true);
        
    }
    
    
}
