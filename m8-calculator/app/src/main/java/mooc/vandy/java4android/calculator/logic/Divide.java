package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    ActivityInterface mOut;
    private int n1, n2;

    public Divide(int n1, int n2, ActivityInterface mOut) // Constructor
    {
        //Initialize values
        this.n1 = n1;
        this.n2 = n2;
        this.mOut = mOut;
    }

    public void perform() {
        if (n2 == 0)
            mOut.print(); // Display error message
        else
            mOut.print(); //Call print function in Operation.java to print output
    }
}
