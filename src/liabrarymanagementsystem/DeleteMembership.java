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


public class DeleteMembership extends JPanel  implements ActionListener {
    
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l20;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JDateChooser dateChooser,dateChooser1;
    JPanel p1,p2;
    JPasswordField pt1;
    JButton b1,b2;
    
    String MID;
    
      
     public static void main(String[] args) {
            new DeleteMembership().setVisible(true);
	}
     
      public DeleteMembership ()
             
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
            
             JLabel l6 = new JLabel("DELETE MEMBERSHIP");
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
            
            
            
            
            t2=new JTextField("");
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
      
           
            t2.setForeground(new Color(255, 0, 0));
            t2.setBounds(300,220,110,30);
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t2.setBackground(new Color(255,255,255));
            l20.add(t2); 
            
             b2=new JButton("Search");      
            b2.setFont(new Font("",Font.BOLD,20));
            b2.setForeground(Color.WHITE);
            b2.setBounds(420,220,110,30);
            b2.setBackground(new Color(255,0,0));
            l20.add(b2);
            
            b2.addActionListener(this);
            
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
            t1.setEditable(false);
            t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t1.setBackground(new Color(255,255,255));
            l20.add(t1); 
            
            JLabel l4 = new JLabel("Issu Date:");
            l4.setBackground(Color.red);
            l4.setForeground(new Color(255, 0, 0));
            l4.setFont(new Font("", Font.BOLD, 20));
            l4.setBounds(150, 300, 150, 30);
            
            l20.add(l4);
            
           
             t3=new JTextField("");
            t3.setFont(new Font("Times New Roman",Font.BOLD,20));
            t3.setForeground(new Color(255, 0, 0));
            t3.setBounds(300, 300, 240, 30); 
            t3.setEditable(false);
            t3.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t3.setBackground(new Color(255,255,255));
            l20.add(t3); 
            
            dateChooser = new JDateChooser();
            dateChooser.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            dateChooser.setForeground(new Color(105, 105, 105));
            dateChooser.setBounds(300, 300, 240, 30); 
 
            
            JLabel l5 = new JLabel("Expire Date:");
            l5.setBackground(Color.red);
            l5.setForeground(new Color(255, 0, 0));
            l5.setFont(new Font("", Font.BOLD, 20));
            l5.setBounds(150, 340, 150, 30);
            

         
           
            
            l20.add(l5);
            
            t4=new JTextField("");
            t4.setFont(new Font("Times New Roman",Font.BOLD,20));
            t4.setForeground(new Color(255, 0, 0));
            t4.setBounds(300, 340, 240, 30); 
            t4.setEditable(false);
            t4.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t4.setBackground(new Color(255,255,255));
            l20.add(t4); 
            
            
            dateChooser1 = new JDateChooser();
            dateChooser1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            dateChooser1.setForeground(new Color(105, 105, 105));
            dateChooser1.setBounds(300, 340, 240, 30);
            //l20.add(dateChooser1);

            b1=new JButton("DELETE");      
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
        
         if(e.getSource()==b2)
        {
            MID=t2.getText();
            System.out.print(MID);
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from membercard where card_no='"+MID+"' ");
            
          
            if(rs.next())
            {
         
     
      
         String u_id=rs.getString("u_id");
         String issue_date=rs.getString("issue_date");
         String exp_date=rs.getString("exp_date");
      
         
     
        
         t1.setText(u_id);
         t3.setText(issue_date);
         t4.setText(exp_date);
       
     
       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  membership does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
         
          if(e.getSource()==b1)
     {
         String card_no=t2.getText();;
         String u_id=t1.getText();
         String issue_date=t3.getText();
         String exp_date= t4.getText();
      
         
        
        
         if(card_no.equals("")|u_id.equals("")|issue_date.equals("")|exp_date.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
         
        
         try {
           Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select card_no from membercard where  card_no='"+card_no+"' ");
            
          
            if(rs.next())
            {
          
                   String q1="DELETE   from membercard where  card_no ='"+card_no+"' ";
                   c1.s.executeUpdate(q1); 
                   JOptionPane.showMessageDialog(null, "You have Successfully delete membership");
          
            }
            
            else{
                 JOptionPane.showMessageDialog(null, "The card number is wrong");
          
                
            }
               
         
            }
                
                 catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        
         }    } 
     }
}
