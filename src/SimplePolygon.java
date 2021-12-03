import java.awt.*;

public class SimplePolygon extends GeometricObject {
    Point[] vertexList;
    int size;
    int vertNumber;

    public SimplePolygon() {
        size = 100;
        vertexList = new Point[size];
        vertNumber = 0;
    }


    void addVertex(Point v) {
        vertexList[vertNumber] = v;
        vertNumber++;
    }

    double area() {
        if (vertNumber < 4)
            return Double.NaN;
        double sum1 = 0.0, sum2 = 0.0;
        Point v1, v2;

        for (int i = 0; i < vertNumber; i++) {
            v1 = vertexList[i];
            v2 = vertexList[(i + 1) % vertNumber];

            sum1 += v1.getX() * v2.getX();
            sum2 += v2.getX() * v2.getY();
        }
        double area = 0.5 * Math.abs(sum1 - sum2);
        return area;

    }

    public Rectangle boundingRectangle() {
        double x1 = smallestX();
        double x2 = greatestX();
        double y1 = smallestY();
        double y2 = greatestY();
        return new Rectangle(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public void draw(Graphics g) {
        int[] xCoord = new int[vertNumber];
        int[] yCoord = new int[vertNumber];

        for (int i = 0; i < vertNumber; i++) {
            xCoord[i] = (int) vertexList[i].getX();
            yCoord[i] = (int) vertexList[i].getY();

        }
        g.setColor(getInteriorColor());
        g.fillPolygon(xCoord, yCoord, vertNumber);
        g.setColor(getBoundaryColor());
        g.drawPolygon(xCoord, yCoord, vertNumber);


    }


    public LineSegment[] getEdges() {
        LineSegment [] edges = new LineSegment[vertNumber];

        for (int i =0; i < vertNumber; i++) {
            LineSegment l = new LineSegment(vertexList[i], vertexList[(i + 1) % vertNumber]);
            edges[i] = l;
        }

        return edges;
    }


    public int getNumberOfVertices() {

        return vertNumber;
    }

    /**
     * Gets the greatest X value in array.
     *
     * @return
     */
    public double greatestX() {

        double maxX = vertexList[0].getX();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getX() > maxX) {
                maxX = vertexList[i].getX();
            }

        }
        return maxX;


    }

    /**
     * Gets the greatest Y value in array.
     *
     * @return
     */
    public double greatestY() {
        double maxY = vertexList[0].getY();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getY() > maxY) {
                maxY = vertexList[i].getY();
            }

        }
        return maxY;

    }

    public double smallestX() {
        double minX = vertexList[0].getX();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getX() < minX) {
                minX = vertexList[i].getX();
            }

        }
        return minX;

    }

    /**
     * Gets the smallest Y value in array.
     *
     * @return minY
     */
    public double smallestY() {
        double minY = vertexList[0].getY();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getY() < minY) {
                minY = vertexList[i].getY();
            }

        }
        return minY;
    }

    /**
     * Shows points
     *
     *
     * @return
     */
    public String toString() {

        StringBuilder str = new StringBuilder("RECTPOLYGON " + super.toString() + "\n");
        str.append("Start: ");
        for (int i = 0; i < vertNumber - 2; i++) {
            str.append("(").append(vertexList[i].getX()).append(" ").append(vertexList[i].getY()).append(") ");
        }
        str.append("End: ");
        str.append("(").append(vertexList[vertNumber - 1].getX()).append(" ").append(vertexList[vertNumber - 1].getY()).append(") ");

        return str.toString();
    }


    /**
     * Translates points in Vertex List
     *
     *
     * @param v
     */
    public void translate(Vector v) {
        for (Point p : vertexList) {
            p.translate(v);
        }
    }




}

