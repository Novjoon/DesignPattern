/**
 * Created by G209_30 on 2015-05-07.
 */
package StateSample1;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public abstract class RectShape {
    private Point upperLeftCorner, bottomRightCorner;

    public RectShape() {
        upperLeftCorner = new Point();
        bottomRightCorner = new Point();
    }

    public RectShape(Point ulc, Point brc) {
        upperLeftCorner = ulc;
        bottomRightCorner = brc;
    }

    Point getUpperLeftCorner() { return new Point(upperLeftCorner); }

    public Point getBottomRightCorner() {
        return new Point(bottomRightCorner);
    }

    public void setUpperLeftCorner(Point ulc) {
        upperLeftCorner = ulc;
    }

    public void setBottomRightCorner(Point brc) {
        bottomRightCorner = brc;
    }

    public double getWidth() {
        return bottomRightCorner.getX() - upperLeftCorner.getX();
    }

    public double getHeight() {
        return bottomRightCorner.getY() - upperLeftCorner.getY();
    }

    public abstract void draw(Graphics2D g);

    // 占싣뤄옙 占쌨소듸옙占쏙옙占� 占쌩곤옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
    // x, y 占쏙옙표占쏙옙 占쏙옙 RectShape 占쏙옙체 占싫울옙 占쏙옙치占싼다몌옙 true占쏙옙 占쌓뤄옙占쏙옙 占십다몌옙 false占쏙옙 占쏙옙환
    public boolean isInside(int x, int y) {
        if (x >= getUpperLeftCorner().getX() && x <= getBottomRightCorner().getX()
                && y >= getUpperLeftCorner().getY() && y <= getBottomRightCorner().getY()) {
            return true;
        }
        return false;
    }

    // 占쏙옙 占쏙옙체占쏙옙 占쏙옙치占쏙옙 x, y 占쏙옙큼 占싱듸옙
    public void move(int x, int y) {
        setUpperLeftCorner(new Point(getUpperLeftCorner().getX() + x, getUpperLeftCorner().getY() + y));
        setBottomRightCorner(new Point(getBottomRightCorner().getX() + x, getBottomRightCorner().getY() + y));
    }

    public void open(BufferedReader reader) {
        upperLeftCorner = new Point();
        upperLeftCorner.open(reader);
        bottomRightCorner = new Point();
        bottomRightCorner.open(reader);
    }

    public void save(BufferedWriter writer, String name) {
        try {
            writer.write(name + "\n");
            getUpperLeftCorner().save(writer);
            getBottomRightCorner().save(writer);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public abstract void save(BufferedWriter writer);
}
