
package hotel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem(){
        setBounds(400,200,424,600);
        //setSize(400,400);
   
        //setLocation(300,300);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/luxury.jpg"));
        JLabel l1 = new JLabel(il);
        l1.setBounds(0,0,424,600);
        add(l1);
        
        JLabel l2 = new JLabel(" Hotel Management System");
        l2.setBounds(20,350,1000,70);
        l2.setForeground(Color.white);
       
        l1.add(l2);
        
        JButton b1 = new JButton("Progress");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(250,380,140,30);
        b1.addActionListener(this);
        l1.add(b1);
        
        setLayout(null);
            setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        new login().setVisible(true);
        this.setVisible(false);
    }
    
    public static void main(String[] args) {
        new HotelManagementSystem();
    }

    
    
}
