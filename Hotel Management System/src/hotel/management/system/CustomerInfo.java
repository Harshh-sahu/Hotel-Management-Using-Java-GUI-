
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    
    
    CustomerInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel I1 = new JLabel("Document Type");
        I1.setBounds(10,10,100,20);
        add(I1);
        
        
          JLabel I2 = new JLabel("Number");
        I2.setBounds(160,10,100,20);
        add(I2);
        
        
        
          JLabel I3 = new JLabel("Name");
        I3.setBounds(290,10,100,20);
        add(I3);
        
        
          JLabel I4 = new JLabel("Gender");
        I4.setBounds(410,10,100,20);
        add(I4);
        
        
          JLabel I5 = new JLabel("Country");
        I5.setBounds(540,10,100,20);
        add(I5);
        
        
          JLabel I6 = new JLabel("Room Number");
        I6.setBounds(640,10,100,20);
        add(I6);
        
          JLabel I7 = new JLabel("Checkin Time");
        I7.setBounds(760,10,100,20);
        add(I7);
        
          JLabel I8 = new JLabel("Deposit");
        I8.setBounds(900,10,100,20);
        add(I8);
        
        
        
        
        
        table = new JTable();
        table.setBounds(0,40,1000,400);
        add(table);
        
        
        try{
           conn c = new conn();
           
         ResultSet rs = c.s.executeQuery("select * from customer");
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
        new CustomerInfo();
        
    }
}
