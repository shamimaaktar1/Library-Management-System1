
package liabrarymanagementsystem;





import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.sql.*;
import java.io.*;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddAuthenticator extends Panel  implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JDateChooser dateChooser,dateChooser1;
    JTextField t1,t2;
    
    JPanel p1,p2;
    JPasswordField pt1;
    
   
    JComboBox cb;
    Integer id,c;
    String b;
    
    
    
    
     public  AddAuthenticator() {
      


        
            setBounds(0, 0, 750, 560);
            setBackground(new Color(224,224,224));
            setLayout(null);
          
          
            ImageIcon image=new ImageIcon("src\\picture\\36.jpg");
            Image img=image.getImage();
            Image temp=img.getScaledInstance(350,790,Image.SCALE_SMOOTH);
            image=new ImageIcon(temp);
            l1=new JLabel("",image,JLabel.CENTER);
            l1.setBounds(0, 0, 350, 790);
           // this.getContentPane().setBackground(Color.white);
          
          
            
           
            add(l1);
            
      
            p1= new JPanel();
            
            p1.setBackground(new Color(255,255,255));
            p1.setBounds(390,80, 320, 400);
            p1.setLayout(null);
            
            
            add(p1);
            
            
            ImageIcon image1=new ImageIcon("src\\picture\\add2.png");
            Image img1=image1.getImage();
            Image temp1=img1.getScaledInstance(100,100,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp1);
            
            l2=new JLabel("",image1,JLabel.CENTER);
            l2.setBounds(120, 0, 100, 100);
            p1.add(l2);
            
            p1.add(l2);
            
           // String type1 = cb.getSelectedItem().toString();
           
        
        
        try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select top 1 * from authenticator order by a_id  desc");
            
          
            if(rs.next())
            {
            String sum=rs.getString("a_id");
            id=Integer.valueOf(sum);
            id++;
            b = String.format("%04d", id).substring(0, 4);
             System.out.print(b); 
       
            }
            else
            {
              b = String.format("%04d", 1).substring(0, 4);
              System.out.print(b);  
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            
           
              
            
            JLabel l5= new JLabel("Authenticator ID");
            l5.setForeground(new Color(204, 51, 102));
            l5.setFont(new Font("", Font.BOLD, 20));
            l5.setBounds(20, 100, 360, 30);
            p1.add(l5);
            
            t2=new JTextField("");
            t2.setText(b);
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
            t2.setForeground(new Color(204, 51, 102));
            t2.setBounds(20,130,290,30);
            t2.setEditable(false);
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t2.setBackground(new Color(255,255,255));
            p1.add(t2); 
            
            /*t2=new JTextField("");
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
            t2.setForeground(new Color(204, 51, 102));
            t2.setBounds(20,260,310,30);
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t2.setBackground(new Color(255,255,255));
            p1.add(t2);*/ 
            
             JLabel l7= new JLabel("Type");
            l7.setForeground(new Color(204, 51, 102));
            l7.setFont(new Font("", Font.BOLD, 20));
            l7.setBounds(20, 170, 350, 30);
            p1.add(l7);
            
             String type[]={"Admin","Librarian","Member"};        
             cb=new JComboBox(type);    
             cb.setBounds(20,210,290,30); 
             cb.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
             cb.setBackground(new Color(255,255,255));
             p1.add(cb);       
          
            
            
            p2= new JPanel();
            
            p2.setBackground(Color.red);
            
            p2.setBounds(100, 290, 150, 50);
            
            p1.add(p2);
            p2.setLayout(null);
            
            
            /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
            Image img2=image2.getImage();
            Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp2);*/
            
            l7=new JLabel("ADD");
            l7.setForeground(new Color(255, 255, 255));
            l7.setFont(new Font("", Font.BOLD, 24));
            l7.setBounds(40, 0, 150, 50);
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
         
         String type="" ;
         String ID="";
                 
         type = cb.getSelectedItem().toString();
         ID=t2.getText();
        
        
      if(evt.getSource()==p2)
     {
        
 
          if(ID.equals("")|type.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
              
            try {
          
           
            Conn c1 =new Conn();
           
            
             String q1="insert into authenticator values( '"+b+"','"+type+"')";
             c1.s.executeUpdate(q1); 
             JOptionPane.showMessageDialog(null, "You have Successfully add number "+b+" authenticator");
             t2.setText("");
             
             c=Integer.parseInt(ID);  
             System.out.println(c);
             System.out.println(ID);
             c=c+1;
          
            b = String.format("%04d", c).substring(0, 4);
             System.out.println(b);
             
             t2.setText(String.valueOf(b));
            
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
        
      
        
            
    }
    
  public static void main(String[] args) {    
    new  AddAuthenticator().setVisible(true);
   
    }    
    
    
}