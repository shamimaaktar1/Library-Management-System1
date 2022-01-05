
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
public class AddPublisher extends JPanel  implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JDateChooser dateChooser,dateChooser1;
    JPanel p1,p2,p3;
    JPasswordField pt1;
    Integer id,c;
    
    String b;
    
    
    
    
    
     public  AddPublisher () {
            
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
            
             p3= new JPanel();
            
            p3.setBackground(new Color(0,0,0,80));
            p3.setBounds(20,50, 350, 100);
            p3.setLayout(null);
             l1.add(p3);
             
             
            l11= new JLabel("ADD PUBLISHER");
            l11.setForeground(new Color(255,0 , 0));
            l11.setFont(new Font("", Font.BOLD, 30));
            l11.setBounds(20, 30, 340, 30);
            p3.add(l11);
            
      
            p1= new JPanel();
            
            p1.setBackground(new Color(255,255,255));
            p1.setBounds(415,-30, 350, 550);
            p1.setLayout(null);
            
            
            add(p1);
            
            
            ImageIcon image1=new ImageIcon("src\\picture\\add2.png");
            Image img1=image1.getImage();
            Image temp1=img1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp1);
            
            l2=new JLabel("",image1,JLabel.CENTER);
            l2.setBounds(120, 20, 80, 80);
            p1.add(l2);
            
            
   
            
            p1.add(l2);
            
             try {
          
            Conn c1 =new Conn();
            
           
            ResultSet rs=c1.s.executeQuery("select top 1 * from publisher order by pub_id desc  ");
            
          
            if(rs.next())
            {
            String sum=rs.getString("pub_id");
            id=Integer.valueOf(sum); 
            id++;
            
            b= String.format("%04d", id).substring(0, 4);
            System.out.println(id);
            
            System.out.println(id);
           
            }
            else
            {
                id=1;
               b= String.format("%04d", id).substring(0, 4);
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            
            
           
            
            JLabel l10= new JLabel("Publisher  ID");
            l10.setForeground(new Color(204, 51, 102));
            
            l10.setFont(new Font("", Font.BOLD, 14));
            l10.setBounds(20, 90, 310, 30);
            p1.add(l10);
            
            t6=new JTextField("");
            t6.setFont(new Font("Times New Roman",Font.BOLD,20));
            t6.setForeground(new Color(204, 51, 102));
            t6.setBounds(20,120,290,30);
            t6.setEditable(false);
            t6.setText(String.valueOf(b));
            t6.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t6.setBackground(new Color(255,255,255));
            p1.add(t6); 
            
            JLabel l11= new JLabel("UserID");
            l11.setForeground(new Color(204, 51, 102));
            l11.setFont(new Font("", Font.BOLD, 14));
            l11.setBounds(180, 90, 150, 30);
           // p1.add(l11);
            
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
            l3.setBounds(20, 150, 150, 30);
            
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
            l5.setBounds(20, 220, 360, 30);
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
            l6.setBounds(20, 300, 350, 30);
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
            l7.setBounds(20, 370, 300, 30);
            p1.add(l7);
            
            t5=new JTextField("");
            t5.setFont(new Font("Times New Roman",Font.BOLD,20));
            t5.setForeground(new Color(204, 51, 102));
            t5.setBounds(20,400,290,30);
            t5.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t5.setBackground(new Color(255,255,255));
            p1.add(t5); 
            
           

           
            
             p2= new JPanel();
            
            p2.setBackground(Color.RED);
            
            p2.setBounds(90, 490, 150, 40);
            
            p1.add(p2);
            p2.setLayout(null);
            
            
            /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
            Image img2=image2.getImage();
            Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp2);*/
            
            l7=new JLabel("ADD");
            l7.setForeground(new Color(255, 255, 255));
            l7.setFont(new Font("", Font.BOLD, 24));
            l7.setBounds(50, 0, 150, 40);
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
         String ID="";
         String fname="";
         String lname="";
         String phone="";
         String dateofbirth="";
         String address="";
         
         ID=t6.getText();
         fname=t1.getText();
         lname=t2.getText();
         phone=t3.getText();
         dateofbirth=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         address=t5.getText();
        
        
      if(evt.getSource()==p2)
     {
        
 
          if(ID.equals("")|fname.equals("")|lname.equals("")|phone.equals("")|dateofbirth.equals("")|address.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
         
        
         try {
          
             
            
          
            Conn c1 =new Conn();
            
            ResultSet r1=c1.s.executeQuery("select pub_id from publisher where pub_id = '"+ID+"' ");
            
          
            if(r1.next())
            {
              JOptionPane.showMessageDialog(null, "the publisher all ready have");  
                
            }
            else{
             
            
             String q1="insert into publisher values( '"+ID+"','"+fname+"','"+lname+"','"+phone+"','"+dateofbirth+"','"+address+"')";
             c1.s.executeUpdate(q1); 
             JOptionPane.showMessageDialog(null, "You have Successfully add number "+ID+" Publisher");
             
             
           
          t1.setText("");
          t2.setText("");
           t3.setText("");
          ((JTextField) dateChooser.getDateEditor().getUiComponent()).setText("");
          t5.setText("");
             
             
             
             c=Integer.parseInt(ID);  
             System.out.println(c);
             System.out.println(ID);
             c=c+1;
          
            b = String.format("%04d", c).substring(0, 4);
             System.out.println(b);
             
             t6.setText(String.valueOf(b));
            }
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            
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
    }
    
     public static void main(String[] args) {
            new AddPublisher().setVisible(true);
	}
    
}