import javax.tools.Tool;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Dimension2D;


/**
 * This class represents a line in plane, given by the equation
 * ax +by + c = 0
 */
public class Line extends GeometricObject {
    private double a;
    private double b;
    private double c;

    /**
     * Instantiates a line object as -x + y = 0 or y = x
     */
    public Line() {
        a = -1;
        b = 1;
        c = 0;
    }


    public Line(Point p , Point q){

    }

    /**
     * Instantiates a line object as ax + by + c = 0 or y = (-a/b) x + (-c/b)
     *
     * @param a
     * @param b
     * @param c
     * @throws IllegalArgumentException
     */
    public Line(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0 && b == 0) throw new IllegalArgumentException();
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    /**
     * Draw this line
     * @param g a graphic content
     */
    public void draw(Graphics g) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double maxX = screenSize.width;
        double maxY = screenSize.height;


        double x1, y1, x2, y2;

        if (!isVertical()) {
            x1 = 0.0;
            y1 = getX(x1);
            x2 = maxY;
            y2 = getX(x2);
        } else {
            y1 = 0.0;
            x1 = getX(y1);
            y2 = maxY;
            x2 = getX(y2);
        }


        g.setColor(getBoundaryColor());
        g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getY(double x) {
        if (b != 0)
            return (-a / b) * x + (-c / b);
        else
            throw new IllegalStateException("Vertical line cannot be used here.");
    }

    public double getX(double y) throws IllegalStateException {
        if (a != 0)
            return (-b / a) * y + (-c / a);
        else
            throw new IllegalStateException("Horizontal line cannot be used here.");
    }

    boolean isVertical() {
        return b == 0;
    }

    public void setA() throws IllegalStateException {
        if (a == 0 && this.b == 0) throw new IllegalStateException();
        else {
            this.a = a;
        }
    }

    public void setB(double b) throws IllegalStateException {
        if (this.a == 0 && b == 0) throw new IllegalStateException();
        else {
            this.b = b;
        }
    }
        public void setC( double c){
            this.c = c;
        }

        public void setLine(double a, double b, double c) throws IllegalStateException {
            if (a == 0 && b == 0) throw new IllegalStateException();
            else {
                this.a = a;
                this.b = b;
                this.c = c;
            }

        }

        public int pointRelativePosition(Point p)
        {
            int relativePosition = 0;
            if (!isVertical()) {
                double yCoord = getY(p.getX());
                if (yCoord > p.getY()) relativePosition = -1;
                else
                    if (yCoord == p.getY()) relativePosition = 0;
                    else relativePosition = 1;

            }
            else
            {
                double xCoord = -c / a; // can also be obtained with getX(p.getY())';
                if (xCoord > p.getX()) relativePosition = -1;
                else
                    if (xCoord == p.getX()) relativePosition = 0;
                    else relativePosition = 1;
            }
            return relativePosition;
        }



        public String toString() {
            String str = "Line " + a + " " + b + " " + super.toString();

            return str;
        }


    }




