/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liabrarymanagementsystem;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class AddMembership extends JPanel  implements ActionListener {
    
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l20;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JDateChooser dateChooser,dateChooser1;
    JPanel p1,p2;
    JPasswordField pt1;
    JButton b1;
    
    int card_no;
    String b;
    int c;
    
      
     public static void main(String[] args) {
            new AddMembership().setVisible(true);
	}
     
      public AddMembership ()
             
             {
                 
        
        
        setBounds(0, 0, 790, 560);
        setBackground(new Color(242,242,242));
        setLayout(null);
        
        ImageIcon image=new ImageIcon("src\\picture\\36.jpg");
        Image img=image.getImage();
        Image temp=img.getScaledInstance(790,560,Image.SCALE_SMOOTH);
        image=new ImageIcon(temp);
        l20=new JLabel("",image,JLabel.CENTER);
        l20.setBounds(0, 0, 790, 560);

        add(l20);
        
         p1= new JPanel();
            
            p1.setBackground(new Color(0,0,0,100));
            p1.setBounds(150,100, 380, 100);
            p1.setLayout(null);
            
            
            l20.add(p1);
            
             JLabel l6 = new JLabel("ADD MEMBERSHIP");
            l6.setBackground(Color.red);
            l6.setForeground(new Color(255, 0, 0));
            l6.setFont(new Font("", Font.BOLD, 30));
            l6.setBounds(50, 30, 350, 30);
            p1.add(l6);
            
            
             JLabel l7 = new JLabel("Card_NO:");
            l7.setBackground(Color.red);
            l7.setForeground(new Color(255, 0, 0));
            l7.setFont(new Font("", Font.BOLD, 20));
            l7.setBounds(150, 220, 150, 30);
            
            l20.add(l7);
            
              try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select top 1 * from membercard order by card_no  desc  ");
            
          
            if(rs.next())
            {
            String sum=rs.getString("card_no");
            card_no=Integer.valueOf(sum); 
            card_no++;
             b = String.format("%04d", card_no).substring(0, 4);
           
            }
            else
            {
                card_no=1;
              b = String.format("%04d", card_no).substring(0, 4);
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            
            t2=new JTextField("");
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
            t2.setText(String.valueOf(b));
            t2.setEditable(false);
            t2.setForeground(new Color(255, 0, 0));
            t2.setBounds(300,220,240,30);
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t2.setBackground(new Color(255,255,255));
            l20.add(t2); 
            
            JLabel l3 = new JLabel("User_ID:");
            l3.setBackground(Color.red);
            l3.setForeground(new Color(255, 0, 0));
            l3.setFont(new Font("", Font.BOLD, 20));
            l3.setBounds(150, 260, 150, 30);
            
            l20.add(l3);
            
            t1=new JTextField("");
            t1.setFont(new Font("Times New Roman",Font.BOLD,20));
            t1.setForeground(new Color(255, 0, 0));
            t1.setBounds(300,260,240,30);
            t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t1.setBackground(new Color(255,255,255));
            l20.add(t1); 
            
            JLabel l4 = new JLabel("Issu Date:");
            l4.setBackground(Color.red);
            l4.setForeground(new Color(255, 0, 0));
            l4.setFont(new Font("", Font.BOLD, 20));
            l4.setBounds(150, 300, 150, 30);
            
            l20.add(l4);
            
           
            
            
            dateChooser = new JDateChooser();
            dateChooser.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            dateChooser.setForeground(new Color(105, 105, 105));
            dateChooser.setBounds(300, 300, 240, 30); 
            
         
            l20.add(dateChooser);
            
            JLabel l5 = new JLabel("Expire Date:");
            l5.setBackground(Color.red);
            l5.setForeground(new Color(255, 0, 0));
            l5.setFont(new Font("", Font.BOLD, 20));
            l5.setBounds(150, 340, 150, 30);
            

         
           
            
            l20.add(l5);
            
            
            dateChooser1 = new JDateChooser();
            dateChooser1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            dateChooser1.setForeground(new Color(105, 105, 105));
            dateChooser1.setBounds(300, 340, 240, 30);
            l20.add(dateChooser1);

            b1=new JButton("ADD");      
            b1.setFont(new Font("",Font.BOLD,20));
            b1.setForeground(Color.WHITE);
            b1.setBounds(250,380,200,40);
            b1.setBackground(new Color(255,0,0));
            l20.add(b1);
            
            b1.addActionListener(this);
      /* 
       b2=new JButton("Rent");      
       b2.setFont(new Font("",Font.BOLD,20));
       b2.setForeground(Color.WHITE);
       b2.setBounds(230,420,150,40);
       b2.setBackground(new Color(255,0,0));
       l20.add(b2);
       
       b3=new JButton("Delete");      
       b3.setFont(new Font("Times New Roman",Font.BOLD,14));
       b3.setForeground(Color.WHITE);
       b3.setBounds(390,420,150,40);
       b3.setBackground(new Color(0,0,51));
       l20.add(b3);
       
       l1=new JLabel("Note: Before click update please refreash");
       l1.setFont(new Font("Times New Roman",Font.BOLD,14));
       l1.setForeground(Color.BLACK);
       l1.setBounds(230,470,300,30);
       l20.add(l1);
       
       
       b4=new JButton("Refresh");      
       b4.setFont(new Font("Times New Roman",Font.BOLD,14));
       b4.setForeground(Color.WHITE);
       b4.setBounds(70,470,150,40);
       b4.setBackground(new Color(0,0,51));
       l20.add(b4);
       */
      
       
//       b2.addActionListener(this);
      // b3.addActionListener(this);
      // b4.addActionListener(this);
                 
                 
                 
                 
             }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1)
        {
            String card_no="";
           String u_id="";
           String issu_date="";
           String expiry_date="";
           
           u_id=t1.getText();
           card_no=t2.getText();
           issu_date=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
           expiry_date=((JTextField) dateChooser1.getDateEditor().getUiComponent()).getText();
        
           
            if(u_id.equals("")|issu_date.equals("")|expiry_date.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
            try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select u_id  from users where  u_id ='"+u_id+"'  ");
            
          
            if(rs.next())
            {
        
       
                
            try {
          
           
            
            ResultSet r1=c1.s.executeQuery("select u_id  from membercard where  u_id ='"+u_id+"'  ");
            
          
            if(r1.next())
            {
                
               JOptionPane.showMessageDialog(null, "The user already have in membership"); 
                
            }
            else{

            
             String q1="insert into membercard values('"+card_no+"' ,'"+u_id+"','"+issu_date+"','"+expiry_date+"')";
             c1.s.executeUpdate(q1); 
             JOptionPane.showMessageDialog(null, "You have Successfully add Membership");
            // card_no=card_no+1;
             System.out.println(card_no);
            
             t1.setText("");
             ((JTextField) dateChooser.getDateEditor().getUiComponent()).setText("");
             ((JTextField) dateChooser1.getDateEditor().getUiComponent()).setText("");
             c=Integer.parseInt(card_no);  
             System.out.println(c);
             System.out.println(card_no);
             c=c+1;
          
            b = String.format("%04d", c).substring(0, 4);
             System.out.println(b);
             
             t2.setText(String.valueOf(b));
           
           }
            }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
                
                
                
                
                
           
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "The user id is not valid");
              
            }
         
        
         
            
        }
            catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
                

        }
        
        
        
        
        }
    }
}
