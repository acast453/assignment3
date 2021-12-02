import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) throws InterruptedException
    {
        new main();
    }


    public main() throws InterruptedException{
        // Frame Size

        Rectangle watchman = new Rectangle(new Point(0, 0), new Point(10 , 10));
        watchman.setInteriorColor(Color.RED);

        int frameWidth = 430;
        int frameHeight = 410;

        int pointNumber = 2;

        GeometricObject [] lineArray = new GeometricObject[pointNumber];
        ArrayList<SimplePolygon> simplePolygons = new ArrayList<SimplePolygon>();

        Random rnd = new Random();
        double x,y;

        lineArray[0] = watchman;

        Point p1 = new Point(60, 315);
        Point p2 = new Point(77, 315);
        Point p3 = new Point(77, 318);
        Point p4 = new Point(75, 318);
        Point p5 = new Point(75, 320);
        Point p6 = new Point(69, 320);
        Point p60 = new Point(69, 322);
        Point p61 = new Point(62, 322);
        Point p62 = new Point(62, 320);
        Point p63 = new Point(60, 320);


        SimplePolygon rectPolygonOne = new SimplePolygon();

        rectPolygonOne.addVertex(p1);
        rectPolygonOne.addVertex(p2);
        rectPolygonOne.addVertex(p3);
        rectPolygonOne.addVertex(p4);
        rectPolygonOne.addVertex(p5);
        rectPolygonOne.addVertex(p6);
        rectPolygonOne.addVertex(p60);
        rectPolygonOne.addVertex(p61);
        rectPolygonOne.addVertex(p62);
        rectPolygonOne.addVertex(p63);

        lineArray[1] = rectPolygonOne;
        simplePolygons.add(rectPolygonOne);
        rectPolygonOne.setInteriorColor(Color.BLUE);

        FrameDisplay frame = new FrameDisplay(frameWidth,frameHeight,lineArray);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Double xDirection = Math.random();
        Double yDirection = Math.random();

        while (true) {
            watchman.translate(new Vector(xDirection, yDirection));

            if (watchman.greatestX() > 400 || watchman.smallestX() < 0) {
                xDirection *= -1;
            }

            if (watchman.greatestY() > 400 || watchman.smallestY() < 0) {
                yDirection *= -1;
            }

            for (SimplePolygon poly : simplePolygons) {
                SimplePolygon watchmanPoly = new SimplePolygon();
                watchmanPoly.addVertex(new Point(0, 0));
                watchmanPoly.addVertex(new Point(10, 0));
                watchmanPoly.addVertex(new Point(10, 10));
                watchmanPoly.addVertex(new Point(0, 10));

                // System.out.println(watchmanPoly.getEdges()[0] + " " + watchmanPoly.getEdges()[1]);
                System.out.println(watchmanPoly.getEdges().length);

            
                // if (Algorithms.isThereAnIntersection(watchmanPoly, poly)) {
                //     xDirection *= -1;
                //     yDirection *= -1;
                // }
            }

            Thread.sleep(1000);
            frame.repaint();
        }

    }
}