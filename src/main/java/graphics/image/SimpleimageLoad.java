package graphics.image;

import graphics.buttons.ButtonDemo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class SimpleimageLoad extends Frame {
    Image img;

    public SimpleimageLoad() {
        try {
            File imageFile = new File("src/main/java/graphics/image/Lilies.jpg");
            // загрузить изображение
            img = ImageIO.read(imageFile);
        } catch (IOException ехс) {
            System.out.println("Cannot load image file.");
            System.exit(0);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics graphics) {
        graphics.drawImage(img, getInsets().left, getInsets().top, null);
    }

    public static void main(String[] args) {
        SimpleimageLoad appwin = new SimpleimageLoad();
        appwin.setSize(new Dimension(400, 200));
        appwin.setTitle("SimpleimageLoad");
        appwin.setVisible(true);
    }
}
