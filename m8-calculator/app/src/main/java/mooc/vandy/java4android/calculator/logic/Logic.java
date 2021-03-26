package mooc.vandy.java4android.calculator.logic;
import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {

    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * initializing final static variables ADD, SUBTRACT, MULTIPLY and DIVIDE
     */
    private final static int ADD=1;
    private final static int SUBTRACT=2;
    private final static int MULTIPLY=3;
    private final static int DIVIDE=4;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        switch (operation){
            // addition case
            case ADD:
                // create new Add object
                Add addition = new Add(argumentOne, argumentTwo, mOut);
                // performing the addition operation
                addition.perform();
                break;
            // subtraction case
            case SUBTRACT:
                // create new Subtract object
                Subtract subtraction = new Subtract(argumentOne, argumentTwo, mOut);
                // performs the subtraction operation
                subtraction.perform();
                break;
            // multiplication case
            case MULTIPLY:
                // create new multiply object
                Multiply multiplication = new Multiply(argumentOne, argumentTwo, mOut);
                // performing multiplication operation
                multiplication.perform();
                break;
            // division case
            case DIVIDE:
                // create new divide oobject
                Divide division = new Divide(argumentOne, argumentTwo, mOut);
                //performs division operation
                division.perform();
                break;
        }
        
    }
}
