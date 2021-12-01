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

        int frameWidth = 500;
        int frameHeight = 500;

        int pointNumber = 10;
        Line [] lineArray = new Line[pointNumber];

        Random rnd = new Random();
        double a, b, c;

        for (int i =0;i <pointNumber; i++){
            a = 1 + rnd.nextInt(5);
            b = 1 + rnd.nextInt(5);
            c = -(100 + rnd.nextInt(400));

            lineArray[i] = new Line(a,b,c);
            lineArray[i].setBoundaryColor(Color.blue);

        }

        FrameDisplay frame = new FrameDisplay(frameWidth,frameHeight,lineArray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}