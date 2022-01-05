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

public class AddBook extends JPanel  implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l12,l13;
    JDateChooser dateChooser, dateChooser1;
    JTextField t1, t2, t5, t4, t6, t7, t3, t8,t9,t10;

    JPanel p1, p2;
    JPasswordField pt1;
    JButton b1;
    JRadioButton rb1,rb2; 
    Integer id,c;
    String b;

    public AddBook() {

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

        JLabel l12 = new JLabel("ADD A BOOK");
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
      

        ImageIcon image1 = new ImageIcon("src\\picture\\book1.png");
        Image img1 = image1.getImage();
        Image temp1 = img1.getScaledInstance(120, 80, Image.SCALE_SMOOTH);
        image1 = new ImageIcon(temp1);

        l2 = new JLabel("", image1, JLabel.CENTER);
        l2.setBounds(230, 10, 120, 80);
        l1.add(l2);

        l1.add(l2);
        
           try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select top 1 * from book order by bk_code  desc  ");
            
          
            if(rs.next())
            {
            String sum=rs.getString("bk_code");
            id=Integer.valueOf(sum); 
            id++;
             b = String.format("%04d", id).substring(0, 4);
           
            }
            else
            {
                id=1;
             b = String.format("%04d", id).substring(0, 4);
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }

        JLabel l10 = new JLabel("Book Code");
        l10.setForeground(new Color(204, 51, 102));
        l10.setFont(new Font("", Font.BOLD, 14));
        l10.setBounds(80, 90, 310, 30);
        
        l1.add(l10);

        t6 = new JTextField("");
        t6.setEditable(false);
        t6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t6.setForeground(new Color(204, 51, 102));
        t6.setBounds(80, 120, 310, 30);
   
        t6.setText(String.valueOf(b));
        t6.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t6.setBackground(new Color(255, 255, 255));
        l1.add(t6);


       

        JLabel l3 = new JLabel("Title");
        l3.setBackground(Color.red);
        l3.setForeground(new Color(204, 51, 102));
        l3.setFont(new Font("", Font.BOLD, 14));
        l3.setBounds(80, 150, 310, 30);

        l1.add(l3);

        t1 = new JTextField("");
        t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t1.setForeground(new Color(204, 51, 102));
        t1.setBounds(80, 180, 310, 30);
        t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t1.setBackground(new Color(255, 255, 255));
        l1.add(t1);

        JLabel l4 = new JLabel("LastName");
        l4.setForeground(new Color(204, 51, 102));
        l4.setFont(new Font("", Font.BOLD, 14));
        l4.setBounds(240, 150, 150, 30);
       // l1.add(l4);

        
        //l1.add(t2);

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
        
         JLabel l15 = new JLabel("Price");
        l15.setForeground(new Color(204, 51, 102));
        l15.setFont(new Font("", Font.BOLD, 14));
        l15.setBounds(80, 270, 350, 30);
        l1.add(l15);

        t10= new JTextField("");
        t10.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t10.setForeground(new Color(204, 51, 102));
        t10.setBounds(80, 300, 310, 30);
        t10.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t10.setBackground(new Color(255, 255, 255));
        l1.add(t10);

    /*
        JLabel l16 = new JLabel("Author ID");
        l16.setForeground(new Color(204, 51, 102));
        l16.setFont(new Font("", Font.BOLD, 14));
        l16.setBounds(80, 270, 350, 30);
        l1.add(l16);
        
        t2 = new JTextField("");
        t2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t2.setForeground(new Color(204, 51, 102));
        t2.setBounds(80, 300, 310, 30);
        t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t2.setBackground(new Color(255, 255, 255));
        l1.add(t2);*/
        
      

    

        JLabel l7 = new JLabel("ISBN");
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

        JLabel l8 = new JLabel("Number Of Copies");
        l8.setForeground(new Color(204, 51, 102));
        l8.setFont(new Font("", Font.BOLD, 14));
        l8.setBounds(80, 405, 300, 30);
        l1.add(l8);

        t9 = new JTextField("");
        t9.setFont(new Font("Times New Roman", Font.BOLD, 14));
        t9.setForeground(new Color(204, 51, 102));
        t9.setBounds(80, 440, 310, 30);
        t9.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(204, 51, 102)));
        t9.setBackground(new Color(255, 255, 255));
        l1.add(t9);
        
       

        p2 = new JPanel();

        p2.setBackground(new Color(255, 0, 102));

        p2.setBounds(460, 420, 200, 40);

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
         String book_code="";
         String title="";
         String pub_id="";
         String price="";
         String numberofcopy="";
         String isbn="";
         String picture="";
         String author="";
      
         
         book_code=t6.getText();
         title=t1.getText();
         pub_id=t3.getText();
         price=t10.getText();
         numberofcopy=t9.getText();
         isbn=t5.getText();
         picture=t8.getText();
         author=t7.getText();
         System.out.println(pub_id);
       

        if (evt.getSource() == p2) {
         if( book_code.equals("")|author.equals("")|title.equals("")|pub_id.equals("")|price.equals("")|numberofcopy.equals("")|isbn.equals("")|picture.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
             
            try {
          
            Conn c1 =new Conn();
            
            ResultSet r1=c1.s.executeQuery("select pub_id from publisher where pub_id = '"+pub_id+"' ");
            
          
            if(r1.next())
            {
         
        
                try {



                   String q1="insert into book values( '"+book_code+"','"+title+"','"+pub_id+"','"+price+"','"+numberofcopy+"','"+isbn+"','"+picture+"','"+author+"')";
                   c1.s.executeUpdate(q1); 
                   
                   
                  JOptionPane.showMessageDialog(null, "You have Successfully add number "+book_code+" Book");
                        t6.setText("");
                     t1.setText("");
                     t3.setText("");
                     t10.setText("");
                     t9.setText("");
                     t5.setText("");
                     t8.setText("");
                     t7.setText("");
                     l13.setIcon(null);
                     
                     c=Integer.parseInt(book_code);  
             System.out.println(c);
             System.out.println(book_code);
             c=c+1;
          
            b = String.format("%04d", c).substring(0, 4);
             System.out.println(c);
             System.out.println(b);
             
           t6.setText(String.valueOf(b));
                 
                  
                      }
                    catch (SQLException ex) {

                             Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
                        }
            
            }
            
            
            else{
                JOptionPane.showMessageDialog(null, "This Publisher is not available in your database ,please at first create Publisher");
         
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
        
    
        
        if(e.getSource()==b1)
           {
              JFileChooser c1 =new JFileChooser();
              c1.showOpenDialog(null);
              File f =c1.getSelectedFile();
              String fname =f.getAbsolutePath();
              t8.setText(fname);
              Image getAbsolutePath = null;
              
              ImageIcon image3= new ImageIcon(fname);
              //Image img3 = image3.getImage();
              Image temp3=image3.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
              image3 = new ImageIcon(temp3);
              
             
              l13=new JLabel("",image3,JLabel.CENTER);
              p1.add(l13);
              l13.setVisible(true);
              
              l13.setBounds(0, 0, 150, 150);
             
             
              // p1.setVisible(true); 
               p1.add(l13);
              
              //l13.setVisible(true);
              
            
               
               
           }
         
    }

    public static void main(String[] args) {
        new AddBook().setVisible(true);
    }

}
