
package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class AdminHome extends JPanel implements ActionListener{
    
    JPanel p1,p2,p3;
    JLabel l1,l2,l3;
    


    AdminHome(){
        
  
   setBackground(Color.white);
   setBounds(0, 0, 790, 560);
 
   
   setLayout(null);
   
    ImageIcon image=new ImageIcon("src\\picture\\b5.jpg");
    Image img=image.getImage();
    Image temp=img.getScaledInstance(790,300,Image.SCALE_SMOOTH);
    image=new ImageIcon(temp);
    l1=new JLabel("",image,JLabel.CENTER);
    l1.setBounds(0, 0, 790, 300);

    add(l1);
    
     p1=new JPanel();
     p1.setBackground(new Color(255,255,255,100));
     p1.setBounds(150, 350, 500, 150);
     add(p1);
     
     l3=new JLabel( "Welcome");
     l3.setForeground(Color.red);
     l3.setFont(new Font("Times new Rahman", Font.BOLD, 36));
     l3.setBackground(new Color(0,0,0,100));
     l3.setBounds(10, 25, 480, 40);
     p1.add(l3);
     
     
     
     l2=new JLabel( "You Have Suceesfuly Login");
     l2.setForeground(Color.red);
     l2.setFont(new Font("Times new Rahman", Font.BOLD, 36));
     l2.setBackground(new Color(0,0,0,100));
     l2.setBounds(10, 90, 480, 100);
     p1.add(l2);
     
     
     

        
        
        
    }

  
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {    
    new AdminHome().setVisible(true);    
    }    
}  
    
    



