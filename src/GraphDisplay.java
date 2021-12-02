
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
        Dimension d = new Dimension(width, height);
        setPreferredSize(d);

        try
        {
            image = ImageIO.read(new File("fiumap.png"));
        }
        catch (IOException ex)
        {
            System.out.println("Image file not found!");
        }






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
