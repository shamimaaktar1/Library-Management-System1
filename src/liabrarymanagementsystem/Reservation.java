

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

public class Reservation extends JPanel  implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l12,l13,l15,l20;
    JDateChooser dateChooser, dateChooser1;
    JTextField t1, t2, t5, t4, t6, t7, t3, t8,t9,t10;

    JPanel p1, p2;
    int id;
    String b;
    JPasswordField pt1;
    JButton b1,b2;
    JRadioButton rb1,rb2; 
    
      String bk_code="";
         String title="";
         String pub_id="";
         String price="";
         String numberofcopy="";
         String isbn="";
         String picture="";
         String author="";
         String u_id="";
         String resrve_id="";
         String reserve_date="";
         String pick_date="";
         String Status="";
         

    public Reservation() {

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

        JLabel l12 = new JLabel("Reserve A Book");
        l12.setForeground(new Color(204, 51, 102));
        l12.setFont(new Font("", Font.BOLD, 30));
        l12.setBounds(300, 45, 300, 50);
        l1.add(l12);

        p1 = new JPanel();

        p1.setBackground(new Color(255, 255, 255));
        p1.setBounds(480, 120, 150, 150);
        p1.setLayout(null);
        l1.add(p1);
        
        l13 = new JLabel("");
        l13.setForeground(new Color(204, 51, 102));
        l13.setFont(new Font("", Font.BOLD, 30));
        l13.setBounds(0, 0, 150, 150);
        p1.add(l13);

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
        
      

        ImageIcon image1 = new ImageIcon("src\\picture\\book1.png");
        Image img1 = image1.getImage();
        Image temp1 = img1.getScaledInstance(120, 80, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(temp1);

        l2 = new JLabel("", image1, JLabel.CENTER);
        l2.setBounds(230, 10, 120, 80);
        
        
         JLabel l6= new JLabel("Author");
         l6.setForeground(new Color(204, 51, 102));
         l6.setFont(new Font("", Font.BOLD, 14));
         l6.setBounds(420, 350, 350, 30);
         l1.add(l6);
            
         t7 = new JTextField("");
        t7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t7.setForeground(new Color(204, 51, 102));
        t7.setBounds(420, 380, 280, 30);

        t7.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t7.setBackground(new Color(255, 255, 255));
        l1.add(t7); 

           JLabel l11 = new JLabel("Book Code");
        l11.setForeground(new Color(204, 51, 102));
        l11.setFont(new Font("", Font.BOLD, 14));
        l11.setBounds(80, 90, 150, 30);
        l1.add(l11);
        

        t6 = new JTextField("");
        t6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t6.setForeground(new Color(204, 51, 102));
        t6.setBounds(80, 120, 150, 30);
    
        t6.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t6.setBackground(new Color(255, 255, 255));
        l1.add(t6);
        
        b2 = new JButton("Search");
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setForeground(new Color(255, 255, 255));
        b2.setBounds(240, 118, 150, 33);
        b2.setBackground(new Color(255, 0, 102));
        l1.add(b2);
        
        b2.addActionListener(this);

    

   

        JLabel l3 = new JLabel("Title");
        l3.setBackground(Color.red);
        l3.setForeground(new Color(204, 51, 102));
        l3.setFont(new Font("", Font.BOLD, 14));
        l3.setBounds(80, 150, 150, 30);

        l1.add(l3);
        
        JLabel l9= new JLabel("User_id");
	l9.setForeground(new Color(204, 51, 102));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(230, 150, 100, 30);
        l1.add(l9);
        
        t10 = new JTextField("");
        t10.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t10.setForeground(new Color(204, 51, 102));
        t10.setBounds(240, 180, 150, 30);
        t10.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t10.setBackground(new Color(255, 255, 255));
        l1.add(t10);

        t1 = new JTextField("");
        t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t1.setForeground(new Color(204, 51, 102));
        t1.setBounds(80, 180, 150, 30);
        t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t1.setBackground(new Color(255, 255, 255));
        l1.add(t1);

 

        JLabel l5 = new JLabel("Publisher_ID");
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
        l6 = new JLabel("Price");
        l6.setForeground(new Color(204, 51, 102));
        l6.setFont(new Font("", Font.BOLD, 14));
        l6.setBounds(80, 270, 350, 30);
        l1.add(l6);
        
        t2 = new JTextField("");
        t2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t2.setForeground(new Color(204, 51, 102));
        t2.setBounds(80, 300, 310, 30);
        t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t2.setBackground(new Color(255, 255, 255));
        l1.add(t2);

    

        JLabel l7 = new JLabel("Number Of Copy");
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

        JLabel l8 = new JLabel("ISBN");
        l8.setForeground(new Color(204, 51, 102));
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(80, 405, 350, 30);
        l1.add(l8);
        
         t4 = new JTextField("");
        t4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t4.setForeground(new Color(204, 51, 102));
        t4.setBounds(80, 440, 310, 30);
        t4.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t4.setBackground(new Color(255, 255, 255));
        l1.add(t4);
        
        JLabel l15 = new JLabel("Reserve Date:");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(400, 410, 118, 26);
        l1.add(l15);
	

	dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(400, 440, 150, 30);
        l1.add(dateChooser);
         
        JLabel l16= new JLabel("Pick Date:");
	l16.setForeground(new Color(105, 105, 105));
	l16.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l16.setBounds(560, 410, 120, 30);
        l1.add(l16);
	

	dateChooser1 = new JDateChooser();
	dateChooser1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser1.setForeground(new Color(105, 105, 105));
	dateChooser1.setBounds(560, 440, 150, 30);
       l1.add(dateChooser1);

        

        p2 = new JPanel();

        p2.setBackground(new Color(255, 0, 102));

        p2.setBounds(460, 480, 200, 40);

        l1.add(p2);
        p2.setLayout(null);

        /*ImageIcon image2=new ImageIcon("src\\picture\\red3.png");
         Image img2=image2.getImage();
         Image temp2=img2.getScaledInstance(150,50,Image.SCALE_SMOOTH);
         image1=new ImageIcon(temp2);*/
        l7 = new JLabel("Reservation");
        l7.setForeground(new Color(255, 255, 255));
        l7.setFont(new Font("", Font.BOLD, 24));
        l7.setBounds(30, 0, 150, 40);
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

        if (evt.getSource() == p2) {
            
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select top 1 * from reservations order by u_id   desc");
            
          
            if(rs.next())
            {
            String sum=rs.getString("resrve_id");
            id=Integer.valueOf(sum); 
            id++;
            
          
            b= String.format("%04d", id).substring(0, 4);
          
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
                u_id=t10.getText();
              
                resrve_id= String.valueOf(b);
                reserve_date=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
                pick_date=((JTextField) dateChooser1.getDateEditor().getUiComponent()).getText();
                
                
                bk_code=t6.getText();
                Status="Not Aprove";
           
           try {
               
               
               if( u_id.equals("")|resrve_id.equals("")|reserve_date.equals("")|pick_date.equals("")|bk_code.equals("")|Status.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
               
            
             Conn c1 =new Conn();
           
             String q2="insert into reservations values( '"+resrve_id+"','"+u_id+"','"+bk_code+"','"+reserve_date+"','"+pick_date+"','"+Status+"')";
                            c1.s.executeUpdate(q2); 
                            JOptionPane.showMessageDialog(null, "You have Successfully RESERVE Book");
               t1.setText("");
              t3.setText("");
              t2.setText("");
              t5.setText("");
              t4.setText("");
              t8.setText("");
              t7.setText("");
              t6.setText("");
              
               t10.setText("");
              
             
              ((JTextField) dateChooser.getDateEditor().getUiComponent()).setText("");
              ((JTextField) dateChooser1.getDateEditor().getUiComponent()).setText("");
       
              
          
              
              l13.setIcon(null);
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
        
    
        
        if(e.getSource()==b1)
           {
              JFileChooser c1 =new JFileChooser();
              c1.showOpenDialog(null);
              File f =c1.getSelectedFile();
              String fname =f.getAbsolutePath();
       
                
              t8.setText(fname);
              Image getAbsolutePath = null;
              ImageIcon imageIcon=new ImageIcon(new ImageIcon(fname).getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
              
              
              
              l13.setIcon(imageIcon);
              
              p1.add(l13);
              l13.setVisible(true);
              
              l13.setBounds(0, 0, 150, 150);
             
             
              // p1.setVisible(true); 
               p1.add(l13);
              
             
              
            
               
               
           }
        
        
         if(e.getSource()==b2)
        {
            
            bk_code=t6.getText();
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from book where bk_code='"+bk_code+"' ");
            
          
            if(rs.next())
            {   
               
                title=rs.getString("title");
                pub_id=rs.getString("pub_id");
                price=rs.getString("price");
                numberofcopy=rs.getString("numofcopy");
                isbn=rs.getString("isbn");
                picture=rs.getString("picture");
                author=rs.getString("author");
                
                
                t1.setText(title);
                t3.setText(pub_id);
                t2.setText(price);
                t5.setText(numberofcopy);
                t4.setText(isbn);
               
                t7.setText(author);
                
              
                 t8.setText(picture);
              
                
             
              
               t8.setText(picture);
              Image getAbsolutePath = null;
              ImageIcon imageIcon=new ImageIcon(new ImageIcon(picture).getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH));
              
              
              
              l13.setIcon(imageIcon); 
              p1.add(l13);
              l13.setVisible(true);
             
              // p1.setVisible(true); 
               p1.add(l13);
     
       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  Book does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
         
         
         
         
         
    }

    public static void main(String[] args) {
        new Reservation().setVisible(true);
    }

}

