
package hotel.management.system;

import javax.swing.*;
import java.awt.event.*;

public class addRooms extends JFrame implements ActionListener{
    
    JTextField t1,t2;
    JComboBox c1, c2, c3;
    JButton b1,b2;
    
    addRooms(){
        JLabel l1 = new JLabel("ADD ROOMS");
        l1.setBounds(300,20,100,30);
        l1.setVisible(true);
        add(l1);
        
        JLabel rooms = new JLabel("Room Number");
        rooms.setBounds(60,60,100,30);
        add(rooms);
        
        t1 = new JTextField();
        t1.setBounds(200,60,150,30);
        add(t1);
        
        JLabel available = new JLabel("Available");
        available.setBounds(60,120,120,30);
        add(available);
        
        c1 = new JComboBox(new String[] {"Available","Occupied"});
        c1.setBounds(200,120,150,30);
        add(c1);
        
        JLabel cleaning = new JLabel("Cleaning Status");
        cleaning.setBounds(60,180,120,30);
        add(cleaning);
        
        c2 = new JComboBox(new String[] {"Cleaned","Dirty"});
        c2.setBounds(200,180,150,30);
        add(c2);
        
        JLabel price = new JLabel("Price");
        price.setBounds(60,240,120,30);
        add(price);
        
        t2 = new JTextField();
        t2.setBounds(200,240,150,30);
        add(t2);
        
        JLabel type = new JLabel("Bed Type");
        type.setBounds(60,300,120,30);
        add(type);
        
        c3 = new JComboBox(new String[] {"Single bed","Double bed"});
        c3.setBounds(200,300,150,30);
        add(c3);
        
        b1 = new JButton("Add Room");
        b1.addActionListener(this);
        b1.setBounds(150,360,130,30);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.addActionListener(this);
        b2.setBounds(440,360,130,30);
        add(b2);
        
       ImageIcon ii = new ImageIcon("C:\\Users\\User-PC\\Documents\\NetBeansProjects\\hotel.management.system\\src\\hotel\\management\\system\\room.jpg");
       JLabel l2 = new JLabel(ii);
       l2.setBounds(360,60,400,240);
       l2.setVisible(true);
       add(l2); 
    
    
        setBounds(400,200,800,500);
        setLayout(null);
        setVisible(true);
    
    
    }
public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == b1){
        String rooms = t1.getText();
        String available = (String)c1.getSelectedItem();
        String cleaning = (String)c2.getSelectedItem();
        String price = t2.getText();
        String type = (String)c3.getSelectedItem();
        
       conn c = new conn();
       String str = "insert into room values('"+rooms+"','"+available+"','"+cleaning+"','"+price+"','"+type+"')";
       try{
       c.s.executeUpdate(str);
       
       JOptionPane.showMessageDialog(null,"NEW ROOM ADDED");
       }catch(Exception e){
           System.out.println(e);
       }
    
    }else if(ae.getSource() == b2){
        this.setVisible(false);
    }
}   
    

public static void main(String[] args){
    new addRooms().setVisible(true);
}
}
