
package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class AdminHome3 extends JPanel implements ActionListener{
    
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4,l6,l7;
    


    AdminHome3(){
        
  
   setBackground(Color.white);
   setBounds(0, 0, 740, 560);
 
   
   setLayout(null);
   
    ImageIcon image=new ImageIcon("src\\picture\\s3.png");
    Image img=image.getImage();
    Image temp=img.getScaledInstance(120,120,Image.SCALE_SMOOTH);
    image=new ImageIcon(temp);
    l1=new JLabel("",image,JLabel.CENTER);
    l1.setBounds(80, 25, 120, 120);

    
     p1=new JPanel();
     p1.setBackground(new Color(18, 187, 243));
     p1.setBounds(0, 0, 750, 200);
     add(p1);
     p1.setLayout(null);
     p1.add(l1);
 
     
     l3=new JLabel( "Show");
     l3.setForeground(new Color(255,255,255));
     l3.setFont(new Font("Times new Rahman", Font.BOLD, 36));
     l3.setBackground(new Color(255,255,255));
     l3.setBounds(240, 70, 480, 40);
     p1.add(l3);
     
     
     p2=new JPanel();
     p2.setBackground(new Color(229, 231, 233));
     p2.setBounds(150, 280, 150, 150);
     add(p2);
     p2.setLayout(null);
     
     
     
        ImageIcon image1=new ImageIcon("src\\picture\\a16.png");
        Image img1=image1.getImage();
        Image temp1=img1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        image1=new ImageIcon(temp1);
        l4=new JLabel("",image1,JLabel.CENTER);
        l4.setBounds(25, 5, 100, 100);
        p2.add(l4);
     
    
     
      p3=new JPanel();
     p3.setBackground(new Color( 229, 231, 233));
     p3.setBounds(450, 280, 150, 150);
     add(p3);
     p3.setLayout(null);
     
     ImageIcon image2=new ImageIcon("src\\picture\\a17.png");
    Image img2=image2.getImage();
    Image temp2=img2.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image2=new ImageIcon(temp2);
    l6=new JLabel("",image2,JLabel.CENTER);
    l6.setBounds(25, 5, 100, 100);
    p3.add(l6);
     
     
     
     l2=new JLabel( "Authenticator");
     l2.setForeground(Color.black);
     l2.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l2.setBackground(new Color(0,0,0,100));
     l2.setBounds(15, 110, 130, 30);
     p2.add(l2);
     
     
      
     l7=new JLabel( "User");
     l7.setForeground(Color.black);
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
     
     
     

        
        
        
    }
    
    
    private void mouseCicked(MouseEvent evt) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
    
     private void MouseEntered(MouseEvent evt) {
         if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(189, 195, 199));
            
        }
         
          if (evt.getSource()==p3)
        {
            p3.setBackground(new Color(189, 195, 199));
            
        }
        
     }

       private void MouseExited(MouseEvent evt) {
           
            if (evt.getSource()==p3)
        {
            p3.setBackground(new Color(229, 231, 233));
            
        }
            
              if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(229, 231, 233 ));
            
        }
           
           
                
                 }

  
    public void actionPerformed(ActionEvent e) {
           }
    
    
    public static void main(String[] args) {    
    new AdminHome3().setVisible(true);    
    }    
}  
    
    


