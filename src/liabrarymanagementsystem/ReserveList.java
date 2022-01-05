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
import javax.swing.table.DefaultTableModel;


public class ReserveList extends JPanel  implements ActionListener {
    
    
    JPanel p1;
    
     JLabel  l2, l3, l4, l5, l6, l7, l8, l9, l12,l13;
    JDateChooser dateChooser, dateChooser1;
    JTextField t1, t2, t5, t4, t6, t7, t3, t8;


    JPasswordField pt1;
  
    JRadioButton rb1,rb2; 
    int id,l=0,j;

    JLabel l1,l20;
    JButton b1,b2,b3,b4;
    JTable table;
    Object[] columns;
    JScrollPane pane;
    String bk_code="";
                String title="";
                String pub_id="";
                String price="";
                String numberofcopy="";
                String isbn="";
                String picture="";
                String author="";
    Object[] columns1={"Reserve_Id","U_ID","Book_code","Reserve_date","Pick_date","Status"};
    DefaultTableModel model =new DefaultTableModel();
    Object[] row = new Object[6];
     int i,z=0;
   
    int selectedIndex;
    
      
     public static void main(String[] args) {
            new ReserveList().setVisible(true);
	}
     
      public ReserveList ()
             
       {
                 
        setBounds(100, 50, 800, 620);
        setBackground(Color.red);
        setLayout(null);

         
                 
        
        ImageIcon image=new ImageIcon("src\\picture\\b7.jpeg");
        Image img=image.getImage();
        Image temp=img.getScaledInstance(900,820,Image.SCALE_SMOOTH);
        image=new ImageIcon(temp);
        l20=new JLabel("",image,JLabel.CENTER);
        l20.setBounds(0, 0, 900, 820);

        add(l20);
        
        



      
       table=new JTable();
      
       b1=new JButton("Reserve List");      
       b1.setFont(new Font("",Font.BOLD,20));
       b1.setForeground(Color.WHITE);
       b1.setBounds(100,50,200,40);
       b1.setBackground(new Color(255,0,0));
       l20.add(b1);
       
       b2=new JButton("Aprove");      
       b2.setFont(new Font("",Font.BOLD,20));
       b2.setForeground(Color.WHITE);
       b2.setBounds(320,50,150,40);
       b2.setBackground(new Color(255,0,0));
       l20.add(b2);
       
       b3=new JButton("Delete");      
       b3.setFont(new Font("Times New Roman",Font.BOLD,14));
       b3.setForeground(Color.WHITE);
       b3.setBounds(500,400,150,40);
       b3.setBackground(new Color(255,0,0));
       //l20.add(b3);
       
       l1=new JLabel("Note: Before click update please refreash");
       l1.setFont(new Font("Times New Roman",Font.BOLD,14));
       l1.setForeground(Color.BLACK);
       l1.setBounds(480,500,300,30);
       //l20.add(l1);
       
       
       b4=new JButton("Refresh");      
       b4.setFont(new Font("Times New Roman",Font.BOLD,14));
       b4.setForeground(Color.WHITE);
       b4.setBounds(100,50,150,40);
       b4.setBackground(new Color(255,0,0));
       //l20.add(b4);
       
       model.setColumnIdentifiers(columns1);
       table.setModel(model);
       
       table.setBackground(Color.white);
       table.setForeground(Color.black);
       table.setSelectionBackground(Color.GREEN);
       table.setGridColor(Color.blue);
       table.setSelectionForeground(Color.black);
       table.setFont(new Font("Times New Roman",Font.BOLD,14));
        table.setRowHeight(120);
       table.setPreferredScrollableViewportSize(new Dimension(300, 200));
       table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       table.setAutoCreateRowSorter(true);
       table.getColumnModel().getColumn(0).setPreferredWidth(120 );
       table.getColumnModel().getColumn(0);
       
       pane =new JScrollPane(table);
       pane.setBackground(Color.pink);
       pane.setBounds(50,100,650,400);
       pane.setForeground(Color.black);
       
      
       
       l20.add(pane);
       
        table.addMouseListener(new MouseAdapter() {
            private void mouseCicked(MouseEvent evt) { 
     if(evt.getSource()==table)
     
    table.getModel();
    selectedIndex=table.getSelectedRow();   
               
 }
            });
       
       
       b1.addActionListener(this);
        b2.addActionListener(this);
      // b3.addActionListener(this);
      // b4.addActionListener(this);
                 
                 
                 
                 
             }

      
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1)
             
           {
             
        
               try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("SELECT  *,   COUNT(*) OVER() AS [Total_Rows] FROM reservations");
            
          
            if(rs.next())
            {
            String sum=rs.getString("Total_Rows");
            int nid=Integer.valueOf(sum);
            id=nid;
            if(l>0){
                    
                for(j=0;j<id;j++){
                     
                      model.removeRow(0);
               
                    
                     
                 }
           
                
                 
                 l=0;
              
                
            
              }
            
            
           
             if(l==0){
           
             for( i=0;i<id;i++){
           
              int NID= i+1;
              ResultSet r1=c1.s.executeQuery("with every as(select ROW_NUMBER() over (order by bk_code) row,* from reservations)SELECT * FROM every where row='"+NID+"'");
            
              try{
                  
                
            if(r1.next()) {
                
               String u_id="";
            String bk_code="";
            String borrow_date="";
            String retdate="";
            String due_date="";
            String status="";
            String resrve_id="";
                
                
            u_id=r1.getString("u_id");
            bk_code=r1.getString("bk_code");
             due_date=r1.getString("pick_date");
            borrow_date=r1.getString("reserve_date");
             status=r1.getString("satus");
             resrve_id=r1.getString("resrve_id");
           
             row[0]=resrve_id;  
             row[1]=u_id;
             row[2]=bk_code;
             row[3]= due_date;
             row[4]=borrow_date;
             row[5]=status;
            
             model.addRow(row);
             
             
              
                      
            
            }
            
            
          
          
           
            
        }
            
            catch (SQLException ex) {
            Logger.getLogger(ShowAllUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            } 
              l=1;
              System.out.print(+id+"  is=\n");
           }
             
             
       
            }
            else
            {
              
              
               JOptionPane.showMessageDialog(null, "You do not create any Users");
                  
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
         }
             
            
               
       } 
         
          if(e.getSource()==b2)
             
           {
            String u_id="";
            String bk_code="";
            String brodate="";
            String retdate="";
            String due_date="";
            String status="";
            String resrve_id="";
            
           
            status="Borrow";
            
            
               try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("SELECT  *,   COUNT(*) OVER() AS [Total_Rows] FROM reservations");
            
          
            if(rs.next())
            {
            String sum=rs.getString("Total_Rows");
            int nid=Integer.valueOf(sum);
            
            if(nid>0){
            
            
            u_id=(model.getValueAt(selectedIndex,1).toString());
            bk_code=(model.getValueAt(selectedIndex,2).toString());
            brodate=(model.getValueAt(selectedIndex,3).toString());
           
            due_date=(model.getValueAt(selectedIndex,4).toString());
            
            
             if(u_id.equals("")|bk_code.equals("")|brodate.equals("")|due_date.equals("")|status.equals("")){
                
                
               JOptionPane.showMessageDialog(null, "Please fill all the field");  
                
            }
            
            else{
                
                try{
                        
                
                    
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
                         
                          JOptionPane.showMessageDialog(null, "The user already have Borrow this book");
                         
                     }
                     else{
                       
                        
                       try{
                           ResultSet r4=c1.s.executeQuery("select * from memberbook where bk_code ='"+bk_code+"' and u_id ='"+u_id+"'");
                  
                           if(r4.next())  {
                               
                               try{
                               
                                String q5="update memberbook set  status='"+status+"',borrow_date='"+brodate+"',due_date='"+due_date+"',retrn_date='"+retdate+"' where bk_code ='"+bk_code+"' and u_id ='"+u_id+"'";
                                c1.s.executeUpdate(q5); 

                                // c1.s.executeUpdate(q5); 
                               JOptionPane.showMessageDialog(null, "You have Successfully issue Book");  
                               }
                               

                               catch (SQLException ex) {

                               Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
                               
                               
                           }
                           
                           else{
                               
                            try{
                               
                              
                            String q2="insert into memberbook values( '"+bk_code+"','"+u_id+"','"+brodate+"','"+retdate+"','"+due_date+"','"+status+"')";
                            c1.s.executeUpdate(q2); 
                            JOptionPane.showMessageDialog(null, "You have Successfully Borrow Book");
                            String staus="Aprove";
                            
                           // String q3="insert into reservations values( '"+bk_code+"','"+u_id+"','"+brodate+"','"+retdate+"','"+due_date+"','"+status+"')";
                           String q3="update reservations set  satus='"+staus+"' where bk_code ='"+bk_code+"' and u_id ='"+u_id+"'";
                             
                             c1.s.executeUpdate(q3); 
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
               
            else
            {
              
              
               JOptionPane.showMessageDialog(null, "Please select a reserve row");
                  
              
            }
            
           }
               
              catch (SQLException ex) {

                    Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
                       }  
               
           }
    }
    
}
