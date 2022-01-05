package liabrarymanagementsystem;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Profile extends JPanel  implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l12,l13;
    JDateChooser dateChooser, dateChooser1;
    JTextField t1, t2, t5, t4, t6, t7, t3, t8,t9,t10;

    JPanel p1, p2;
    JPasswordField pt1;
    JButton b1,b2;
    JRadioButton rb1,rb2; 
    String u_id;
     String aid="";
            String fname="";
            String lname="";
            String phone="";
            String dateofbirth="";
            String addres="";
            String pasword="";
            String picture="";
            String gender="";

    public Profile() {

        setBounds(0, 0, 790, 560);
        setBackground(new Color(255, 255, 255));
        setLayout(null);
       
        ImageIcon image = new ImageIcon("src\\picture\\b4.jpeg");
        Image img = image.getImage();
        Image temp = img.getScaledInstance(790, 560, Image.SCALE_SMOOTH);
        image = new ImageIcon(temp);
        l1 = new JLabel("", image, JLabel.CENTER);
        l1.setBounds(0, 0, 790, 560);
           // this.getContentPane().setBackground(Color.white);

        add(l1);

        JLabel l12 = new JLabel("User Profile");
        l12.setForeground(new Color(204, 51, 102));
        l12.setFont(new Font("", Font.BOLD, 30));
        l12.setBounds(320, 15, 300, 50);
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
        t8.setEditable(false);
        t8.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t8.setBackground(new Color(255, 255, 255));
        l1.add(t8);

        b1 = new JButton("Upload Picture");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b1.setForeground(new Color(204, 51, 102));
        b1.setBounds(420, 320, 280, 30);
        b1.setBackground(new Color(255, 255, 255));
        //l1.add(b1);
        
        JLabel l13 = new JLabel("Gender");
        l13.setForeground(new Color(204, 51, 102));
        l13.setFont(new Font("", Font.BOLD, 14));
        l13.setBounds(420, 340, 200, 50);
        l1.add(l13);
        
        rb1=new JRadioButton("Male");    
        rb1.setBounds(420,380,130,30); 
        rb1.setSelected(false);
        rb1.setBackground(new Color(255,255,204));
        rb2=new JRadioButton("Female");
        rb2.setBackground(new Color(255,255,204));
        rb2.setBounds(570,380,130,30);  
        rb2.setSelected(false);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);bg.add(rb2);    
          
        l1.add(rb1);
        l1.add(rb2); 

        ImageIcon image1 = new ImageIcon("src\\picture\\dlogo4.png");
        Image img1 = image1.getImage();
        Image temp1 = img1.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(temp1);

        l2 = new JLabel("", image1, JLabel.CENTER);
        l2.setBounds(230, 10, 80, 80);
        l1.add(l2);

        l1.add(l2);
        
         JLabel l11 = new JLabel("UserID");
        l11.setForeground(new Color(204, 51, 102));
        l11.setFont(new Font("", Font.BOLD, 14));
        l11.setBounds(80, 90, 150, 30);
        l1.add(l11);
        

        t7 = new JTextField("");
        t7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t7.setForeground(new Color(204, 51, 102));
        t7.setBounds(80, 120, 150, 30);
        
        t7.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t7.setBackground(new Color(255, 255, 255));
        l1.add(t7);
        
        b2 = new JButton("Search");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setForeground(new Color(255, 255, 255));
        b2.setBounds(240, 118, 150, 33);
        b2.setBackground(new Color(255, 0, 102));
        l1.add(b2);
        b2.addActionListener(this);

        JLabel l10 = new JLabel("Authenticator ID");
        l10.setForeground(new Color(204, 51, 102));
        l10.setFont(new Font("", Font.BOLD, 14));
        l10.setBounds(80, 150, 310, 30);
        l1.add(l10);
        
      

        t6 = new JTextField("");
        t6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t6.setForeground(new Color(204, 51, 102));
        t6.setBounds(80, 180, 310, 30);
        t6.setEditable(false);
        t6.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t6.setBackground(new Color(255, 255, 255));
        l1.add(t6);

       

        JLabel l3 = new JLabel("FastName");
        l3.setBackground(Color.red);
        l3.setForeground(new Color(204, 51, 102));
        l3.setFont(new Font("", Font.BOLD, 14));
        l3.setBounds(80, 210, 150, 30);

        l1.add(l3);

        t1 = new JTextField("");
        t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t1.setForeground(new Color(204, 51, 102));
        t1.setBounds(80, 240, 150, 30);
        t1.setEditable(false);
        t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t1.setBackground(new Color(255, 255, 255));
        l1.add(t1);

        JLabel l4 = new JLabel("LastName");
        l4.setForeground(new Color(204, 51, 102));
        l4.setFont(new Font("", Font.BOLD, 14));
        l4.setBounds(240, 210, 150, 30);
        l1.add(l4);

        t2 = new JTextField("");
        t2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t2.setForeground(new Color(204, 51, 102));
        t2.setBounds(240, 240, 150, 30);
        t2.setEditable(false);
        t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t2.setBackground(new Color(255, 255, 255));
        l1.add(t2);

        JLabel l5 = new JLabel("Phone");
        l5.setForeground(new Color(204, 51, 102));
        l5.setFont(new Font("", Font.BOLD, 14));
        l5.setBounds(80, 270, 360, 30);
        l1.add(l5);

        t3 = new JTextField("");
        t3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t3.setForeground(new Color(204, 51, 102));
        t3.setBounds(80, 300, 310, 30);
        t3.setEditable(false);
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
        l6.setBounds(80, 330, 350, 30);
        l1.add(l6);
        
        t9 = new JTextField("");
        t9.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t9.setForeground(new Color(204, 51, 102));
        t9.setBounds(80, 360, 310, 30);
        t9.setEditable(false);
        t9.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t9.setBackground(new Color(255, 255, 255));
        l1.add(t9);

       /* dateChooser = new JDateChooser();
        dateChooser.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        dateChooser.setForeground(new Color(204, 51, 102));
        dateChooser.setBackground(new Color(255, 255, 255));
        dateChooser.setBounds(80, 360, 310, 30);
        l1.add(dateChooser);*/

        JLabel l7 = new JLabel("Address");
        l7.setForeground(new Color(204, 51, 102));
        l7.setFont(new Font("", Font.BOLD, 14));
        l7.setBounds(80, 390, 410, 30);
        l1.add(l7);

        t5 = new JTextField("");
        t5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t5.setForeground(new Color(204, 51, 102));
        t5.setBounds(80, 420, 310, 30);
        t5.setEditable(false);
        t5.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t5.setBackground(new Color(255, 255, 255));
        l1.add(t5);

        JLabel l8 = new JLabel("Password");
        l8.setForeground(new Color(204, 51, 102));
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(80, 450, 350, 30);
        l1.add(l8);

        pt1 = new JPasswordField("");
        pt1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pt1.setForeground(new Color(204, 51, 102));
        pt1.setBounds(80, 480, 310, 30);
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
        l7 = new JLabel("DELETE");
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
        String Gender="";

        if (evt.getSource() == p2) {
            
             if(rb1.isSelected()){  
            
           Gender="Male";
       
        }    
        if(rb2.isSelected()){ 
           Gender="Female";
        
        }  
          
           u_id=t7.getText();
           
            aid=t6.getText();
            fname=  t1.getText();
            lname= t2.getText();
            phone=  t3.getText();
            dateofbirth =  t9.getText();
            addres=  t5.getText();
            pasword=  pt1.getText();
            picture=  t8.getText();
           try {
               
            
             Conn c1 =new Conn();
           
             ResultSet r4=c1.s.executeQuery("select * from users where u_id='"+u_id+"' ");
            try{
                  if(r4.next())
            {
               String q4="UPDATE users  set aid='"+aid+"',fname='"+fname+"',lname='"+lname+"',phone='"+phone+"',dateofbirth='"+dateofbirth+"',addres='"+addres+"',pasword='"+pasword+"',picture='"+picture+"'  where  u_id ='"+u_id+"' ";
              c1.s.executeUpdate(q4); 

              JOptionPane.showMessageDialog(null, "You have Successfully Update Users");
              t7.setText("");
              t6.setText("");
              t1.setText("");
              t2.setText("");
              t3.setText("");
              t9.setText("");
              t5.setText("");
              pt1.setText("");
              t8.setText("");
              
          
              rb1.setSelected(false);
            
              rb2.setSelected(false);
            
              
               String img="";
              l13=new JLabel("");
              l13.setText("");
              p1.add(l13);
              l13.setVisible(true);
              
              l13.setBounds(0, 0, 150, 150);
             
             
              // p1.setVisible(true); 
               p1.add(l13);
             
                 
            }
                
            }
              catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
                
                 catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
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
        
       
        
        
         if (e.getSource() == b2) {
          
             u_id="";
             
             u_id=t7.getText();
           
            
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from users where u_id='"+u_id+"' ");
            
          
            if(rs.next())
            {
         
     

            aid=rs.getString("a_id");
            fname=rs.getString("fname");
            lname=rs.getString("lname");
            phone=rs.getString("phone");
            dateofbirth=rs.getString("dateofbirth");
            addres=rs.getString("addres");
            pasword=rs.getString("pasword");
            picture=rs.getString("picture");
            gender=rs.getString("gender");
     
             
              t6.setText(aid);
              t1.setText(fname);
              t2.setText(lname);
              t3.setText(phone);
              t9.setText(dateofbirth);
              t5.setText(addres);
              pt1.setText(pasword);
              t8.setText(picture);
              
              if(gender.equals("Male"))
              {
                  rb1.setSelected(true);
              }
              else{
                  rb2.setSelected(true);
              }
              
               ImageIcon image3= new ImageIcon(picture);
              //Image img3 = image3.getImage();
              Image temp3=image3.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
              image3 = new ImageIcon(temp3);
              
             
              l13=new JLabel("",image3,JLabel.CENTER);
              p1.add(l13);
              l13.setVisible(true);
              
              l13.setBounds(0, 0, 150, 150);
             
             
              // p1.setVisible(true); 
               p1.add(l13);
       
     
       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  User does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
            
            

        
        
    }

    public static void main(String[] args) {
        new Profile().setVisible(true);
    }

}
