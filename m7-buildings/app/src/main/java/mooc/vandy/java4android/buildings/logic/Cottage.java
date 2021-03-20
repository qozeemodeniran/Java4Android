package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
        extends House {

    private boolean mSecondFloor;

    /**
     * constructors
     */
    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
    }

    public  Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean
            secondFloor){
        super(dimension,dimension,lotLength,lotWidth,owner);
        mSecondFloor = secondFloor;
    }

    /**
     * methods
     */
    public boolean hasSecondFloor() {
        return mSecondFloor;
    }

    /**
     *other methods
     */
    @Override
    public String toString() {
        String result = "Owner: ";
        if (super.getOwner() != null)
            result += getOwner();
        else
            result += "n/a";
        if (super.hasPool())
            result += "; has a pool";
        if(this.calcLotArea() > this.calcBuildingArea())
            result += "; has a big open space";
        if (this.hasSecondFloor())
            result += "; is a two story cottage";
        else
            result += "; is a cottage";
        return result;
    }

}

