
package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class AdminHome2 extends JPanel implements ActionListener{
    
    JPanel p1,p2,p3,p4,p5,p6,p7,p8;
    JLabel l1,l2,l3,l4,l6,l7,l8,l9,l10,l12,l11;
    


    AdminHome2(){
        
  
   setBackground(Color.white);
   setBounds(0, 0, 740, 560);
 
   
   setLayout(null);
   
    ImageIcon image=new ImageIcon("src\\picture\\h12.png");
    Image img=image.getImage();
    Image temp=img.getScaledInstance(50,50,Image.SCALE_SMOOTH);
    image=new ImageIcon(temp);
    l1=new JLabel("",image,JLabel.CENTER);
    l1.setBounds(0, 0, 50, 50);

    
     p1=new JPanel();
     p1.setBackground(new Color(215, 219, 221));
     p1.setBounds(0, 20, 750, 50);
     add(p1);
     p1.setLayout(null);
     p1.add(l1);
 
     
    
     
     p6=new JPanel();
     p6.setBackground(new Color(215, 219, 221));
     p6.setBounds(0, 290, 750, 50);
     add(p6);
     p6.setLayout(null);
     
     ImageIcon image4=new ImageIcon("src\\picture\\d3.png");
    Image img4=image4.getImage();
    Image temp4=img4.getScaledInstance(50,50,Image.SCALE_SMOOTH);
    image4=new ImageIcon(temp4);
    l8=new JLabel("",image4,JLabel.CENTER);
    l8.setBounds(0, 0, 50, 50);
    p6.add(l8);
     
    l7=new JLabel( "Delete User & Authenticator");
     l7.setForeground(new Color(0,0,51));
     l7.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l7.setBackground(new Color(255,255,255));
     l7.setBounds(60, 5, 480, 40);
     p6.add(l7);
     

 
     
     l3=new JLabel( "Update User & Authenticator");
     l3.setForeground(new Color(0,0,51));
     l3.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l3.setBackground(new Color(255,255,255));
     l3.setBounds(60, 5, 480, 40);
     p1.add(l3);
     
     
     p2=new JPanel();
     p2.setBackground(new Color(244, 208, 63));
     p2.setBounds(150, 90, 150, 150);
     add(p2);
     p2.setLayout(null);
     
        ImageIcon image1=new ImageIcon("src\\picture\\a15.png");
        Image img1=image1.getImage();
        Image temp1=img1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        image1=new ImageIcon(temp1);
        l4=new JLabel("",image1,JLabel.CENTER);
        l4.setBounds(25, 5, 100, 100);
        p2.add(l4);
        
     l2=new JLabel( "Authenticator");
     l2.setForeground(Color.white);
     l2.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l2.setBackground(new Color(0,0,0,100));
     l2.setBounds(15, 110, 130, 30);
     p2.add(l2);
     
    
     
      p3=new JPanel();
     p3.setBackground(new Color( 231, 76, 60));
     p3.setBounds(450, 90, 150, 150);
     add(p3);
     p3.setLayout(null);
     
     ImageIcon image2=new ImageIcon("src\\picture\\u13.png");
    Image img2=image2.getImage();
    Image temp2=img2.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image2=new ImageIcon(temp2);
    l6=new JLabel("",image2,JLabel.CENTER);
    l6.setBounds(25, 5, 100, 100);
    p3.add(l6);
     
     
     
     
     
      ImageIcon image5=new ImageIcon("src\\picture\\u13.png");
    Image img5=image5.getImage();
    Image temp5=img5.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image5=new ImageIcon(temp5);
    l9=new JLabel("",image5,JLabel.CENTER);
    l9.setBounds(25, 5, 100, 100);
    p3.add(l9);
    
    
     
     p4=new JPanel();
     p4.setBackground(new Color(41, 128, 185 ));
     p4.setBounds(150, 360, 150, 150);
     add(p4);
     p4.setLayout(null);
     
     
       
     p4.add(l9);
     
     l11=new JLabel( "Authenticator");
     l11.setForeground(Color.white);
     l11.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l11.setBackground(new Color(0,0,0,100));
     l11.setBounds(15, 110, 130, 30);
     p4.add(l11);
     
      ImageIcon image6=new ImageIcon("src\\picture\\u13.png");
    Image img6=image6.getImage();
    Image temp6=img6.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image6=new ImageIcon(temp6);
    l10=new JLabel("",image6,JLabel.CENTER);
    l10.setBounds(25, 5, 100, 100);
    p3.add(l10);
     
    
     
     p5=new JPanel();
     p5.setBackground(new Color(46, 204, 113));
     p5.setBounds(450, 360, 150, 150);
     add(p5);
     p5.setLayout(null);
     p5.add(l6);
     
     l12=new JLabel( "User");
     l12.setForeground(Color.white);
     l12.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l12.setBackground(new Color(0,0,0,100));
     l12.setBounds(52, 110, 130, 30);
     p5.add(l12);
     
     
     
      
     l7=new JLabel( "User");
     l7.setForeground(Color.white);
     l7.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l7.setBackground(new Color(0,0,0,100));
     l7.setBounds(52, 110, 130, 30);
     p3.add(l7);
     
      p2.addMouseListener(new MouseAdapter() {
          
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
         });
            
            
      p3.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
      

       
        });
      
      
       p4.addMouseListener(new MouseAdapter() {
          
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
         });
            
            
      p5.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
      

       
        });
     
     
     

        
        
        
    }
    
    
    private void mouseCicked(MouseEvent evt) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
    
     private void MouseEntered(MouseEvent evt) {
         if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(243, 156, 18));
            
        }
         
          if (evt.getSource()==p3)
        {
            p3.setBackground(new Color(192, 57, 43));
            
        }
          
           if (evt.getSource()==p4)
        {
            p4.setBackground(new Color(31, 97, 141));
            
        }
         
          if (evt.getSource()==p5)
        {
            p5.setBackground(new Color(30, 132, 73 ));
            
        }
        
     }

       private void MouseExited(MouseEvent evt) {
           
            if (evt.getSource()==p3)
        {
            p3.setBackground(new Color(231, 76, 60));
            
        }
            
              if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(244, 208, 63 ));
            
        }
              
              
           if (evt.getSource()==p4)
        {
            p4.setBackground(new Color(41, 128, 185));
            
        }
         
          if (evt.getSource()==p5)
        {
            p5.setBackground(new Color(46, 204, 113));
            
        }
           
           
                
                 }

  
    public void actionPerformed(ActionEvent e) {
           }
    
    
    public static void main(String[] args) {    
    new AdminHome2().setVisible(true);    
    }    
}  
    
    



