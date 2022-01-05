/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


/**
 *
 * @author ASUS
 */
public class Welcomehome  extends JPanel implements ActionListener{
    JPanel p5,p2,p1,p3,p4;
    JLabel l1;
    
    Welcomehome(){
    
    
             setBackground(Color.WHITE);
             setBounds(0, 0, 800, 530);
             setLayout(null);
             setVisible(true);
            
            
            ImageIcon image=new ImageIcon("src\\picture\\u24.jpg");
            Image img=image.getImage();
            Image temp=img.getScaledInstance(800,400,Image.SCALE_SMOOTH);
            image=new ImageIcon(temp);
            l1=new JLabel("",image,JLabel.CENTER);
            l1.setBounds(0, 0, 800, 400);
            add(l1);
            
           
            
           
  
            
           
            
            JLabel l5= new JLabel("Jiangxi Normal University Library");
            l5.setBackground(Color.red);
            l5.setForeground(new Color(0, 0, 0));
            l5.setFont(new Font("Times New Rahman", Font.BOLD, 20));
            l5.setBounds(220, 410, 400, 30);
            add(l5);
            
                            JTextArea textArea = new JTextArea(
                    "As the public infrastructure of a well-known university in Jiangxi Province,"
                            + " the library of Jiangxi Normal University was initially established in1940, "
                            + "after that, the library has been renamed repeatedly with the development of the "
                            + "university. The university has been successively named as National Chung Cheng "
                            + "University, National Nan Chang University, Jiangxi Normal College, Jiangxi Normal "
                            + "University, the library name was renamed correspondingly, in 1983, the library was"
                            + " renamed as Library of Jiangxi Normal University."
                );
            textArea.setFont(new Font("Serif", Font.ITALIC, 16));
            textArea.setBackground(Color.WHITE);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setForeground(new Color(0, 0, 0));
            textArea.setFont(new Font("Times New Rahman",Font.PLAIN, 14));
            textArea.setBounds(20, 440, 700, 100);
            add(textArea);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
            new Welcomehome().setVisible(true);
	}
    
}
