
package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class LibrarianHome2 extends JPanel implements ActionListener{
    
   JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    JLabel l1,l2,l3,l4,l6,l7,l8,l9,l10,l12,l11,l13,l14,l15,l16,l17,l18,l19,l20;
    


    LibrarianHome2(){
        
  
   setBackground(Color.white);
   setBounds(0, 0, 740, 560);
 
   
   setLayout(null);
   
    ImageIcon image=new ImageIcon("src\\picture\\e5.png");
    Image img=image.getImage();
    Image temp=img.getScaledInstance(50,50,Image.SCALE_SMOOTH);
    image=new ImageIcon(temp);
    l1=new JLabel("",image,JLabel.CENTER);
    l1.setBounds(10, 0, 50, 50);

    
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
     
    l7=new JLabel( "Delete Book,Membership,Category & Publisher");
     l7.setForeground(new Color(0,0,51));
     l7.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l7.setBackground(new Color(255,255,255));
     l7.setBounds(60, 5, 480, 40);
     p6.add(l7);
     

 
     
     l3=new JLabel( "Update Book,Membership,Category & Publisher");
     l3.setForeground(new Color(0,0,51));
     l3.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l3.setBackground(new Color(255,255,255));
     l3.setBounds(70, 5, 480, 40);
     p1.add(l3);
     
     
     p2=new JPanel();
     p2.setBackground(new Color(244, 208, 63));
     p2.setBounds(30, 90, 150, 150);
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
     p3.setBounds(190, 90, 150, 150);
     add(p3);
     p3.setLayout(null);
     
     ImageIcon image2=new ImageIcon("src\\picture\\m2.png");
    Image img2=image2.getImage();
    Image temp2=img2.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    image2=new ImageIcon(temp2);
    l6=new JLabel("",image2,JLabel.CENTER);
    l6.setBounds(25, 5, 100, 100);
    p3.add(l6);
     
     
     
     
     
      
    
    
     
     p4=new JPanel();
     p4.setBackground(new Color(41, 128, 185 ));
     p4.setBounds(350, 90, 150, 150);
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
     p5.setBounds(510, 90, 150, 150);
     add(p5);
     p5.setLayout(null);
     p5.add(l10);
     
     l12=new JLabel( "Publisher");
     l12.setForeground(Color.white);
     l12.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l12.setBackground(new Color(0,0,0,100));
     l12.setBounds(30, 110, 130, 30);
     p5.add(l12);
     
     
     
      
     l7=new JLabel( "Membership");
     l7.setForeground(Color.white);
     l7.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l7.setBackground(new Color(0,0,0,100));
     l7.setBounds(15, 110, 130, 30);
     p3.add(l7);
     
     p7=new JPanel();
     p7.setBackground(new Color(244, 208, 63));
     p7.setBounds(30, 360, 150, 150);
     add(p7);
     p7.setLayout(null);
    // p7.add(l1);
     

        l13=new JLabel("",image1,JLabel.CENTER);
        l13.setBounds(25, 5, 100, 100);
        p7.add(l13);
        
     l14=new JLabel( "Book");
     l14.setForeground(Color.white);
     l14.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l14.setBackground(new Color(0,0,0,100));
     l14.setBounds(15, 110, 130, 30);
     p7.add(l14);
     
     
     p8=new JPanel();
     p8.setBackground(new Color( 231, 76, 60));
     p8.setBounds(190, 360, 150, 150);
     add(p8);
     p8.setLayout(null);
     //p1.add(l1);
     

    l15=new JLabel("",image2,JLabel.CENTER);
    l15.setBounds(25, 5, 100, 100);
    p8.add(l15);
    
    l16=new JLabel( "Membership");
     l16.setForeground(Color.white);
     l16.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l16.setBackground(new Color(0,0,0,100));
     l16.setBounds(35, 110, 130, 30);
     p8.add(l16);
    
      p9=new JPanel();
     p9.setBackground(new Color(41, 128, 185 ));
     p9.setBounds(350, 360, 150, 150);
     add(p9);
     p9.setLayout(null);
     
 
    l17=new JLabel("",image5,JLabel.CENTER);
    l17.setBounds(25, 5, 100, 100);
    p9.add(l17);
    
       l18=new JLabel( "Category");
     l18.setForeground(Color.white);
     l18.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l18.setBackground(new Color(0,0,0,100));
     l18.setBounds(35, 110, 130, 30);
     p9.add(l18);
    
     
     p10=new JPanel();
     p10.setBackground(new Color(46, 204, 113));
     p10.setBounds(510, 360, 150, 150);
     add(p10);
     p5.setLayout(null);
     //p5.add(l10);
     
    
    l19=new JLabel("",image6,JLabel.CENTER);
    l19.setBounds(25, 5, 100, 100);
    p10.add(l19);
    
     l20=new JLabel( "Publisher");
     l20.setForeground(Color.white);
     l20.setFont(new Font("Times new Rahman", Font.BOLD, 18));
     l20.setBackground(new Color(0,0,0,100));
     l20.setBounds(25, 110, 130, 30);
     p10.add(l20);
     
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
      
       p7.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
      

       
        });
       
        p8.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
      

       
        });
        
         p9.addMouseListener(new MouseAdapter() {
        
            public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
      

       
        });
         
         
          p10.addMouseListener(new MouseAdapter() {
        
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
          
          if (evt.getSource()==p7)
        {
            p7.setBackground(new Color(243, 156, 18));
            
        }
         
          if (evt.getSource()==p8)
        {
            p8.setBackground(new Color(192, 57, 43));
            
        }
          
           if (evt.getSource()==p9)
        {
            p9.setBackground(new Color(31, 97, 141));
            
        }
         
          if (evt.getSource()==p10)
        {
            p10.setBackground(new Color(30, 132, 73 ));
            
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
          
          
           
              if (evt.getSource()==p7)
        {
            p7.setBackground(new Color(244, 208, 63 ));
            
        }
              
                   if (evt.getSource()==p8)
        {
            p8.setBackground(new Color(231, 76, 60));
            
        }
              
              
           if (evt.getSource()==p9)
        {
            p9.setBackground(new Color(41, 128, 185));
            
        }
         
          if (evt.getSource()==p10)
        {
            p10.setBackground(new Color(46, 204, 113));
            
        }
           
          
          
           
                
                 }

  
    public void actionPerformed(ActionEvent e) {
           }
    
    
    public static void main(String[] args) {    
    new LibrarianHome2().setVisible(true);    
    }    
}  
    
    



