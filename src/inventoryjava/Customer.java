/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventoryjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author OKOJIE EROMOSELE
 */
public class Customer extends javax.swing.JFrame {

   
    public Customer() {
        initComponents();
        SelectCust();
    }

    Connection Con = null;
    Statement St = null;
    Statement St1 = null;
    ResultSet Rs = null;
    ResultSet Rs1 = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit_lbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        custid = new javax.swing.JTextField();
        custname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        custphone = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        OrderNum = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        OrdersNum = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        OrderAmt = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        OrdersAmt = new javax.swing.JLabel();
        Clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 5));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory Management System");

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Product");

        exit_lbl.setBackground(new java.awt.Color(204, 204, 255));
        exit_lbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        exit_lbl.setForeground(new java.awt.Color(255, 255, 255));
        exit_lbl.setText("X");
        exit_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_lblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit_lbl)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(exit_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 5));
        jLabel6.setText("CustId");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 5));
        jLabel7.setText("Name");

        custid.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        custid.setForeground(new java.awt.Color(255, 0, 5));

        custname.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        custname.setForeground(new java.awt.Color(255, 0, 5));
        custname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 5));
        jLabel8.setText("Phone");

        custphone.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        custphone.setForeground(new java.awt.Color(255, 0, 5));

        addbtn.setBackground(new java.awt.Color(255, 0, 5));
        addbtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 0, 5));
        deletebtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        homebtn.setBackground(new java.awt.Color(255, 0, 5));
        homebtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setText("Home");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(255, 0, 5));
        editbtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(255, 0, 51));

        customertbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        customertbl.setForeground(new java.awt.Color(255, 0, 51));
        customertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustdId", "Name", "Phone"
            }
        ));
        customertbl.setRowHeight(25);
        customertbl.setSelectionBackground(new java.awt.Color(255, 0, 5));
        customertbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customertbl);

        jPanel3.setBackground(new java.awt.Color(255, 0, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Product");

        jLabel5.setBackground(new java.awt.Color(255, 0, 5));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 5));
        jLabel5.setText("Customers List");

        jPanel4.setBackground(new java.awt.Color(204, 0, 153));
        jPanel4.setToolTipText("");

        OrderNum.setBackground(new java.awt.Color(255, 255, 255));
        OrderNum.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        OrderNum.setForeground(new java.awt.Color(255, 255, 255));
        OrderNum.setText("X");

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));

        OrdersNum.setBackground(new java.awt.Color(255, 51, 51));
        OrdersNum.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        OrdersNum.setForeground(new java.awt.Color(255, 255, 255));
        OrdersNum.setText("ORDER NUMBER");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OrdersNum)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(OrdersNum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(OrderNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OrderNum)
                .addGap(23, 23, 23))
        );

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        OrderAmt.setBackground(new java.awt.Color(255, 255, 255));
        OrderAmt.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        OrderAmt.setForeground(new java.awt.Color(255, 255, 255));
        OrderAmt.setText("X");

        jPanel7.setBackground(new java.awt.Color(255, 0, 102));

        OrdersAmt.setBackground(new java.awt.Color(204, 0, 204));
        OrdersAmt.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        OrdersAmt.setForeground(new java.awt.Color(255, 255, 255));
        OrdersAmt.setText("ORDER AMOUNT");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrdersAmt)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(OrdersAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OrderAmt)
                .addGap(22, 22, 22))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderAmt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Clear_btn.setBackground(new java.awt.Color(255, 0, 5));
        Clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        Clear_btn.setText("Clear");
        Clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clear_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(custid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(custphone))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(211, 211, 211))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(364, 364, 364)
                    .addComponent(jLabel4)
                    .addContainerGap(366, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custphone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(deletebtn)
                            .addComponent(editbtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(Clear_btn))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addComponent(jLabel4)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void SelectCust()
    {
        try{
         Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");  
         St = Con.createStatement();
         Rs = St.executeQuery("select * from customer");
         customertbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    private void custnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        try{
           Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");
           PreparedStatement add = Con.prepareStatement("insert into customer values(?,?,?)");
           add.setInt(1, Integer.valueOf(custid.getText()));
           add.setString(2, custname.getText());
           add.setString(3, custphone.getText());
           int row = add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Customer Successfully Added");
           Con.close();
           SelectCust();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
       if(custid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Customer To Be Deleted");
        }
        else
        {
            try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");
             String Id = custid.getText();
             String Query = "Delete from customer where customer_id="+Id;
             Statement Add = Con.createStatement();
             Add.executeUpdate(Query);
             SelectCust();
             JOptionPane.showMessageDialog(this, "Customer Deleted Successfully");
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deletebtnMouseClicked

    private void exit_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_lblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_lblMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
         if(custid.getText().isEmpty()||custname.getText().isEmpty()||custphone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");
             String UpdateQuery = "update customer set customer_name='"+custname.getText()+"'"+",customer_phone='"+custphone.getText()+"'"
                     +"where customer_id ="+custid.getText();                                             
             Statement Add = Con.createStatement();
             Add.executeUpdate(UpdateQuery);
             JOptionPane.showMessageDialog(this, "Customer Updated Successfully");
             SelectCust();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void customertblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertblMouseClicked
        DefaultTableModel model = (DefaultTableModel)customertbl.getModel();
        int Myindex = customertbl.getSelectedRow();
        custid.setText(model.getValueAt(Myindex, 0).toString());
        custname.setText(model.getValueAt(Myindex, 1).toString());
        custphone.setText(model.getValueAt(Myindex, 2).toString());
        try {
             Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");
             St = Con.createStatement();
             St1 = Con.createStatement();
             Rs = St.executeQuery("select count(*) from orders where customer_name='"+model.getValueAt(Myindex, 1).toString()+"'");
             Rs1 = St1.executeQuery("select sum(AMOUNT) from orders where customer_name='"+model.getValueAt(Myindex, 1).toString()+"'");
             while(Rs.next()){
                 OrderNum.setText(""+Rs.getInt(1));
             }
             while (Rs1.next()){
                 OrderAmt.setText("Rs"+Rs1.getInt(1));
             }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_customertblMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
         new HomeForm().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void Clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_btnMouseClicked
        // TODO add your handling code here:
        custid.setText("");
        custname.setText("");
        custphone.setText("");
        OrderNum.setText("");
        OrderAmt.setText("");
    }//GEN-LAST:event_Clear_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_btn;
    private javax.swing.JLabel OrderAmt;
    private javax.swing.JLabel OrderNum;
    private javax.swing.JLabel OrdersAmt;
    private javax.swing.JLabel OrdersNum;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField custid;
    private javax.swing.JTextField custname;
    private javax.swing.JTable customertbl;
    private javax.swing.JTextField custphone;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel exit_lbl;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
