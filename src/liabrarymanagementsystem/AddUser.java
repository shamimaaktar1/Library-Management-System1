 package liabrarymanagementsystem;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class AddUser extends JPanel  implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l12,l13;
    JDateChooser dateChooser, dateChooser1;
    JTextField t1, t2, t5, t4, t6, t7, t3, t8;

    JPanel p1, p2;
    JPasswordField pt1;
    JButton b1;
    JRadioButton rb1,rb2; 
    int id,c;
    String b;
    private String imageUploadPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\LiabraryManagementSystem\\src\\UploadProfilePic";

    public AddUser() {

        setBounds(0, 0, 790, 560);
        setBackground(new Color(255, 255, 255));
        setLayout(null);
       
        ImageIcon image = new ImageIcon("src\\picture\\b1.jpeg");
        Image img = image.getImage();
        Image temp = img.getScaledInstance(790, 560, Image.SCALE_SMOOTH);
        image = new ImageIcon(temp);
        l1 = new JLabel("", image, JLabel.CENTER);
        l1.setBounds(0, 0, 790, 560);
           // this.getContentPane().setBackground(Color.white);

        add(l1);

        JLabel l12 = new JLabel("ADD A USER");
        l12.setForeground(new Color(204, 51, 102));
        l12.setFont(new Font("", Font.BOLD, 30));
        l12.setBounds(350, 45, 200, 50);
        l1.add(l12);

        p1 = new JPanel();

        p1.setBackground(new Color(255, 255, 255));
        p1.setBounds(480, 120, 150, 150);
        p1.setLayout(null);
        l1.add(p1);

        t8 = new JTextField("");
        t8.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t8.setForeground(new Color(204, 51, 102));
        t8.setBounds(420, 280, 280, 30);
        t8.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t8.setBackground(new Color(255, 255, 255));
        l1.add(t8);

        b1 = new JButton("Upload Picture");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setForeground(new Color(204, 51, 102));
        b1.setBounds(420, 320, 280, 30);
        b1.setBackground(new Color(255, 255, 255));
        l1.add(b1);
        
        JLabel l13 = new JLabel("Gender");
        l13.setForeground(new Color(204, 51, 102));
        l13.setFont(new Font("", Font.BOLD, 14));
        l13.setBounds(420, 340, 200, 50);
        l1.add(l13);
        
        rb1=new JRadioButton("Male");    
        rb1.setBounds(420,380,130,30); 
        rb1.setBackground(new Color(255,255,204));
        rb2=new JRadioButton("Female");
        rb2.setBackground(new Color(255,255,204));
        rb2.setBounds(570,380,130,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);bg.add(rb2);    
          
        l1.add(rb1);
        l1.add(rb2); 

        ImageIcon image1 = new ImageIcon("src\\picture\\add2.png");
        Image img1 = image1.getImage();
        Image temp1 = img1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(temp1);

        l2 = new JLabel("", image1, JLabel.CENTER);
        l2.setBounds(230, 10, 100, 100);
        l1.add(l2);

        l1.add(l2);

        JLabel l10 = new JLabel("Authenticator ID");
        l10.setForeground(new Color(204, 51, 102));
        l10.setFont(new Font("", Font.BOLD, 14));
        l10.setBounds(80, 90, 150, 30);
        l1.add(l10);

        t6 = new JTextField("");
        t6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t6.setForeground(new Color(204, 51, 102));
        t6.setBounds(80, 120, 150, 30);
        t6.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t6.setBackground(new Color(255, 255, 255));
        l1.add(t6);

        JLabel l11 = new JLabel("UserID");
        l11.setForeground(new Color(204, 51, 102));
        l11.setFont(new Font("", Font.BOLD, 14));
        l11.setBounds(240, 90, 150, 30);
        l1.add(l11);
        
         try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select top 1 * from users order by u_id   desc");
            
          
            if(rs.next())
            {
            String sum=rs.getString("u_id");
            id=Integer.valueOf(sum); 
            id++;
            b= String.format("%04d", id).substring(0, 4);
          
            }
            else
            {
            b = String.format("%04d", 1).substring(0, 4);
             
            }
            
            }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            

        t7 = new JTextField("");
        t7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t7.setForeground(new Color(204, 51, 102));
        t7.setBounds(240, 120, 150, 30);
        t7.setText(String.valueOf(b));
        t7.setEditable(false);
        t7.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t7.setBackground(new Color(255, 255, 255));
        l1.add(t7);

        JLabel l3 = new JLabel("FastName");
        l3.setBackground(Color.red);
        l3.setForeground(new Color(204, 51, 102));
        l3.setFont(new Font("", Font.BOLD, 14));
        l3.setBounds(80, 150, 150, 30);

        l1.add(l3);

        t1 = new JTextField("");
        t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t1.setForeground(new Color(204, 51, 102));
        t1.setBounds(80, 180, 150, 30);
        t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t1.setBackground(new Color(255, 255, 255));
        l1.add(t1);

        JLabel l4 = new JLabel("LastName");
        l4.setForeground(new Color(204, 51, 102));
        l4.setFont(new Font("", Font.BOLD, 14));
        l4.setBounds(240, 150, 150, 30);
        l1.add(l4);

        t2 = new JTextField("");
        t2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t2.setForeground(new Color(204, 51, 102));
        t2.setBounds(240, 180, 150, 30);
        t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t2.setBackground(new Color(255, 255, 255));
        l1.add(t2);

        JLabel l5 = new JLabel("Phone");
        l5.setForeground(new Color(204, 51, 102));
        l5.setFont(new Font("", Font.BOLD, 14));
        l5.setBounds(80, 210, 360, 30);
        l1.add(l5);

        t3 = new JTextField("");
        t3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t3.setForeground(new Color(204, 51, 102));
        t3.setBounds(80, 240, 310, 30);
        t3.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t3.setBackground(new Color(255, 255, 255));
        l1.add(t3);

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
        JLabel l6 = new JLabel("Date of Birth");
        l6.setForeground(new Color(204, 51, 102));
        l6.setFont(new Font("", Font.BOLD, 14));
        l6.setBounds(80, 270, 350, 30);
        l1.add(l6);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        dateChooser.setForeground(new Color(204, 51, 102));
        dateChooser.setBackground(new Color(255, 255, 255));
        dateChooser.setBounds(80, 300, 310, 30);
        l1.add(dateChooser);

        JLabel l7 = new JLabel("Address");
        l7.setForeground(new Color(204, 51, 102));
        l7.setFont(new Font("", Font.BOLD, 14));
        l7.setBounds(80, 330, 410, 30);
        l1.add(l7);

        t5 = new JTextField("");
        t5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t5.setForeground(new Color(204, 51, 102));
        t5.setBounds(80, 365, 310, 30);
        t5.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t5.setBackground(new Color(255, 255, 255));
        l1.add(t5);

        JLabel l8 = new JLabel("Password");
        l8.setForeground(new Color(204, 51, 102));
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(80, 405, 350, 30);
        l1.add(l8);

        pt1 = new JPasswordField("");
        pt1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pt1.setForeground(new Color(204, 51, 102));
        pt1.setBounds(80, 440, 310, 30);
        pt1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        pt1.setBackground(new Color(255, 255, 255));
        l1.add(pt1);

        p2 = new JPanel();

        p2.setBackground(new Color(255, 0, 102));

        p2.setBounds(460, 430, 200, 40);

        l1.add(p2);
        p2.setLayout(null);

        /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
         Image img2=image2.getImage();
         Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
         image1=new ImageIcon(temp2);*/
        l7 = new JLabel("ADD");
        l7.setForeground(new Color(255, 255, 255));
        l7.setFont(new Font("", Font.BOLD, 24));
        l7.setBounds(70, 0, 150, 40);
        p2.add(l7);
        
        
        b1.addActionListener(this);

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

        String aid="" ;
         String uid="";
         String fname="";
         String lname="";
         String phone="";
         //Date dateofbirth=null;
         String address="";
         String password="";
         String img="";
         String gender="";
                 
         uid=t7.getText();
         aid=t6.getText();
         fname=t1.getText();
         lname=t2.getText();
         phone=t3.getText();
         String dateofbirth = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         address=t5.getText();
         password=pt1.getText();
         img=t8.getText();
        
         
         if(rb1.isSelected()){    
            gender="Male" ;  
        }    
        if(rb2.isSelected()){    
            gender="Female";
        }  
         
        
        
      if(evt.getSource()==p2)
     {
         
         if( aid.equals("")|uid.equals("")|fname.equals("")|lname.equals("")|phone.equals("")|address.equals("")|dateofbirth.equals("")|img.equals("")|gender.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
           try {
               
                String athor1="";
             String athor2="";
          
            Conn c1 =new Conn();
            
            ResultSet r1=c1.s.executeQuery("select a_id from authenticator where a_id = '"+aid+"' ");
            
     
             
            
          
            if(r1.next())
            {
            
               try {
                   
                    ResultSet r2=c1.s.executeQuery("select a_id from users where a_id = '"+aid+"' ");
                    
                   
           if(r2.next())
            {
                JOptionPane.showMessageDialog(null, "This type of Athenticator already have an User ");
      
            }
           
           else{
            
             String q2="insert into users values( '"+uid+"','"+aid+"','"+fname+"','"+lname+"','"+phone+"','"+dateofbirth+"','"+address+"','"+password+"','"+img+"','"+gender+"')";
             c1.s.executeUpdate(q2); 
             JOptionPane.showMessageDialog(null, "You have Successfully add");
                t7.setText("");
                t6.setText("");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                ((JTextField) dateChooser.getDateEditor().getUiComponent()).setText("");
                t5.setText("");
                pt1.setText("");
                t8.setText("");
                 rb1.setSelected(false);
            
               rb2.setSelected(false);
             
              l13.setIcon(null);
              p1.add(l13);
              l13.setVisible(true);
              
              l13.setBounds(0, 0, 150, 150);
              
             c=Integer.parseInt(uid);  
             System.out.println(c);
             System.out.println(uid);
             c=c+1;
          
            b = String.format("%04d", c).substring(0, 4);
             System.out.println(b);
             
             t7.setText(String.valueOf(b));
             
             
                }
            }
            catch (SQLException ex) {

                     Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
                 }  
            
            }
            else
            {
              JOptionPane.showMessageDialog(null, "This Authenticator is not available in your database ,please at first create an Autheticator");
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
           
           
         }
         
        
       }
           
           
           
     }
     

    

    private void MouseEntered(MouseEvent evt) {

        if (evt.getSource() == p2) {
            p2.setBackground(new Color(0, 204, 0));

        }

    }

    private void MouseExited(MouseEvent evt) {
        p2.setBackground(new Color(255, 0, 102));

    }

    public void actionPerformed(ActionEvent e) {
        
        if(rb1.isSelected()){    
        JOptionPane.showMessageDialog(this,"You are Male.");    
        }    
        if(rb2.isSelected()){    
        JOptionPane.showMessageDialog(this,"You are Female.");    
        }  
        
        if(e.getSource()==b1)
           {
               
             
             
              
              JFileChooser c1 =new JFileChooser();
              c1.showOpenDialog(null);
              File f =c1.getSelectedFile();
              String fname =f.getAbsolutePath();
              
              Image getAbsolutePath = null;
              
              ImageIcon image3= new ImageIcon(fname);
              //Image img3 = image3.getImage();
              Image temp3=image3.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
              image3 = new ImageIcon(temp3);
              
               t8.setText(fname);
             
              l13=new JLabel("",image3,JLabel.CENTER);
              p1.add(l13);
              l13.setVisible(true);
              
              l13.setBounds(0, 0, 150, 150);
             
             
              // p1.setVisible(true); 
               p1.add(l13);
              
              //l13.setVisible(true);
               
               
             /* String filePath = imageUploadPath + fname;
            try {
                BufferedImage bi = ImageIO.read(f);
                 
   
                ImageIO.write(bi, "jpg", new File(filePath));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
           
           
           */
               
               
               
           }
         
    }

    public static void main(String[] args) {
        new AddUser().setVisible(true);
    }

}
