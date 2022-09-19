/*
Christopher Wischmann
CIT 130
July 23rd, 2022
Smiley Face/Frowny Face Graphical User Interface
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Color;

public class SmileFace extends JFrame implements ActionListener {
    JButton change = new JButton("Smiley");
    JPanel panel = new JPanel();
    
    int i = 0;
    
    public SmileFace() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.WHITE);
        panel.add(change);
        change.addActionListener(this); 
    }
    public void paint(Graphics draw1) {
        super.paint(draw1);
        Graphics2D draw = (Graphics2D) draw1;
        draw.drawOval(50, 170, 70, 70); 
        draw.fillOval(73, 185, 3, 5); 
        draw.fillOval(93, 185, 3, 5); 

        if (i % 2 == 0) {
            draw.drawArc(48, 200, 75, 75, 30, 120); 

        }
        else {
            draw.drawArc(48, 150, 75, 75, 210, 120); 
        }
    }

    public void actionPerformed(ActionEvent arg0) {
        i++; 
        repaint(); 
    }
    public static void main(String[] args) {
        SmileFace window = new SmileFace();
        window.setVisible(true);
        window.setSize(300, 300);
    }
}