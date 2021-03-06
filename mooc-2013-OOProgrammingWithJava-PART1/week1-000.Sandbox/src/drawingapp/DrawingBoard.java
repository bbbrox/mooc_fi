
package drawingapp;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawingBoard extends JPanel {

    private final Avatar avatar;

    public DrawingBoard(Avatar avatar) {
        super();
        super.setBackground(Color.WHITE);
        this.avatar = avatar;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics); 
        avatar.draw(graphics);
    }

}
