/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse3.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amit
 */
public class display_doners extends javax.swing.JFrame {

    /**
     * Creates new form display_doners
     */
    public display_doners() {
        initComponents();
    }
    
    
    public ArrayList<User> userlist() {
        ArrayList<User> userslist = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=cse31;selectMethod=cursor", "sa", "123456");
            String data = "select id,name,occupation,phone,email,amount_of_donation,date from doner";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(data);
            User x;
            while (rs.next()) {
                x = new User(rs.getInt("id"), rs.getString("name"), rs.getString("occupation"), rs.getString("phone"), rs.getString("email"), rs.getDouble("amount_of_donation"), rs.getString("date"));
                userslist.add(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return userslist;

    }

    public void show_doners() {
        ArrayList<User> list = userlist();
        DefaultTableModel model = (DefaultTableModel) doner_table.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; i--){
            model.removeRow(i);
        }
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).id();
            row[1] = list.get(i).name();
            row[2] = list.get(i).occupation();
            row[3] = list.get(i).phone();
            row[4] = list.get(i).email();
            row[5] = list.get(i).amount_of_donation();
            row[6] = list.get(i).date();
            
            model.addRow(row);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table_donator = new javax.swing.JScrollPane();
        doner_table = new javax.swing.JTable();
        show = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        home2 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doner_table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        doner_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Occupation", "Phone", "Email", "Amount of Donaion", "Date"
            }
        ));
        table_donator.setViewportView(doner_table);

        getContentPane().add(table_donator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 920, 190));

        show.setBackground(new java.awt.Color(153, 0, 0));
        show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, -1, 30));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Donner's Info");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        home2.setBackground(new java.awt.Color(153, 0, 0));
        home2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home2.setText("Home");
        home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home2ActionPerformed(evt);
            }
        });
        getContentPane().add(home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, 30));

        background.setIcon(new javax.swing.ImageIcon("G:\\CSE 3.1\\LAB\\Database lab\\images\\display_recipents (1).jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
            show_doners();
    }//GEN-LAST:event_showActionPerformed

    private void home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home2ActionPerformed
        operations ob = new operations();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(display_doners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(display_doners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(display_doners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(display_doners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display_doners().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTable doner_table;
    private javax.swing.JButton home2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton show;
    private javax.swing.JScrollPane table_donator;
    // End of variables declaration//GEN-END:variables
}
