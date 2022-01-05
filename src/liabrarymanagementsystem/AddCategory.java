
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


public class AddCategory extends JPanel  implements ActionListener {
    
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l20;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JDateChooser dateChooser,dateChooser1;
    JPanel p1,p2;
    JPasswordField pt1;
    JButton b1;
    int cat_id,c;
    String b;
    
      
     public static void main(String[] args) {
            new AddCategory().setVisible(true);
	}
     
      public AddCategory ()
             
             {
                 
        
        
        setBounds(0, 0, 790, 560);
        setBackground(new Color(242,242,242));
        setLayout(null);
        
        ImageIcon image=new ImageIcon("src\\picture\\6.jpg");
        Image img=image.getImage();
        Image temp=img.getScaledInstance(790,560,Image.SCALE_SMOOTH);
        image=new ImageIcon(temp);
        l20=new JLabel("",image,JLabel.CENTER);
        l20.setBounds(0, 0, 790, 560);

        add(l20);
        
         p1= new JPanel();
            
            p1.setBackground(new Color(0,0,0,100));
            p1.setBounds(200,100, 380, 100);
            p1.setLayout(null);
            
            
            l20.add(p1);
            
             JLabel l6 = new JLabel("ADD Book Category");
            l6.setBackground(Color.red);
            l6.setForeground(new Color(255, 0, 0));
            l6.setFont(new Font("", Font.BOLD, 30));
            l6.setBounds(50, 30, 400, 50);
            p1.add(l6);
            
            JLabel l3 = new JLabel("Category ID:");
            l3.setBackground(Color.red);
            l3.setForeground(new Color(255, 0, 0));
            l3.setFont(new Font("", Font.BOLD, 20));
            l3.setBounds(200, 220, 150, 30);
            
             try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("select top 1 * from category order by cat_id  desc  ");
            
          
            if(rs.next())
            {
            String sum=rs.getString("cat_id");
            cat_id=Integer.valueOf(sum); 
            cat_id++;
            b= String.format("%04d",cat_id).substring(0, 4);
           
            }
            else
            {
                cat_id=1;
                b= String.format("%04d",cat_id).substring(0, 4);
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            
            l20.add(l3);
            
            t1=new JTextField("");
            t1.setFont(new Font("Times New Roman",Font.BOLD,20));
            t1.setForeground(new Color(255, 0, 0));
            t1.setText(String.valueOf(b));
            t1.setEditable(false);
            t1.setBounds(350,220,240,30);
            t1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t1.setBackground(new Color(255,255,255));
            l20.add(t1); 
            
            JLabel l4 = new JLabel("Category Name");
            l4.setBackground(Color.red);
            l4.setForeground(new Color(255, 0, 0));
            l4.setFont(new Font("", Font.BOLD, 20));
            l4.setBounds(200, 260, 150, 30);
            
            l20.add(l4);
            
            
            t2=new JTextField("");
            t2.setFont(new Font("Times New Roman",Font.BOLD,20));
            t2.setForeground(new Color(255, 0, 0));
            t2.setBounds(350, 260, 240, 30); 
            t2.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t2.setBackground(new Color(255,255,255));
            l20.add(t2);
            
            
            JLabel l5 = new JLabel("Rent Rate");
            l5.setBackground(Color.red);
            l5.setForeground(new Color(255, 0, 0));
            l5.setFont(new Font("", Font.BOLD, 20));
            l5.setBounds(200, 300, 150, 30);
            

         
           
            
            l20.add(l5);
            
            t3=new JTextField("");
            t3.setFont(new Font("Times New Roman",Font.BOLD,20));
            t3.setForeground(new Color(255, 0, 0));
            t3.setBounds(350, 300, 240, 30);
            t3.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t3.setBackground(new Color(255,255,255));
            l20.add(t3);
            
          
            
            JLabel l7= new JLabel("Daily Fine");
            l7.setBackground(Color.red);
            l7.setForeground(new Color(255, 0, 0));
            l7.setFont(new Font("", Font.BOLD, 20));
            l7.setBounds(200, 340, 150, 30);
            l20.add(l7);
            
            t4=new JTextField("");
            t4.setFont(new Font("Times New Roman",Font.BOLD,20));
            t4.setForeground(new Color(255, 0, 0));
            t4.setBounds(350, 340, 240, 30);
            t4.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 0, 0)));
            t4.setBackground(new Color(255,255,255));
            l20.add(t4);

            b1=new JButton("ADD");      
            b1.setFont(new Font("",Font.BOLD,20));
            b1.setForeground(Color.WHITE);
            b1.setBounds(300,380,200,40);
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

   
    public void actionPerformed(ActionEvent e) {
        
    
    
         if(e.getSource()==b1)
        {
           String cat_id="";
           String cat_name="";
           String rent_rate="";
           String daily_fine="";
           
           cat_id=t1.getText();
           cat_name=t2.getText();
           rent_rate=t3.getText();
           daily_fine=t4.getText();
           
        
           
            if(cat_id.equals("")|cat_name.equals("")|daily_fine.equals("")|rent_rate.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }
          
        else{
         
        
         try {
          
            Conn c1 =new Conn();
            
           
            
             String q1="insert into category values( '"+cat_id+"','"+cat_name+"','"+daily_fine+"','"+rent_rate+"')";
             c1.s.executeUpdate(q1); 
             
             
              
           
         
             JOptionPane.showMessageDialog(null, "You have Successfully add number "+cat_id+" Book Category");
             t2.setText("");
            
             t3.setText("");
             t4.setText("");
             
             c=Integer.parseInt(cat_id);  
             System.out.println(c);
             System.out.println(cat_id);
             c=c+1;
          
             b = String.format("%04d", c).substring(0, 4);
             System.out.println(b);
             
             t1.setText(String.valueOf(b));
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
              }
            
        }

        }
    
    
    
    }
    
}
