
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class addEmployee extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;
    
    addEmployee(){
        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,120,30);
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(150,30,150,30);
        add(t1);
        
        JLabel age = new JLabel("AGE");
        age.setBounds(60,90,120,30);
        add(age);
        
        t2 = new JTextField();
        t2.setBounds(150,90,150,30);
        add(t2);
        
        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,150,120,30);
        add(gender);
        
        r1 = new JRadioButton("MALE");
        r1.setBounds(150,150,100,30);
        add(r1);
        
        r2 = new JRadioButton("FEMALE");
        r2.setBounds(230,150,100,30);
        add(r2);
                        
        JLabel job = new JLabel("JOB");
        job.setBounds(60,210,120,30);
        add(job);
        
        String str[] = {"Front Desk Clerks","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
        c1 = new JComboBox(str);
        c1.setBounds(150,210,150,30);
        add(c1);
        
        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,270,120,30);
        add(salary);
        
        t3 = new JTextField();
        t3.setBounds(150,270,150,30);
        add(t3);
        
        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,330,120,30);
        add(phone);
        
        t4 = new JTextField();
        t4.setBounds(150,330,150,30);
        add(t4);
        
        JLabel address = new JLabel("ADDRESS");
        address.setBounds(60,390,120,30);
        add(address);
        
        t5 = new JTextField();
        t5.setBounds(150,390,150,30);
        add(t5);
        
        JLabel email = new JLabel("E MAIL");
        email.setBounds(60,450,120,30);
        add(email);
        
        t6 = new JTextField();
        t6.setBounds(150,450,150,30);
        add(t6);
        
       ImageIcon ii = new ImageIcon("C:\\Users\\User-PC\\Documents\\NetBeansProjects\\hotel.management.system\\src\\hotel\\management\\system\\employee.jpg");
       JLabel l1 = new JLabel(ii);
       l1.setBounds(370,30,600,450);
       add(l1);
       
       b1 = new JButton("SUBMIT");
       b1.setBackground(Color.black);
       b1.setForeground(Color.LIGHT_GRAY);
       b1.setBounds(150,510,100,30);
       b1.addActionListener(this);
       add(b1);
       
       JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
       l2.setForeground(Color.red);
       l2.setBounds(500,5,200,30);
       add(l2);
        
       getContentPane().setBackground(Color.white);
       
        setLayout(null);
        setBounds(300,100,1000,600);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String age = t2.getText();
        String salary = t3.getText();
        String phone = t4.getText();
        String address = t5.getText();
        String email = t6.getText();
        
        String gender = null;
            if(r1.isSelected()){
                gender = "Male";
            }else if(r2.isSelected()){
                gender = "Female";
            }
            
        String job = (String)c1.getSelectedItem();
        
        conn c = new conn();
        
        String str = "INSERT INTO employee VALUE('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+address+"','"+email+"')";
        
        try{
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"New Employee Added");
            this.setVisible(false);
        }catch(Exception e){
        System.out.println(e);
        }
    }
    
   
    public static void main(String[] args){
        new addEmployee().setVisible(true);
}
    
}
