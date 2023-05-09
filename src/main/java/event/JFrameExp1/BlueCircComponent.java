package event.JFrameExp1;

import java.awt.*;

public class BlueCircComponent extends Component {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 400);
    }
     public void paint(Graphics graphics){
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,getWidth(),getHeight());
        graphics.setColor(Color.blue);
        graphics.fillOval(0,0,getWidth(),getHeight());
     }
}
