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
public class View_SeventyFiveSeats extends javax.swing.JFrame {

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
    
    public View_SeventyFiveSeats() {
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
                jPanel75_1.setBackground(Color.red);
            } else if (table_id == 2) {
                jPanel75_2.setBackground(Color.red);
            } else if (table_id == 3) {
                jPanel75_3.setBackground(Color.red);
            } else if (table_id == 4) {
                jPanel75_4.setBackground(Color.red);
            } else if (table_id == 5) {
                jPanel75_5.setBackground(Color.red);
            } else if (table_id == 6) {
                jPanel75_6.setBackground(Color.red);
            } else if (table_id == 7) {
                jPanel75_7.setBackground(Color.red);
            } else if (table_id == 8) {
                jPanel75_8.setBackground(Color.red);
            } else if (table_id == 9) {
                jPanel75_9.setBackground(Color.red);
            } else if (table_id == 10) {
                jPanel75_10.setBackground(Color.red);
            } else if (table_id == 11) {
                jPanel75_11.setBackground(Color.red);
            } else if (table_id == 12) {
                jPanel75_12.setBackground(Color.red);
            } else if (table_id == 13) {
                jPanel75_13.setBackground(Color.red);
            } else if (table_id == 14) {
                jPanel75_14.setBackground(Color.red);
            } else if (table_id == 15) {
                jPanel75_15.setBackground(Color.red);
            } else if (table_id == 16) {
                jPanel75_16.setBackground(Color.red);
            } else if (table_id == 17) {
                jPanel75_17.setBackground(Color.red);
            } else if (table_id == 18) {
                jPanel75_18.setBackground(Color.red);
            } else if (table_id == 19) {
                jPanel75_19.setBackground(Color.red);
            } else if (table_id == 20) {
                jPanel75_20.setBackground(Color.red);
            } else if (table_id == 21) {
                jPanel75_21.setBackground(Color.red);
            } else if (table_id == 22) {
                jPanel75_22.setBackground(Color.red);
            } else if (table_id == 23) {
                jPanel75_23.setBackground(Color.red);
            } else if (table_id == 24) {
                jPanel75_24.setBackground(Color.red);
            } else if (table_id == 25) {
                jPanel75_25.setBackground(Color.red);
            } else if (table_id == 26) {
                jPanel75_26.setBackground(Color.red);
            } else if (table_id == 27) {
                jPanel75_27.setBackground(Color.red);
            } else if (table_id == 28) {
                jPanel75_28.setBackground(Color.red);
            } else if (table_id == 29) {
                jPanel75_29.setBackground(Color.red);
            } else if (table_id == 30) {
                jPanel75_30.setBackground(Color.red);
            } else if (table_id == 31) {
                jPanel75_31.setBackground(Color.red);
            } else if (table_id == 32) {
                jPanel75_32.setBackground(Color.red);
            } else if (table_id == 33) {
                jPanel75_33.setBackground(Color.red);
            } else if (table_id == 34) {
                jPanel75_34.setBackground(Color.red);
            } else if (table_id == 35) {
                jPanel75_35.setBackground(Color.red);
            } else if (table_id == 36) {
                jPanel75_36.setBackground(Color.red);
            } else if (table_id == 37) {
                jPanel75_37.setBackground(Color.red);
            } else if (table_id == 38) {
                jPanel75_38.setBackground(Color.red);
            } else if (table_id == 39) {
                jPanel75_39.setBackground(Color.red);
            } else if (table_id == 40) {
                jPanel75_40.setBackground(Color.red);
            } else if (table_id == 41) {
                jPanel75_41.setBackground(Color.red);
            } else if (table_id == 42) {
                jPanel75_42.setBackground(Color.red);
            } else if (table_id == 43) {
                jPanel75_43.setBackground(Color.red);
            } else if (table_id == 44) {
                jPanel75_44.setBackground(Color.red);
            } else if (table_id == 45) {
                jPanel75_45.setBackground(Color.red);
            } else if (table_id == 46) {
                jPanel75_46.setBackground(Color.red);
            } else if (table_id == 47) {
                jPanel75_47.setBackground(Color.red);
            } else if (table_id == 48) {
                jPanel75_48.setBackground(Color.red);
            } else if (table_id == 49) {
                jPanel75_49.setBackground(Color.red);
            } else if (table_id == 50) {
                jPanel75_50.setBackground(Color.red);
            } else if (table_id == 51) {
                jPanel75_51.setBackground(Color.red);
            } else if (table_id == 52) {
                jPanel75_52.setBackground(Color.red);
            } else if (table_id == 53) {
                jPanel75_53.setBackground(Color.red);
            } else if (table_id == 54) {
                jPanel75_54.setBackground(Color.red);
            } else if (table_id == 55) {
                jPanel75_55.setBackground(Color.red);
            } else if (table_id == 56) {
                jPanel75_56.setBackground(Color.red);
            } else if (table_id == 57) {
                jPanel75_57.setBackground(Color.red);
            } else if (table_id == 58) {
                jPanel75_58.setBackground(Color.red);
            } else if (table_id == 59) {
                jPanel75_59.setBackground(Color.red);
            } else if (table_id == 60) {
                jPanel75_60.setBackground(Color.red);
            } else if (table_id == 61) {
                jPanel75_61.setBackground(Color.red);
            } else if (table_id == 62) {
                jPanel75_62.setBackground(Color.red);
            } else if (table_id == 63) {
                jPanel75_63.setBackground(Color.red);
            } else if (table_id == 64) {
                jPanel75_64.setBackground(Color.red);
            } else if (table_id == 65) {
                jPanel75_65.setBackground(Color.red);
            } else if (table_id == 66) {
                jPanel75_66.setBackground(Color.red);
            } else if (table_id == 67) {
                jPanel75_67.setBackground(Color.red);
            } else if (table_id == 68) {
                jPanel75_68.setBackground(Color.red);
            } else if (table_id == 69) {
                jPanel75_69.setBackground(Color.red);
            } else if (table_id == 70) {
                jPanel75_70.setBackground(Color.red);
            } else if (table_id == 71) {
                jPanel75_71.setBackground(Color.red);
            } else if (table_id == 72) {
                jPanel75_72.setBackground(Color.red);
            } else if (table_id == 73) {
                jPanel75_73.setBackground(Color.red);
            } else if (table_id == 74) {
                jPanel75_74.setBackground(Color.red);
            } else if (table_id == 75) {
                jPanel75_75.setBackground(Color.red);
            }
            
            
            

            // Close resources
            rs.close();
            st.close();
            con.close();
        
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel75_1 = new javax.swing.JPanel();
        jPanel75_2 = new javax.swing.JPanel();
        jPanel75_3 = new javax.swing.JPanel();
        jPanel75_5 = new javax.swing.JPanel();
        jPanel75_4 = new javax.swing.JPanel();
        jPanel75_11 = new javax.swing.JPanel();
        jPanel75_12 = new javax.swing.JPanel();
        jPanel75_13 = new javax.swing.JPanel();
        jPanel75_14 = new javax.swing.JPanel();
        jPanel75_15 = new javax.swing.JPanel();
        jPanel75_21 = new javax.swing.JPanel();
        jPanel75_22 = new javax.swing.JPanel();
        jPanel75_23 = new javax.swing.JPanel();
        jPanel75_24 = new javax.swing.JPanel();
        jPanel75_25 = new javax.swing.JPanel();
        jPanel75_31 = new javax.swing.JPanel();
        jPanel75_32 = new javax.swing.JPanel();
        jPanel75_33 = new javax.swing.JPanel();
        jPanel75_34 = new javax.swing.JPanel();
        jPanel75_35 = new javax.swing.JPanel();
        jPanel75_41 = new javax.swing.JPanel();
        jPanel75_42 = new javax.swing.JPanel();
        jPanel75_43 = new javax.swing.JPanel();
        jPanel75_44 = new javax.swing.JPanel();
        jPanel75_45 = new javax.swing.JPanel();
        jPanel75_6 = new javax.swing.JPanel();
        jPanel75_16 = new javax.swing.JPanel();
        jPanel75_26 = new javax.swing.JPanel();
        jPanel75_36 = new javax.swing.JPanel();
        jPanel75_46 = new javax.swing.JPanel();
        jPanel75_47 = new javax.swing.JPanel();
        jPanel75_37 = new javax.swing.JPanel();
        jPanel75_27 = new javax.swing.JPanel();
        jPanel75_17 = new javax.swing.JPanel();
        jPanel75_7 = new javax.swing.JPanel();
        jPanel75_8 = new javax.swing.JPanel();
        jPanel75_18 = new javax.swing.JPanel();
        jPanel75_28 = new javax.swing.JPanel();
        jPanel75_38 = new javax.swing.JPanel();
        jPanel75_48 = new javax.swing.JPanel();
        jPanel75_49 = new javax.swing.JPanel();
        jPanel75_39 = new javax.swing.JPanel();
        jPanel75_29 = new javax.swing.JPanel();
        jPanel75_19 = new javax.swing.JPanel();
        jPanel75_9 = new javax.swing.JPanel();
        jPanel75_10 = new javax.swing.JPanel();
        jPanel75_20 = new javax.swing.JPanel();
        jPanel75_30 = new javax.swing.JPanel();
        jPanel75_40 = new javax.swing.JPanel();
        jPanel75_50 = new javax.swing.JPanel();
        jPanel75_51 = new javax.swing.JPanel();
        jPanel75_52 = new javax.swing.JPanel();
        jPanel75_53 = new javax.swing.JPanel();
        jPanel75_54 = new javax.swing.JPanel();
        jPanel75_55 = new javax.swing.JPanel();
        jPanel75_61 = new javax.swing.JPanel();
        jPanel75_62 = new javax.swing.JPanel();
        jPanel75_63 = new javax.swing.JPanel();
        jPanel75_64 = new javax.swing.JPanel();
        jPanel75_65 = new javax.swing.JPanel();
        jPanel75_56 = new javax.swing.JPanel();
        jPanel75_57 = new javax.swing.JPanel();
        jPanel75_58 = new javax.swing.JPanel();
        jPanel75_59 = new javax.swing.JPanel();
        jPanel75_60 = new javax.swing.JPanel();
        jPanel75_66 = new javax.swing.JPanel();
        jPanel75_67 = new javax.swing.JPanel();
        jPanel75_68 = new javax.swing.JPanel();
        jPanel75_69 = new javax.swing.JPanel();
        jPanel75_70 = new javax.swing.JPanel();
        jPanel75_71 = new javax.swing.JPanel();
        jPanel75_72 = new javax.swing.JPanel();
        jPanel75_73 = new javax.swing.JPanel();
        jPanel75_74 = new javax.swing.JPanel();
        jPanel75_75 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel75_1Layout = new javax.swing.GroupLayout(jPanel75_1);
        jPanel75_1.setLayout(jPanel75_1Layout);
        jPanel75_1Layout.setHorizontalGroup(
            jPanel75_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_1Layout.setVerticalGroup(
            jPanel75_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_2Layout = new javax.swing.GroupLayout(jPanel75_2);
        jPanel75_2.setLayout(jPanel75_2Layout);
        jPanel75_2Layout.setHorizontalGroup(
            jPanel75_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_2Layout.setVerticalGroup(
            jPanel75_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_3Layout = new javax.swing.GroupLayout(jPanel75_3);
        jPanel75_3.setLayout(jPanel75_3Layout);
        jPanel75_3Layout.setHorizontalGroup(
            jPanel75_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_3Layout.setVerticalGroup(
            jPanel75_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_5Layout = new javax.swing.GroupLayout(jPanel75_5);
        jPanel75_5.setLayout(jPanel75_5Layout);
        jPanel75_5Layout.setHorizontalGroup(
            jPanel75_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_5Layout.setVerticalGroup(
            jPanel75_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_4Layout = new javax.swing.GroupLayout(jPanel75_4);
        jPanel75_4.setLayout(jPanel75_4Layout);
        jPanel75_4Layout.setHorizontalGroup(
            jPanel75_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_4Layout.setVerticalGroup(
            jPanel75_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_11Layout = new javax.swing.GroupLayout(jPanel75_11);
        jPanel75_11.setLayout(jPanel75_11Layout);
        jPanel75_11Layout.setHorizontalGroup(
            jPanel75_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_11Layout.setVerticalGroup(
            jPanel75_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_12Layout = new javax.swing.GroupLayout(jPanel75_12);
        jPanel75_12.setLayout(jPanel75_12Layout);
        jPanel75_12Layout.setHorizontalGroup(
            jPanel75_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_12Layout.setVerticalGroup(
            jPanel75_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_13Layout = new javax.swing.GroupLayout(jPanel75_13);
        jPanel75_13.setLayout(jPanel75_13Layout);
        jPanel75_13Layout.setHorizontalGroup(
            jPanel75_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_13Layout.setVerticalGroup(
            jPanel75_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_14Layout = new javax.swing.GroupLayout(jPanel75_14);
        jPanel75_14.setLayout(jPanel75_14Layout);
        jPanel75_14Layout.setHorizontalGroup(
            jPanel75_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_14Layout.setVerticalGroup(
            jPanel75_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_15Layout = new javax.swing.GroupLayout(jPanel75_15);
        jPanel75_15.setLayout(jPanel75_15Layout);
        jPanel75_15Layout.setHorizontalGroup(
            jPanel75_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_15Layout.setVerticalGroup(
            jPanel75_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_21Layout = new javax.swing.GroupLayout(jPanel75_21);
        jPanel75_21.setLayout(jPanel75_21Layout);
        jPanel75_21Layout.setHorizontalGroup(
            jPanel75_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_21Layout.setVerticalGroup(
            jPanel75_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_22Layout = new javax.swing.GroupLayout(jPanel75_22);
        jPanel75_22.setLayout(jPanel75_22Layout);
        jPanel75_22Layout.setHorizontalGroup(
            jPanel75_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_22Layout.setVerticalGroup(
            jPanel75_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_23Layout = new javax.swing.GroupLayout(jPanel75_23);
        jPanel75_23.setLayout(jPanel75_23Layout);
        jPanel75_23Layout.setHorizontalGroup(
            jPanel75_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_23Layout.setVerticalGroup(
            jPanel75_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_24Layout = new javax.swing.GroupLayout(jPanel75_24);
        jPanel75_24.setLayout(jPanel75_24Layout);
        jPanel75_24Layout.setHorizontalGroup(
            jPanel75_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_24Layout.setVerticalGroup(
            jPanel75_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_25Layout = new javax.swing.GroupLayout(jPanel75_25);
        jPanel75_25.setLayout(jPanel75_25Layout);
        jPanel75_25Layout.setHorizontalGroup(
            jPanel75_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_25Layout.setVerticalGroup(
            jPanel75_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_31Layout = new javax.swing.GroupLayout(jPanel75_31);
        jPanel75_31.setLayout(jPanel75_31Layout);
        jPanel75_31Layout.setHorizontalGroup(
            jPanel75_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_31Layout.setVerticalGroup(
            jPanel75_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_32Layout = new javax.swing.GroupLayout(jPanel75_32);
        jPanel75_32.setLayout(jPanel75_32Layout);
        jPanel75_32Layout.setHorizontalGroup(
            jPanel75_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_32Layout.setVerticalGroup(
            jPanel75_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_33Layout = new javax.swing.GroupLayout(jPanel75_33);
        jPanel75_33.setLayout(jPanel75_33Layout);
        jPanel75_33Layout.setHorizontalGroup(
            jPanel75_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_33Layout.setVerticalGroup(
            jPanel75_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_34Layout = new javax.swing.GroupLayout(jPanel75_34);
        jPanel75_34.setLayout(jPanel75_34Layout);
        jPanel75_34Layout.setHorizontalGroup(
            jPanel75_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_34Layout.setVerticalGroup(
            jPanel75_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_35Layout = new javax.swing.GroupLayout(jPanel75_35);
        jPanel75_35.setLayout(jPanel75_35Layout);
        jPanel75_35Layout.setHorizontalGroup(
            jPanel75_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_35Layout.setVerticalGroup(
            jPanel75_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_41Layout = new javax.swing.GroupLayout(jPanel75_41);
        jPanel75_41.setLayout(jPanel75_41Layout);
        jPanel75_41Layout.setHorizontalGroup(
            jPanel75_41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_41Layout.setVerticalGroup(
            jPanel75_41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_42Layout = new javax.swing.GroupLayout(jPanel75_42);
        jPanel75_42.setLayout(jPanel75_42Layout);
        jPanel75_42Layout.setHorizontalGroup(
            jPanel75_42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_42Layout.setVerticalGroup(
            jPanel75_42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_43Layout = new javax.swing.GroupLayout(jPanel75_43);
        jPanel75_43.setLayout(jPanel75_43Layout);
        jPanel75_43Layout.setHorizontalGroup(
            jPanel75_43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_43Layout.setVerticalGroup(
            jPanel75_43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_44Layout = new javax.swing.GroupLayout(jPanel75_44);
        jPanel75_44.setLayout(jPanel75_44Layout);
        jPanel75_44Layout.setHorizontalGroup(
            jPanel75_44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_44Layout.setVerticalGroup(
            jPanel75_44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_45Layout = new javax.swing.GroupLayout(jPanel75_45);
        jPanel75_45.setLayout(jPanel75_45Layout);
        jPanel75_45Layout.setHorizontalGroup(
            jPanel75_45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_45Layout.setVerticalGroup(
            jPanel75_45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_6Layout = new javax.swing.GroupLayout(jPanel75_6);
        jPanel75_6.setLayout(jPanel75_6Layout);
        jPanel75_6Layout.setHorizontalGroup(
            jPanel75_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_6Layout.setVerticalGroup(
            jPanel75_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_16Layout = new javax.swing.GroupLayout(jPanel75_16);
        jPanel75_16.setLayout(jPanel75_16Layout);
        jPanel75_16Layout.setHorizontalGroup(
            jPanel75_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_16Layout.setVerticalGroup(
            jPanel75_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_26Layout = new javax.swing.GroupLayout(jPanel75_26);
        jPanel75_26.setLayout(jPanel75_26Layout);
        jPanel75_26Layout.setHorizontalGroup(
            jPanel75_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_26Layout.setVerticalGroup(
            jPanel75_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_36Layout = new javax.swing.GroupLayout(jPanel75_36);
        jPanel75_36.setLayout(jPanel75_36Layout);
        jPanel75_36Layout.setHorizontalGroup(
            jPanel75_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_36Layout.setVerticalGroup(
            jPanel75_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_46Layout = new javax.swing.GroupLayout(jPanel75_46);
        jPanel75_46.setLayout(jPanel75_46Layout);
        jPanel75_46Layout.setHorizontalGroup(
            jPanel75_46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_46Layout.setVerticalGroup(
            jPanel75_46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_47Layout = new javax.swing.GroupLayout(jPanel75_47);
        jPanel75_47.setLayout(jPanel75_47Layout);
        jPanel75_47Layout.setHorizontalGroup(
            jPanel75_47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_47Layout.setVerticalGroup(
            jPanel75_47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_37Layout = new javax.swing.GroupLayout(jPanel75_37);
        jPanel75_37.setLayout(jPanel75_37Layout);
        jPanel75_37Layout.setHorizontalGroup(
            jPanel75_37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_37Layout.setVerticalGroup(
            jPanel75_37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_27Layout = new javax.swing.GroupLayout(jPanel75_27);
        jPanel75_27.setLayout(jPanel75_27Layout);
        jPanel75_27Layout.setHorizontalGroup(
            jPanel75_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_27Layout.setVerticalGroup(
            jPanel75_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_17Layout = new javax.swing.GroupLayout(jPanel75_17);
        jPanel75_17.setLayout(jPanel75_17Layout);
        jPanel75_17Layout.setHorizontalGroup(
            jPanel75_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_17Layout.setVerticalGroup(
            jPanel75_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_7Layout = new javax.swing.GroupLayout(jPanel75_7);
        jPanel75_7.setLayout(jPanel75_7Layout);
        jPanel75_7Layout.setHorizontalGroup(
            jPanel75_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_7Layout.setVerticalGroup(
            jPanel75_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_8Layout = new javax.swing.GroupLayout(jPanel75_8);
        jPanel75_8.setLayout(jPanel75_8Layout);
        jPanel75_8Layout.setHorizontalGroup(
            jPanel75_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_8Layout.setVerticalGroup(
            jPanel75_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_18Layout = new javax.swing.GroupLayout(jPanel75_18);
        jPanel75_18.setLayout(jPanel75_18Layout);
        jPanel75_18Layout.setHorizontalGroup(
            jPanel75_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_18Layout.setVerticalGroup(
            jPanel75_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_28Layout = new javax.swing.GroupLayout(jPanel75_28);
        jPanel75_28.setLayout(jPanel75_28Layout);
        jPanel75_28Layout.setHorizontalGroup(
            jPanel75_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_28Layout.setVerticalGroup(
            jPanel75_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_38Layout = new javax.swing.GroupLayout(jPanel75_38);
        jPanel75_38.setLayout(jPanel75_38Layout);
        jPanel75_38Layout.setHorizontalGroup(
            jPanel75_38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_38Layout.setVerticalGroup(
            jPanel75_38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_48Layout = new javax.swing.GroupLayout(jPanel75_48);
        jPanel75_48.setLayout(jPanel75_48Layout);
        jPanel75_48Layout.setHorizontalGroup(
            jPanel75_48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_48Layout.setVerticalGroup(
            jPanel75_48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_49Layout = new javax.swing.GroupLayout(jPanel75_49);
        jPanel75_49.setLayout(jPanel75_49Layout);
        jPanel75_49Layout.setHorizontalGroup(
            jPanel75_49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_49Layout.setVerticalGroup(
            jPanel75_49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_39Layout = new javax.swing.GroupLayout(jPanel75_39);
        jPanel75_39.setLayout(jPanel75_39Layout);
        jPanel75_39Layout.setHorizontalGroup(
            jPanel75_39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_39Layout.setVerticalGroup(
            jPanel75_39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_29Layout = new javax.swing.GroupLayout(jPanel75_29);
        jPanel75_29.setLayout(jPanel75_29Layout);
        jPanel75_29Layout.setHorizontalGroup(
            jPanel75_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_29Layout.setVerticalGroup(
            jPanel75_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_19Layout = new javax.swing.GroupLayout(jPanel75_19);
        jPanel75_19.setLayout(jPanel75_19Layout);
        jPanel75_19Layout.setHorizontalGroup(
            jPanel75_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_19Layout.setVerticalGroup(
            jPanel75_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_9Layout = new javax.swing.GroupLayout(jPanel75_9);
        jPanel75_9.setLayout(jPanel75_9Layout);
        jPanel75_9Layout.setHorizontalGroup(
            jPanel75_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_9Layout.setVerticalGroup(
            jPanel75_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_10Layout = new javax.swing.GroupLayout(jPanel75_10);
        jPanel75_10.setLayout(jPanel75_10Layout);
        jPanel75_10Layout.setHorizontalGroup(
            jPanel75_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_10Layout.setVerticalGroup(
            jPanel75_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_20Layout = new javax.swing.GroupLayout(jPanel75_20);
        jPanel75_20.setLayout(jPanel75_20Layout);
        jPanel75_20Layout.setHorizontalGroup(
            jPanel75_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_20Layout.setVerticalGroup(
            jPanel75_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_30Layout = new javax.swing.GroupLayout(jPanel75_30);
        jPanel75_30.setLayout(jPanel75_30Layout);
        jPanel75_30Layout.setHorizontalGroup(
            jPanel75_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_30Layout.setVerticalGroup(
            jPanel75_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_40Layout = new javax.swing.GroupLayout(jPanel75_40);
        jPanel75_40.setLayout(jPanel75_40Layout);
        jPanel75_40Layout.setHorizontalGroup(
            jPanel75_40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_40Layout.setVerticalGroup(
            jPanel75_40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_50Layout = new javax.swing.GroupLayout(jPanel75_50);
        jPanel75_50.setLayout(jPanel75_50Layout);
        jPanel75_50Layout.setHorizontalGroup(
            jPanel75_50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_50Layout.setVerticalGroup(
            jPanel75_50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_51Layout = new javax.swing.GroupLayout(jPanel75_51);
        jPanel75_51.setLayout(jPanel75_51Layout);
        jPanel75_51Layout.setHorizontalGroup(
            jPanel75_51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_51Layout.setVerticalGroup(
            jPanel75_51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_52Layout = new javax.swing.GroupLayout(jPanel75_52);
        jPanel75_52.setLayout(jPanel75_52Layout);
        jPanel75_52Layout.setHorizontalGroup(
            jPanel75_52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_52Layout.setVerticalGroup(
            jPanel75_52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_53Layout = new javax.swing.GroupLayout(jPanel75_53);
        jPanel75_53.setLayout(jPanel75_53Layout);
        jPanel75_53Layout.setHorizontalGroup(
            jPanel75_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_53Layout.setVerticalGroup(
            jPanel75_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_54Layout = new javax.swing.GroupLayout(jPanel75_54);
        jPanel75_54.setLayout(jPanel75_54Layout);
        jPanel75_54Layout.setHorizontalGroup(
            jPanel75_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_54Layout.setVerticalGroup(
            jPanel75_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_55Layout = new javax.swing.GroupLayout(jPanel75_55);
        jPanel75_55.setLayout(jPanel75_55Layout);
        jPanel75_55Layout.setHorizontalGroup(
            jPanel75_55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_55Layout.setVerticalGroup(
            jPanel75_55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_61Layout = new javax.swing.GroupLayout(jPanel75_61);
        jPanel75_61.setLayout(jPanel75_61Layout);
        jPanel75_61Layout.setHorizontalGroup(
            jPanel75_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_61Layout.setVerticalGroup(
            jPanel75_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_62Layout = new javax.swing.GroupLayout(jPanel75_62);
        jPanel75_62.setLayout(jPanel75_62Layout);
        jPanel75_62Layout.setHorizontalGroup(
            jPanel75_62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_62Layout.setVerticalGroup(
            jPanel75_62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_63Layout = new javax.swing.GroupLayout(jPanel75_63);
        jPanel75_63.setLayout(jPanel75_63Layout);
        jPanel75_63Layout.setHorizontalGroup(
            jPanel75_63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_63Layout.setVerticalGroup(
            jPanel75_63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_64Layout = new javax.swing.GroupLayout(jPanel75_64);
        jPanel75_64.setLayout(jPanel75_64Layout);
        jPanel75_64Layout.setHorizontalGroup(
            jPanel75_64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_64Layout.setVerticalGroup(
            jPanel75_64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_65Layout = new javax.swing.GroupLayout(jPanel75_65);
        jPanel75_65.setLayout(jPanel75_65Layout);
        jPanel75_65Layout.setHorizontalGroup(
            jPanel75_65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_65Layout.setVerticalGroup(
            jPanel75_65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_56Layout = new javax.swing.GroupLayout(jPanel75_56);
        jPanel75_56.setLayout(jPanel75_56Layout);
        jPanel75_56Layout.setHorizontalGroup(
            jPanel75_56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_56Layout.setVerticalGroup(
            jPanel75_56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_57Layout = new javax.swing.GroupLayout(jPanel75_57);
        jPanel75_57.setLayout(jPanel75_57Layout);
        jPanel75_57Layout.setHorizontalGroup(
            jPanel75_57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_57Layout.setVerticalGroup(
            jPanel75_57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_58Layout = new javax.swing.GroupLayout(jPanel75_58);
        jPanel75_58.setLayout(jPanel75_58Layout);
        jPanel75_58Layout.setHorizontalGroup(
            jPanel75_58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_58Layout.setVerticalGroup(
            jPanel75_58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_59Layout = new javax.swing.GroupLayout(jPanel75_59);
        jPanel75_59.setLayout(jPanel75_59Layout);
        jPanel75_59Layout.setHorizontalGroup(
            jPanel75_59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_59Layout.setVerticalGroup(
            jPanel75_59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_60Layout = new javax.swing.GroupLayout(jPanel75_60);
        jPanel75_60.setLayout(jPanel75_60Layout);
        jPanel75_60Layout.setHorizontalGroup(
            jPanel75_60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_60Layout.setVerticalGroup(
            jPanel75_60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_66Layout = new javax.swing.GroupLayout(jPanel75_66);
        jPanel75_66.setLayout(jPanel75_66Layout);
        jPanel75_66Layout.setHorizontalGroup(
            jPanel75_66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_66Layout.setVerticalGroup(
            jPanel75_66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_67Layout = new javax.swing.GroupLayout(jPanel75_67);
        jPanel75_67.setLayout(jPanel75_67Layout);
        jPanel75_67Layout.setHorizontalGroup(
            jPanel75_67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_67Layout.setVerticalGroup(
            jPanel75_67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_68Layout = new javax.swing.GroupLayout(jPanel75_68);
        jPanel75_68.setLayout(jPanel75_68Layout);
        jPanel75_68Layout.setHorizontalGroup(
            jPanel75_68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_68Layout.setVerticalGroup(
            jPanel75_68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_69Layout = new javax.swing.GroupLayout(jPanel75_69);
        jPanel75_69.setLayout(jPanel75_69Layout);
        jPanel75_69Layout.setHorizontalGroup(
            jPanel75_69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_69Layout.setVerticalGroup(
            jPanel75_69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_70Layout = new javax.swing.GroupLayout(jPanel75_70);
        jPanel75_70.setLayout(jPanel75_70Layout);
        jPanel75_70Layout.setHorizontalGroup(
            jPanel75_70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_70Layout.setVerticalGroup(
            jPanel75_70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_71Layout = new javax.swing.GroupLayout(jPanel75_71);
        jPanel75_71.setLayout(jPanel75_71Layout);
        jPanel75_71Layout.setHorizontalGroup(
            jPanel75_71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_71Layout.setVerticalGroup(
            jPanel75_71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_72Layout = new javax.swing.GroupLayout(jPanel75_72);
        jPanel75_72.setLayout(jPanel75_72Layout);
        jPanel75_72Layout.setHorizontalGroup(
            jPanel75_72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_72Layout.setVerticalGroup(
            jPanel75_72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_73Layout = new javax.swing.GroupLayout(jPanel75_73);
        jPanel75_73.setLayout(jPanel75_73Layout);
        jPanel75_73Layout.setHorizontalGroup(
            jPanel75_73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_73Layout.setVerticalGroup(
            jPanel75_73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_74Layout = new javax.swing.GroupLayout(jPanel75_74);
        jPanel75_74.setLayout(jPanel75_74Layout);
        jPanel75_74Layout.setHorizontalGroup(
            jPanel75_74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_74Layout.setVerticalGroup(
            jPanel75_74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel75_75Layout = new javax.swing.GroupLayout(jPanel75_75);
        jPanel75_75.setLayout(jPanel75_75Layout);
        jPanel75_75Layout.setHorizontalGroup(
            jPanel75_75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel75_75Layout.setVerticalGroup(
            jPanel75_75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jPanel75_71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel75_74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel75_51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel75_56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel75_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel75_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel75_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel75_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel75_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel75_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel75_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel75_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel75_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel75_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel75_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel75_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel75_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel75_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel75_66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75_70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jPanel75_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel75_51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel75_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel75_71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75_75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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
        int usersId = View_SeventyFiveSeats.getMyID();
        
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
            java.util.logging.Logger.getLogger(View_SeventyFiveSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_SeventyFiveSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_SeventyFiveSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_SeventyFiveSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_SeventyFiveSeats().setVisible(true);
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
    private javax.swing.JPanel jPanel75_1;
    private javax.swing.JPanel jPanel75_10;
    private javax.swing.JPanel jPanel75_11;
    private javax.swing.JPanel jPanel75_12;
    private javax.swing.JPanel jPanel75_13;
    private javax.swing.JPanel jPanel75_14;
    private javax.swing.JPanel jPanel75_15;
    private javax.swing.JPanel jPanel75_16;
    private javax.swing.JPanel jPanel75_17;
    private javax.swing.JPanel jPanel75_18;
    private javax.swing.JPanel jPanel75_19;
    private javax.swing.JPanel jPanel75_2;
    private javax.swing.JPanel jPanel75_20;
    private javax.swing.JPanel jPanel75_21;
    private javax.swing.JPanel jPanel75_22;
    private javax.swing.JPanel jPanel75_23;
    private javax.swing.JPanel jPanel75_24;
    private javax.swing.JPanel jPanel75_25;
    private javax.swing.JPanel jPanel75_26;
    private javax.swing.JPanel jPanel75_27;
    private javax.swing.JPanel jPanel75_28;
    private javax.swing.JPanel jPanel75_29;
    private javax.swing.JPanel jPanel75_3;
    private javax.swing.JPanel jPanel75_30;
    private javax.swing.JPanel jPanel75_31;
    private javax.swing.JPanel jPanel75_32;
    private javax.swing.JPanel jPanel75_33;
    private javax.swing.JPanel jPanel75_34;
    private javax.swing.JPanel jPanel75_35;
    private javax.swing.JPanel jPanel75_36;
    private javax.swing.JPanel jPanel75_37;
    private javax.swing.JPanel jPanel75_38;
    private javax.swing.JPanel jPanel75_39;
    private javax.swing.JPanel jPanel75_4;
    private javax.swing.JPanel jPanel75_40;
    private javax.swing.JPanel jPanel75_41;
    private javax.swing.JPanel jPanel75_42;
    private javax.swing.JPanel jPanel75_43;
    private javax.swing.JPanel jPanel75_44;
    private javax.swing.JPanel jPanel75_45;
    private javax.swing.JPanel jPanel75_46;
    private javax.swing.JPanel jPanel75_47;
    private javax.swing.JPanel jPanel75_48;
    private javax.swing.JPanel jPanel75_49;
    private javax.swing.JPanel jPanel75_5;
    private javax.swing.JPanel jPanel75_50;
    private javax.swing.JPanel jPanel75_51;
    private javax.swing.JPanel jPanel75_52;
    private javax.swing.JPanel jPanel75_53;
    private javax.swing.JPanel jPanel75_54;
    private javax.swing.JPanel jPanel75_55;
    private javax.swing.JPanel jPanel75_56;
    private javax.swing.JPanel jPanel75_57;
    private javax.swing.JPanel jPanel75_58;
    private javax.swing.JPanel jPanel75_59;
    private javax.swing.JPanel jPanel75_6;
    private javax.swing.JPanel jPanel75_60;
    private javax.swing.JPanel jPanel75_61;
    private javax.swing.JPanel jPanel75_62;
    private javax.swing.JPanel jPanel75_63;
    private javax.swing.JPanel jPanel75_64;
    private javax.swing.JPanel jPanel75_65;
    private javax.swing.JPanel jPanel75_66;
    private javax.swing.JPanel jPanel75_67;
    private javax.swing.JPanel jPanel75_68;
    private javax.swing.JPanel jPanel75_69;
    private javax.swing.JPanel jPanel75_7;
    private javax.swing.JPanel jPanel75_70;
    private javax.swing.JPanel jPanel75_71;
    private javax.swing.JPanel jPanel75_72;
    private javax.swing.JPanel jPanel75_73;
    private javax.swing.JPanel jPanel75_74;
    private javax.swing.JPanel jPanel75_75;
    private javax.swing.JPanel jPanel75_8;
    private javax.swing.JPanel jPanel75_9;
    // End of variables declaration//GEN-END:variables
}
