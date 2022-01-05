

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


public class ShowCategory extends JPanel implements ActionListener {
    
    int id,i,l=0,j;
    
    
    JPanel p1,p2,p3;

    JLabel l1,l20;
    JButton b1,b2,b3,b4;
    JTable table;
    Object[] columns;
    JScrollPane pane;
    Object[] columns1={"Cat_Id","Name","Rent Rate","daily fine"};
    DefaultTableModel model =new DefaultTableModel();
    Object[] row = new Object[4];
    public static int z=0;
    int selectedIndex;
    
      
     public static void main(String[] args) {
         
	new ShowCategory().setVisible(true);
			
    }
         
	
     
      public ShowCategory()
             
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
           
           JLabel l6 = new JLabel("Show All Category");
           l6.setBackground(Color.red);
           l6.setForeground(new Color(255, 0, 0));
           l6.setFont(new Font("", Font.BOLD, 30));
           l6.setBounds(100, 10, 370, 30);
           p2.add(l6);
           
           p3= new JPanel(); 
           p3.setBackground(new Color(255,255,255,100));
           p3.setBounds(580,320, 380, 200);
         
           
         
           
              


      
       table=new JTable();
      
       b1=new JButton("Show All");      
       b1.setFont(new Font("",Font.BOLD,20));
       b1.setForeground(Color.WHITE);
       b1.setBounds(580,100,150,40);
       b1.setBackground(new Color(255,0,0));
       l20.add(b1);
     
     /*  b2=new JButton("Update");      
       b2.setFont(new Font("",Font.BOLD,20));
       b2.setForeground(Color.WHITE);
       b2.setBounds(580,160,150,40);
       b2.setBackground(new Color(255,0,0));
       l20.add(b2);
       
       b3=new JButton("Delete");      
       b3.setFont(new Font("Times New Roman",Font.BOLD,20));
       b3.setForeground(Color.WHITE);
       b3.setBounds(580,210,150,40);
       b3.setBackground(new Color(255,0,0));
       l20.add(b3);
       
       l1=new JLabel("Note: Before click update please refreash");
       l1.setFont(new Font("Times New Roman",Font.BOLD,18));
       l1.setForeground(Color.BLACK);
       l1.setBounds(230,470,300,30);
      
       
       
       b4=new JButton("Refresh");      
       b4.setFont(new Font("Times New Roman",Font.BOLD,20));
       b4.setForeground(Color.WHITE);
       b4.setBounds(580,260,150,40);
       b4.setBackground(new Color(255,0,0));
       l20.add(b4);*/
       
       model.setColumnIdentifiers(columns1);
       table.setModel(model);
       
       table.setBackground(Color.white);
       table.setForeground(Color.black);
       table.setSelectionBackground(Color.GREEN);
       table.setGridColor(Color.blue);
       table.setSelectionForeground(Color.black);
       table.setFont(new Font("Times New Roman",Font.BOLD,14));
       table.setRowHeight(40);
       table.setPreferredScrollableViewportSize(new Dimension(300, 200));
       table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       table.setAutoCreateRowSorter(true);
      
      
       pane =new JScrollPane(table);
       pane.setBackground(Color.pink);
       pane.setBounds(120,100,310,350);
       pane.setForeground(Color.black);
       
      
       
       l20.add(pane);
       table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
            
       
       
       b1.addActionListener(this);
//       b2.addActionListener(this);
      // b3.addActionListener(this);
       //b4.addActionListener(this);
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
            
            ResultSet rs=c1.s.executeQuery("SELECT  *,   COUNT(*) OVER() AS [Total_Rows] FROM category");
            
          
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
              try{
         
              ResultSet r1=c1.s.executeQuery("with every as(select ROW_NUMBER() over (order by cat_id) row,* from Category)SELECT * FROM every where row='"+NID+"'");
            
              
            if(r1.next()) {
                
               
                String cat_id="";
                String cat_name="";
                String daily_fine="";
                String rent_rate="";
               
                
            cat_id=r1.getString("cat_id");
            
            cat_name=r1.getString("cat_name");
            daily_fine=r1.getString("daily_fine");         
            rent_rate =r1.getString("rent_rate");
            
            try {
          
           
            
            ResultSet r2=c1.s.executeQuery("SELECT  *   FROM category where cat_id='"+cat_id+"'");
            
          
           if(r2.next()){
             row[0]=cat_id;
             row[1]=cat_name ;
             row[2]=daily_fine;
             row[3]=rent_rate;
             
             System.out.print(cat_id);
           
             model.addRow(row);
             
             
              
                      
            
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
        
            }
           l=1; 
            
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

