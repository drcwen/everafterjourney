/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package everafterjourney;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Wendel
 */
public class SecondTheme extends javax.swing.JFrame {

    private static String guestNameFromSelect;

    public static void setGuestName(String guestname) {
        guestNameFromSelect = guestname;
    }

    public static String getGuestName() {
        return guestNameFromSelect;
    }
    
    private static int userId;

    public static void setID(int usersId) {
        userId = usersId;
    }

    public static int getID() {
        return userId;
    }
    public SecondTheme() {
        initComponents();
        
        try {
            String SUrl, SUser, SPass, query;
            int signupId = -1;
              
            Class.forName("com.mysql.cj.jdbc.Driver");
            SUrl = "jdbc:mysql://localhost:3306/everafterjourney_database";
            SUser = "root";
            SPass = "";

            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();   

            String GuestName = GuestHome.getGuestName();
            System.out.println("Guest Name: " + GuestName);
            jLabel2.setText(GuestName);

            String sql = "SELECT signup_id FROM guests WHERE guestname = '" + GuestName + "'";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                signupId = rs.getInt("signup_id");
                SecondTheme.setID(signupId);
            }
            System.out.println(signupId);
            
        } catch (Exception e) {
            
        }    
        
        try {
            String SUrl, SUser, SPass, query;
            int signupId = -1;
            
            String partner1Name = null;
            String partner2Name = null;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            SUrl = "jdbc:mysql://localhost:3306/everafterjourney_database";
            SUser = "root";
            SPass = "";

            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();   

            String GuestName = GuestHome.getGuestName();
            System.out.println("Guest Name: " + GuestName);
            jLabel2.setText(GuestName);

            String sql = "SELECT signup_id FROM guests WHERE guestname = '" + GuestName + "'";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                signupId = rs.getInt("signup_id");
                
            }
      
            String sql2 = "SELECT p1_first_name, p2_first_name FROM signup WHERE id = '" + signupId + "'";
            
            ResultSet rs2 = st.executeQuery(sql2);
            
            while (rs2.next()) {

                partner1Name = rs2.getString("p1_first_name");
                partner2Name = rs2.getString("p2_first_name");
                
                System.out.println(partner1Name + partner2Name);
                
                jLabel4.setText(partner1Name + "&");
                jLabel5.setText(partner2Name + "'s");
                
                System.out.println(partner1Name+partner2Name);
            }
            
            String sql3 = "SELECT wedding_date, wedding_reception, wedding_place FROM wedding_invitation WHERE signup_id = '" + signupId + "'";
            
            ResultSet rs3 = st.executeQuery(sql3);
            
            while (rs3.next()) {

                String date = rs3.getString("wedding_date");
                String reception = rs3.getString("wedding_reception");
                String place = rs3.getString("wedding_place");
                
                System.out.println(date + " " + reception + " " + place);
                
                jLabel10.setText(date);
                jLabel11.setText(reception);
                jLabel12.setText(place);
                
                System.out.println(partner1Name+partner2Name);
            }
            
            
        } catch (Exception e) {
            
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

        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(228, 233, 229));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, -1));

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 173, -1));

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Reception:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reception");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 173, -1));

        jLabel9.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Place:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Place");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 173, -1));

        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Wedding");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Edwardian Script ITC", 0, 67)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Partner 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 310, -1));

        jLabel4.setFont(new java.awt.Font("Edwardian Script ITC", 0, 67)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Partner 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, -1));

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("you are invited to:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 0, 53)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Guest");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pink.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GuestHome home = new GuestHome();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SecondTheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondTheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondTheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondTheme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondTheme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
