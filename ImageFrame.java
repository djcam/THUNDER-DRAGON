import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ImageFrame extends Panel {

    private BufferedImage  image;
        
    public ImageFrame(String filename) {
        try {
            File input = new File(filename);
            image = ImageIO.read(input);
        } 
        catch (IOException ie) {
            System.out.println("Error:"+ie.getMessage());
        }
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

}
