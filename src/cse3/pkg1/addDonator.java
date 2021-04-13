
package cse3.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author amit
 */
public class addDonator extends javax.swing.JFrame {

   
    /*private static java.sql.Date getCurrentDate() {
            java.util.Date today = new java.util.Date();
            return new java.sql.Date(today.getTime());
}*/
    public void addDonator(){
        try {
            // TODO add your handling code here:
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=cse31;selectMethod=cursor", "sa", "123456");
            String data = "insert into doner values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(data);
            
            
            ps.setString(1, namefield.getText());
           
            int age = Integer.parseInt(agefield.getText()); 
            ps.setInt(2, age);
            
            String gender;
            gender = genderbox.getSelectedItem().toString();
            ps.setString(3, gender);
             
            String division;
            division = divisionbox.getSelectedItem().toString();
            ps.setString(4, division);
           
            ps.setString(5, districtfield.getText());
            
            ps.setString(6, psfield.getText());
            
            ps.setString(7, pofield.getText());
            
            int post_code = Integer.parseInt(postcodefield.getText()); 
            ps.setInt(8, post_code);
            
            String occu;
            occu = occupationbox.getSelectedItem().toString();
            ps.setString(9, occu);
            
            ps.setString(10, phonefield.getText());
            
            ps.setString(11, emailfield.getText());
            
            double amount = Double.parseDouble(amountfield.getText()); 
            ps.setDouble(12, amount);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    LocalDateTime now = LocalDateTime.now();
            String date = dtf.format(now).toString();
            
            ps.setString(13, date);
           
           
            JOptionPane.showMessageDialog(null, "New Doner Inserted Successfully !!!");
            
            namefield.setText("");
            agefield.setText("");
            phonefield.setText("");
            emailfield.setText("");
            districtfield.setText("");
            psfield.setText("");
            pofield.setText("");
            amountfield.setText("");
            postcodefield.setText("");
            
            
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please insert all the field correctly.");
        }
    }
    
    
    public addDonator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        districtfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        amountfield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        postcodefield = new javax.swing.JTextField();
        pofield = new javax.swing.JTextField();
        psfield = new javax.swing.JTextField();
        agefield = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox<>();
        divisionbox = new javax.swing.JComboBox<>();
        occupationbox = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setText("ADD NEW DONATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Division");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("District");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Police Station");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Post Office");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Post code");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Occupation");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Amount Of Donation");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Phone");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Name");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Age");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 170, 160));

        back.setBackground(new java.awt.Color(102, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 110, 40));

        districtfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(districtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 170, 30));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Insert Photo");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 170, 30));

        insert.setBackground(new java.awt.Color(102, 0, 0));
        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        getContentPane().add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 170, 40));

        amountfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(amountfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 170, 30));

        emailfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 170, 30));

        phonefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 170, 30));

        postcodefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(postcodefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 170, 30));

        pofield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pofield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 170, 30));

        psfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(psfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, 30));

        agefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(agefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 170, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 170, 30));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 170, 30));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 170, 30));

        namefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));

        genderbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, -1));

        divisionbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        divisionbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chattagram", "Sylhet", "Barishal", "Rajshahi", "Khulna", "Mymensing", "Rangpur" }));
        getContentPane().add(divisionbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, -1));

        occupationbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        occupationbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engineer", "Doctor", "Teacher", "Businessman", "Student", "Housewife", "Lawyer" }));
        getContentPane().add(occupationbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 170, -1));

        background.setIcon(new javax.swing.ImageIcon("G:\\CSE 3.1\\LAB\\Database lab\\images\\add-donator (1).jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        operations ob = new operations();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        addDonator();
    }//GEN-LAST:event_insertActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addDonator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDonator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDonator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDonator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDonator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agefield;
    private javax.swing.JTextField amountfield;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField districtfield;
    private javax.swing.JComboBox<String> divisionbox;
    private javax.swing.JTextField emailfield;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField namefield;
    private javax.swing.JComboBox<String> occupationbox;
    private javax.swing.JTextField phonefield;
    private javax.swing.JTextField pofield;
    private javax.swing.JTextField postcodefield;
    private javax.swing.JTextField psfield;
    // End of variables declaration//GEN-END:variables
}
