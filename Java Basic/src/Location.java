import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Location extends SpacePlace {
    private int c;
    private int r;
    private DIRECTION d;
    private int tmp;

    public enum DIRECTION { VERTICAL, HORIZONTAL }

    public Location(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public Location(int r, int c, DIRECTION d) {
        this(r, c);
        this.d = d;
    }

    public int getRow() {
        return r;
    }

    public int getColumn() {
        return c;
    }

    public DIRECTION getDirection() {
        return d;
    }

    public String toString() {
        if (d == null) {
            tmp = c + 1;
            return "(" + tmp + "," + (r + 1) + ")";
        } else {
            tmp = c + 1;
            return "(" + tmp + "," + (r + 1) + "," + d + ")";
        }
    }

    public void drawGridLines(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);

        final int startX = 20;
        final int endX = 180;
        final int startY = 20;
        final int endY = 160;

        for (tmp = 0; tmp <= 7; tmp++) {
            g.drawLine(startX, startY + tmp * 20, endX, startY + tmp * 20);
        }
        for (int see = 0; see <= 8; see++) {
            g.drawLine(startX + see * 20, startY, startX + see * 20, endY);
        }
    }

    public static int getInt() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                return Integer.parseInt(r.readLine());
            } catch (Exception e) {
            }
        }
    }
}
