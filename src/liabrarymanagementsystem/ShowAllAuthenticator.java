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



public class ShowAllAuthenticator extends JPanel  implements ActionListener {
    
    
    JPanel p1,p2,p3;

    JLabel l1,l20;
    JButton b1,b2,b3,b4;
    JTable table;
    Object[] columns;
    JScrollPane pane;
   Object[] columns1={"ID","TYPE"};
    DefaultTableModel model =new DefaultTableModel();
    Object[] row = new Object[9];
    public static int j,i,l,id,z=0;
    int selectedIndex;
    
      
     public static void main(String[] args) {
            new ShowAllAuthenticator().setVisible(true);
	}
     
      public ShowAllAuthenticator()
             
             {
                 
    
        
        
        setBounds(0, 0, 790, 560);
      
        setBackground(Color.red);
        setLayout(null);

        
        ImageIcon image=new ImageIcon("src\\picture\\6.jpg");
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
           
           JLabel l6 = new JLabel("Show All Authenticator");
           l6.setBackground(Color.red);
           l6.setForeground(new Color(255, 0, 0));
           l6.setFont(new Font("", Font.BOLD, 30));
           l6.setBounds(25, 10, 370, 30);
           p2.add(l6);
           
          
         
           
              



      
       table=new JTable();
      
       b1=new JButton("Show All");      
       b1.setFont(new Font("",Font.BOLD,20));
       b1.setForeground(Color.WHITE);
       b1.setBounds(580,100,150,40);
       b1.setBackground(new Color(255,0,0));
       l20.add(b1);
     
      
       
       model.setColumnIdentifiers(columns1);
       table.setModel(model);
       
       table.setBackground(Color.white);
       table.setForeground(Color.black);
       table.setSelectionBackground(Color.GREEN);
       table.setGridColor(Color.blue);
       table.setSelectionForeground(Color.black);
       table.setFont(new Font("Times New Roman",Font.BOLD,14));
       table.setRowHeight(30);
       table.setPreferredScrollableViewportSize(new Dimension(300, 200));
       table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       table.setAutoCreateRowSorter(true);
       
       pane =new JScrollPane(table);
       pane.setBackground(Color.pink);
       pane.setBounds(50,100,500,400);
       pane.setForeground(Color.black);
       
      
       
       l20.add(pane);
       
       table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }

                     private void mouseCicked(MouseEvent evt) {
                         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                     }
            });
            
       
       
       b1.addActionListener(this);
      
                 
                 
             }

   public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1)
             
           {
               
               try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("SELECT  *,   COUNT(*) OVER() AS [Total_Rows] FROM authenticator");
            
          
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
         
              ResultSet r1=c1.s.executeQuery("with every as(select ROW_NUMBER() over (order by a_id) row,* from authenticator)SELECT * FROM every where row='"+NID+"'");
            
            
              try{
            if(r1.next()) {
                
                String a_id="";
                String type="";
                
                
                a_id=r1.getString("a_id");
                type=r1.getString("type");
            
             row[0]= a_id;
             row[1]=type;
            
           
             
            
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
              
              
               JOptionPane.showMessageDialog(null, "You do not create any Authenticator");
                  
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
         }
             
            
               
       } 
    }
    
}
