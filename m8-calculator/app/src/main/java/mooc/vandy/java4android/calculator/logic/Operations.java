package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

public abstract class Operations {

    abstract void perform(); // Create abstract class

    protected void print(String outputString, ActivityInterface mOut) {
        mOut.print(outputString, mOut); // Print result
    }
}

