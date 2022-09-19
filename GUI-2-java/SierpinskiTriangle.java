/*
Christopher Wischmann
CIT 130
July 23rd, 2022
Fractal Sierpiński triangle Graphical User Interface
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class SierpinskiTriangle extends JFrame implements ActionListener {
    public static final int VERTEX_1X = 50;
    public static final int VERTEX_1Y = 450;
    public static final int VERTEX_2X = 450;
    public static final int VERTEX_2Y = 450;
    public static final int VERTEX_3X = 250;
    public static final int VERTEX_3Y = 50;
    
    private JPanel panel;
    public static void main(String[] args) {
        SierpinskiTriangle SierpinskiTriangle = new SierpinskiTriangle();
        SierpinskiTriangle.setVisible(true);
    }
    
    public SierpinskiTriangle() {
        setTitle("Sierpinski Gasket");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,550);

        setLayout(new BorderLayout());
        panel = new JPanel();

        add(panel, "Center");
        panel.setSize(500, 500);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);
        add(buttonPanel, "South");
    }
    
    public void actionPerformed(ActionEvent e) {
        int midpointX = 0;
        int midpointY = 0;
        Random randomGenerator = new Random();
        int targetX = 0;
        int targetY = 0;
        int currentX = 50;
        int currentY = 450;
        
        for (int i = 0; i <= 50000; i++) {
            int r = randomGenerator.nextInt(3) + 1;
            
            switch (r) {
                case 1:
                targetX = VERTEX_1X;
                targetY = VERTEX_1Y;
                break;
                case 2:
                targetX = VERTEX_2X;
                targetY = VERTEX_2Y;
                break;
                case 3:
                targetX = VERTEX_3X;
                targetY = VERTEX_3Y;
                break;
            }
            
            midpointX = ((currentX + targetX) / 2);
            midpointY = ((currentY + targetY) / 2);
            draw(midpointX, midpointY);
            
            currentX = midpointX;
            currentY = midpointY;
        }
    }

public void draw(int x, int y) { 
    Graphics panelGraphics = panel.getGraphics();
    panelGraphics.setColor(Color.green);
    panelGraphics.drawLine(x, y, x, y);
 }
}
