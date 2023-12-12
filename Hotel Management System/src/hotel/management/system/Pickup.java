
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Pickup extends JFrame implements ActionListener {
    JTable table;
    JButton back,submit;
    
    Choice typeofcar;
    
    JCheckBox available;
    
    Pickup(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel text = new JLabel("Pickup Service");
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        text.setBounds(400,30,200,30);
        add(text);
        
          
        JLabel lblbed = new JLabel("Type of Car");
        lblbed.setBounds(50,100,100,20);
        add(lblbed);
        
        
        typeofcar = new Choice();
        typeofcar.setBounds(150,100,200,25);
        add(typeofcar);
        
        try{
             conn c = new conn();
             ResultSet rs =c.s.executeQuery("select* from driver");
             while(rs.next()){
                 typeofcar.add(rs.getString("brand"));
                 
             }
        }catch(Exception e){
        e.printStackTrace();
        
        
        }
        
        
        
        
       
        
        
        
        JLabel I1 = new JLabel("Name");
        I1.setBounds(30,160,100,20);
        add(I1);
        
        
          JLabel I2 = new JLabel("Age");
        I2.setBounds(200,160,100,20);
        add(I2);
        
        
        
          JLabel I3 = new JLabel("Gender");
        I3.setBounds(330,160,100,20);
        add(I3);
        
        
          JLabel I4 = new JLabel("Company");
        I4.setBounds(460,160,100,20);
        add(I4);
        
        
          JLabel I5 = new JLabel("Brand");
        I5.setBounds(630,160,100,20);
        add(I5);
        
          
          JLabel I6 = new JLabel("Availability");
        I6.setBounds(740,160,100,20);
        add(I6);
        
          
          JLabel I7 = new JLabel("Location");
        I7.setBounds(890,160,100,20);
        add(I7);
        
        
        
        
        
        table = new JTable();
        table.setBounds(0,200,1000,300);
        add(table);
         
        try{
           conn c = new conn();
           
         ResultSet rs = c.s.executeQuery("select * from driver");
          table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
          e.printStackTrace();
        }
        
   submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setBounds(300,520,120,30);
        add(submit);
        
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setBounds(500,520,120,30);
        add(back);
        
        
       setBounds(300,200,1000,600);
       setVisible(true);
    
     }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
        try{
          String query = "select * from driver where brand='"+typeofcar.getSelectedItem()+"'";
          
          conn conn = new conn();
          ResultSet rs;
          
        
          rs = conn.s.executeQuery(query);
         table.setModel(DbUtils.resultSetToTableModel(rs));
         
        }catch(Exception e){
        
        e.printStackTrace();
        }
        
        }else {
        setVisible(false);
        new Reception();}
    }
    public static void main(String[] args) {
        new Pickup();
        
    }
}
