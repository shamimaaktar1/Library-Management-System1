/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liabrarymanagementsystem;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReturnBook extends JPanel implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser,dateChooser1;
    JComboBox cb;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    private JButton b1,b2,b3,b4;
    
    
    JLabel l20;
    JPanel p1;
    
    
    String bk_code="";
    String pub_id="";
    String price="";
    String numofcopy="";
    String  isbn="";
    String author="";
    String title="";
    
    String u_id="";
    String a_id="";
    String fname="";
    String lname="";
    String  phone="";
    String dateofbirth="";
    String addres="";
     String duedate="";

    public static void main(String[] args) {
	new ReturnBook().setVisible(true);
			
    }

    public ReturnBook() {
        setBounds(200, 100, 750, 500);
        setLayout(null);
	//contentPane = new JPanel();
	//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//setContentPane(contentPane);
        //contentPane.setBackground(Color.WHITE);
	//contentPane.setLayout(null);
        
 

            ImageIcon image=new ImageIcon("src\\picture\\b7.jpeg");
            Image img=image.getImage();
            Image temp=img.getScaledInstance(900,820,Image.SCALE_SMOOTH);
            image=new ImageIcon(temp);
            l20=new JLabel("",image,JLabel.CENTER);
            l20.setBounds(0, 0, 900, 820);
            
            add(l20);
            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2, true), "Book_Info",
                                    TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
            panel.setFont(new Font("Tahoma", Font.BOLD, 14));
            panel.setBounds(10, 38, 345, 288);
            panel.setBackground(new Color(255, 255, 255,0));
            panel.setLayout(null);
            l20.add(panel);
        
        
  

	JLabel l1 = new JLabel("Book Code");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(255, 255, 255));
	l1.setBounds(20, 20, 100, 30);
        panel.add(l1);
        
	

	JLabel l2 = new JLabel("Title");
	l2.setForeground(new Color(255, 255, 255));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(20, 60, 100, 30);
        panel.add(l2);
	
	JLabel l3 = new JLabel("Publisher");
	l3.setForeground(new Color(255, 255, 255));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(20, 100, 100, 30);
         panel.add(l3);
	

	JLabel l4 = new JLabel("available copy");
	l4.setForeground(new Color(255, 255, 255));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(20, 140, 100, 30);
         panel.add(l4);
	

	JLabel l5 = new JLabel("ISBN");
	l5.setForeground(new Color(255, 255, 255));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(20, 180, 100, 30);
        panel.add(l5);


	JLabel l6 = new JLabel("author");
	l6.setForeground(new Color(255, 255, 255));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(20, 220, 100, 30);
        panel.add(l6);


	
	

	t1 = new JTextField();
	t1.setForeground(new Color(255, 255, 255));
        t1.setBackground(new Color(3, 36, 103));
        
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 20, 86, 30);
        panel.add(t1);
	
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.WHITE);
        b1.setForeground(new Color(3, 36, 103));
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(234, 20, 100, 30);
         panel.add(b1);
         
        


	t2 = new JTextField();
	t2.setForeground(new Color(255, 255, 255));
        t2.setEditable(false);
        t2.setBackground(new Color(3, 36, 103));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 60, 208, 30);
         panel.add(t2);

	t2.setColumns(10);

	t3 = new JTextField();
	t3.setForeground(new Color(255, 255, 255));
        t3.setBackground(new Color(3, 36, 103));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
        t3.setEditable(false);
	t3.setBounds(126, 100, 208, 30);
        panel.add(t3);
	

	t4 = new JTextField();
	t4.setForeground(new Color(255, 255, 255));
        t4.setBackground(new Color(3, 36, 103));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
        t4.setEditable(false);
	t4.setBounds(126, 140, 208, 30);
         panel.add(t4);
	

	
	
	t6 = new JTextField();
	t6.setForeground(new Color(255, 255, 255));
        t6.setBackground(new Color(3, 36, 103));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
        t6.setEditable(false);
	t6.setBounds(126, 180, 208, 30);
        panel.add(t6);

	t7 = new JTextField();
	t7.setForeground(new Color(255, 255, 255));
        t7.setBackground(new Color(3, 36, 103));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
        t7.setEditable(false);
	t7.setBounds(126, 220, 208, 30);
        panel.add(t7);


	 JPanel p2 = new JPanel();
             p2.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 2, true), "User_Info",
                                    TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
             p2.setFont(new Font("Tahoma", Font.BOLD, 14));
            p2.setBounds(360, 38, 345, 288);
             p2.setBackground(new Color(255, 255, 255,0));
            p2.setLayout(null);
            l20.add(p2);

	JLabel l8 = new JLabel("User_id");
	l8.setForeground(new Color(255, 255, 255));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(20, 20, 100, 30);
         p2.add(l8);

	JLabel l9 = new JLabel("First Name");
	l9.setForeground(new Color(255, 255, 255));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(20, 60, 100, 30);
	  p2.add(l9);

	JLabel l10 = new JLabel("Last Name");
	l10.setForeground(new Color(255, 255, 255));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(20, 100, 100, 30);
        p2.add(l10);
	

	JLabel l11 = new JLabel("Phone");
	l11.setForeground(new Color(255, 255, 255));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(20, 140, 100, 30);
         p2.add(l11);
	

	JLabel l12 = new JLabel("Date of birth");
	l12.setForeground(new Color(255, 255, 255));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(20, 180, 100, 30);
        p2.add(l12);
	

	JLabel l13 = new JLabel("Address");
	l13.setForeground(new Color(255, 255, 255));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(20, 220, 100, 30);
         p2.add(l13);
	

	
        
        t8 = new JTextField();
	t8.setForeground(new Color(255, 255, 255));
        t8.setBackground(new Color(3, 36, 103));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
       
	t8.setBounds(126, 20, 86, 30);
        p2.add(t8);
	
        b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b2.setBackground(Color.WHITE);
        b2.setForeground(new Color(3, 36, 103));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(234, 20, 100, 30);
         p2.add(b2);
         
        

	t9 = new JTextField();
	t9.setForeground(new Color(255, 255, 255));
        t9.setBackground(new Color(3, 36, 103));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setBounds(126, 60, 208, 30);
        t9.setEditable(false);
         p2.add(t9);

	t9.setColumns(10);

	t10= new JTextField();
	t10.setForeground(new Color(255, 255, 255));
        t10.setBackground(new Color(3, 36, 103));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setColumns(10);
        t10.setEditable(false);
	t10.setBounds(126, 100, 208, 30);
        p2.add(t10);
        

	t11 = new JTextField();
	t11.setForeground(new Color(255, 255, 255));
        t11.setBackground(new Color(3, 36, 103));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setColumns(10);
        t11.setEditable(false);
	t11.setBounds(126, 140, 208, 30);
        p2.add(t11);
	

	t12 = new JTextField();
	t12.setForeground(new Color(255, 255, 255));
        t12.setBackground(new Color(3, 36, 103));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setColumns(10);
         t12.setEditable(false);
	t12.setBounds(126, 140, 208, 30);
        p2.add(t12);
        
        t13= new JTextField();
	t13.setForeground(new Color(255, 255, 255));
        t13.setBackground(new Color(3, 36, 103));
	t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t13.setColumns(10);
        t13.setEditable(false);
	t13.setBounds(126, 180, 208, 30);
        p2.add(t13);

	t14 = new JTextField();
	t14.setForeground(new Color(255, 255, 255));
        t14.setBackground(new Color(3, 36, 103));
	t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t14.setColumns(10);
        t14.setEditable(false);
	t14.setBounds(126, 220, 208, 30);
        p2.add(t14);

	
	
	

	

	

        
           
	
        
	JLabel l15 = new JLabel(" Date of Return:");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(20, 340, 118, 26);
        l20.add(l15);
	

	dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(137, 337, 200, 30);
        l20.add(dateChooser);
         
        JLabel l16= new JLabel(" Date of Expire:");
	l16.setForeground(new Color(105, 105, 105));
	l16.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l16.setBounds(360, 340, 120, 30);
        l20.add(l16);
        
  
        
        t15 = new JTextField();
	t15.setForeground(new Color(255, 255, 255));
        t15.setBackground(new Color(3, 36, 103));
	t15.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t15.setColumns(10);
        t15.setEditable(false);
	t15.setBounds(500, 340, 200, 30);
        l20.add(t15);
	
        
        

	//dateChooser1 = new JDateChooser();
	//dateChooser1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	//dateChooser1.setForeground(new Color(105, 105, 105));
	//dateChooser1.setBounds(500, 340, 200, 30);
       //l20.add(dateChooser1);
        
        JLabel l17= new JLabel("Status");
	l17.setForeground(new Color(105, 105, 105));
	l17.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l17.setBounds(360, 380, 120, 30);
       // l20.add(l17);
        
         String type[]={"Return","Borrow"};        
             cb=new JComboBox(type);    
             cb.setBounds(500, 380, 200, 30);
             cb.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
             cb.setBackground(new Color(255,255,255));
            // l20.add(cb);     
       
	

	b3 = new JButton("Return");
	b3.addActionListener(this);
        b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b3.setBackground(Color.WHITE);
        b3.setForeground(new Color(3, 36, 103));
	b3.setBounds(140, 400, 150, 33);
        l20.add(b3);
        
        //b3.addActionListener(this);
        
        
     
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==b1)
        {
            bk_code=t1.getText();
            System.out.print(bk_code);
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from book where bk_code='"+bk_code+"' ");
            
          
            if(rs.next())
            {
         
                

      
               bk_code=rs.getString("bk_code");
               title=rs.getString("title");
               pub_id=rs.getString("pub_id");
               numofcopy=rs.getString("numofcopy");
               isbn=rs.getString("isbn");
               author=rs.getString("author");
               
               
       
                t2.setText(title);
                t3.setText( pub_id);
                t4.setText(numofcopy);
         
                t6.setText(isbn);
                t7.setText(author);
       
     
       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  book  does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
         
        
        if(e.getSource()==b2)
        {
            u_id=t8.getText();
            System.out.print( u_id);
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from users where u_id ='"+u_id+"' ");
            
          
            if(rs.next())
            {
         
                
                 String u_id="";
                 String a_id="";
                 String fname="";
                 String lname="";
                 String  phone="";
                 String dateofbirth="";
                 String addres="";


      
               u_id=rs.getString("u_id");
               a_id=rs.getString("a_id");
               fname=rs.getString("fname");
               lname=rs.getString("lname");
               phone=rs.getString("phone");
               Date datefbirth=rs.getDate("dateofbirth");
               addres=rs.getString("addres");
               
               
               System.out.print(String.valueOf(datefbirth));
               System.out.print(addres);
      
         
     
        
               
                t9.setText(  a_id);
                t10.setText(fname);
         
                t11.setText(lname);
                t12.setText(phone);
                t13.setText(String.valueOf(datefbirth));
                t14.setText(addres);
                
       
     
       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This  users does not have"); 
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
             
             
             
                   
           bk_code=t1.getText();
        
         try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select * from memberbook where bk_code ='"+bk_code+"' and u_id='"+u_id+"' ");
            
          
            if(rs.next())
            {
            duedate=rs.getString("due_date");
            t15.setText(duedate);
        
       
            }
         
            
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
         
        
        
         if(e.getSource()==b3)
        {
            String uid="";
            String bkcode="";
            String brodate="";
            String retdate="";
            String due_date="";
            String status="Return";
            
            u_id=t8.getText();
            bk_code=t1.getText();
            status=cb.getSelectedItem().toString();
            brodate =  ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            //due_date=((JTextField) dateChooser1.getDateEditor().getUiComponent()).getText();
            
            
            if(u_id.equals("")|bk_code.equals("")|brodate.equals("")|status.equals("")){
                
                
               JOptionPane.showMessageDialog(null, "Please fill all the field");  
                
            }
            
            else{
                
                try{
                        
                Conn c1= new Conn();
                    
                ResultSet r1=c1.s.executeQuery("select * from users where u_id ='"+u_id+"' ");
                
             try{
            
          
            if(r1.next())
            {
                    ResultSet r2=c1.s.executeQuery("select * from book where bk_code ='"+bk_code+"' ");

                 try{


                    if(r2.next())
                  {
                     
                      
                   ResultSet r3=c1.s.executeQuery("select * from memberbook where bk_code ='"+bk_code+"' and u_id ='"+u_id+"' and status='"+status+"'");
                     
                   
                    try{
                   
                   if(r3.next())  {
                         
                          JOptionPane.showMessageDialog(null, "The user already have Return this book");
                         
                     }
                     else{
                       
                       
                        ///String q2="insert into memberbook values( '"+bk_code+"','"+u_id+"','"+brodate+"','"+retdate+"','"+due_date+"','"+status+"')";
                        

                         String q5="update memberbook set  status='"+status+"',retrn_date='"+brodate+"' where bk_code ='"+bk_code+"' and u_id ='"+u_id+"'";
                         c1.s.executeUpdate(q5); 

                         // c1.s.executeUpdate(q5); 
                        JOptionPane.showMessageDialog(null, "You have Successfully Return Book");   
                        
                            t9.setText("");
                            t10.setText("");

                            t11.setText("");
                            t12.setText("");
                            t13.setText("");
                            t14.setText("");
                            

                            t2.setText("");
                            t3.setText("");
                            t4.setText("");

                            t6.setText("");
                            t7.setText("");
                               
                                     
                           
                                   
                                  
                                  
                              }
                        }
                            
                    
                     catch (SQLException ex) {

                               Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
                    
                    
                  }
                 }
                 
                 catch (SQLException ex) {

                    Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
                       }    
                 
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
         
         
         
       
        
      
    }
}
