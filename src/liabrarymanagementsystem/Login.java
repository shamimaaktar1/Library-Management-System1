/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liabrarymanagementsystem;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login extends JPanel implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2;
    
    JPanel p1,p2;
    JPasswordField pt1;
    
    //WelCome   WelCome = new  WelCome ();
    // Admin Admin= new Admin();
    
    
    
    
    public Login() {
        
        
	     setBackground(Color.WHITE);
             setBounds(0, 0, 800, 590);
             setLayout(null);
            
            
            ImageIcon image=new ImageIcon("src\\picture\\17.jpg");
            Image img=image.getImage();
            Image temp=img.getScaledInstance(400,820,Image.SCALE_SMOOTH);
            image=new ImageIcon(temp);
            l1=new JLabel("",image,JLabel.CENTER);
            l1.setBounds(0, 0, 400, 820);
           // this.getContentPane().setBackground(Color.white);
          
          
            
           
            add(l1);
            
            
            JLabel l2 = new JLabel("Library Management System");
            l2.setBackground(Color.red);
            l2.setForeground(new Color(204, 51, 102));
            l2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 24));
            l2.setBounds(30, 30, 350, 30);
            
            l1.add(l2);
            
          
            
           JLabel l3 = new JLabel("圖書館管理系統");
            l3.setBackground(Color.red);
            l3.setForeground(new Color(204, 51, 102));
            l3.setFont(new Font("", Font.BOLD, 24));
            l3.setBounds(80, 65, 350, 30);
            
            l1.add(l2);
            l1.add(l3);
            
            
            
              
            p1= new JPanel();
            
            p1.setBackground(new Color(255,255,255));
            p1.setBounds(444,100, 300, 350);
            p1.setLayout(null);
            add(p1);
            
           
            
            ImageIcon image1=new ImageIcon("src\\picture\\log2.png");
            Image img1=image1.getImage();
            Image temp1=img1.getScaledInstance(120,70,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp1);
            
            l4=new JLabel("",image1,JLabel.CENTER);
            l4.setBounds(90, 20, 120, 70);
            p1.add(l4);
            
            
            JLabel l5 = new JLabel("UserID");
            l5.setForeground(new Color(204, 51, 102));
            l5.setFont(new Font("", Font.BOLD, 24));
            l5.setBounds(20, 110, 350, 30);
            p1.add(l5);
            
            t1=new JTextField("");
            t1.setFont(new Font("Times New Roman",Font.BOLD,20));
            t1.setForeground(new Color(204, 51, 102));
            t1.setBounds(20,140,260,30);
            t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t1.setBackground(new Color(255,255,255));
            p1.add(t1);  
            
            JLabel l6 = new JLabel("Password");
            l6.setForeground(new Color(204, 51, 102));
            l6.setFont(new Font("", Font.BOLD, 24));
            l6.setBounds(20, 180, 350, 30);
            p1.add(l6);
            
            pt1=new JPasswordField("");
            pt1.setFont(new Font("Times New Roman",Font.BOLD,20));
            pt1.setForeground(new Color(204, 51, 102));
            pt1.setBounds(20,210,260,30);
           pt1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
           pt1.setBackground(new Color(255,255,255));
            p1.add(pt1);  

            
            
            p2= new JPanel();
            
            p2.setBackground(Color.RED);
            
            p2.setBounds(65, 260, 150, 50);
            
            p1.add(p2);
            p2.setLayout(null);
            
            
            /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
            Image img2=image2.getImage();
            Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp2);*/
            
            l7=new JLabel("LOGIN");
            l7.setForeground(new Color(255, 255, 255));
            l7.setFont(new Font("", Font.BOLD, 24));
            l7.setBounds(35, 0, 150, 50);
            p2.add(l7);
            
            p2.addMouseListener(new MouseAdapter() {
       
             public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }

        

                
           
         
        });
            
            
            
           
           
            
    }
    
   
      
     
      private void MouseEntered(MouseEvent evt) {
          
          if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(0,204,0));
            
        }
                    
      }

       private void MouseExited(MouseEvent evt) {
           p2.setBackground(Color.red);
                  
       }
  
    
    
    
  
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public static void main(String[] args) {
            new Login().setVisible(true);
	}
    
}


