/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class GenerClass {

    private static Connection con = null;

    public static void setImageIntoLabel(String path, JLabel picshow) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newimage = img.getScaledInstance(picshow.getWidth(), picshow.getHeight(), 0);
        ImageIcon newimmgicon = new ImageIcon(newimage);
        picshow.setIcon(newimmgicon);

    }

    public static void showDataintoTable(String dbtable,JTable table) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
        String path = "E:\\Bloodbank.accdb";
        String url = "jdbc:ucanaccess://" + path;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(BloodDonor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = con.createStatement();
            String query = "select * from " + dbtable;
            PreparedStatement pt = con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public static void showAvailableBlood(JTable table,String id) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
        String path = "E:\\Bloodbank.accdb";
        String url = "jdbc:ucanaccess://" + path;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(BloodDonor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Statement st = con.createStatement();
            String query = "select * from blood where Id='"+id+"'";
            PreparedStatement pt = con.prepareStatement(query);
            ResultSet rs = pt.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
