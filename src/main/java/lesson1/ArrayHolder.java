package lesson1;

import java.util.Arrays;

public class ArrayHolder {
    private int[] ints;
    public ArrayHolder(){
        this.ints=new int[]{1,2,3,4,5};
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }
    @Override
    public String toString(){
        return Arrays.toString(ints);
    }
}
