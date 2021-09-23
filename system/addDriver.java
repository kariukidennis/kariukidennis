
package hotel.management.system;

import javax.swing.*;
import java.awt.event.*;

public class addDriver extends JFrame{
    
    JTextField t1,t2,t3,t4,t5;
    addDriver(){
        JLabel name = new JLabel("NAME");
        name.setBounds(60,60,100,30);
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(250,60,150,30);
        add(t1);
        
        JLabel title = new JLabel("ADD DRIVER");
        title.setBounds(300,10,150,30);
        add(title);
        
        t2 = new JTextField();
        t2.setBounds(250,100,150,30);
        add(t2);
        
        JLabel age = new JLabel("AGE");
        age.setBounds(60,100,100,30);
        add(age);
        
        t3 = new JTextField();
        t3.setBounds(250,140,150,30);
        add(t3);
        
        JLabel car = new JLabel("CAR MAKE");
        car.setBounds(60,140,100,30);
        add(car);
         
        t4 = new JTextField();
        t4.setBounds(250,180,150,30);
        add(t4);
        
        JLabel model = new JLabel("CAR MODEL");
        model.setBounds(60,180,150,30);
        add(model);
         
        t5 = new JTextField();
        t5.setBounds(250,220,150,30);
        add(t5);
        
        JLabel reg = new JLabel("REGISTRATION NO");
        reg.setBounds(60,220,120,30);
        add(reg);
        
        setLayout(null);
        setBounds(400,200,800,400);
        setVisible(true);
    }
public static void main(String[] args){
    new addDriver().setVisible(true);
}
}
