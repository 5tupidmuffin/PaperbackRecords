/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperbackrecords;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JPanel;
import java.time.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author S145
 */
public class PaperbackRecords {

    /**
     * @param args the command line arguments
     */
    
    static void Blink(JPanel panel) {
        Color bgcolor = panel.getBackground();
        System.out.println(bgcolor);
        panel.setBackground(Color.BLACK);
                
    }
    
    public static void main(String[] args) {
        new login().setVisible(true); // start the application from login screen
        
        LocalDate currentdate = LocalDate.now();
        int currentDay = currentdate.getDayOfMonth();
        System.out.println("day : " + currentDay);
        
        if (currentDay == 1){ // reset monthly_sales table on the start of the new month
            try{
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/paperbackrecords", "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("update monthly_sales set monthly_sold = 0"); // make sql statement
            
            int rs = st.executeUpdate();
            
           System.out.println("monthly_sales table has been reset since today's date is 1");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        }
    }
    
}
