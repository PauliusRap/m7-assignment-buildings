package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.
/*    -mLength:int
­mWidth:int
­mLotLength:int
­mLotWidth:int*/
//fields:
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    //constructor
    public Building(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        this.mLength = mLength;
        this.mWidth = mWidth;
        this.mLotLength = mLotLength;
        this.mLotWidth = mLotWidth;
    }

    //setters and getters

    public int getLength() {
        return mLength;
    }

    public void setLength(int mLength) {
        this.mLength = mLength;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public void setLotLength(int mLotLength) {
        this.mLotLength = mLotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLotWidth(int mLotWidth) {
        this.mLotWidth = mLotWidth;
    }

    //methods
    public int calcBuildingArea() {

    }

    public int calcLotArea() {

    }

    public String toString() {

    }


}
