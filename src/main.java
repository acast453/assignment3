import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class main {

    public static void main(String[] args)
    {
        new main();
    }


    public main(){
        // Frame Size

        int frameWidth = 430;
        int frameHeight = 410;

        int pointNumber = 10;
        LineSegment [] obj = new LineSegment[pointNumber];

        GeometricObject [] lineArray = obj;

        Random rnd = new Random();
        double x,y;

        for (int i =0;i <pointNumber; i++){
            x = rnd.nextInt(frameWidth);
            y = rnd.nextInt(frameHeight);
            Point begin = new Point(x,y);


            x = rnd.nextInt(frameWidth);
            y = rnd.nextInt(frameHeight);
            Point end = new Point(x,y);


            lineArray[i] = new LineSegment(begin, end);
            lineArray[i].setBoundaryColor(Color.blue);

        }

        FrameDisplay frame = new FrameDisplay(frameWidth,frameHeight,lineArray);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}