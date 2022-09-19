
/*
Christopher Wischmann
CIT 130
July 23rd, 2022
Calculator Graphical User Interface
*/

import javax.swing.*;
import java.awt.event.*;


class Calculator implements ActionListener {
    JFrame framenew;
    JTextField tf;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,button_div,button_mul,button_sub,button_add,button_decrement,button_equal,button_clear;
    static double one=0,two=0,output=0;
    static int midop=0;
    
    Calculator() {
        framenew=new JFrame("Calc.");
        tf=new JTextField();
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button0=new JButton("0");
        button_div=new JButton("/");
        button_mul=new JButton("*");
        button_sub=new JButton("-");
        button_add=new JButton("+");
        button_decrement=new JButton(".");
        button_equal=new JButton("=");
        button_clear=new JButton("C");
        tf.setBounds(30,40,280,30);
        button7.setBounds(40,100,48,40);
        button8.setBounds(110,100,48,40);
        button9.setBounds(180,100,48,40);
        button_div.setBounds(250,100,48,40);
        button4.setBounds(40,170,48,40);
        button5.setBounds(110,170,48,40);
        button6.setBounds(180,170,48,40);
        button_mul.setBounds(250,170,48,40);
        
        button1.setBounds(40,240,48,40);
        button2.setBounds(110,240,48,40);
        button3.setBounds(180,240,48,40);
        button_sub.setBounds(250,240,48,40);
        
        button_decrement.setBounds(40,310,48,40);
        button0.setBounds(110,310,48,40);
        button_equal.setBounds(180,310,48,40);
        button_add.setBounds(250,310,48,40);
        button_clear.setBounds(40,397,250,40);
        framenew.add(tf);
        framenew.add(button7);
        framenew.add(button8);
        framenew.add(button9);
        framenew.add(button_div);
        framenew.add(button4);
        framenew.add(button5);
        framenew.add(button6);
        framenew.add(button_mul);
        framenew.add(button1);
        framenew.add(button2);
        framenew.add(button3);
        framenew.add(button_sub);
        framenew.add(button_decrement);
        framenew.add(button0);
        framenew.add(button_equal);
        framenew.add(button_add);
        framenew.add(button_clear);
        
        framenew.setLayout(null);
        framenew.setVisible(true);
        framenew.setSize(350,500);
        framenew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framenew.setResizable(false);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        button_add.addActionListener(this);
        button_div.addActionListener(this);
        button_mul.addActionListener(this);
        button_sub.addActionListener(this);
        button_decrement.addActionListener(this);
        button_equal.addActionListener(this);
        
        button_clear.addActionListener(this);
    }


    public void actionPerformed(ActionEvent event) {
    if(event.getSource()==button1)
    tf.setText(tf.getText().concat("1"));
    
    if(event.getSource()==button2)
    tf.setText(tf.getText().concat("2"));
    
    if(event.getSource()==button3)
    tf.setText(tf.getText().concat("3"));
    
    if(event.getSource()==button4)
    tf.setText(tf.getText().concat("4"));
    
    if(event.getSource()==button5)
    tf.setText(tf.getText().concat("5"));
    
    if(event.getSource()==button6)
    tf.setText(tf.getText().concat("6"));
    
    if(event.getSource()==button7)
    tf.setText(tf.getText().concat("7"));
    
    if(event.getSource()==button8)
    tf.setText(tf.getText().concat("8"));
    
    if(event.getSource()==button9)
    tf.setText(tf.getText().concat("9"));
    
    if(event.getSource()==button0)
    tf.setText(tf.getText().concat("0"));
    
    if(event.getSource()==button_decrement)
    tf.setText(tf.getText().concat("."));
    
    if(event.getSource()==button_add) {
        one=Double.parseDouble(tf.getText());
        midop=1;
        tf.setText("");
    } 
    
    if(event.getSource()==button_sub) {
        one=Double.parseDouble(tf.getText());
        midop=2;
        tf.setText("");
    }
    
    if(event.getSource()==button_mul) {
        one=Double.parseDouble(tf.getText());
        midop=3;
        tf.setText("");
    }
    
    if(event.getSource()==button_div) {
        one=Double.parseDouble(tf.getText());
        midop=4;
        tf.setText("");
    }
    
    if(event.getSource()==button_equal) {
        two=Double.parseDouble(tf.getText());
        switch(midop){
            case 1: output=one+two;
            break;
            
            case 2: output=one-two;
            break;
            
            case 3: output=one*two;
            break;
            
            case 4: output=one/two;
            break;
            
            default: output=0;
        }
        
        tf.setText(""+output);
    }
    
    if(event.getSource()==button_clear)
    tf.setText("");
}
public static void main(String...s) {
    new Calculator();
 }
}