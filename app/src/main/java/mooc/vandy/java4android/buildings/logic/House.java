package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    // TODO - Put your code here.

    //fields
    private String mOwner;
    private boolean mPool;

    //constructors
    public House(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        super(mLength, mWidth, mLotLength, mLotWidth);
    }

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth, String mOwner) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mOwner = mOwner;
    }

    public House(int mLength, int mWidth, int mLotLength, int mLotWidth, String mOwner, boolean mPool) {
        super(mLength, mWidth, mLotLength, mLotWidth);
        this.mOwner = mOwner;
        this.mPool = mPool;
    }

    //getters and setters
    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    
}
