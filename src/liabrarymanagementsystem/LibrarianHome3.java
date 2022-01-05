
package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class LibrarianHome3 extends JPanel implements ActionListener{
    
    JPanel p1,p2,p3,p4,p5,p6,p7;
    JLabel l1,l2,l3,l4,l6,l7,l8,l9,l10,l11,l12;
    


    LibrarianHome3(){
        
  
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
     p2.setBackground(new Color(244, 208, 63));
     p2.setBounds(30, 280, 150, 150);
     add(p2);
     p2.setLayout(null);
     
        ImageIcon image1=new ImageIcon("src\\picture\\bk1.png");
        Image img1=image1.getImage();
        Image temp1=img1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        image1=new ImageIcon(temp1);
        l4=new JLabel("",image1,JLabel.CENTER);
        l4.setBounds(25, 5, 100, 100);
        p2.add(l4);
        
     l2=new JLabel( "Book");
     l2.setForeground(Color.white);
     l2.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l2.setBackground(new Color(0,0,0,100));
     l2.setBounds(15, 110, 130, 30);
     p2.add(l2);
     
    
     
      p3=new JPanel();
     p3.setBackground(new Color( 231, 76, 60));
     p3.setBounds(190, 280, 150, 150);
     add(p3);
     p3.setLayout(null);
     
     ImageIcon image2=new ImageIcon("src\\picture\\m2.png");
    Image img2=image2.getImage();
    Image temp2=img2.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image2=new ImageIcon(temp2);
    l6=new JLabel("",image2,JLabel.CENTER);
    l6.setBounds(25, 5, 100, 100);
    p3.add(l6);
    
    l7=new JLabel( "Membership");
     l7.setForeground(Color.white);
     l7.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l7.setBackground(new Color(0,0,0,100));
     l7.setBounds(15, 110, 130, 30);
     p3.add(l7);
     
     

    
    
     
     p4=new JPanel();
     p4.setBackground(new Color(41, 128, 185 ));
     p4.setBounds(350, 280, 150, 150);
     add(p4);
     p4.setLayout(null);
     
     
    
     
           ImageIcon image5=new ImageIcon("src\\picture\\c1.png");
    Image img5=image5.getImage();
    Image temp5=img5.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image5=new ImageIcon(temp5);
    l9=new JLabel("",image5,JLabel.CENTER);
    l9.setBounds(25, 5, 100, 100);
    p4.add(l9);
     
     l11=new JLabel( "Category");
     l11.setForeground(Color.white);
     l11.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l11.setBackground(new Color(0,0,0,100));
     l11.setBounds(35, 110, 130, 30);
     p4.add(l11);
     
     
     ImageIcon image6=new ImageIcon("src\\picture\\p1.png");
    Image img6=image6.getImage();
    Image temp6=img6.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image6=new ImageIcon(temp6);
    l10=new JLabel("",image6,JLabel.CENTER);
    l10.setBounds(25, 5, 100, 100);
  
     
    
     
     p5=new JPanel();
     p5.setBackground(new Color(46, 204, 113));
     p5.setBounds(510, 280, 150, 150);
     add(p5);
     p5.setLayout(null);
     p5.add(l10);
     
     l12=new JLabel( "Publisher");
     l12.setForeground(Color.white);
     l12.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l12.setBackground(new Color(0,0,0,100));
     l12.setBounds(30, 110, 130, 30);
     p5.add(l12);
     
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
           
           
              if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(244, 208, 63 ));
            
        }
              
                   if (evt.getSource()==p3)
        {
            p3.setBackground(new Color(231, 76, 60));
            
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
    new LibrarianHome3().setVisible(true);    
    }    
}  
    
    



