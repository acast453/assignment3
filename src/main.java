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

        int pointNumber = 10;

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

        Point p7 = new Point(177, 171);
        Point p8 = new Point(198, 171);
        Point p9 = new Point(198, 181);
        Point p10 = new Point(195, 181);
        Point p11 = new Point(195, 196);
        Point p12 = new Point(194, 196);
        Point p13 = new Point(194, 206);
        Point p14 = new Point(191, 206);
        Point p15 = new Point(191, 210);
        Point p16 = new Point(177, 210);

        SimplePolygon rectPolygonTwo = new SimplePolygon();

        rectPolygonTwo.addVertex(p7);
        rectPolygonTwo.addVertex(p8);
        rectPolygonTwo.addVertex(p9);
        rectPolygonTwo.addVertex(p10);
        rectPolygonTwo.addVertex(p11);
        rectPolygonTwo.addVertex(p12);
        rectPolygonTwo.addVertex(p13);
        rectPolygonTwo.addVertex(p14);
        rectPolygonTwo.addVertex(p15);
        rectPolygonTwo.addVertex(p16);

        // WO1C
        Point p17 = new Point(88, 345);
        Point p18 = new Point(96, 345);
        Point p19 = new Point(96, 348);
        Point p20 = new Point(98, 348);
        Point p21 = new Point(98, 352);
        Point p22 = new Point(88, 352);



        SimplePolygon rectPolygon3 = new SimplePolygon();

        rectPolygon3.addVertex(p17);
        rectPolygon3.addVertex(p18);
        rectPolygon3.addVertex(p19);
        rectPolygon3.addVertex(p20);
        rectPolygon3.addVertex(p21);
        rectPolygon3.addVertex(p22);

        // Wo1
        Point p23 = new Point(66, 344);
        Point p24 = new Point(80, 344);
        Point p25 = new Point(80, 349);
        Point p26 = new Point(78, 349);
        Point p27 = new Point(78, 353);
        Point p28 = new Point(76, 353);
        Point p29 = new Point(76, 354);
        Point p30 = new Point(74, 354);
        Point p31 = new Point(74, 353);
        Point p32 = new Point(66, 353);

        SimplePolygon rectPolygon4 = new SimplePolygon();

        rectPolygon4.addVertex(p23);
        rectPolygon4.addVertex(p24);
        rectPolygon4.addVertex(p25);
        rectPolygon4.addVertex(p26);
        rectPolygon4.addVertex(p27);
        rectPolygon4.addVertex(p28);
        rectPolygon4.addVertex(p29);
        rectPolygon4.addVertex(p30);
        rectPolygon4.addVertex(p31);
        rectPolygon4.addVertex(p32);


        //As

        Point p33 = new Point(95, 337);
        Point p34 = new Point(98, 337);
        Point p35 = new Point(98, 335);
        Point p36 = new Point(102, 335);
        Point p37 = new Point(102, 340);
        Point p38 = new Point(95, 340);

        SimplePolygon rectPolygon5 = new SimplePolygon();

        rectPolygon5.addVertex(p33);
        rectPolygon5.addVertex(p34);
        rectPolygon5.addVertex(p35);
        rectPolygon5.addVertex(p36);
        rectPolygon5.addVertex(p37);
        rectPolygon5.addVertex(p38);



        //New
        Point p39 = new Point(300, 135);
        Point p40 = new Point(325, 135);
        Point p41 = new Point(325, 224);
        Point p42 = new Point(355, 224);
        Point p43 = new Point(355, 265);
        Point p44 = new Point(300, 265);

        SimplePolygon rectPolygon6 = new SimplePolygon();

        rectPolygon6.addVertex(p39);
        rectPolygon6.addVertex(p40);
        rectPolygon6.addVertex(p41);
        rectPolygon6.addVertex(p42);
        rectPolygon6.addVertex(p43);
        rectPolygon6.addVertex(p44);



        //New 7
        Point p45 = new Point(100, 135);
        Point p46 = new Point(125, 135);
        Point p47 = new Point(125, 265);
        Point p48 = new Point(70, 265);
        Point p49 = new Point(70, 220);
        Point p50 = new Point(100, 220);

        SimplePolygon rectPolygon7 = new SimplePolygon();

        rectPolygon7.addVertex(p45);
        rectPolygon7.addVertex(p46);
        rectPolygon7.addVertex(p47);
        rectPolygon7.addVertex(p48);
        rectPolygon7.addVertex(p49);
        rectPolygon7.addVertex(p50);


//New 8
        Point p56 = new Point(320, 335);
        Point p51 = new Point(370, 335);
        Point p52 = new Point(370, 375);
        Point p53 = new Point(415, 375);
        Point p54 = new Point(415, 390);
        Point p55 = new Point(320, 390);

        SimplePolygon rectPolygon8 = new SimplePolygon();

        rectPolygon8.addVertex(p56);
        rectPolygon8.addVertex(p51);
        rectPolygon8.addVertex(p52);
        rectPolygon8.addVertex(p53);
        rectPolygon8.addVertex(p54);
        rectPolygon8.addVertex(p55);


//New 9
        Point p57 = new Point(290, 50);
        Point p58 = new Point(395, 50);
        Point p59 = new Point(395, 90);
        Point p60_2 = new Point(365, 90);
        Point p61_2 = new Point(365, 70);
        Point p62_2 = new Point(335, 70);
        Point p63_2 = new Point(335, 90);
        Point p64_2 = new Point(290, 90);
        SimplePolygon rectPolygon9 = new SimplePolygon();

        rectPolygon9.addVertex(p57);
        rectPolygon9.addVertex(p58);
        rectPolygon9.addVertex(p59);
        rectPolygon9.addVertex(p60_2);
        rectPolygon9.addVertex(p61_2);
        rectPolygon9.addVertex(p62_2);
        rectPolygon9.addVertex(p63_2);
        rectPolygon9.addVertex(p64_2);




        lineArray[1] = rectPolygonOne;
        lineArray[2] = rectPolygonTwo;
        lineArray[3] = rectPolygon3;
        lineArray[4] = rectPolygon4;
        lineArray[5] = rectPolygon5;
        lineArray[6] = rectPolygon6;
        lineArray[7] = rectPolygon7;
        lineArray[8] = rectPolygon8;
        lineArray[9] = rectPolygon9;


        simplePolygons.add(rectPolygonOne);
        simplePolygons.add(rectPolygonTwo);
        simplePolygons.add(rectPolygon3);
        simplePolygons.add(rectPolygon4);
        simplePolygons.add(rectPolygon5);
        simplePolygons.add(rectPolygon6);
        simplePolygons.add(rectPolygon7);
        simplePolygons.add(rectPolygon8);
        simplePolygons.add(rectPolygon9);


        rectPolygonOne.setInteriorColor(Color.RED);

        FrameDisplay frame = new FrameDisplay(frameWidth,frameHeight,lineArray);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        double xDirection = Math.random();
        double yDirection = Math.random();

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
                watchmanPoly.addVertex(new Point(watchman.smallestX(), watchman.smallestY()));
                watchmanPoly.addVertex(new Point(watchman.greatestX(), watchman.smallestY()));
                watchmanPoly.addVertex(new Point(watchman.greatestX(), watchman.greatestY()));
                watchmanPoly.addVertex(new Point(watchman.smallestX(), watchman.greatestY()));

                boolean intersection = Algorithms.isThereAnIntersection(watchmanPoly, poly);

                if (intersection) {
                    System.out.println(intersection);
                    xDirection = - Math.random();
                    yDirection = - Math.random();

                }
            }

            //Thread.sleep(1000 );
            Thread.sleep(3);
            frame.repaint();
        }

    }
}