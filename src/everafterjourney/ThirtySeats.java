/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package everafterjourney;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Wendel
 */
public class ThirtySeats extends javax.swing.JFrame {

    private SQL sqlconnection;

    public ThirtySeats() {
        initComponents();
        sqlconnection = new SQL("jdbc:mysql://localhost:3306/everafterjourney_database", "root", "");
        
        int guessno = this.validateSeatTaken(1, ThirtySeats.getId());
        if(guessno >= 1){
            this.thirtyNameGuest1.setEnabled(false);
            this.thirtyNameGuest1.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno2 = this.validateSeatTaken(2, ThirtySeats.getId());
        if(guessno2 >= 1){
            this.thirtyNameGuest2.setEnabled(false);
            this.thirtyNameGuest2.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno3 = this.validateSeatTaken(3, ThirtySeats.getId());
        if(guessno3 >= 1){
            this.thirtyNameGuest3.setEnabled(false);
            this.thirtyNameGuest3.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno4 = this.validateSeatTaken(4, ThirtySeats.getId());
        if(guessno4 >= 1){
            this.thirtyNameGuest4.setEnabled(false);
            this.thirtyNameGuest4.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno5 = this.validateSeatTaken(5, ThirtySeats.getId());
        if(guessno5 >= 1){
            this.thirtyNameGuest5.setEnabled(false);
            this.thirtyNameGuest5.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno6 = this.validateSeatTaken(6, ThirtySeats.getId());
        if(guessno6 >= 1){
            this.thirtyNameGuest6.setEnabled(false);
            this.thirtyNameGuest6.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno7 = this.validateSeatTaken(7, ThirtySeats.getId());
        if(guessno7 >= 1){
            this.thirtyNameGuest7.setEnabled(false);
            this.thirtyNameGuest7.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno8 = this.validateSeatTaken(8, ThirtySeats.getId());
        if(guessno8 >= 1){
            this.thirtyNameGuest8.setEnabled(false);
            this.thirtyNameGuest8.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno9 = this.validateSeatTaken(9, ThirtySeats.getId());
        if(guessno9 >= 1){
            this.thirtyNameGuest9.setEnabled(false);
            this.thirtyNameGuest9.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno10 = this.validateSeatTaken(10, ThirtySeats.getId());
        if(guessno10 >= 1){
            this.thirtyNameGuest10.setEnabled(false);
            this.thirtyNameGuest10.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno11 = this.validateSeatTaken(11, ThirtySeats.getId());
        if(guessno11 >= 1){
            this.thirtyNameGuest11.setEnabled(false);
            this.thirtyNameGuest11.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno12 = this.validateSeatTaken(12, ThirtySeats.getId());
        if(guessno12 >= 1){
            this.thirtyNameGuest12.setEnabled(false);
            this.thirtyNameGuest12.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno13 = this.validateSeatTaken(13, ThirtySeats.getId());
        if(guessno13 >= 1){
            this.thirtyNameGuest13.setEnabled(false);
            this.thirtyNameGuest13.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno14 = this.validateSeatTaken(14, ThirtySeats.getId());
        if(guessno14 >= 1){
            this.thirtyNameGuest14.setEnabled(false);
            this.thirtyNameGuest14.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno15 = this.validateSeatTaken(15, ThirtySeats.getId());
        if(guessno15 >= 1){
            this.thirtyNameGuest15.setEnabled(false);
            this.thirtyNameGuest15.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno16 = this.validateSeatTaken(16, ThirtySeats.getId());
        if(guessno16 >= 1){
            this.thirtyNameGuest16.setEnabled(false);
            this.thirtyNameGuest16.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno17 = this.validateSeatTaken(17, ThirtySeats.getId());
        if(guessno17 >= 1){
            this.thirtyNameGuest17.setEnabled(false);
            this.thirtyNameGuest17.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno18 = this.validateSeatTaken(18, ThirtySeats.getId());
        if(guessno18 >= 1){
            this.thirtyNameGuest18.setEnabled(false);
            this.thirtyNameGuest18.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno19 = this.validateSeatTaken(19, ThirtySeats.getId());
        if(guessno19 >= 1){
            this.thirtyNameGuest19.setEnabled(false);
            this.thirtyNameGuest19.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno20 = this.validateSeatTaken(20, ThirtySeats.getId());
        if(guessno20 >= 1){
            this.thirtyNameGuest20.setEnabled(false);
            this.thirtyNameGuest20.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno21 = this.validateSeatTaken(21, ThirtySeats.getId());
        if(guessno21 >= 1){
            this.thirtyNameGuest21.setEnabled(false);
            this.thirtyNameGuest21.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno22 = this.validateSeatTaken(22, ThirtySeats.getId());
        if(guessno22 >= 1){
            this.thirtyNameGuest22.setEnabled(false);
            this.thirtyNameGuest22.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno23 = this.validateSeatTaken(23, ThirtySeats.getId());
        if(guessno23 >= 1){
            this.thirtyNameGuest23.setEnabled(false);
            this.thirtyNameGuest23.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno24 = this.validateSeatTaken(24, ThirtySeats.getId());
        if(guessno24 >= 1){
            this.thirtyNameGuest24.setEnabled(false);
            this.thirtyNameGuest24.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno25 = this.validateSeatTaken(25, ThirtySeats.getId());
        if(guessno25 >= 1){
            this.thirtyNameGuest25.setEnabled(false);
            this.thirtyNameGuest25.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno26 = this.validateSeatTaken(26, ThirtySeats.getId());
        if(guessno26 >= 1){
            this.thirtyNameGuest26.setEnabled(false);
            this.thirtyNameGuest26.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno27 = this.validateSeatTaken(27, ThirtySeats.getId());
        if(guessno27 >= 1){
            this.thirtyNameGuest27.setEnabled(false);
            this.thirtyNameGuest27.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno28 = this.validateSeatTaken(28, ThirtySeats.getId());
        if(guessno28 >= 1){
            this.thirtyNameGuest28.setEnabled(false);
            this.thirtyNameGuest28.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno29 = this.validateSeatTaken(29, ThirtySeats.getId());
        if(guessno29 >= 1){
            this.thirtyNameGuest29.setEnabled(false);
            this.thirtyNameGuest29.setBackground(Color.decode("#ffa6a6"));
        }
        
        int guessno30 = this.validateSeatTaken(30, ThirtySeats.getId());
        if(guessno30 >= 1){
            this.thirtyNameGuest30.setEnabled(false);
            this.thirtyNameGuest30.setBackground(Color.decode("#ffa6a6"));
        }
    }

        public void insertGuest(int user_id, String guest, int table_id) {
            Connection conn = null;
            PreparedStatement pstmt = null;

            try {
                sqlconnection.connect();
                conn = sqlconnection.getConnection();

                String sql = "INSERT INTO guests (signup_id, guestname, tableid) " +
                             "SELECT ?, ?, ? " +
                             "WHERE NOT EXISTS (" +
                             "    SELECT 1 FROM guests WHERE tableid = ? AND signup_id = ?" +
                             ")";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, user_id);
                pstmt.setString(2, guest);
                pstmt.setInt(3, table_id);
                pstmt.setInt(4, table_id);
                pstmt.setInt(5, user_id);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new guest was inserted successfully!");
                } else {
                    System.out.println("No rows inserted. The table_id might already exist.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    if (pstmt != null) pstmt.close();
                    if (conn != null) conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    
    public int validateSeatTaken(int tableid, int signup_id){
        int rs1 = 0;
        
        try {
            sqlconnection.connect();
            Connection conn = sqlconnection.getConnection();

            String sql = "SELECT COUNT(id) as 'count' FROM guests WHERE signup_id = ? AND tableid = ? LIMIT 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, signup_id);
            pstmt.setInt(2, tableid);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                rs1 = rs.getInt(1);
            }
            
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        return rs1;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        thirtyNameGuest1 = new javax.swing.JButton();
        thirtyNameGuest2 = new javax.swing.JButton();
        thirtyNameGuest3 = new javax.swing.JButton();
        thirtyNameGuest4 = new javax.swing.JButton();
        thirtyNameGuest26 = new javax.swing.JButton();
        thirtyNameGuest9 = new javax.swing.JButton();
        thirtyNameGuest10 = new javax.swing.JButton();
        thirtyNameGuest11 = new javax.swing.JButton();
        thirtyNameGuest25 = new javax.swing.JButton();
        thirtyNameGuest19 = new javax.swing.JButton();
        thirtyNameGuest17 = new javax.swing.JButton();
        thirtyNameGuest12 = new javax.swing.JButton();
        thirtyNameGuest20 = new javax.swing.JButton();
        thirtyNameGuest27 = new javax.swing.JButton();
        thirtyNameGuest18 = new javax.swing.JButton();
        thirtyNameGuest5 = new javax.swing.JButton();
        thirtyNameGuest13 = new javax.swing.JButton();
        thirtyNameGuest21 = new javax.swing.JButton();
        thirtyNameGuest28 = new javax.swing.JButton();
        thirtyNameGuest29 = new javax.swing.JButton();
        thirtyNameGuest22 = new javax.swing.JButton();
        thirtyNameGuest14 = new javax.swing.JButton();
        thirtyNameGuest6 = new javax.swing.JButton();
        thirtyNameGuest7 = new javax.swing.JButton();
        thirtyNameGuest15 = new javax.swing.JButton();
        thirtyNameGuest23 = new javax.swing.JButton();
        thirtyNameGuest30 = new javax.swing.JButton();
        thirtyNameGuest24 = new javax.swing.JButton();
        thirtyNameGuest16 = new javax.swing.JButton();
        thirtyNameGuest8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        thirtyNameGuest31 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(117, 90, 51));

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

        thirtyNameGuest1.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest1.setForeground(new java.awt.Color(255, 204, 204));
        thirtyNameGuest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest1ActionPerformed(evt);
            }
        });

        thirtyNameGuest2.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest2ActionPerformed(evt);
            }
        });

        thirtyNameGuest3.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest3ActionPerformed(evt);
            }
        });

        thirtyNameGuest4.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest4ActionPerformed(evt);
            }
        });

        thirtyNameGuest26.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest26ActionPerformed(evt);
            }
        });

        thirtyNameGuest9.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest9ActionPerformed(evt);
            }
        });

        thirtyNameGuest10.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest10ActionPerformed(evt);
            }
        });

        thirtyNameGuest11.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest11ActionPerformed(evt);
            }
        });

        thirtyNameGuest25.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest25ActionPerformed(evt);
            }
        });

        thirtyNameGuest19.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest19ActionPerformed(evt);
            }
        });

        thirtyNameGuest17.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest17ActionPerformed(evt);
            }
        });

        thirtyNameGuest12.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest12ActionPerformed(evt);
            }
        });

        thirtyNameGuest20.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest20ActionPerformed(evt);
            }
        });

        thirtyNameGuest27.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest27ActionPerformed(evt);
            }
        });

        thirtyNameGuest18.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest18ActionPerformed(evt);
            }
        });

        thirtyNameGuest5.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest5ActionPerformed(evt);
            }
        });

        thirtyNameGuest13.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest13ActionPerformed(evt);
            }
        });

        thirtyNameGuest21.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest21ActionPerformed(evt);
            }
        });

        thirtyNameGuest28.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest28ActionPerformed(evt);
            }
        });

        thirtyNameGuest29.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest29ActionPerformed(evt);
            }
        });

        thirtyNameGuest22.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest22ActionPerformed(evt);
            }
        });

        thirtyNameGuest14.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest14ActionPerformed(evt);
            }
        });

        thirtyNameGuest6.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest6ActionPerformed(evt);
            }
        });

        thirtyNameGuest7.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest7ActionPerformed(evt);
            }
        });

        thirtyNameGuest15.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest15ActionPerformed(evt);
            }
        });

        thirtyNameGuest23.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest23ActionPerformed(evt);
            }
        });

        thirtyNameGuest30.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest30ActionPerformed(evt);
            }
        });

        thirtyNameGuest24.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest24ActionPerformed(evt);
            }
        });

        thirtyNameGuest16.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest16ActionPerformed(evt);
            }
        });

        thirtyNameGuest8.setBackground(new java.awt.Color(153, 255, 153));
        thirtyNameGuest8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 233, 229));
        jLabel1.setText("15-30 Seats");

        thirtyNameGuest31.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        thirtyNameGuest31.setText("Back");
        thirtyNameGuest31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirtyNameGuest31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(thirtyNameGuest25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thirtyNameGuest26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirtyNameGuest10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirtyNameGuest11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(thirtyNameGuest27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thirtyNameGuest4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirtyNameGuest12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(thirtyNameGuest20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thirtyNameGuest21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(thirtyNameGuest13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(thirtyNameGuest5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirtyNameGuest14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirtyNameGuest15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirtyNameGuest16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(thirtyNameGuest28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtyNameGuest29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirtyNameGuest30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(thirtyNameGuest31, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(thirtyNameGuest31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(thirtyNameGuest2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(thirtyNameGuest3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(thirtyNameGuest4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(thirtyNameGuest1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thirtyNameGuest9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(thirtyNameGuest11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(thirtyNameGuest12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(thirtyNameGuest10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(thirtyNameGuest5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(thirtyNameGuest6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(thirtyNameGuest7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(thirtyNameGuest8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thirtyNameGuest13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(thirtyNameGuest15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(thirtyNameGuest16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(thirtyNameGuest14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thirtyNameGuest28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thirtyNameGuest29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(210, Short.MAX_VALUE))
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

    private static int usersId;

    public static void setId(int userId) {
        usersId = userId;
    }

    public static int getId() {
        return usersId;
    }


    private void thirtyNameGuest4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest4ActionPerformed

        boolean nameEntered4 = false;

        String nameGuest4 = JOptionPane.showInputDialog(this, "Enter name of Guest 4:");

        if (nameGuest4 != null && !nameGuest4.trim().isEmpty()) {
            nameEntered4 = true;
            if (nameEntered4) {
                int response4 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response4 == JOptionPane.YES_OPTION) {
                    int userId_guest4 = ThirtySeats.getId();
                    int tableid = 4;
                    this.insertGuest(userId_guest4, nameGuest4, tableid);
                    
                    thirtyNameGuest4.setEnabled(false);
                    thirtyNameGuest4.setBackground(Color.GREEN);
                    
                }
            }
        } else {
            thirtyNameGuest4.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest4ActionPerformed

    private void thirtyNameGuest26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest26ActionPerformed
        boolean nameEntered26 = false;

        String nameGuest26 = JOptionPane.showInputDialog(this, "Enter name of Guest 26:");

        if (nameGuest26 != null && !nameGuest26.trim().isEmpty()) {
            nameEntered26 = true;
            if (nameEntered26) {
                int response26 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response26 == JOptionPane.YES_OPTION) {
                    int userId_guest26 = ThirtySeats.getId();
                    int tableid = 26;
                    this.insertGuest(userId_guest26, nameGuest26, tableid);

                    
                    thirtyNameGuest26.setEnabled(false);
                    thirtyNameGuest26.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest26.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest26ActionPerformed

    private void thirtyNameGuest25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest25ActionPerformed
        boolean nameEntered25 = false;

        String nameGuest25 = JOptionPane.showInputDialog(this, "Enter name of Guest 25:");

        if (nameGuest25 != null && !nameGuest25.trim().isEmpty()) {
            nameEntered25 = true;
            if (nameEntered25) {
                int response25 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response25 == JOptionPane.YES_OPTION) {
                    int userId_guest25 = ThirtySeats.getId();
                    int tableid = 25;
                    this.insertGuest(userId_guest25, nameGuest25, tableid);
                    
                    thirtyNameGuest25.setEnabled(false);
                    thirtyNameGuest25.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest25.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest25ActionPerformed

    private void thirtyNameGuest19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest19ActionPerformed
        boolean nameEntered19 = false;

        String nameGuest19 = JOptionPane.showInputDialog(this, "Enter name of Guest 19:");

        if (nameGuest19 != null && !nameGuest19.trim().isEmpty()) {
            nameEntered19 = true;
            if (nameEntered19) {
                int response19 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response19 == JOptionPane.YES_OPTION) {
                    int userId_guest19 = ThirtySeats.getId();
                    int tableid = 19;
                    this.insertGuest(userId_guest19, nameGuest19, tableid);
                    
                    thirtyNameGuest19.setEnabled(false);
                    thirtyNameGuest19.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest19.setBackground(Color.decode("#ffa6a6"));
        }

    }//GEN-LAST:event_thirtyNameGuest19ActionPerformed

    private void thirtyNameGuest27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest27ActionPerformed
        boolean nameEntered27 = false;

        String nameGuest27 = JOptionPane.showInputDialog(this, "Enter name of Guest 27:");

        if (nameGuest27 != null && !nameGuest27.trim().isEmpty()) {
            nameEntered27 = true;
            if (nameEntered27) {
                int response27 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response27 == JOptionPane.YES_OPTION) {
                    
                    int userId_guest27 = ThirtySeats.getId();
                    int tableid = 27;
                    this.insertGuest(userId_guest27, nameGuest27, tableid);
                    
                    thirtyNameGuest27.setEnabled(false);
                    thirtyNameGuest27.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest27.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest27ActionPerformed

    private void thirtyNameGuest18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest18ActionPerformed
        boolean nameEntered18 = false;

        String nameGuest18 = JOptionPane.showInputDialog(this, "Enter name of Guest 18:");

        if (nameGuest18 != null && !nameGuest18.trim().isEmpty()) {
            nameEntered18 = true;
            if (nameEntered18) {
                int response18 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response18 == JOptionPane.YES_OPTION) {
                    int userId_guest18 = ThirtySeats.getId();
                    int tableid = 18;
                    this.insertGuest(userId_guest18, nameGuest18, tableid);
                    
                    thirtyNameGuest18.setEnabled(false);
                    thirtyNameGuest18.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest18.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest18ActionPerformed

    private void thirtyNameGuest28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest28ActionPerformed
        boolean nameEntered28 = false;

        String nameGuest28 = JOptionPane.showInputDialog(this, "Enter name of Guest 28:");

        if (nameGuest28 != null && !nameGuest28.trim().isEmpty()) {
            nameEntered28 = true;
            if (nameEntered28) {
                int response28 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response28 == JOptionPane.YES_OPTION) {
                    int userId_guest28 = ThirtySeats.getId();
                    int tableid = 28;
                    this.insertGuest(userId_guest28, nameGuest28, tableid);
                    
                    thirtyNameGuest28.setEnabled(false);
                    thirtyNameGuest28.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest28.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest28ActionPerformed

    private void thirtyNameGuest29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest29ActionPerformed
        boolean nameEntered29 = false;

        String nameGuest29 = JOptionPane.showInputDialog(this, "Enter name of Guest 29:");

        if (nameGuest29 != null && !nameGuest29.trim().isEmpty()) {
            nameEntered29 = true;
            if (nameEntered29) {
                int response29 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response29 == JOptionPane.YES_OPTION) {
                    int userId_guest29 = ThirtySeats.getId();
                    int tableid = 29;
                    this.insertGuest(userId_guest29, nameGuest29, tableid);
                    
                    thirtyNameGuest29.setEnabled(false);
                    thirtyNameGuest29.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest29.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest29ActionPerformed

    private void thirtyNameGuest22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest22ActionPerformed
        boolean nameEntered22 = false;

        String nameGuest22 = JOptionPane.showInputDialog(this, "Enter name of Guest 22:");

        if (nameGuest22 != null && !nameGuest22.trim().isEmpty()) {
            nameEntered22 = true;
            if (nameEntered22) {
                int response22 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response22 == JOptionPane.YES_OPTION) {
                    int userId_guest22 = ThirtySeats.getId();
                    int tableid = 22;
                    this.insertGuest(userId_guest22, nameGuest22, tableid);
                    
                    thirtyNameGuest22.setEnabled(false);
                    thirtyNameGuest22.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest22.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest22ActionPerformed

    private void thirtyNameGuest23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest23ActionPerformed
        boolean nameEntered23 = false;

        String nameGuest23 = JOptionPane.showInputDialog(this, "Enter name of Guest 23:");

        if (nameGuest23 != null && !nameGuest23.trim().isEmpty()) {
            nameEntered23 = true;
            if (nameEntered23) {
                int response23 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response23 == JOptionPane.YES_OPTION) {
                    int userId_guest23 = ThirtySeats.getId();
                    int tableid = 23;
                    this.insertGuest(userId_guest23, nameGuest23, tableid);

                    thirtyNameGuest23.setEnabled(false);
                    thirtyNameGuest23.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest23.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest23ActionPerformed

    private void thirtyNameGuest30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest30ActionPerformed
        boolean nameEntered30 = false;

        String nameGuest30 = JOptionPane.showInputDialog(this, "Enter name of Guest 30:");

        if (nameGuest30 != null && !nameGuest30.trim().isEmpty()) {
            nameEntered30 = true;
            if (nameEntered30) {
                int response30 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response30 == JOptionPane.YES_OPTION) {
                    int userId_guest30 = ThirtySeats.getId();
                    int tableid = 30;
                    this.insertGuest(userId_guest30, nameGuest30, tableid);
                    
                    thirtyNameGuest30.setEnabled(false);
                    thirtyNameGuest30.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest30.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest30ActionPerformed

    private void thirtyNameGuest8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest8ActionPerformed
        boolean nameEntered8 = false;

        String nameGuest8 = JOptionPane.showInputDialog(this, "Enter name of Guest 8:");

        if (nameGuest8 != null && !nameGuest8.trim().isEmpty()) {
            nameEntered8 = true;
            if (nameEntered8) {
                int response8 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response8 == JOptionPane.YES_OPTION) {
                    int userId_guest8 = ThirtySeats.getId();
                    int tableid = 8;
                    this.insertGuest(userId_guest8, nameGuest8, tableid);
                    
                    thirtyNameGuest8.setEnabled(false);
                    thirtyNameGuest8.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest8.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest8ActionPerformed


    private void thirtyNameGuest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest1ActionPerformed

        boolean nameEntered1 = false;

        String nameGuest1 = JOptionPane.showInputDialog(this, "Enter name of Guest 1:");

        if (nameGuest1 != null && !nameGuest1.trim().isEmpty()) {
            nameEntered1 = true;
            if (nameEntered1) {
                int response1 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response1 == JOptionPane.YES_OPTION) {

                    int userId_guest1 = ThirtySeats.getId();
                    int tableid = 1;
                    this.insertGuest(userId_guest1, nameGuest1, tableid);
                    
                    
                    thirtyNameGuest1.setEnabled(false);
                    thirtyNameGuest1.setBackground(Color.GREEN);

                }
            }
        } else {
            thirtyNameGuest1.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest1ActionPerformed

    private void thirtyNameGuest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest2ActionPerformed
        boolean nameEntered2 = false;

        String nameGuest2 = JOptionPane.showInputDialog(this, "Enter name of Guest 2:");

        if (nameGuest2 != null && !nameGuest2.trim().isEmpty()) {
            nameEntered2 = true;
            if (nameEntered2) {
                int response2 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response2 == JOptionPane.YES_OPTION) {
                    
                    int userId = ThirtySeats.getId();
                    int tableid = 2;
                    this.insertGuest(userId, nameGuest2, tableid);
                    
                    thirtyNameGuest2.setEnabled(false);
                    thirtyNameGuest2.setBackground(Color.GREEN);
                    
                }
            }
        } else {
            thirtyNameGuest2.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest2ActionPerformed

    private void thirtyNameGuest3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest3ActionPerformed
        boolean nameEntered3 = false;

        String nameGuest3 = JOptionPane.showInputDialog(this, "Enter name of Guest 3:");

        if (nameGuest3 != null && !nameGuest3.trim().isEmpty()) {
            nameEntered3 = true;

            if (nameEntered3) {
                int response3 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response3 == JOptionPane.YES_OPTION) {
                    int userId_guest3 = ThirtySeats.getId();
                    int tableid = 3;
                    this.insertGuest(userId_guest3, nameGuest3, tableid);
                    
                    thirtyNameGuest3.setEnabled(false);
                    thirtyNameGuest3.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest3.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest3ActionPerformed

    private void thirtyNameGuest5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest5ActionPerformed
        boolean nameEntered5 = false;

        String nameGuest5 = JOptionPane.showInputDialog(this, "Enter name of Guest 5:");

        if (nameGuest5 != null && !nameGuest5.trim().isEmpty()) {
            nameEntered5 = true;
            if (nameEntered5) {
                int response5 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response5 == JOptionPane.YES_OPTION) {
                    
                    int userId_guest5 = ThirtySeats.getId();
                    int tableid = 5;
                    this.insertGuest(userId_guest5, nameGuest5, tableid);
                    
                    thirtyNameGuest5.setEnabled(false);
                    thirtyNameGuest5.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest5.setBackground(Color.decode("#ffa6a6"));
        }

    }//GEN-LAST:event_thirtyNameGuest5ActionPerformed

    private void thirtyNameGuest6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest6ActionPerformed
        boolean nameEntered6 = false;

        String nameGuest6 = JOptionPane.showInputDialog(this, "Enter name of Guest 6:");

        if (nameGuest6 != null && !nameGuest6.trim().isEmpty()) {
            nameEntered6 = true;
            if (nameEntered6) {
                int response6 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response6 == JOptionPane.YES_OPTION) {
                    
                    int userId_guest6 = ThirtySeats.getId();
                    int tableid = 6;
                    this.insertGuest(userId_guest6, nameGuest6, tableid);
                    
                    thirtyNameGuest6.setEnabled(false);
                    thirtyNameGuest6.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest6.setBackground(Color.decode("#ffa6a6"));
        }

    }//GEN-LAST:event_thirtyNameGuest6ActionPerformed

    private void thirtyNameGuest7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest7ActionPerformed
        boolean nameEntered7 = false;

        String nameGuest7 = JOptionPane.showInputDialog(this, "Enter name of Guest 7:");

        if (nameGuest7 != null && !nameGuest7.trim().isEmpty()) {
            nameEntered7 = true;
            if (nameEntered7) {
                int response7 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response7 == JOptionPane.YES_OPTION) {
                    
                    int userId_guest7 = ThirtySeats.getId();
                    int tableid = 7;
                    this.insertGuest(userId_guest7, nameGuest7, tableid);
                    
                    thirtyNameGuest7.setEnabled(false);
                    thirtyNameGuest7.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest7.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest7ActionPerformed

    private void thirtyNameGuest9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest9ActionPerformed
        boolean nameEntered9 = false;

        String nameGuest9 = JOptionPane.showInputDialog(this, "Enter name of Guest 9:");

        if (nameGuest9 != null && !nameGuest9.trim().isEmpty()) {
            nameEntered9 = true;
            if (nameEntered9) {
                int response9 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response9 == JOptionPane.YES_OPTION) {
                    int userId_guest9 = ThirtySeats.getId();
                    int tableid = 9;
                    this.insertGuest(userId_guest9, nameGuest9, tableid);
                    
                    thirtyNameGuest9.setEnabled(false);
                    thirtyNameGuest9.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest9.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest9ActionPerformed

    private void thirtyNameGuest10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest10ActionPerformed
        boolean nameEntered10 = false;
        String nameGuest10 = JOptionPane.showInputDialog(this, "Enter name of Guest 10:");

        if (nameGuest10 != null && !nameGuest10.trim().isEmpty()) {
            nameEntered10 = true;
            if (nameEntered10) {
                int response10 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response10 == JOptionPane.YES_OPTION) {
                    int userId_guest10 = ThirtySeats.getId();
                    int tableid = 10;
                    this.insertGuest(userId_guest10, nameGuest10, tableid);
                    
                    thirtyNameGuest10.setEnabled(false);
                    thirtyNameGuest10.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest10.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest10ActionPerformed

    private void thirtyNameGuest11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest11ActionPerformed
        boolean nameEntered11 = false;

        String nameGuest11 = JOptionPane.showInputDialog(this, "Enter name of Guest 11:");

        if (nameGuest11 != null && !nameGuest11.trim().isEmpty()) {
            nameEntered11 = true;
            if (nameEntered11) {
                int response11 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response11 == JOptionPane.YES_OPTION) {
                    int userId_guest11 = ThirtySeats.getId();
                    int tableid = 11;
                    this.insertGuest(userId_guest11, nameGuest11, tableid);
                    
                    thirtyNameGuest11.setEnabled(false);
                    thirtyNameGuest11.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest11.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest11ActionPerformed

    private void thirtyNameGuest12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest12ActionPerformed
        boolean nameEntered12 = false;

        String nameGuest12 = JOptionPane.showInputDialog(this, "Enter name of Guest 12:");

        if (nameGuest12 != null && !nameGuest12.trim().isEmpty()) {
            nameEntered12 = true;
            if (nameEntered12) {
                int response12 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response12 == JOptionPane.YES_OPTION) {
                    int userId_guest12 = ThirtySeats.getId();
                    int tableid = 12;
                    this.insertGuest(userId_guest12, nameGuest12, tableid);
                    
                    thirtyNameGuest12.setEnabled(false);
                    thirtyNameGuest12.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest12.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest12ActionPerformed

    private void thirtyNameGuest13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest13ActionPerformed
        boolean nameEntered13 = false;

        String nameGuest13 = JOptionPane.showInputDialog(this, "Enter name of Guest 13:");

        if (nameGuest13 != null && !nameGuest13.trim().isEmpty()) {
            nameEntered13 = true;
            if (nameEntered13) {
                int response13 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response13 == JOptionPane.YES_OPTION) {
                    int userId_guest13 = ThirtySeats.getId();
                    int tableid = 13;
                    this.insertGuest(userId_guest13, nameGuest13, tableid);
                    
                    thirtyNameGuest13.setEnabled(false);
                    thirtyNameGuest13.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest13.setBackground(Color.decode("#ffa6a6"));
        }

    }//GEN-LAST:event_thirtyNameGuest13ActionPerformed

    private void thirtyNameGuest14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest14ActionPerformed
        boolean nameEntered14 = false;

        String nameGuest14 = JOptionPane.showInputDialog(this, "Enter name of Guest 14:");

        if (nameGuest14 != null && !nameGuest14.trim().isEmpty()) {
            nameEntered14 = true;
            if (nameEntered14) {
                int response14 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response14 == JOptionPane.YES_OPTION) {
                    int userId_guest14 = ThirtySeats.getId();
                    int tableid = 14;
                    this.insertGuest(userId_guest14, nameGuest14, tableid);
                    
                    thirtyNameGuest14.setEnabled(false);
                    thirtyNameGuest14.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest14.setBackground(Color.decode("#ffa6a6"));
        }

    }//GEN-LAST:event_thirtyNameGuest14ActionPerformed

    private void thirtyNameGuest15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest15ActionPerformed
        boolean nameEntered15 = false;

        String nameGuest15 = JOptionPane.showInputDialog(this, "Enter name of Guest 15:");

        if (nameGuest15 != null && !nameGuest15.trim().isEmpty()) {
            nameEntered15 = true;
            if (nameEntered15) {
                int response15 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response15 == JOptionPane.YES_OPTION) {
                    int userId_guest15 = ThirtySeats.getId();
                    int tableid = 15;
                    this.insertGuest(userId_guest15, nameGuest15, tableid);
                    
                    thirtyNameGuest15.setEnabled(false);
                    thirtyNameGuest15.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest15.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest15ActionPerformed

    private void thirtyNameGuest16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest16ActionPerformed
        boolean nameEntered16 = false;

        String nameGuest16 = JOptionPane.showInputDialog(this, "Enter name of Guest 16:");

        if (nameGuest16 != null && !nameGuest16.trim().isEmpty()) {
            nameEntered16 = true;
            if (nameEntered16) {
                int response16 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response16 == JOptionPane.YES_OPTION) {
                    int userId_guest16 = ThirtySeats.getId();
                    int tableid = 16;
                    this.insertGuest(userId_guest16, nameGuest16, tableid);

                    thirtyNameGuest16.setEnabled(false);
                    thirtyNameGuest16.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest16.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest16ActionPerformed

    private void thirtyNameGuest17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest17ActionPerformed
        boolean nameEntered17 = false;

        String nameGuest17 = JOptionPane.showInputDialog(this, "Enter name of Guest 17:");

        if (nameGuest17 != null && !nameGuest17.trim().isEmpty()) {
            nameEntered17 = true;
            if (nameEntered17) {
                int response17 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response17 == JOptionPane.YES_OPTION) {
                    int userId_guest17 = ThirtySeats.getId();
                    int tableid = 17;
                    this.insertGuest(userId_guest17, nameGuest17, tableid);
                    
                    thirtyNameGuest17.setEnabled(false);
                    thirtyNameGuest17.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest17.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest17ActionPerformed

    private void thirtyNameGuest20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest20ActionPerformed
        boolean nameEntered20 = false;

        String nameGuest20 = JOptionPane.showInputDialog(this, "Enter name of Guest 20:");

        if (nameGuest20 != null && !nameGuest20.trim().isEmpty()) {
            nameEntered20 = true;
            if (nameEntered20) {
                int response20 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response20 == JOptionPane.YES_OPTION) {
                    int userId_guest20 = ThirtySeats.getId();
                    int tableid = 20;
                    this.insertGuest(userId_guest20, nameGuest20, tableid);
                    
                    thirtyNameGuest20.setEnabled(false);
                    thirtyNameGuest20.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest20.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest20ActionPerformed

    private void thirtyNameGuest21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest21ActionPerformed
        boolean nameEntered21 = false;

        String nameGuest21 = JOptionPane.showInputDialog(this, "Enter name of Guest 21:");

        if (nameGuest21 != null && !nameGuest21.trim().isEmpty()) {
            nameEntered21 = true;
            if (nameEntered21) {
                int response21 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response21 == JOptionPane.YES_OPTION) {
                    int userId_guest21 = ThirtySeats.getId();
                    int tableid = 21;
                    this.insertGuest(userId_guest21, nameGuest21, tableid);
                    
                    thirtyNameGuest21.setEnabled(false);
                    thirtyNameGuest21.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest21.setBackground(Color.decode("#ffa6a6"));
        }
    }//GEN-LAST:event_thirtyNameGuest21ActionPerformed

    private void thirtyNameGuest24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest24ActionPerformed
        boolean nameEntered24 = false;

        String nameGuest24 = JOptionPane.showInputDialog(this, "Enter name of Guest 24:");

        if (nameGuest24 != null && !nameGuest24.trim().isEmpty()) {
            nameEntered24 = true;
            if (nameEntered24) {
                int response24 = JOptionPane.showConfirmDialog(this, "Are you sure? You cannot undo details once submitted.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (response24 == JOptionPane.YES_OPTION) {
                    
                    int userId_guest24 = ThirtySeats.getId();
                    int tableid = 24;
                    this.insertGuest(userId_guest24, nameGuest24, tableid);
                    
                    thirtyNameGuest24.setEnabled(false);
                    thirtyNameGuest24.setBackground(Color.GREEN);
                }
            }
        } else {
            thirtyNameGuest24.setBackground(Color.decode("#ffa6a6"));
        }

    }//GEN-LAST:event_thirtyNameGuest24ActionPerformed

    private void thirtyNameGuest31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirtyNameGuest31ActionPerformed
        SeatingCapacity seat = new SeatingCapacity();
        seat.setVisible(true);
        dispose();
    }//GEN-LAST:event_thirtyNameGuest31ActionPerformed

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
            java.util.logging.Logger.getLogger(ThirtySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirtySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirtySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirtySeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int userId = 1;
                new ThirtySeats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton thirtyNameGuest1;
    private javax.swing.JButton thirtyNameGuest10;
    private javax.swing.JButton thirtyNameGuest11;
    private javax.swing.JButton thirtyNameGuest12;
    private javax.swing.JButton thirtyNameGuest13;
    private javax.swing.JButton thirtyNameGuest14;
    private javax.swing.JButton thirtyNameGuest15;
    private javax.swing.JButton thirtyNameGuest16;
    private javax.swing.JButton thirtyNameGuest17;
    private javax.swing.JButton thirtyNameGuest18;
    private javax.swing.JButton thirtyNameGuest19;
    private javax.swing.JButton thirtyNameGuest2;
    private javax.swing.JButton thirtyNameGuest20;
    private javax.swing.JButton thirtyNameGuest21;
    private javax.swing.JButton thirtyNameGuest22;
    private javax.swing.JButton thirtyNameGuest23;
    private javax.swing.JButton thirtyNameGuest24;
    private javax.swing.JButton thirtyNameGuest25;
    private javax.swing.JButton thirtyNameGuest26;
    private javax.swing.JButton thirtyNameGuest27;
    private javax.swing.JButton thirtyNameGuest28;
    private javax.swing.JButton thirtyNameGuest29;
    private javax.swing.JButton thirtyNameGuest3;
    private javax.swing.JButton thirtyNameGuest30;
    private javax.swing.JButton thirtyNameGuest31;
    private javax.swing.JButton thirtyNameGuest4;
    private javax.swing.JButton thirtyNameGuest5;
    private javax.swing.JButton thirtyNameGuest6;
    private javax.swing.JButton thirtyNameGuest7;
    private javax.swing.JButton thirtyNameGuest8;
    private javax.swing.JButton thirtyNameGuest9;
    // End of variables declaration//GEN-END:variables
}
