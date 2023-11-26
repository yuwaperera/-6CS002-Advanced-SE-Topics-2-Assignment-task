/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class Domino implements Comparable<Domino> {
    private int high;
    private int low;
    private int hx;
    private int hy;
    private int lx;
    private int ly;
    private boolean placed = false;

    public Domino(int high, int low) {
        this.high = high;
        this.low = low;
    }

    public void place(int hx, int hy, int lx, int ly) {
        this.hx = hx;
        this.hy = hy;
        this.lx = lx;
        this.ly = ly;
        placed = true;
    }

    public String toString() {
        if (!placed) {
            return "[" + high + low + "]" + "unplaced";
        } else {
            return "[" + high + low + "]" + "(" + (hx + 1) + "," + (hy + 1) + ")" + "(" + (lx + 1) + "," + (ly + 1) + ")";
        }
    }

    public void invert() {
        int tx = hx;
        hx = lx;
        lx = tx;

        int ty = hy;
        hy = ly;
        ly = ty;
    }

    public boolean ishl() {
        return hy == ly;
    }

    public int compareTo(Domino other) {
        return Integer.compare(this.high, other.high) == 0 ? Integer.compare(this.low, other.low) : Integer.compare(this.high, other.high);
    }

    // Getter methods (assuming you have these in your actual implementation)
    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public int getHx() {
        return hx;
    }

    public int getHy() {
        return hy;
    }

    public int getLx() {
        return lx;
    }

    public int getLy() {
        return ly;
    }

    public boolean isPlaced() {
        return placed;
    }
}
