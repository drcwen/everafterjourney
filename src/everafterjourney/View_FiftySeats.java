/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package everafterjourney;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Wendel
 */
public class View_FiftySeats extends javax.swing.JFrame {

    private static String guestNames;

    public static void setGuestName(String guestName) {
        guestNames = guestName;
    }

    public static String getGuestName() {
        return guestNames;
    }
    
    private static int uID;

    public static void setMyID(int userId) {
        uID = userId;
    }

    public static int getMyID() {
        return uID;
    }
    
    public View_FiftySeats() {
        initComponents();
        
        try {
            String SUrl, SUser, SPass, query;
            Class.forName("com.mysql.cj.jdbc.Driver");
            SUrl = "jdbc:mysql://localhost:3306/everafterjourney_database";
            SUser = "root";
            SPass = "";

            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();   

            String GuestName = GuestHome.getGuestName();
            System.out.println("Guest Name: " + GuestName);

            String sql = "SELECT tableid FROM guests WHERE guestname = '" + GuestName + "'";

            ResultSet rs = st.executeQuery(sql);

            int table_id = -1;

            while (rs.next()) {
                table_id = rs.getInt("tableid");
                System.out.println("Table ID: " + table_id);
            }

            if (table_id == 1) {
                jPanel50_1.setBackground(Color.red);
            } else if (table_id == 2) {
                jPanel50_2.setBackground(Color.red);
            } else if (table_id == 3) {
                jPanel50_3.setBackground(Color.red);
            } else if (table_id == 4) {
                jPanel50_4.setBackground(Color.red);
            } else if (table_id == 5) {
                jPanel50_5.setBackground(Color.red);
            } else if (table_id == 6) {
                jPanel50_6.setBackground(Color.red);
            } else if (table_id == 7) {
                jPanel50_7.setBackground(Color.red);
            } else if (table_id == 8) {
                jPanel50_8.setBackground(Color.red);
            } else if (table_id == 9) {
                jPanel50_9.setBackground(Color.red);
            } else if (table_id == 10) {
                jPanel50_10.setBackground(Color.red);
            } else if (table_id == 11) {
                jPanel50_11.setBackground(Color.red);
            } else if (table_id == 12) {
                jPanel50_12.setBackground(Color.red);
            } else if (table_id == 13) {
                jPanel50_13.setBackground(Color.red);
            } else if (table_id == 14) {
                jPanel50_14.setBackground(Color.red);
            } else if (table_id == 15) {
                jPanel50_15.setBackground(Color.red);
            } else if (table_id == 16) {
                jPanel50_16.setBackground(Color.red);
            } else if (table_id == 17) {
                jPanel50_17.setBackground(Color.red);
            } else if (table_id == 18) {
                jPanel50_18.setBackground(Color.red);
            } else if (table_id == 19) {
                jPanel50_19.setBackground(Color.red);
            } else if (table_id == 20) {
                jPanel50_20.setBackground(Color.red);
            } else if (table_id == 21) {
                jPanel50_21.setBackground(Color.red);
            } else if (table_id == 22) {
                jPanel50_22.setBackground(Color.red);
            } else if (table_id == 23) {
                jPanel50_23.setBackground(Color.red);
            } else if (table_id == 24) {
                jPanel50_24.setBackground(Color.red);
            } else if (table_id == 25) {
                jPanel50_25.setBackground(Color.red);
            } else if (table_id == 26) {
                jPanel50_26.setBackground(Color.red);
            } else if (table_id == 27) {
                jPanel50_27.setBackground(Color.red);
            } else if (table_id == 28) {
                jPanel50_28.setBackground(Color.red);
            } else if (table_id == 29) {
                jPanel50_29.setBackground(Color.red);
            } else if (table_id == 30) {
                jPanel50_30.setBackground(Color.red);
            } else if (table_id == 31) {
                jPanel50_31.setBackground(Color.red);
            } else if (table_id == 32) {
                jPanel50_32.setBackground(Color.red);
            } else if (table_id == 33) {
                jPanel50_33.setBackground(Color.red);
            } else if (table_id == 34) {
                jPanel50_34.setBackground(Color.red);
            } else if (table_id == 35) {
                jPanel50_35.setBackground(Color.red);
            } else if (table_id == 36) {
                jPanel50_36.setBackground(Color.red);
            } else if (table_id == 37) {
                jPanel50_37.setBackground(Color.red);
            } else if (table_id == 38) {
                jPanel50_38.setBackground(Color.red);
            } else if (table_id == 39) {
                jPanel50_39.setBackground(Color.red);
            } else if (table_id == 40) {
                jPanel50_40.setBackground(Color.red);
            } else if (table_id == 41) {
                jPanel50_41.setBackground(Color.red);
            } else if (table_id == 42) {
                jPanel50_42.setBackground(Color.red);
            } else if (table_id == 43) {
                jPanel50_43.setBackground(Color.red);
            } else if (table_id == 44) {
                jPanel50_44.setBackground(Color.red);
            } else if (table_id == 45) {
                jPanel50_45.setBackground(Color.red);
            } else if (table_id == 46) {
                jPanel50_46.setBackground(Color.red);
            } else if (table_id == 47) {
                jPanel50_47.setBackground(Color.red);
            } else if (table_id == 48) {
                jPanel50_48.setBackground(Color.red);
            } else if (table_id == 49) {
                jPanel50_49.setBackground(Color.red);
            } else if (table_id == 50) {
                jPanel50_50.setBackground(Color.red);
            }
            
            
            

            // Close resources
            rs.close();
            st.close();
            con.close();
        
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel50_1 = new javax.swing.JPanel();
        jPanel50_2 = new javax.swing.JPanel();
        jPanel50_3 = new javax.swing.JPanel();
        jPanel50_5 = new javax.swing.JPanel();
        jPanel50_4 = new javax.swing.JPanel();
        jPanel50_11 = new javax.swing.JPanel();
        jPanel50_12 = new javax.swing.JPanel();
        jPanel50_13 = new javax.swing.JPanel();
        jPanel50_14 = new javax.swing.JPanel();
        jPanel50_15 = new javax.swing.JPanel();
        jPanel50_21 = new javax.swing.JPanel();
        jPanel50_22 = new javax.swing.JPanel();
        jPanel50_23 = new javax.swing.JPanel();
        jPanel50_24 = new javax.swing.JPanel();
        jPanel50_25 = new javax.swing.JPanel();
        jPanel50_31 = new javax.swing.JPanel();
        jPanel50_32 = new javax.swing.JPanel();
        jPanel50_33 = new javax.swing.JPanel();
        jPanel50_34 = new javax.swing.JPanel();
        jPanel50_35 = new javax.swing.JPanel();
        jPanel50_41 = new javax.swing.JPanel();
        jPanel50_42 = new javax.swing.JPanel();
        jPanel50_43 = new javax.swing.JPanel();
        jPanel50_44 = new javax.swing.JPanel();
        jPanel50_45 = new javax.swing.JPanel();
        jPanel50_6 = new javax.swing.JPanel();
        jPanel50_16 = new javax.swing.JPanel();
        jPanel50_26 = new javax.swing.JPanel();
        jPanel50_36 = new javax.swing.JPanel();
        jPanel50_46 = new javax.swing.JPanel();
        jPanel50_47 = new javax.swing.JPanel();
        jPanel50_37 = new javax.swing.JPanel();
        jPanel50_27 = new javax.swing.JPanel();
        jPanel50_17 = new javax.swing.JPanel();
        jPanel50_7 = new javax.swing.JPanel();
        jPanel50_8 = new javax.swing.JPanel();
        jPanel50_18 = new javax.swing.JPanel();
        jPanel50_28 = new javax.swing.JPanel();
        jPanel50_38 = new javax.swing.JPanel();
        jPanel50_48 = new javax.swing.JPanel();
        jPanel50_49 = new javax.swing.JPanel();
        jPanel50_39 = new javax.swing.JPanel();
        jPanel50_29 = new javax.swing.JPanel();
        jPanel50_19 = new javax.swing.JPanel();
        jPanel50_9 = new javax.swing.JPanel();
        jPanel50_10 = new javax.swing.JPanel();
        jPanel50_20 = new javax.swing.JPanel();
        jPanel50_30 = new javax.swing.JPanel();
        jPanel50_40 = new javax.swing.JPanel();
        jPanel50_50 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(117, 90, 51));

        jLabel1.setBackground(new java.awt.Color(249, 249, 249));
        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 233, 229));
        jLabel1.setText("View Seats");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        jLabel2.setText("Front");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel50_1Layout = new javax.swing.GroupLayout(jPanel50_1);
        jPanel50_1.setLayout(jPanel50_1Layout);
        jPanel50_1Layout.setHorizontalGroup(
            jPanel50_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_1Layout.setVerticalGroup(
            jPanel50_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_2Layout = new javax.swing.GroupLayout(jPanel50_2);
        jPanel50_2.setLayout(jPanel50_2Layout);
        jPanel50_2Layout.setHorizontalGroup(
            jPanel50_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_2Layout.setVerticalGroup(
            jPanel50_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_3Layout = new javax.swing.GroupLayout(jPanel50_3);
        jPanel50_3.setLayout(jPanel50_3Layout);
        jPanel50_3Layout.setHorizontalGroup(
            jPanel50_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_3Layout.setVerticalGroup(
            jPanel50_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_5Layout = new javax.swing.GroupLayout(jPanel50_5);
        jPanel50_5.setLayout(jPanel50_5Layout);
        jPanel50_5Layout.setHorizontalGroup(
            jPanel50_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_5Layout.setVerticalGroup(
            jPanel50_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_4Layout = new javax.swing.GroupLayout(jPanel50_4);
        jPanel50_4.setLayout(jPanel50_4Layout);
        jPanel50_4Layout.setHorizontalGroup(
            jPanel50_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_4Layout.setVerticalGroup(
            jPanel50_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_11Layout = new javax.swing.GroupLayout(jPanel50_11);
        jPanel50_11.setLayout(jPanel50_11Layout);
        jPanel50_11Layout.setHorizontalGroup(
            jPanel50_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_11Layout.setVerticalGroup(
            jPanel50_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_12Layout = new javax.swing.GroupLayout(jPanel50_12);
        jPanel50_12.setLayout(jPanel50_12Layout);
        jPanel50_12Layout.setHorizontalGroup(
            jPanel50_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_12Layout.setVerticalGroup(
            jPanel50_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_13Layout = new javax.swing.GroupLayout(jPanel50_13);
        jPanel50_13.setLayout(jPanel50_13Layout);
        jPanel50_13Layout.setHorizontalGroup(
            jPanel50_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_13Layout.setVerticalGroup(
            jPanel50_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_14Layout = new javax.swing.GroupLayout(jPanel50_14);
        jPanel50_14.setLayout(jPanel50_14Layout);
        jPanel50_14Layout.setHorizontalGroup(
            jPanel50_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_14Layout.setVerticalGroup(
            jPanel50_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_15Layout = new javax.swing.GroupLayout(jPanel50_15);
        jPanel50_15.setLayout(jPanel50_15Layout);
        jPanel50_15Layout.setHorizontalGroup(
            jPanel50_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_15Layout.setVerticalGroup(
            jPanel50_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_21Layout = new javax.swing.GroupLayout(jPanel50_21);
        jPanel50_21.setLayout(jPanel50_21Layout);
        jPanel50_21Layout.setHorizontalGroup(
            jPanel50_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_21Layout.setVerticalGroup(
            jPanel50_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_22Layout = new javax.swing.GroupLayout(jPanel50_22);
        jPanel50_22.setLayout(jPanel50_22Layout);
        jPanel50_22Layout.setHorizontalGroup(
            jPanel50_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_22Layout.setVerticalGroup(
            jPanel50_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_23Layout = new javax.swing.GroupLayout(jPanel50_23);
        jPanel50_23.setLayout(jPanel50_23Layout);
        jPanel50_23Layout.setHorizontalGroup(
            jPanel50_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_23Layout.setVerticalGroup(
            jPanel50_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_24Layout = new javax.swing.GroupLayout(jPanel50_24);
        jPanel50_24.setLayout(jPanel50_24Layout);
        jPanel50_24Layout.setHorizontalGroup(
            jPanel50_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_24Layout.setVerticalGroup(
            jPanel50_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_25Layout = new javax.swing.GroupLayout(jPanel50_25);
        jPanel50_25.setLayout(jPanel50_25Layout);
        jPanel50_25Layout.setHorizontalGroup(
            jPanel50_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_25Layout.setVerticalGroup(
            jPanel50_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_31Layout = new javax.swing.GroupLayout(jPanel50_31);
        jPanel50_31.setLayout(jPanel50_31Layout);
        jPanel50_31Layout.setHorizontalGroup(
            jPanel50_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_31Layout.setVerticalGroup(
            jPanel50_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_32Layout = new javax.swing.GroupLayout(jPanel50_32);
        jPanel50_32.setLayout(jPanel50_32Layout);
        jPanel50_32Layout.setHorizontalGroup(
            jPanel50_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_32Layout.setVerticalGroup(
            jPanel50_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_33Layout = new javax.swing.GroupLayout(jPanel50_33);
        jPanel50_33.setLayout(jPanel50_33Layout);
        jPanel50_33Layout.setHorizontalGroup(
            jPanel50_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_33Layout.setVerticalGroup(
            jPanel50_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_34Layout = new javax.swing.GroupLayout(jPanel50_34);
        jPanel50_34.setLayout(jPanel50_34Layout);
        jPanel50_34Layout.setHorizontalGroup(
            jPanel50_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_34Layout.setVerticalGroup(
            jPanel50_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_35Layout = new javax.swing.GroupLayout(jPanel50_35);
        jPanel50_35.setLayout(jPanel50_35Layout);
        jPanel50_35Layout.setHorizontalGroup(
            jPanel50_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_35Layout.setVerticalGroup(
            jPanel50_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_41Layout = new javax.swing.GroupLayout(jPanel50_41);
        jPanel50_41.setLayout(jPanel50_41Layout);
        jPanel50_41Layout.setHorizontalGroup(
            jPanel50_41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_41Layout.setVerticalGroup(
            jPanel50_41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_42Layout = new javax.swing.GroupLayout(jPanel50_42);
        jPanel50_42.setLayout(jPanel50_42Layout);
        jPanel50_42Layout.setHorizontalGroup(
            jPanel50_42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_42Layout.setVerticalGroup(
            jPanel50_42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_43Layout = new javax.swing.GroupLayout(jPanel50_43);
        jPanel50_43.setLayout(jPanel50_43Layout);
        jPanel50_43Layout.setHorizontalGroup(
            jPanel50_43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_43Layout.setVerticalGroup(
            jPanel50_43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_44Layout = new javax.swing.GroupLayout(jPanel50_44);
        jPanel50_44.setLayout(jPanel50_44Layout);
        jPanel50_44Layout.setHorizontalGroup(
            jPanel50_44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_44Layout.setVerticalGroup(
            jPanel50_44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_45Layout = new javax.swing.GroupLayout(jPanel50_45);
        jPanel50_45.setLayout(jPanel50_45Layout);
        jPanel50_45Layout.setHorizontalGroup(
            jPanel50_45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_45Layout.setVerticalGroup(
            jPanel50_45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_6Layout = new javax.swing.GroupLayout(jPanel50_6);
        jPanel50_6.setLayout(jPanel50_6Layout);
        jPanel50_6Layout.setHorizontalGroup(
            jPanel50_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_6Layout.setVerticalGroup(
            jPanel50_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_16Layout = new javax.swing.GroupLayout(jPanel50_16);
        jPanel50_16.setLayout(jPanel50_16Layout);
        jPanel50_16Layout.setHorizontalGroup(
            jPanel50_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_16Layout.setVerticalGroup(
            jPanel50_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_26Layout = new javax.swing.GroupLayout(jPanel50_26);
        jPanel50_26.setLayout(jPanel50_26Layout);
        jPanel50_26Layout.setHorizontalGroup(
            jPanel50_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_26Layout.setVerticalGroup(
            jPanel50_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_36Layout = new javax.swing.GroupLayout(jPanel50_36);
        jPanel50_36.setLayout(jPanel50_36Layout);
        jPanel50_36Layout.setHorizontalGroup(
            jPanel50_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_36Layout.setVerticalGroup(
            jPanel50_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_46Layout = new javax.swing.GroupLayout(jPanel50_46);
        jPanel50_46.setLayout(jPanel50_46Layout);
        jPanel50_46Layout.setHorizontalGroup(
            jPanel50_46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_46Layout.setVerticalGroup(
            jPanel50_46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_47Layout = new javax.swing.GroupLayout(jPanel50_47);
        jPanel50_47.setLayout(jPanel50_47Layout);
        jPanel50_47Layout.setHorizontalGroup(
            jPanel50_47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_47Layout.setVerticalGroup(
            jPanel50_47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_37Layout = new javax.swing.GroupLayout(jPanel50_37);
        jPanel50_37.setLayout(jPanel50_37Layout);
        jPanel50_37Layout.setHorizontalGroup(
            jPanel50_37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_37Layout.setVerticalGroup(
            jPanel50_37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_27Layout = new javax.swing.GroupLayout(jPanel50_27);
        jPanel50_27.setLayout(jPanel50_27Layout);
        jPanel50_27Layout.setHorizontalGroup(
            jPanel50_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_27Layout.setVerticalGroup(
            jPanel50_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_17Layout = new javax.swing.GroupLayout(jPanel50_17);
        jPanel50_17.setLayout(jPanel50_17Layout);
        jPanel50_17Layout.setHorizontalGroup(
            jPanel50_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_17Layout.setVerticalGroup(
            jPanel50_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_7Layout = new javax.swing.GroupLayout(jPanel50_7);
        jPanel50_7.setLayout(jPanel50_7Layout);
        jPanel50_7Layout.setHorizontalGroup(
            jPanel50_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_7Layout.setVerticalGroup(
            jPanel50_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_8Layout = new javax.swing.GroupLayout(jPanel50_8);
        jPanel50_8.setLayout(jPanel50_8Layout);
        jPanel50_8Layout.setHorizontalGroup(
            jPanel50_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_8Layout.setVerticalGroup(
            jPanel50_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_18Layout = new javax.swing.GroupLayout(jPanel50_18);
        jPanel50_18.setLayout(jPanel50_18Layout);
        jPanel50_18Layout.setHorizontalGroup(
            jPanel50_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_18Layout.setVerticalGroup(
            jPanel50_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_28Layout = new javax.swing.GroupLayout(jPanel50_28);
        jPanel50_28.setLayout(jPanel50_28Layout);
        jPanel50_28Layout.setHorizontalGroup(
            jPanel50_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_28Layout.setVerticalGroup(
            jPanel50_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_38Layout = new javax.swing.GroupLayout(jPanel50_38);
        jPanel50_38.setLayout(jPanel50_38Layout);
        jPanel50_38Layout.setHorizontalGroup(
            jPanel50_38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_38Layout.setVerticalGroup(
            jPanel50_38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_48Layout = new javax.swing.GroupLayout(jPanel50_48);
        jPanel50_48.setLayout(jPanel50_48Layout);
        jPanel50_48Layout.setHorizontalGroup(
            jPanel50_48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_48Layout.setVerticalGroup(
            jPanel50_48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_49Layout = new javax.swing.GroupLayout(jPanel50_49);
        jPanel50_49.setLayout(jPanel50_49Layout);
        jPanel50_49Layout.setHorizontalGroup(
            jPanel50_49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_49Layout.setVerticalGroup(
            jPanel50_49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_39Layout = new javax.swing.GroupLayout(jPanel50_39);
        jPanel50_39.setLayout(jPanel50_39Layout);
        jPanel50_39Layout.setHorizontalGroup(
            jPanel50_39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_39Layout.setVerticalGroup(
            jPanel50_39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_29Layout = new javax.swing.GroupLayout(jPanel50_29);
        jPanel50_29.setLayout(jPanel50_29Layout);
        jPanel50_29Layout.setHorizontalGroup(
            jPanel50_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_29Layout.setVerticalGroup(
            jPanel50_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_19Layout = new javax.swing.GroupLayout(jPanel50_19);
        jPanel50_19.setLayout(jPanel50_19Layout);
        jPanel50_19Layout.setHorizontalGroup(
            jPanel50_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_19Layout.setVerticalGroup(
            jPanel50_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_9Layout = new javax.swing.GroupLayout(jPanel50_9);
        jPanel50_9.setLayout(jPanel50_9Layout);
        jPanel50_9Layout.setHorizontalGroup(
            jPanel50_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_9Layout.setVerticalGroup(
            jPanel50_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_10Layout = new javax.swing.GroupLayout(jPanel50_10);
        jPanel50_10.setLayout(jPanel50_10Layout);
        jPanel50_10Layout.setHorizontalGroup(
            jPanel50_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_10Layout.setVerticalGroup(
            jPanel50_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_20Layout = new javax.swing.GroupLayout(jPanel50_20);
        jPanel50_20.setLayout(jPanel50_20Layout);
        jPanel50_20Layout.setHorizontalGroup(
            jPanel50_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_20Layout.setVerticalGroup(
            jPanel50_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_30Layout = new javax.swing.GroupLayout(jPanel50_30);
        jPanel50_30.setLayout(jPanel50_30Layout);
        jPanel50_30Layout.setHorizontalGroup(
            jPanel50_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_30Layout.setVerticalGroup(
            jPanel50_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_40Layout = new javax.swing.GroupLayout(jPanel50_40);
        jPanel50_40.setLayout(jPanel50_40Layout);
        jPanel50_40Layout.setHorizontalGroup(
            jPanel50_40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_40Layout.setVerticalGroup(
            jPanel50_40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel50_50Layout = new javax.swing.GroupLayout(jPanel50_50);
        jPanel50_50.setLayout(jPanel50_50Layout);
        jPanel50_50Layout.setHorizontalGroup(
            jPanel50_50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel50_50Layout.setVerticalGroup(
            jPanel50_50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(228, 233, 229));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jButton1.setText("Go to Invitation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel50_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel50_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel50_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel50_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel50_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel50_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel50_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel50_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel50_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel50_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel50_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel50_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel50_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int usersId = View_FiftySeats.getMyID();
        
        String themechoice;
        try {
            String SUrl, SUser, SPass;
            Class.forName("com.mysql.cj.jdbc.Driver");
            SUrl = "jdbc:mysql://localhost:3306/everafterjourney_database";
            SUser = "root";
            SPass = "";

            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();   

             String sql = "SELECT theme_choice FROM wedding_invitation WHERE signup_id = " + usersId;

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                themechoice = rs.getString("theme_choice");
                System.out.println(themechoice);
                
                if (themechoice.equals("blue")) {
                    FirstTheme first = new FirstTheme();
                    first.setVisible(true);
                    this.setVisible(false);
                } else if (themechoice.equals("pink")) {
                    SecondTheme second = new SecondTheme();
                    second.setVisible(true);
                    this.setVisible(false);
                } else if (themechoice.equals("gold")) {
                    ThirdTheme third = new ThirdTheme();
                    third.setVisible(true);
                    this.setVisible(false);
                } else {
                    
                }
            } 
           
        } catch (Exception e) {
            e.printStackTrace();    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_FiftySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_FiftySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_FiftySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_FiftySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_FiftySeats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel50_1;
    private javax.swing.JPanel jPanel50_10;
    private javax.swing.JPanel jPanel50_11;
    private javax.swing.JPanel jPanel50_12;
    private javax.swing.JPanel jPanel50_13;
    private javax.swing.JPanel jPanel50_14;
    private javax.swing.JPanel jPanel50_15;
    private javax.swing.JPanel jPanel50_16;
    private javax.swing.JPanel jPanel50_17;
    private javax.swing.JPanel jPanel50_18;
    private javax.swing.JPanel jPanel50_19;
    private javax.swing.JPanel jPanel50_2;
    private javax.swing.JPanel jPanel50_20;
    private javax.swing.JPanel jPanel50_21;
    private javax.swing.JPanel jPanel50_22;
    private javax.swing.JPanel jPanel50_23;
    private javax.swing.JPanel jPanel50_24;
    private javax.swing.JPanel jPanel50_25;
    private javax.swing.JPanel jPanel50_26;
    private javax.swing.JPanel jPanel50_27;
    private javax.swing.JPanel jPanel50_28;
    private javax.swing.JPanel jPanel50_29;
    private javax.swing.JPanel jPanel50_3;
    private javax.swing.JPanel jPanel50_30;
    private javax.swing.JPanel jPanel50_31;
    private javax.swing.JPanel jPanel50_32;
    private javax.swing.JPanel jPanel50_33;
    private javax.swing.JPanel jPanel50_34;
    private javax.swing.JPanel jPanel50_35;
    private javax.swing.JPanel jPanel50_36;
    private javax.swing.JPanel jPanel50_37;
    private javax.swing.JPanel jPanel50_38;
    private javax.swing.JPanel jPanel50_39;
    private javax.swing.JPanel jPanel50_4;
    private javax.swing.JPanel jPanel50_40;
    private javax.swing.JPanel jPanel50_41;
    private javax.swing.JPanel jPanel50_42;
    private javax.swing.JPanel jPanel50_43;
    private javax.swing.JPanel jPanel50_44;
    private javax.swing.JPanel jPanel50_45;
    private javax.swing.JPanel jPanel50_46;
    private javax.swing.JPanel jPanel50_47;
    private javax.swing.JPanel jPanel50_48;
    private javax.swing.JPanel jPanel50_49;
    private javax.swing.JPanel jPanel50_5;
    private javax.swing.JPanel jPanel50_50;
    private javax.swing.JPanel jPanel50_6;
    private javax.swing.JPanel jPanel50_7;
    private javax.swing.JPanel jPanel50_8;
    private javax.swing.JPanel jPanel50_9;
    // End of variables declaration//GEN-END:variables
}
