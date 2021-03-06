/**
 * Author Name: Anthony Castillo
 * Panther ID: 5910063
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphDisplay extends JPanel
{
    GeometricObject[] gArray; //geometric objects
    private BufferedImage image;
    /**
     * Parameterized constructor.
     */
    public GraphDisplay(int width, int height, GeometricObject[] g)
    {
        this.gArray = g;

        //setBackground(Color.white);
        try
        {
            image = ImageIO.read(new File("src/floorplans.PNG"));
        }
        catch (IOException ex)
        {
            System.out.println("Image file not found!");
        }


        setBackground(Color.white);
        Dimension d = new Dimension(width, height);
        setPreferredSize(d);



    }

    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
    @Override
    public void paint(Graphics g)
    {
        super.paint(g); //clears window

        //draws geometric objects

        Dimension d = getSize();

        g.drawImage(image, 0, 0, d.width, d.height, this);

        for (GeometricObject e:gArray)
        {
            e.draw(g); //invokes object's draw method through polymorphism
        }

    }
}