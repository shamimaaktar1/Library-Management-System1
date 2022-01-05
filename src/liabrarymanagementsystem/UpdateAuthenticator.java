
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
public class UpdateAuthenticator extends JPanel implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JDateChooser dateChooser,dateChooser1;
    JTextField t1,t2;
     String ID="";
     JComboBox cb;
     
     String type="";
     
      JButton b2 ;
    
    JPanel p1,p2;
    JPasswordField pt1;
    
    JMenu menu, submenu;  
    JMenuItem i1, i2, i3, i4, i5; 
    
    
    
    
    
     public  UpdateAuthenticator() {
            
        setBounds(0, 0, 790, 560);
        setLayout(null);

        
          
            ImageIcon image=new ImageIcon("src\\picture\\18.jpeg");
            Image img=image.getImage();
            Image temp=img.getScaledInstance(400,790,Image.SCALE_SMOOTH);
            image=new ImageIcon(temp);
            l1=new JLabel("",image,JLabel.CENTER);
            l1.setBounds(0, 0, 400, 790);
           // this.getContentPane().setBackground(Color.white);
          
          
            
           
            add(l1);
            
      
            p1= new JPanel();
            
            p1.setBackground(new Color(255,255,255));
            p1.setBounds(415,80, 350, 400);
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
            
           
              
            
            JLabel l5= new JLabel("Authenticator ID");
            l5.setForeground(new Color(204, 51, 102));
            l5.setFont(new Font("", Font.BOLD, 20));
            l5.setBounds(20, 100, 360, 30);
            p1.add(l5);
            
            t2=new JTextField("");
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
            t2.setForeground(new Color(204, 51, 102));
            t2.setBounds(20,130,180,30);
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
            t2.setBackground(new Color(255,255,255));
            p1.add(t2); 
            
         b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b2.setBackground(Color.red);
        b2.setForeground(new Color(255, 255, 255));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(220, 130, 100, 30);
         p1.add(b2);
            
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
            
             String type[]={"","Admin","Librarian","Member"};        
             cb=new JComboBox(type);    
             cb.setBounds(20,210,280,30); 
             cb.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
             cb.setBackground(new Color(255,255,255));
             p1.add(cb);       
          
            
            
            p2= new JPanel();
            
            p2.setBackground(Color.RED);
            
            p2.setBounds(100, 290, 150, 50);
            
            p1.add(p2);
            p2.setLayout(null);
            
            
            /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
            Image img2=image2.getImage();
            Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
            image1=new ImageIcon(temp2);*/
            
            l7=new JLabel("UPDATE");
            l7.setForeground(new Color(255, 255, 255));
            l7.setFont(new Font("", Font.BOLD, 24));
            l7.setBounds(25, 0, 150, 50);
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
                 
         type =  cb.getSelectedItem().toString();
  
        
 
          if(ID.equals("")|type.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
              
                   
             try{
                 Conn c1 =new Conn();
                 ResultSet r3=c1.s.executeQuery("select * from authenticator where a_id='"+ID+"'");
                       
                   if(r3.next())
                            
                   {
              
                    
                    String q2="UPDATE authenticator set type='"+type+"' where  a_id ='"+ID+"'";
                    c1.s.executeUpdate(q2); 

                    JOptionPane.showMessageDialog(null, "You have Successfully Update number "+ID+" authenticator");
                    t2.setText("");
                    String Typ="";
           
                    cb.setSelectedItem(Typ);
         
                   
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
            ID=t2.getText();
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select type from authenticator where a_id='"+ID+"' ");
            
          
            if(rs.next())
            {
           String Tp="";
           Tp=rs.getString("type");
           
          cb.setSelectedItem(Tp);
          cb.setEditable(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  authenticator does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
    }
    
     public static void main(String[] args) {
            new UpdateAuthenticator().setVisible(true);
	}
    
}