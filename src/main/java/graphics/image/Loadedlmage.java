package graphics.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class Loadedlmage extends Canvas {
    static Image img;



    public Loadedlmage(Image image) {
        set(image);
    }

    public void painImNow() {

        try {
            File imageFile = new File("src/main/java/graphics/image/photo1685393369.jpeg");
            //загрузить изображение
            img = ImageIO.read(imageFile);
            set(img);

        } catch (IOException ехс) {
            System.out.println("Cannot load irnage file.");
            System.exit(0);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    void set(Image i) {
        img = i;
        repaint();
    }

    public void paint(Graphics g) {
        if (img == null) {
            g.drawString("no image", 10, 30);
        } else {
            g.drawImage(img, 0, 0, this);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(img.getWidth(this),
                img.getHeight(this));
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }



    public static void main(String[] args) {
        Loadedlmage appwin = new Loadedlmage(img);
        appwin.setSize(new Dimension(400, 380));
        appwin.setVisible(true);

    }
}
