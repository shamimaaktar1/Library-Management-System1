
package liabrarymanagementsystem;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UpdatePublisher extends JPanel  implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JDateChooser dateChooser,dateChooser1;
    JPanel p1,p2,p3;
    JPasswordField pt1;
    JButton b2;
    
    
    String ID;
    
    
     public   UpdatePublisher() {
            
              setBounds(0, 0, 790, 570);
             
              setBackground(new Color(255,255,255));
              setLayout(null);


        
         
            ImageIcon image=new ImageIcon("src\\picture\\7.jpg");
            Image img=image.getImage();
            Image temp=img.getScaledInstance(400,560,Image.SCALE_SMOOTH);
            image=new ImageIcon(temp);
            l1=new JLabel("",image,JLabel.CENTER);
            l1.setBounds(0, 0, 400, 560);
          
          
          
            
           
            add(l1);
            
      
            p1= new JPanel();
            
            p1.setBackground(new Color(255,255,255));
            p1.setBounds(400,-30, 350, 550);
            p1.setLayout(null);
            
            
            add(p1);
            
            
            p3= new JPanel();
            
            p3.setBackground(new Color(0,0,0,80));
            p3.setBounds(20,50, 350, 100);
            p3.setLayout(null);
            //l1.add(p3);
             
             
            l11= new JLabel("UPDATE PUBLISHER");
            l11.setForeground(new Color(255,0 , 0));
            l11.setFont(new Font("", Font.BOLD, 30));
            l11.setBounds(5, 50, 340, 30);
            p1.add(l11);
            
           
            
            
           /* ImageIcon image1=new ImageIcon("src\\picture\\dlogo4.png");
            Image img1=image1.getImage();
            Image temp1=img1.getScaledInstance(60,60,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp1);
            
            l2=new JLabel("",image1,JLabel.CENTER);
            l2.setBounds(120, 30, 60, 60);
            p1.add(l2);
            
            */
            
           
            
            JLabel l10= new JLabel("Publisher ID");
            l10.setForeground(new Color(204, 51, 102));
            l10.setFont(new Font("", Font.BOLD, 14));
            l10.setBounds(20, 90, 290, 30);
            p1.add(l10);
            
            t6=new JTextField("");
            t6.setFont(new Font("Times New Roman",Font.BOLD,20));
            t6.setForeground(new Color(204, 51, 102));
            t6.setBounds(20,120,140,30);
            t6.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t6.setBackground(new Color(255,255,255));
            p1.add(t6); 
            
            b2=new JButton("Search");      
            b2.setFont(new Font("",Font.BOLD,20));
            b2.setForeground(Color.WHITE);
            b2.setBounds(170,120,140,30);
            b2.setBackground(new Color(255,0,0));
            p1.add(b2);
            b2.addActionListener(this);
            
            JLabel l11= new JLabel("UserID");
            l11.setForeground(new Color(204, 51, 102));
            l11.setFont(new Font("", Font.BOLD, 14));
            l11.setBounds(180, 90, 150, 30);
            //p1.add(l11);
            
            t7=new JTextField("");
            t7.setFont(new Font("Times New Roman",Font.BOLD,20));
            t7.setForeground(new Color(204, 51, 102));
            t7.setBounds(180,120,150,30);
            t7.setEditable(false);
            t7.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t7.setBackground(new Color(255,255,255));
            //p1.add(t7); 
            
          
            
            JLabel l3 = new JLabel("FastName");
            l3.setBackground(Color.red);
            l3.setForeground(new Color(204, 51, 102));
            l3.setFont(new Font("", Font.BOLD, 20));
            l3.setBounds(20, 150, 140, 30);
            
            p1.add(l3);
            
            t1=new JTextField("");
            t1.setFont(new Font("Times New Roman",Font.BOLD,20));
            t1.setForeground(new Color(204, 51, 102));
            t1.setBounds(20,180,140,30);
            t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t1.setBackground(new Color(255,255,255));
            p1.add(t1);  

            
            JLabel l4= new JLabel("LastName");
            l4.setForeground(new Color(204, 51, 102));
            l4.setFont(new Font("", Font.BOLD, 20));
            l4.setBounds(170, 150, 140, 30);
            p1.add(l4);
            
            t2=new JTextField("");
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
            t2.setForeground(new Color(204, 51, 102));
            t2.setBounds(170,180,140,30);
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t2.setBackground(new Color(255,255,255));
            p1.add(t2); 
            
            
            JLabel l5= new JLabel("Phone");
            l5.setForeground(new Color(204, 51, 102));
            l5.setFont(new Font("", Font.BOLD, 20));
            l5.setBounds(20, 220, 290, 30);
            p1.add(l5);
            
            t3=new JTextField("");
            t3.setFont(new Font("Times New Roman",Font.BOLD,20));
            t3.setForeground(new Color(204, 51, 102));
            t3.setBounds(20,250,290,30);
            t3.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t3.setBackground(new Color(255,255,255));
            p1.add(t3); 
            
           /* JLabel l6= new JLabel("Age");
            l6.setForeground(new Color(204, 51, 102));
            l6.setFont(new Font("", Font.BOLD, 20));
            l6.setBounds(20, 230, 350, 30);
            p1.add(l6);
            
            t4=new JTextField("");
            t4.setFont(new Font("Times New Roman",Font.BOLD,20));
            t4.setForeground(new Color(204, 51, 102));
            t4.setBounds(20,260,310,30);
            t4.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t4.setBackground(new Color(255,255,255));
            p1.add(t4); */
            
            JLabel l6= new JLabel("Date of Birth");
            l6.setForeground(new Color(204, 51, 102));
            l6.setFont(new Font("", Font.BOLD, 20));
            l6.setBounds(20, 300, 290, 30);
            p1.add(l6);
            
            dateChooser = new JDateChooser();
            dateChooser.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            dateChooser.setForeground(new Color(204, 51, 102));
            dateChooser.setBackground(new Color(255,255,255));
            dateChooser.setBounds(20,330,290,30);
            p1.add(dateChooser);
            
             JLabel l7= new JLabel("Address");
            l7.setForeground(new Color(204, 51, 102));
            l7.setFont(new Font("", Font.BOLD, 20));
            l7.setBounds(20, 370, 290, 30);
            p1.add(l7);
            
            t5=new JTextField("");
            t5.setFont(new Font("Times New Roman",Font.BOLD,20));
            t5.setForeground(new Color(204, 51, 102));
            t5.setBounds(20,400,290,30);
            t5.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t5.setBackground(new Color(255,255,255));
            p1.add(t5); 
            
         
            
            JLabel l8= new JLabel("Password");
            l8.setForeground(new Color(204, 51, 102));
            l8.setFont(new Font("", Font.BOLD, 20));
            l8.setBounds(20, 440, 290, 30);
            //p1.add(l8);
            
            
            pt1=new JPasswordField("");
            pt1.setFont(new Font("Times New Roman",Font.BOLD,20));
            pt1.setForeground(new Color(204, 51, 102));
            pt1.setBounds(20,470,290,30);
            pt1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            pt1.setBackground(new Color(255,255,255));
           // p1.add(pt1);  

           
            
             p2= new JPanel();
            
            p2.setBackground(Color.RED);
            
            p2.setBounds(90, 490, 150, 40);
            
            p1.add(p2);
            p2.setLayout(null);
            
            
            /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
            Image img2=image2.getImage();
            Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp2);*/
            
            l7=new JLabel("UPDATE");
            l7.setForeground(new Color(255, 255, 255));
            l7.setFont(new Font("", Font.BOLD, 24));
            l7.setBounds(20, 0, 150, 40);
            p2.add(l7);
            
            p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
                
            }
            
             public void mouseEntered(MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }

                
           
         
        });
            
           
            
    
        
        
    }
     
     private void mouseCicked(MouseEvent evt) { 
        
      if(evt.getSource()==p2)
     {
         String fname="";
         String lname="";
         String phone="";
         String dateofbirth="";
         String address="";
         String pub_id="";
         
         
         
        pub_id=t6.getText();
        fname = t1.getText();
        lname = t2.getText();
        phone = t3.getText();
        dateofbirth = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        address = t5.getText();
        
         if(pub_id.equals("")|fname.equals("")|lname.equals("")|phone.equals("")|dateofbirth.equals("")|address.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
         
        
       
             
             try {
               
            
             Conn c1 =new Conn();
                
                    ResultSet rs=c1.s.executeQuery("select * from publisher   where  pub_id ='"+pub_id+"' ");
                    
                     if(rs.next())
                    {
         
                   
          
                   

                            String q2="UPDATE publisher  set fname ='"+fname+"',lname='"+lname+"',phone='"+phone+"',dateofbirth='"+dateofbirth+"',address='"+address+"' where  pub_id ='"+pub_id+"' ";
                           c1.s.executeUpdate(q2); 
                           JOptionPane.showMessageDialog(null, "You have Successfully Update publisher");
                            t6.setText("");
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            ((JTextField) dateChooser.getDateEditor().getUiComponent()).setText("");
                            t5.setText("");



                    }
                    
            
              }
            
           
                
                 catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        
            } 
        
     }
      
      
      
      
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
        
         if(e.getSource()==b2)
        {
            ID=t6.getText();
            System.out.print(ID);
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from publisher where pub_id='"+ID+"' ");
            
          
            if(rs.next())
            {
         
     
         String fname=rs.getString("fname");
         String lname=rs.getString("lname");
         String phone=rs.getString("phone");
         String dateofbirth=rs.getString("dateofbirth");
         String address=rs.getString("address");
         
     
         t1.setText(fname);
         t2.setText(lname);
         t3.setText(phone);
         ((JTextField) dateChooser.getDateEditor().getUiComponent()).setText(dateofbirth);
         t5.setText(address);
     
       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  publisher does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
    }
    
     public static void main(String[] args) {
            new  UpdatePublisher().setVisible(true);
	}
    
}