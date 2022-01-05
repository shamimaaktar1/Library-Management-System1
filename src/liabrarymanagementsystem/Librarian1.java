

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
public class Librarian1 extends JFrame implements ActionListener {
    JPanel top,side,center,home,exit,p1,p2,p3,p4,p5,p6,p7,ext,min,profile,p8,p9,p10;
    JLabel ladmin,linformation,ltop,lhome,lexit,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,lext,lmin,title;
    
    LibrarianHome home1 =new LibrarianHome();
    LibrarianHome1 home2 =new LibrarianHome1();
    LibrarianHome2 home3 =new LibrarianHome2();
    LibrarianHome3 home4=new LibrarianHome3();
    LibraruanHome4 home5= new LibraruanHome4();
    LibrarianHome5 home6 = new LibrarianHome5();
    LibrarianHome6 home7= new LibrarianHome6();
    
    AddBook addbook = new  AddBook();
    AddMembership membership =new AddMembership();
    AddPublisher AddPublisher = new AddPublisher();
    AddBookCategory  AddBookCategory= new AddBookCategory(); 
    AddCategory  AddCategory =new AddCategory ();



    DeleteBook DeleteBook= new DeleteBook();
    DeletePublisher  DeletePublisher=new  DeletePublisher();
    DeleteBookCategory DeleteBookCategory =new DeleteBookCategory ();
    DeleteMembership DeleteMembership = new DeleteMembership();
    DeleteCategory  DeleteCategory =new DeleteCategory ();


    UpdateBook  UpdateBook= new UpdateBook();
    UpdateMembership UpdateMembership= new UpdateMembership();
    UpdateBookCategory UpdateBookCategory = new UpdateBookCategory();
    UpdatePublisher UpdatePublisher = new UpdatePublisher();
    UpdateCategory  UpdateCategory =new UpdateCategory();
    
    ReserveList Reservation=new ReserveList();



    



    ShowBook ShowBook= new ShowBook();
    ShowMembership   ShowMembership= new  ShowMembership();
    ShowPublisher    ShowPublisher = new ShowPublisher();
    ShowCategory ShowCategory=new ShowCategory();
    


    IssueBook IssueBook= new IssueBook();
    ReturnBook  ReturnBook= new ReturnBook();

    AddAuthenticator authenticat = new AddAuthenticator();
    AddUser adduser =new AddUser();

    DeleteAuthenticator dauthenticat= new DeleteAuthenticator();
    DeleteUser deleteuser =new DeleteUser();

    UpdateUser     uuser = new UpdateUser();
    UpdateAuthenticator uauthenticator = new UpdateAuthenticator();


   
    Librarian1()
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
       
       title=new JLabel("       Library Management System ");
       title.setFont(new Font("Times New Roman",Font.BOLD,20));
       title.setForeground(Color.WHITE);
       
       l1=new JLabel("Add");
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
       
       
       
       ladmin=new JLabel("Edit");
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
        
        l11=new JLabel("Librarian");
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
       
       ImageIcon image3=new ImageIcon("src\\picture\\e1.png");
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
       
       p8= new JPanel();
       p8.setBackground(new Color(0, 0, 51));
       p8.setBounds(0,280,200,40);
       p8.setLayout(null);
       side.add(p8);
       
        ImageIcon image6=new ImageIcon("src\\picture\\bk6.png");
        Image img6=image6.getImage();
        Image temp6=img6.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image6=new ImageIcon(temp6);
        l12=new JLabel("",image6,JLabel.CENTER);
        l12.setBounds(10, 5, 30, 30);
        p8.add(l12);
        
          
       l13=new JLabel("Issue Book");
       l13.setFont(new Font("Times New Roman",Font.BOLD,20));
       l13.setForeground(Color.WHITE);
       l13.setBounds(50,0,150,40);
       p8.add(l13);
       
        p9= new JPanel();
       p9.setBackground(new Color(0, 0, 51));
       p9.setBounds(0,320,200,40);
       p9.setLayout(null);
       side.add(p9);
       
        ImageIcon image7=new ImageIcon("src\\picture\\bk7.png");
        Image img7=image7.getImage();
        Image temp7=img7.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image7=new ImageIcon(temp7);
        l14=new JLabel("",image7,JLabel.CENTER);
        l14.setBounds(10, 5, 30, 30);
        p9.add(l14);
        
          
       l15=new JLabel("Return Book");
       l15.setFont(new Font("Times New Roman",Font.BOLD,20));
       l15.setForeground(Color.WHITE);
       l15.setBounds(50,0,150,40);
       p9.add(l15);
       
         p10= new JPanel();
       p10.setBackground(new Color(0, 0, 51));
       p10.setBounds(0,360,200,40);
       p10.setLayout(null);
       side.add(p10);
       
        ImageIcon image8=new ImageIcon("src\\picture\\re1.png");
        Image img8=image8.getImage();
        Image temp8=img8.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image8=new ImageIcon(temp8);
        l16=new JLabel("",image8,JLabel.CENTER);
        l16.setBounds(10, 5, 30, 30);
        p10.add(l16);
        
          
       l17=new JLabel("Reserve list");
       l17.setFont(new Font("Times New Roman",Font.BOLD,20));
       l17.setForeground(Color.WHITE);
       l17.setBounds(50,0,150,40);
       p10.add(l17);
       
        ImageIcon image5=new ImageIcon("src\\picture\\e3.png");
        Image img5=image5.getImage();
        Image temp5=img5.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        image5=new ImageIcon(temp5);
        l10=new JLabel("",image5,JLabel.CENTER);
        l10.setBounds(10, 5, 30, 30);
        exit.add(l10);
       
       
       exit.setBounds(0,400,200,40);
       exit.setLayout(null);
       exit.add(lexit);
       side.add(exit);
       
       center.setBounds(200,30, 800, 600);
       center.setLayout(new CardLayout());
       add(center);
       
        
       // login.b1.addActionListener(this);
           
       
        
        add(center, BorderLayout.CENTER);
        center.add(home1, "card1");   
        center.add( home2, "card2");
        center.add( home3, "card3");
        center.add( home4, "card4");
        center.add(addbook, "card5"); 
        center.add( membership, "card6"); 
        center.add( AddBookCategory, "card7");      
        center.add( AddPublisher, "card8");

        center.add( DeleteBook, "card9");
        center.add( DeletePublisher, "card10");
        center.add(DeleteBookCategory,"card11");
        center.add(DeleteMembership,"card12");
        center.add( UpdateBook, "card13");
        center.add(UpdateMembership,"card14");
        center.add(UpdateBookCategory, "card15");
        center.add(UpdatePublisher,"card16");

        center.add(ShowBook,"card17");
        center.add(IssueBook,"card18");
        center.add(ReturnBook,"card19");
        center.add( home5, "card20");
        center.add( home6, "card21");
        center.add( home7, "card22");
        center.add( AddCategory, "card23");
        center.add( DeleteCategory, "card24");
        center.add( UpdateCategory, "card25");
        center.add(ShowMembership,"card26");
        center.add(ShowPublisher,"card27");
        center.add(ShowCategory,"card28");
        center.add(Reservation,"card28");
       
                
        
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
          p10.addMouseListener(new MouseAdapter() {
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
        
        p8.addMouseListener(new MouseAdapter() {
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
        
        p9.addMouseListener(new MouseAdapter() {
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
        
        
         home2.p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home2.p3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
          home2.p4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home2.p5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         
         home3.p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home3.p3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home3.p4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home3.p5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
          home3.p7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home3.p8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home3.p9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home3.p10.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home4.p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home4.p3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home4.p4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home4.p5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
          home5.p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home5.p3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
          home6.p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home6.p3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         home7.p2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
            }
            });
         
         home7.p3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mouseCicked(evt);
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
        
        if(evt.getSource()==p1){
         home1.setVisible(false);
         home2.setVisible(true);
         home3.setVisible(false);
         home4.setVisible(false);
         home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
         
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
        
       

      }
        if(evt.getSource()==p2){
         home1.setVisible(true);
         home2.setVisible(false);
         home3.setVisible(false);
         home4.setVisible(false);
         home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
         
         addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
        
       

      }
        
       
       
       if(evt.getSource()==p6){
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(true);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
        
        

      }
       
       
      
       
         if(evt.getSource()==p7)
     {
         home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(true);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);     
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
         
         
        if(evt.getSource()==p8){
         home1.setVisible(false);
         home2.setVisible(false);
         home3.setVisible(false);
         home4.setVisible(false);
         home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
         
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        
        
        IssueBook.setVisible(true);
        ReturnBook.setVisible(false);
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
        
       

      }
        
        
        if(evt.getSource()==p9){
         home1.setVisible(false);
         home2.setVisible(false);
         home3.setVisible(false);
         home4.setVisible(false);
         home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
         
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(true);
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
        
       

      }
         
         
    if(evt.getSource()==home2.p2)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(true);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     
     }
    
    
     if(evt.getSource()==home2.p3)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(true);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);     
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
     
      if(evt.getSource()==home2.p4)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(true);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
      
      
       if(evt.getSource()==home2.p5)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(true);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);  
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
       
       
        if(evt.getSource()==home3.p2)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(true);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);   
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
        
          if(evt.getSource()==home3.p3)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(true);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);  
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
          
          
          if(evt.getSource()==home3.p4)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(true);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);   
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
          
          
        if(evt.getSource()==home3.p5)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(true);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
       if(evt.getSource()==home3.p7)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(true);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);  
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
       
       if(evt.getSource()==home3.p8)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(true);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);     
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
       
       if(evt.getSource()==home3.p9)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(true);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
       
       if(evt.getSource()==home3.p10)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(true);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);  
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
       
        if(evt.getSource()==home4.p2)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(true);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
        
          if(evt.getSource()==home4.p3)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
       ShowMembership.setVisible(true);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);  
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
          
          
          if(evt.getSource()==home4.p4)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(true);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);  
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
          
          
        if(evt.getSource()==home4.p5)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
         home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
         ShowMembership.setVisible(false);
        ShowPublisher.setVisible(true);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false);   
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
        
        if(evt.getSource()==home5.p2)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(true);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
        
         if(evt.getSource()==home5.p3)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(true);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(false);
         
     }
         
         
           if(evt.getSource()==home7.p2)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(true);
         Reservation.setVisible(false);
         
     }
        
         if(evt.getSource()==home7.p3)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(true);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
         Reservation.setVisible(false);
         
     }
         
         
           if(evt.getSource()==home6.p2)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(true);
        UpdateCategory.setVisible(false);
         Reservation.setVisible(false);
         
     }
        
         if(evt.getSource()==home6.p3)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(true);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
         Reservation.setVisible(false);
         
     }
    
    

        if(evt.getSource()==p10)
     {
        home2.setVisible(false);
        home1.setVisible(false);
        home3.setVisible(false);
        home4.setVisible(false);
        home5.setVisible(false);
        home6.setVisible(false);
         home7.setVisible(false);
        
        addbook.setVisible(false);
        membership.setVisible(false);
        AddBookCategory.setVisible(false);
        AddPublisher .setVisible(false);
        DeleteBook.setVisible(false);

       
        DeletePublisher.setVisible(false);
        DeleteBookCategory .setVisible(false);
        DeleteMembership.setVisible(false);
        UpdateBook.setVisible(false);
        
        UpdateMembership.setVisible(false);
        UpdateBookCategory.setVisible(false);
        UpdatePublisher.setVisible(false);

        ShowBook.setVisible(false);
        ShowMembership.setVisible(false);
        ShowPublisher.setVisible(false);
        ShowCategory.setVisible(false);
        
        IssueBook.setVisible(false);
        ReturnBook.setVisible(false); 
        
        AddCategory.setVisible(false);
        DeleteCategory.setVisible(false);
        UpdateCategory.setVisible(false);
        Reservation.setVisible(true);
         
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
         if (evt.getSource()==p8)
        {
            p8.setBackground(new Color(3, 3, 92));
            
        }
         
         if (evt.getSource()==p9)
        {
            p9.setBackground(new Color(3, 3, 92));
            
        }
          if (evt.getSource()==p10)
        {
            p10.setBackground(new Color(3, 3, 92));
            
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
            
         if (evt.getSource()==p8)
        {
            p8.setBackground(new Color(0, 0, 51));
            
        }
         
          if (evt.getSource()==p9)
        {
            p9.setBackground(new Color(0, 0, 51));
            
        }
      if (evt.getSource()==p10)
        {
            p10.setBackground(new Color(0, 0, 51));
            
        }
      
           
            
          
    }
     public void actionPerformed(ActionEvent ae) {   
    
          }      
     
    
    
    public static void main(String[] args) 
    {
      
        new Librarian1().setVisible(true);
    } 
}

