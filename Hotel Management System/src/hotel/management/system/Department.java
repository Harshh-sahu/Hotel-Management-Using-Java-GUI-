
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Department extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    
    
    Department(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel I1 = new JLabel("Department");
        I1.setBounds(180,10,100,20);
        add(I1);
        
        
          JLabel I2 = new JLabel("Budget");
        I2.setBounds(420,10,100,20);
        add(I2);
        
        
        
          
        
        table = new JTable();
        table.setBounds(0,40,700,350);
        add(table);
        
        
        try{
           conn c = new conn();
           
         ResultSet rs = c.s.executeQuery("select * from department");
          table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
          e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setBounds(280,400,120,30);
        add(back);
        
        
       setBounds(400,200,700,480);
       setVisible(true);
    
     }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    public static void main(String[] args) {
        new Department();
        
    }
}
