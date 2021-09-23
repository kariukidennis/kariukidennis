package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



 public class login extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
  
    
    login(){
    l1 = new JLabel("Username:");
    l1.setBounds(10,20,200,20);
    add(l1);
    
    t1 = new JTextField();
    t1.setBounds(100,20,220,30);
    add(t1);
    
    l2 = new JLabel("Password:");
    l2.setBounds(10,60,200,20);
    add(l2);
    
    t2 = new JPasswordField();
    t2.setBounds(100,60,220,30);
    add(t2);
    
    b1 = new JButton("Login");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(150,150,100,40);
    b1.addActionListener(this);
    add(b1);
     
    b2 = new JButton("cancel");
    b2.setBackground(Color.WHITE);
    b2.setForeground(Color.BLACK);
    b2.setBounds(150,210,100,40);
    b2.addActionListener(this);
    add(b2);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/unnamed.jpg"));
    Image i2 = i1.getImage().getScaledInstance(150,150 , Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l3 = new JLabel(i3);
    l3.setBounds(320,10,150,150);
    add(l3);
 
    
    getContentPane().setBackground(Color.WHITE);
  
    
    
    setLayout(null);
    setBounds(300,300,500,300);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username = t1.getText();
            String password = t2.getText();
            conn c = new conn();
                    
                String str = "select * from login where username = '"+username+"'and password = '"+password+"'";
                    try {
                       ResultSet rs = c.s.executeQuery(str);
                        if(rs.next()){
                            new dashboard().setVisible(true);
                            this.setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null,"invalid username or password");
                            this.setVisible(false);
                        }
                    }catch (Exception e){
                    
                    }
        
        
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
    
    
    }
    
    
    public static void main (String[] args){
        new login() {
            
            
        };
           
    
   
           
}

    
    
   

   

  
}
