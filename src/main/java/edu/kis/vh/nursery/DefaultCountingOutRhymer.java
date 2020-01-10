package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int SIZE = 12;
    private static final int END = -1;
    private int total = -1;

    public void setTotal(int total) {
        this.total = total;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public static int getEND() {
        return END;
    }

    public int getTotal() {
        return total;
    }

    private final int[] numbers = new int[getSIZE()];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == getEND();
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return getEND();
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return getEND();
        return numbers[total--];
    }
}
