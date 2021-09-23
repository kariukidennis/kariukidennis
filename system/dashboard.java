
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener{
    
JMenuBar mb;
JMenu m1,m2;
JMenuItem i1,i2,i3,i4;

    dashboard (){
        mb = new JMenuBar();
        add(mb);
        
        m1 = new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.red);
        mb.add(m1);
    
        m2 = new JMenu("ADMIN");
        m1.setForeground(Color.blue);
        mb.add(m2);
        
        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2 = new JMenuItem("ADD ROOM");
        i2.addActionListener(this);
        m2.add(i2);
        
        i3 = new JMenuItem("ADD EMPLOYEE");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4 = new JMenuItem("ADD DRIVER");
        i4.addActionListener(this);
        m2.add(i4);
        
        mb.setBounds(0,0,750,40);
        
       ImageIcon ii = new ImageIcon("C:\\Users\\User-PC\\Documents\\NetBeansProjects\\hotel.management.system\\src\\hotel\\management\\system\\Sea.jpg");
       JLabel l1 = new JLabel(ii);
       l1.setBounds(0,0,750,420);
       l1.setVisible(true);
       add(l1); 
       
       JLabel l2 = new JLabel("THE CRIIMSONS WELCOMES YOU");
       l2.setBounds(250,100,300,50);
       l2.setForeground(Color.WHITE);
       l1.add(l2);
        
        setLayout(null);
        setBounds(0,0,750,450);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("RECEPTION")){
            
        }else if(ae.getActionCommand().equals("ADD ROOM")){
            new addRooms().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new addEmployee().setVisible(true);
        }    
    }

    public static void main(String[] args){
        new dashboard().setVisible(true);
    }
}
