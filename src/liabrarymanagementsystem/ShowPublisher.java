/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liabrarymanagementsystem;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ShowPublisher extends JPanel  implements ActionListener {
    
    int id,i,l=0,j;
    
    
    JPanel p1,p2,p3;

    JLabel l1,l20;
    JButton b1,b2,b3,b4;
    JTable table;
    Object[] columns;
    JScrollPane pane;
    Object[] columns1={"PublisherId","Fname","Lname","Phone","Date of Birth","Address"};
    DefaultTableModel model =new DefaultTableModel();
    Object[] row = new Object[6];
    public static int z=0;
    int selectedIndex;
    
      
     public static void main(String[] args) {
         
	new ShowPublisher().setVisible(true);
			
    }
         
	
     
      public ShowPublisher()
             
             {
                 
   
        
        
        setBounds(0, 0, 790, 560);
      
        setBackground(Color.red);
        setLayout(null);
        
         
                 

        
        ImageIcon image=new ImageIcon("src\\picture\\39.jpg");
        Image img=image.getImage();
        Image temp=img.getScaledInstance(790,560,Image.SCALE_SMOOTH);
        image=new ImageIcon(temp);
        l20=new JLabel("",image,JLabel.CENTER);
        l20.setBounds(0, 0, 790, 560);

        add(l20);
           p2= new JPanel(); 
           p2.setBackground(new Color(255,255,255,100));
           p2.setBounds(120,20, 380, 50);
           p2.setLayout(null);
           
           l20.add(p2);
           
           JLabel l6 = new JLabel("Show All Publisher");
           l6.setBackground(Color.red);
           l6.setForeground(new Color(255, 0, 0));
           l6.setFont(new Font("", Font.BOLD, 30));
           l6.setBounds(50, 10, 370, 30);
           p2.add(l6);
           
         
    



      
       table=new JTable();
      
       b1=new JButton("Show All");      
       b1.setFont(new Font("",Font.BOLD,20));
       b1.setForeground(Color.red);
       b1.setBounds(580,100,150,40);
       b1.setBackground(new Color(255,255,255));
       l20.add(b1);
     
      
      
       
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
   
       
       
       pane =new JScrollPane(table);
       pane.setBackground(Color.pink);
       pane.setBounds(50,100,500,400);
       pane.setForeground(Color.black);
       
      
       
       l20.add(pane);
       table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
            
       
       
       b1.addActionListener(this);
       
    }
    private void mouseCicked(MouseEvent evt) { 
     if(evt.getSource()==table)
     
    table.getModel();
    selectedIndex=table.getSelectedRow();   
               
 }
    public void actionPerformed(ActionEvent e) {
        
         if(e.getSource()==b1)
             
           {
               
               try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("SELECT  *,   COUNT(*) OVER() AS [Total_Rows] FROM publisher");
            
          
            if(rs.next())
            {
            String sum=rs.getString("Total_Rows");
            int nid=Integer.valueOf(sum);
            id=nid;
            if(l>0){
                System.out.print("minus l gjis= "+l+"\n");
                
                
                for(j=0;j<id;j++){
                     
                      model.removeRow(0);
               
                     System.out.print(id+" row remove= "+j+"\n");
                       System.out.print("minus l is= "+l+"\n");
                      
                       
                     
                 }
           
                
                 
                 l=0;
                 System.out.print("minus l is= "+l+"\n");
                
            
        }
            
            
            
           
             if(l==0){
           System.out.print(+id+"remove id  is=\n");
            for( i=0;i<id;i++){
           
              int NID= i+1;
         
              ResultSet r1=c1.s.executeQuery("with every as(select ROW_NUMBER() over (order by pub_id) row,* from publisher)SELECT * FROM every where row='"+NID+"'");
            
              try{
            if(r1.next()) {
                
                String aid="" ;
                String uid="";
                String fname="";
                String lname="";
                String phone="";
                String dateofbirth="";
                String address="";
                String password="";
                String picture="";
                String gender="";
                
            uid=r1.getString("pub_id");
            
           
            fname=r1.getString("fname");         
            lname =r1.getString("lname");
            phone = r1.getString("phone");
            address= r1.getString("address");
           
            dateofbirth = r1.getString("dateofbirth");
           
            
              
           
             row[0]=uid;
             row[1]=fname;
             row[2]=lname ;
           
             row[3]= phone;
             row[5]=address;
           
             row[4]=dateofbirth;
          
             model.addRow(row);
             
             
              
                      
            
            }
            
            
          
            System.out.print(+id+"plus add row is="+i+"\n");
              
           
            
        }
            
            catch (SQLException ex) {
            Logger.getLogger(ShowAllUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            } 
              l=id;
              System.out.print(+id+"  is=\n");
           }
             
             
       
            }
            else
            {
              
              
               JOptionPane.showMessageDialog(null, "You do not create any publisher");
                  
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
         }
             
            
               
       }
        
        
        
        
        
        
    }
    

    
      
    
    
}
