
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class ManagerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    
    
    ManagerInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel I1 = new JLabel("Name");
        I1.setBounds(40,10,100,20);
        add(I1);
        
        
          JLabel I2 = new JLabel("Age");
        I2.setBounds(170,10,100,20);
        add(I2);
        
        
        
          JLabel I3 = new JLabel("Gender");
        I3.setBounds(290,10,100,20);
        add(I3);
        
        
          JLabel I4 = new JLabel("Job");
        I4.setBounds(410,10,100,20);
        add(I4);
        
        
          JLabel I5 = new JLabel("Salary");
        I5.setBounds(540,10,100,20);
        add(I5);
        
        
          JLabel I6 = new JLabel("Phone");
        I6.setBounds(670,10,100,20);
        add(I6);
        
          JLabel I7 = new JLabel("Email");
        I7.setBounds(790,10,100,20);
        add(I7);
        
          JLabel I8 = new JLabel("Aadhar");
        I8.setBounds(910,10,100,20);
        add(I8);
        
        
        
        
        
        table = new JTable();
        table.setBounds(0,40,1000,400);
        add(table);
        
        
        try{
           conn c = new conn();
           
         ResultSet rs = c.s.executeQuery("select * from employee where job='Manager'");
          table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
          e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setBounds(420,500,120,30);
        add(back);
        
        
       setBounds(300,200,1000,600);
       setVisible(true);
    
     }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    public static void main(String[] args) {
        new ManagerInfo();
        
    }
}
