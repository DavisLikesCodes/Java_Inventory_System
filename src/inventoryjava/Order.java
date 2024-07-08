 
package inventoryjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Order extends javax.swing.JFrame {

    
    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
      public void SelectProd()
    {
        try{
         Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");  
         St = Con.createStatement();
         Rs = St.executeQuery("select * from product");
         producttbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
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
    private void GetToday()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        datelbl.setText(dtf.format(now));
    }
    private void update()
    {
        int newqty = oldqty - Integer.valueOf(qtytb.getText());
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");
            String UpdateQuery = "update product set prod_qty='"+newqty+"'"+"where prod_id ="+productid;                                             
            Statement Add = Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            SelectProd();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit_lbl = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        addtobtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customertbl = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        custnamelbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        qtytb = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Bill_Tbl = new javax.swing.JTable();
        totamt_lbl = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Print_Btn = new javax.swing.JButton();
        totamt_lbl1 = new javax.swing.JLabel();
        Clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 5));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory Management System");

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Orders");

        exit_lbl.setBackground(new java.awt.Color(204, 204, 255));
        exit_lbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
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
                .addGap(365, 365, 365)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addComponent(exit_lbl)
                .addGap(31, 31, 31))
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

        BillId.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        BillId.setForeground(new java.awt.Color(255, 0, 51));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 5));
        jLabel8.setText("Quantity");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 5));
        jLabel9.setText("OrderId");

        addbtn.setBackground(new java.awt.Color(255, 0, 5));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add Order");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        addtobtn.setBackground(new java.awt.Color(255, 0, 5));
        addtobtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        addtobtn.setForeground(new java.awt.Color(255, 255, 255));
        addtobtn.setText("AddToOrder");
        addtobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addtobtnMouseClicked(evt);
            }
        });

        homebtn.setBackground(new java.awt.Color(255, 0, 5));
        homebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setText("Home");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });

        producttbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        producttbl.setForeground(new java.awt.Color(255, 0, 51));
        producttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdId", "Name", "Quantity", "Description", "Category"
            }
        ));
        producttbl.setRowHeight(30);
        producttbl.setSelectionBackground(new java.awt.Color(255, 0, 5));
        producttbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttbl);

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

        jLabel5.setBackground(new java.awt.Color(255, 0, 5));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 5));
        jLabel5.setText("Products List");

        customertbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        customertbl.setForeground(new java.awt.Color(255, 0, 51));
        customertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustdId", "Name", "Phone"
            }
        ));
        customertbl.setRowHeight(30);
        customertbl.setSelectionBackground(new java.awt.Color(255, 0, 5));
        customertbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customertbl);

        jLabel11.setBackground(new java.awt.Color(255, 0, 5));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 5));
        jLabel11.setText("Customers List");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 5));
        jLabel13.setText("CustomerName");

        custnamelbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        custnamelbl.setForeground(new java.awt.Color(255, 0, 5));
        custnamelbl.setText("CustName");

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 5));
        jLabel15.setText("Date");

        datelbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        datelbl.setForeground(new java.awt.Color(255, 0, 5));
        datelbl.setText("Date");

        qtytb.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        qtytb.setForeground(new java.awt.Color(255, 0, 51));

        Bill_Tbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Bill_Tbl.setForeground(new java.awt.Color(255, 0, 51));
        Bill_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        Bill_Tbl.setRowHeight(30);
        Bill_Tbl.setSelectionBackground(new java.awt.Color(255, 0, 5));
        Bill_Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bill_TblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Bill_Tbl);

        totamt_lbl.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        totamt_lbl.setForeground(new java.awt.Color(255, 0, 5));
        totamt_lbl.setText("Amount");

        Price.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 0, 51));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 5));
        jLabel10.setText("Price");

        Print_Btn.setBackground(new java.awt.Color(255, 0, 5));
        Print_Btn.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        Print_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Print_Btn.setText("Print");
        Print_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Print_BtnMouseClicked(evt);
            }
        });
        Print_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_BtnActionPerformed(evt);
            }
        });

        totamt_lbl1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        totamt_lbl1.setForeground(new java.awt.Color(255, 0, 5));
        totamt_lbl1.setText("N");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(63, 63, 63)
                                        .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(custnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(85, 85, 85)
                                            .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(addbtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel11))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(233, 233, 233))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(totamt_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totamt_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addtobtn)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(custnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(homebtn))
                        .addGap(18, 18, 18)
                        .addComponent(Clear_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addtobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Print_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totamt_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totamt_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
  
    private void exit_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_lblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_lblMouseClicked

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
       if(BillId.getText().isEmpty())
       {
            JOptionPane.showMessageDialog(this, "Enter The Bill Id");
       } 
       else{
        try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost/inventory_db","root","");
        PreparedStatement add = Con.prepareStatement("insert into orders values(?,?,?,?)");
        add.setInt(1, Integer.valueOf(BillId.getText()));
        add.setString(2, custnamelbl.getText());
        add.setString(3, datelbl.getText());
        add.setInt(4, Integer.valueOf(totamt_lbl.getText()));
        int row = add.executeUpdate();
        JOptionPane.showMessageDialog(this, "Order Successfully Added");
        Con.close();
       
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_addbtnMouseClicked
int i = 1,Uprice,tot=0,total;
String prodname;
    private void addtobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtobtnMouseClicked
    if(flag == 0||qtytb.getText().isEmpty()||Price.getText().isEmpty())
    {
       JOptionPane.showMessageDialog(this, "Select Product and Enter Quantity"); 
    }
    else
    {
    Uprice = Integer.valueOf(Price.getText());
    tot = Uprice * Integer.valueOf(qtytb.getText());
    Vector v = new Vector();
    v.add(i);
    v.add(prodname);
    v.add(qtytb.getText());
    v.add(Uprice);
    v.add(tot);
    DefaultTableModel dt = (DefaultTableModel)Bill_Tbl.getModel();
    dt.addRow(v);
    total = total + tot;
    totamt_lbl.setText(""+total);
    update(); 
    i++;
    }
    }//GEN-LAST:event_addtobtnMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked
int flag = 0,productid,oldqty;
    private void producttblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttblMouseClicked
        DefaultTableModel model = (DefaultTableModel)producttbl.getModel();
        int Myindex = producttbl.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        prodname = model.getValueAt(Myindex, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        //proddesc.setText(model.getValueAt(Myindex, 3).toString());
        flag = 1;
    }//GEN-LAST:event_producttblMouseClicked

    private void customertblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertblMouseClicked
        DefaultTableModel model = (DefaultTableModel)customertbl.getModel();
        int Myindex = customertbl.getSelectedRow();
       // custid.setText(model.getValueAt(Myindex, 0).toString());
        custnamelbl.setText(model.getValueAt(Myindex, 1).toString());
        //custphone.setText(model.getValueAt(Myindex, 2).toString()); 
    }//GEN-LAST:event_customertblMouseClicked

    private void Bill_TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bill_TblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bill_TblMouseClicked

    private void Print_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Print_BtnMouseClicked
        // TODO add your handling code here:
        try {
            Bill_Tbl.print();
        } catch (Exception exp) 
        {
            exp.printStackTrace();
        }
    }//GEN-LAST:event_Print_BtnMouseClicked

    private void Print_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Print_BtnActionPerformed

    private void Clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_btnMouseClicked
        // TODO add your handling code here:
        BillId.setText("");
        datelbl.setText("");
        custnamelbl.setText("");
        Price.setText("");
        qtytb.setText("");
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillId;
    private javax.swing.JTable Bill_Tbl;
    private javax.swing.JButton Clear_btn;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Print_Btn;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addtobtn;
    private javax.swing.JLabel custnamelbl;
    private javax.swing.JTable customertbl;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel exit_lbl;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable producttbl;
    private javax.swing.JTextField qtytb;
    private javax.swing.JLabel totamt_lbl;
    private javax.swing.JLabel totamt_lbl1;
    // End of variables declaration//GEN-END:variables
}
