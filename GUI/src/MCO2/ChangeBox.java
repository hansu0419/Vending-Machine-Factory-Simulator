package MCO2;
/**
 * The ChangeBox Class represents a Vending Machine's changebox
 * where it contains the Vending Machine's coins and cash.
 */

public class ChangeBox{
    private int nOnes;
    private int nFives;
    private int nTens;
    private int nTwenties;
    private int nFifties;
    private int nHundreds;

/**
 * This is a Constructor that initializes the Changebox's denominations :
 * Ones, Fives, Tens, Twenties, Fifties, Hundreds' quantity to zero.
 */
    public ChangeBox() {
        this.nOnes = 0;
        this.nFives = 0;
        this.nTens = 0;
        this.nTwenties = 0;
        this.nFifties = 0;
        this.nHundreds = 0;
    }
/**
 * This is a Constructor that initializes the Changebox's denominations :
 * Ones, Fives, Tens, Twenties, Fifties, Hundreds' quantity to 
 * a specific number.
 * 
 * @param nOnes represents One peso
 * @param nFives represents Five pesos
 * @param nTens represents Ten pesos
 * @param nTwenties represents Twenty pesos
 * @param nFifties represents Fifty pesos
 * @param nHundreds represents One Hundred pesos
 */
    public ChangeBox(int nOnes, int nFives, int nTens, int nTwenties, int nFifties, int nHundreds) {
        this.nOnes = nOnes;
        this.nFives = nFives;
        this.nTens = nTens;
        this.nTwenties = nTwenties;
        this.nFifties = nFifties;
        this.nHundreds = nHundreds;
    }
/**
 * Returns the quantity of nOnes
 * 
 * @return Quantity of One Peso
 */
    public int getnOnes() {
        return nOnes;
    }

/**
 * The quantity of One peso will be updated.
 * 
 * @param nOnes represents One Peso
 */
    public void setnOnes(int nOnes) {
        this.nOnes = nOnes;
    }

/**
 * Returns the quantity of Five pesos
 * 
 * @return Quantity of Five Pesos
 */
    public int getnFives() {
        return nFives;
    }

/**
 * The quantity of Five pesos will be updated.
 * 
 * @param nFives Quantity of Five Pesos
 */
    public void setnFives(int nFives) {
        this.nFives = nFives;
    }

/**
 * Returns the quantity of Ten pesos
 * 
 * @return Quantity of Ten Pesos
 */
    public int getnTens() {
        return nTens;
    }

/**
 * The quantity of Ten pesos will be updated.
 * 
 * @param nTens Quantity of Ten Pesos
 */
    public void setnTens(int nTens) {
        this.nTens = nTens;
    }

/**
 * Returns the quantity of Twenty pesos
 * 
 * @return Quantity of Twenty Pesos
 */
    public int getnTwenties() {
        return nTwenties;
    }

/**
 * The quantity of Twenty pesos will be updated.
 * 
 * @param nTwenties Quantity of Twenty Pesos
 */
    public void setnTwenties(int nTwenties) {
        this.nTwenties = nTwenties;
    }

/**
 * Returns the quantity of Fifty pesos
 * 
 * @return Quantity of Fifty Pesos
 */
    public int getnFifties() {
        return nFifties;
    }

/**
 * The quantity of Fifty pesos will be updated.
 * 
 * @param nFifties Quantity of Fifty Pesos
 */
    public void setnFifties(int nFifties) {
        this.nFifties = nFifties;
    }

/**
 * Returns the quantity of Hundred pesos
 * 
 * @return Quantity of Hundred Pesos
 */
    public int getnHundreds() {
        return nHundreds;
    }

/**
 * The quantity of Hundred pesos will be updated.
 * 
 * @param nHundreds Quantity of Hundred Pesos
 */
    public void setnHundreds(int nHundreds) {
        this.nHundreds = nHundreds;
    }

/**
 * A method that returns the total change a vending Machine currently has.
 * @return Total Change
 */
    public int getTotal() {
        return this.nFifties*50 + this.nFives*5 + this.nHundreds*100 + this.nOnes + this.nTens*10 + this.nTwenties*20;
    }

/**
 * Allows to add a quantity of change for each denomination.
 * 
 * @param nOnes represents One peso
 * @param nFives represents Five pesos
 * @param nTens represents Ten pesos
 * @param nTwenties represents Twenty pesos
 * @param nFifties represents Fifty pesos
 * @param nHundreds represents One Hundred pesos
 */
    public void replenishChange(int nOnes, int nFives, int nTens, int nTwenties, int nFifties, int nHundreds) {
        this.nOnes += nOnes;
        this.nFives += nFives;
        this.nTens += nTens;
        this.nTwenties += nTwenties;
        this.nFifties += nFifties;
        this.nHundreds += nHundreds;
    }

}