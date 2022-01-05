

package liabrarymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.lang.String;
import javax.swing.*;

/**
 *
 * @author Shamima
 */
public class Member1 extends JFrame implements ActionListener {
    JPanel top,side,center,home,exit,p1,p2,p3,p4,p5,p6,p7,ext,min,profile;
    JLabel ladmin,linformation,ltop,lhome,lexit,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,lext,lmin,title;
    
    AdminHome home1 =new AdminHome();
    
    
   
    
    Reservation Reservation=new Reservation();
    ShowBook   ShowBook=new ShowBook() ;
    SearchBook SearchBook=new SearchBook();


    
    
    
    
    
    
    
    
   
    Member1()
    {
        
       setLayout(null);
       top= new JPanel();
       top.setBackground(new Color(3, 3, 92));
       top.setLayout(null);
       
       ext= new JPanel();
       ext.setBackground(new Color(3, 3, 92));
       ext.setLayout(null);
       
       min= new JPanel();
       min.setBackground(new Color(3, 3, 92));
       min.setLayout(null);
        
       
       side= new JPanel();
       side.setBackground(new Color(0, 0, 51));
       
       
       center= new JPanel();
       center.setBackground(new Color(255,255,255));
       
       
       p1= new JPanel();
       p1.setBackground(new Color(0, 0, 51));
       
       p2= new JPanel();
       p2.setBackground(new Color(0, 0, 51));
       
       //home= new JPanel();
       //home.setBackground(new Color(0, 0, 51));
       
       
       
       p6= new JPanel();
       p6.setBackground(new Color(0, 0, 51));
       
       
       exit= new JPanel();
       exit.setBackground(new Color(0, 0, 51));
       
       
       
       //lhome=new JLabel("Home");
       //lhome.setFont(new Font("Times New Roman",Font.BOLD,20));
       //lhome.setForeground(Color.WHITE);
       
       title=new JLabel("Library Management System");
       title.setFont(new Font("Times New Roman",Font.BOLD,20));
       title.setForeground(Color.WHITE);
       
       l1=new JLabel("Reservation");
       l1.setFont(new Font("Times New Roman",Font.BOLD,20));
       l1.setForeground(Color.WHITE);
        l1.setBounds(50,0,150,40);
       
       lext=new JLabel("X");
       lext.setFont(new Font("Times New Roman",Font.BOLD,20));
       lext.setForeground(Color.WHITE);
       
       
       lmin=new JLabel("-");
       lmin.setFont(new Font("Times New Roman",Font.BOLD,36));
       lmin.setForeground(Color.WHITE);
       
       l2=new JLabel("Home");
       l2.setFont(new Font("Times New Roman",Font.BOLD,20));
       l2.setForeground(Color.WHITE);
       l2.setBounds(50,0,150,40);
       
       
       
       ladmin=new JLabel("Search Book");
       ladmin.setFont(new Font("Times New Roman",Font.BOLD,20));
       ladmin.setForeground(Color.WHITE);
       ladmin.setBounds(50,0,150,40);
       
       
       lexit=new JLabel("Exit");
       lexit.setFont(new Font("Times New Roman",Font.BOLD,20));
       lexit.setForeground(Color.WHITE);
       lexit.setBounds(50,0,150,40);
       
      
       //Deposit Sectio
        
     
       
       top.setBounds(0, 0, 950, 30);
//       ltop.setBounds(0, 0, 800, 100);
       //top.add(ltop);
       add(top);
       title.setBounds(300, 0, 300, 30);
       top.add(title);
       
       min.setBounds(850, 0, 40, 30);
       top.add(min);
       
       ext.setBounds(900, 0, 50, 30);
       top.add(ext);
       
       
       
       lext.setBounds(15,0,50,30);
       
       ext.add(lext);
     
       
       lmin.setBounds(15,0,50,25);
       min.add(lmin);
       
       
       
       
       
       side.setBounds(0, 30, 200, 600);
       side.setLayout(null);
       add(side);
       
/*       home.setBounds(0,60,150,40);
       home.add(lhome);
       side.add(home);*/
       
       p2.setBounds(0,120,200,40);
       p2.setLayout(null);
       p2.add(l2);
       side.add(p2);
       
       ImageIcon image1=new ImageIcon("src\\picture\\h8.png");
        Image img1=image1.getImage();
        Image temp1=img1.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image1=new ImageIcon(temp1);
        l5=new JLabel("",image1,JLabel.CENTER);
        l5.setBounds(10, 5, 30, 30);
        p2.add(l5);
       
       
       p1.setBounds(0,160,200,40);
       p1.add(l1);
       p1.setLayout(null);
       side.add(p1);
       
        ImageIcon image2=new ImageIcon("src\\picture\\a1.png");
        Image img2=image2.getImage();
        Image temp2=img2.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image2=new ImageIcon(temp2);
        l6=new JLabel("",image2,JLabel.CENTER);
        l6.setBounds(10, 5, 30, 30);
        p1.add(l6);
       
        profile = new JPanel();
        profile.setBounds(0,20,200,40);
        profile.setBackground(new Color(0, 0, 51));
        profile.setLayout(null);
        side.add( profile);
        
        l11=new JLabel("Member");
       l11.setFont(new Font("Times New Roman",Font.BOLD,20));
       l11.setForeground(Color.WHITE);
        l11.setBounds(60,0,150,40);
        profile.add(l11);
        
        ImageIcon image=new ImageIcon("src\\picture\\p8.png");
        Image img=image.getImage();
        Image temp=img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        image=new ImageIcon(temp);
        l4=new JLabel("",image,JLabel.CENTER);
        l4.setBounds(10, 0, 40, 40);
        profile.add(l4);
        
        JSeparator sep = new JSeparator(); 
        sep.setBackground(new Color(255, 255, 255));
        sep.setBounds(0,80,200,40);
        side.add(sep);  

       
       /*deposit.setBounds(0,180,150,40);
       deposit.add(ldeposit);
       side.add(deposit);
       
       withdraw.setBounds(0,220,150,40);
       withdraw.add(lwithdraw);
       side.add(withdraw);
       
       transfer.setBounds(0,260,150,40);
       transfer.add(ltransfer);
       side.add(transfer);*/
       
       p6.setBounds(0,200,200,40);
       p6.add(ladmin);
       p6.setLayout(null);
       side.add(p6);
       
       ImageIcon image3=new ImageIcon("src\\picture\\s1.png");
        Image img3=image3.getImage();
        Image temp3=img3.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image3=new ImageIcon(temp3);
        l7=new JLabel("",image3,JLabel.CENTER);
        l7.setBounds(10, 5, 30, 30);
        p6.add(l7);
        
       p7= new JPanel();
       p7.setBackground(new Color(0, 0, 51));
       p7.setBounds(0,240,200,40);
       p7.setLayout(null);
       side.add(p7);
       
        ImageIcon image4=new ImageIcon("src\\picture\\s2.png");
        Image img4=image4.getImage();
        Image temp4=img4.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image4=new ImageIcon(temp4);
        l8=new JLabel("",image4,JLabel.CENTER);
        l8.setBounds(10, 5, 30, 30);
        p7.add(l8);
        
          
       l9=new JLabel("Show");
       l9.setFont(new Font("Times New Roman",Font.BOLD,20));
       l9.setForeground(Color.WHITE);
       l9.setBounds(50,0,150,40);
       p7.add(l9);
       
        ImageIcon image5=new ImageIcon("src\\picture\\e3.png");
        Image img5=image5.getImage();
        Image temp5=img5.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image5=new ImageIcon(temp5);
        l10=new JLabel("",image5,JLabel.CENTER);
        l10.setBounds(10, 5, 30, 30);
        exit.add(l10);
       
       
       exit.setBounds(0,280,200,40);
       exit.setLayout(null);
       exit.add(lexit);
       side.add(exit);
       
       center.setBounds(200,30, 800, 600);
       center.setLayout(new CardLayout());
       add(center);
       
        
       // login.b1.addActionListener(this);
           
       
        
        add(center, BorderLayout.CENTER);
        center.add(home1, "card1");   
       // center.add( Profile, "card2"); 
         center.add( Reservation, "card3");
        center.add(ShowBook, "card3");
       center.add(SearchBook, "card4");
                
        
       // center.add(tranp2, "card12"); */
        
         profile.addMouseListener(new MouseAdapter() {
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
        
       
       p1.addMouseListener(new MouseAdapter() {
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
         
         p7.addMouseListener(new MouseAdapter() {
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
         
         /* home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
               MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                MouseExited(evt);
            }
            
            
        });*/
          
           
            
            
            
           
            exit.addMouseListener(new MouseAdapter() {
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
            
          ext.addMouseListener(new MouseAdapter() {
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
          
          min.addMouseListener(new MouseAdapter() {
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
            
        p6.addMouseListener(new MouseAdapter() {
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
        
        
        

            
            
            
            
            
    
           
    getContentPane().setBackground(new Color(33, 40, 62));
    setUndecorated(true);

    //setShape(new RoundRectangle2D.Double(0, 0, 800, 630, 50, 50));
    setSize(940,590);
    setLocation(200,50);
    setVisible(true); 
    FrameDragListener frameDragListener = new FrameDragListener(this);
    this.addMouseListener(frameDragListener);
    this.addMouseMotionListener(frameDragListener);
    setDefaultCloseOperation( JFrame.HIDE_ON_CLOSE );
   
        
    }
    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }
    
    private void mouseCicked(MouseEvent evt) { 
        
        if(evt.getSource()==p2){
         home1.setVisible(true);
         Reservation.setVisible(false);
        
         ShowBook.setVisible(false);
         SearchBook.setVisible(false);
        
      }
        
        
        
        if(evt.getSource()== p1){
        
        home1.setVisible(false);
        Reservation.setVisible(true);   
       
        ShowBook.setVisible(false);
        SearchBook.setVisible(false);
       

      }
        
        if(evt.getSource()== p7){
        
        home1.setVisible(false);
        Reservation.setVisible(false);   
       
        ShowBook.setVisible(true);
        SearchBook.setVisible(false);
       

      }
        
        if(evt.getSource()== p6){
        
        home1.setVisible(false);
        Reservation.setVisible(false);   
        
        ShowBook.setVisible(false);
        SearchBook.setVisible(true);
       

      }
        
       
        
        
    
    


            
       
        
         
        
           if(evt.getSource()==ext)
     {
         System.exit(0);
         
         //setState(Frame.ICONIFIED);
         
         
     }
           
     
           if(evt.getSource()==min)
     {
         
         
         setState(Frame.ICONIFIED);
         
         
     }
     
     if(evt.getSource()==exit)
     {
          System.exit(0);
        
     }
 
    
    }
    
    
    
    
    
    
    
   
    private void MouseEntered(MouseEvent evt) { 
        
        if (evt.getSource()==profile)
        {
            profile.setBackground(new Color(3, 3, 92));
            
        }
        
            if(evt.getSource()==p7)
        {
             p7.setBackground(new Color(3, 3, 92));
            //setState(Frame.ICONIFIED);


        }

        if (evt.getSource()==p1)
        {
            p1.setBackground(new Color(3, 3, 92));
            
        }
        
         if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(3, 3, 92));
            
        }
         if (evt.getSource()==home)
        {
            home.setBackground(new Color(3, 3, 92));
            
        }
           
         if (evt.getSource()==exit)
        {
            exit.setBackground(new Color(3, 3, 92));
            
        }
         if (evt.getSource()==p6)
        {
            p6.setBackground(new Color(3, 3, 92));
            
        }
         if (evt.getSource()==ext)
        {
            ext.setBackground(new Color(255, 0, 0));
            
        }
         
         if (evt.getSource()==min)
        {
            min.setBackground(new Color(255, 0, 0));
            
        }
        
         
          
    }                                

    private void MouseExited(MouseEvent evt) {  
         if (evt.getSource()==profile)
        {
            profile.setBackground(new Color(0,0,51));
            
        }
         
          if(evt.getSource()==p7)
        {
             p7.setBackground(new Color(0,0,51));

            //setState(Frame.ICONIFIED);


        }
        
        if (evt.getSource()==p1)
        {
            p1.setBackground(new Color(0,0,51));
            
        }
        
         if (evt.getSource()==p2)
        {
            p2.setBackground(new Color(0,0,51));
            
        }
         if (evt.getSource()==home)
        {
            home.setBackground(new Color(0,0,51));
            
        }
          
          
           if (evt.getSource()==exit)
        { 
           exit.setBackground(new Color(0,0,51));
            
        }
              if (evt.getSource()==ext)
        {
           ext.setBackground(new Color(3, 3, 92));
            
        }
              if (evt.getSource()==min)
        {
           min.setBackground(new Color(3, 3, 92));
            
        }
            if (evt.getSource()==p6)
        {
            p6.setBackground(new Color(0, 0, 51));
            
        }
      
           
            
          
    }
     public void actionPerformed(ActionEvent ae) {   
    
          }      
     
    
    
    public static void main(String[] args) 
    {
      
        new Member1().setVisible(true);
    } 
}

