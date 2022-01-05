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


public class ShowBook extends JPanel  implements ActionListener {
    
    
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
    Object[] columns1={"Picture","ID","title","publisher_name","Catrgory Name","price","numberofcopy","isbn","author"};
    DefaultTableModel model =new DefaultTableModel();
    Object[] row = new Object[9];
     int i,z=0;
   
    int selectedIndex;
    
      
     public static void main(String[] args) {
            new ShowBook().setVisible(true);
	}
     
      public ShowBook ()
             
       {
                 
        setBounds(100, 50, 800, 620);
        setBackground(Color.red);
        setLayout(null);

         model = new DefaultTableModel(){
            @Override
            public Class<?> getColumnClass(int column) {
                if (column==0) return ImageIcon.class;
                return Object.class;
            }
           
            };
                 
        
        ImageIcon image=new ImageIcon("src\\picture\\b7.jpeg");
        Image img=image.getImage();
        Image temp=img.getScaledInstance(900,820,Image.SCALE_SMOOTH);
        image=new ImageIcon(temp);
        l20=new JLabel("",image,JLabel.CENTER);
        l20.setBounds(0, 0, 900, 820);

        add(l20);
        
        



      
       table=new JTable();
      
       b1=new JButton("Show All Book");      
       b1.setFont(new Font("",Font.BOLD,20));
       b1.setForeground(Color.WHITE);
       b1.setBounds(100,50,200,40);
       b1.setBackground(new Color(255,0,0));
       l20.add(b1);
       
       b2=new JButton("Rent");      
       b2.setFont(new Font("",Font.BOLD,20));
       b2.setForeground(Color.WHITE);
       b2.setBounds(500,350,150,40);
       b2.setBackground(new Color(255,0,0));
       //l20.add(b2);
       
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
//       b2.addActionListener(this);
      // b3.addActionListener(this);
      // b4.addActionListener(this);
                 
                 
                 
                 
             }

      
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1)
             
           {
             
        
               try {
          
            Conn c1 =new Conn();
            
            ResultSet rs=c1.s.executeQuery("SELECT  *,   COUNT(*) OVER() AS [Total_Rows] FROM book");
            
          
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
              ResultSet r1=c1.s.executeQuery("with every as(select ROW_NUMBER() over (order by bk_code) row,* from book)SELECT * FROM every where row='"+NID+"'");
            
              try{
                  
                
            if(r1.next()) {
                
                String bk_code="";
                String title="";
                String pub_id="";
                String price="";
                String numberofcopy="";
                String isbn="";
                String picture="";
                String author="";
                String fname="";
                 String lname="";
                 String  name="";
                 String cat_id="";
                 String cat_name="";
                
                
                bk_code=r1.getString("bk_code");
                title=r1.getString("title");
                pub_id=r1.getString("pub_id");
                price=r1.getString("price");
                numberofcopy=r1.getString("numofcopy");
                isbn=r1.getString("isbn");
                picture=r1.getString("picture");
                author=r1.getString("author");
                try {
          
           
            
                    ResultSet r2=c1.s.executeQuery("SELECT  *   FROM publisher where pub_id='"+pub_id+"'");
            
          
                    if(r2.next())
                    {
                        
                        fname=r2.getString("fname");
                        lname=r2.getString("lname");
                        
                     name = fname +" "+lname;
                        
                    }

                    }

                    catch (SQLException ex) {
                   Logger.getLogger(ShowAllUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
          
           
            
                    ResultSet r2=c1.s.executeQuery("SELECT  cat_id FROM bookcategory where bk_code='"+bk_code+"'");
            
          
                    if(r2.next())
                    {
                        cat_id=r2.getString("cat_id");
                         try {
                             ResultSet r3=c1.s.executeQuery("SELECT  cat_name FROM category where cat_id='"+cat_id+"'");
                             
                            
                    if(r3.next())
                    {
            
          
                         cat_name=r3.getString("cat_name");
                    }
                          
                         }
                          catch (SQLException ex) {
                        Logger.getLogger(ShowAllUser.class.getName()).log(Level.SEVERE, null, ex);
                     }

                        
                    }

                    }

                    catch (SQLException ex) {
                   Logger.getLogger(ShowAllUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            
              
            if(picture !=null)
            {
              Image getAbsolutePath = null;
              ImageIcon imageIcon=new ImageIcon(new ImageIcon(picture).getImage().getScaledInstance(110,110,Image.SCALE_SMOOTH));
          
             
            
             l13=new JLabel("",imageIcon,JLabel.CENTER);
             
            row[0]=imageIcon;
             // l13.setVisible(true);
            //l13.add(",imageIcon,JLabel.CENTER);
              
             l13.setBounds(0, 0, 150, 150);
             l20.add(l13);
          
              
              
            }
            
            else{
                
                row[0]=null;
                
            }
             row[1]=bk_code;
             row[2]=title;
             row[3]=name ;
             row[4]=cat_name;
             row[5]=price;
             row[6]=numberofcopy;
             row[7]=isbn;
             row[8]=author;
            
            
             model.addRow(row);
             
             
              
                      
            
            }
            
            
          
          
           
            
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
              
              
               JOptionPane.showMessageDialog(null, "You do not create any Users");
                  
              
            }
            
        }
         catch (SQLException ex) {
           
                  Logger.getLogger(AddAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
         }
             
            
               
       } 
    }
    
}
