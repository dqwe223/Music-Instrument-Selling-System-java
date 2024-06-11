
package inf;

import codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Shan
 */
public class mainf extends javax.swing.JFrame { //inheritance

    Connection conn =null;
    PreparedStatement pst =null;
    ResultSet rs =null;
    
    static void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form mainf
     */
    public mainf() {
        initComponents();
        conn = DBconnect.connect();
        tableload();
    }

    public void tableload(){ //encapsulation
        try {
            String sql = "SELECT id AS ID,type AS Type,price AS Price,qty AS QTY,total AS Total FROM cattable";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ctable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void cartclean(){ //encap , //abstactraction
          try {
            String sql="DELETE FROM cattable;" ;
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            tableload();
        } catch (SQLException e) {
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logoutlab = new javax.swing.JLabel();
        lableu = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ibox = new javax.swing.JComboBox<>();
        qtybox = new javax.swing.JComboBox<>();
        t1box = new javax.swing.JTextField();
        printbtn = new javax.swing.JButton();
        totbox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ramuntbox = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        blab = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cnamebox = new javax.swing.JTextField();
        cnomberbox = new javax.swing.JTextField();
        bbtn = new javax.swing.JButton();
        dbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Music BackGround");

        logoutlab.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\24.png")); // NOI18N
        logoutlab.setToolTipText("LogOut");
        logoutlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabMouseClicked(evt);
            }
        });

        lableu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lableu.setText("User Name");

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\logggggggg.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addComponent(lableu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutlab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lableu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutlab)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\mm.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, 250));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\Goblet-Drum-icon.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 120, 120));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Insument         :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Next Price       :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Qty                 :");

        ibox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ibox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Drum", "Keybord", "Gitar", "Octerpad", "Floot", "Others" }));
        ibox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iboxMouseClicked(evt);
            }
        });
        ibox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iboxActionPerformed(evt);
            }
        });

        qtybox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qtybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", " " }));
        qtybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyboxActionPerformed(evt);
            }
        });

        t1box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1boxMouseClicked(evt);
            }
        });
        t1box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1boxActionPerformed(evt);
            }
        });

        printbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        printbtn.setText("Print Bill");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        totbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totboxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Total              : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Recevied Amount");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Discount         :");

        ramuntbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramuntboxActionPerformed(evt);
            }
        });
        ramuntbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ramuntboxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ramuntboxKeyTyped(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearbtn.setText("Clear Cart");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Balance          :");

        blab.setText("##########");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Customer Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Mobile No       :");

        cnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameboxActionPerformed(evt);
            }
        });

        cnomberbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnomberboxActionPerformed(evt);
            }
        });

        bbtn.setText("Get to Bill");
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });

        dbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "5", "10", "20" }));
        dbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dboxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("%");

        deletebtn.setText("Delete One");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qtybox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ibox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11))
                                    .addGap(150, 150, 150))
                                .addComponent(printbtn)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t1box, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(dbox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel3))
                                        .addComponent(totbox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cnomberbox)
                                        .addComponent(blab)
                                        .addComponent(ramuntbox, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(cnamebox)))))
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(deletebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bbtn)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearbtn)
                    .addComponent(bbtn)
                    .addComponent(deletebtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(totbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ramuntbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(blab))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cnomberbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(printbtn)
                .addGap(64, 64, 64))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 510));

        itable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type", "Price"
            }
        ));
        itable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                itableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(itable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 270, 390));

        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ctable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 340, 390));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\stock.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 40, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\cat.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 30, 30));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 140, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\3333333333333.gif")); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 280, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shan\\Downloads\\music-icon2.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 120, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameboxActionPerformed

    private void cnomberboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnomberboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnomberboxActionPerformed

    private void totboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totboxActionPerformed

    private void ramuntboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramuntboxActionPerformed
        double tot = Double.parseDouble(totbox.getText()); 
        double pp = Double.parseDouble(ramuntbox.getText());
        double getm = pp-tot;
        
        blab.setText(String.valueOf(getm));
    }//GEN-LAST:event_ramuntboxActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        cartclean();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void iboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iboxActionPerformed
       
        String insmt;
        insmt = ibox.getSelectedItem().toString();
        
        if(insmt.equals("Gitar")){
            try {
            String sql="SELECT gid AS ID,gtype AS Type,gprice AS Price FROM guitar" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            itable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException e) {
            
        }
       }
        else if(insmt.equals("Drum")){
                try {
            String sql="SELECT did AS ID,dtype AS Type,dprice AS Price FROM drum" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            itable.setModel(DbUtils.resultSetToTableModel(rs));
            
             } catch (SQLException e) {
            
             }
        }
        else if(insmt.equals("Keybord")){
                try {
            String sql="SELECT kid AS ID,ktype AS Type,kprice AS Price FROM keyboard" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            itable.setModel(DbUtils.resultSetToTableModel(rs));
            
             } catch (SQLException e) {
            
             }
        }
        else if(insmt.equals("Octerpad")){
                try {
            String sql="SELECT oid AS ID,otype AS Type,oprice AS Price FROM octapad" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            itable.setModel(DbUtils.resultSetToTableModel(rs));
            
             } catch (SQLException e) {
            
             }
        }
        else{
        
        }
    }//GEN-LAST:event_iboxActionPerformed

    private void iboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iboxMouseClicked
        
    }//GEN-LAST:event_iboxMouseClicked

    private void itableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itableMouseClicked
       int column = 0;
       int row = itable.getSelectedRow();
       String value = itable.getModel().getValueAt(row, column).toString();
       
       int tr =itable.getSelectedRow();
       
       String id = itable.getValueAt(tr, 0).toString();
       String type = itable.getValueAt(tr, 1).toString();
       String price = itable.getValueAt(tr, 2).toString();
       
        try {
            String sql = "INSERT INTO cattable(id,type,price) VALUES ('"+id+"','"+type+"','"+price+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        tableload();
    }//GEN-LAST:event_itableMouseClicked

    private void itableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itableMousePressed
       
    }//GEN-LAST:event_itableMousePressed

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
       int numr=ctable.getRowCount();
       double tot=0;
       
       for(int i=0;i<numr;i++){
           double val=Double.valueOf(ctable.getValueAt(i, 4).toString());
           tot += val;
       }
       t1box.setText(Double.toString(tot));
           
    }//GEN-LAST:event_bbtnActionPerformed

    private void dboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dboxActionPerformed
        try {
            double tot = Double.parseDouble(t1box.getText());
            double dc = Double.parseDouble(dbox.getSelectedItem().toString());
            double dis = (tot*(dc/100));
            double atot =tot-dis;
        
        totbox.setText(String.valueOf(atot));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dboxActionPerformed

    private void ramuntboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ramuntboxKeyPressed
        
        
    }//GEN-LAST:event_ramuntboxKeyPressed

    private void ramuntboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ramuntboxKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ramuntboxKeyTyped

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        try {
            String tot = totbox.getText();
            String name = cnamebox.getText();
            String number = cnomberbox.getText();
            LocalDate date =java.time.LocalDate.now();
        
            bill obj=new bill();
            obj.biln(tot,name,number,date);
            cartclean();
            obj.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printbtnActionPerformed

    private void qtyboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyboxActionPerformed
        try {
            String qt1 = qtybox.getSelectedItem().toString();
            int qt=Integer.parseInt(qt1);
            int tr =ctable.getSelectedRow();
            String id = ctable.getValueAt(tr, 0).toString();
            String price1 = ctable.getValueAt(tr, 2).toString();
            int price=Integer.parseInt(price1);

       // double qty=Double.parseDouble(qtybox.getSelectedItem().toString());
        //double pprice=Double.parseDouble(itable.getValueAt(tr, 2).toString());
            try {
                String sql ="UPDATE cattable SET qty='"+qt+"' WHERE id='"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                tableload();
            try {
                int tot =(qt*price);
                String sql ="UPDATE cattable SET total='"+tot+"' WHERE id='"+id+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            tableload();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_qtyboxActionPerformed

    private void t1boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1boxActionPerformed
        
        
    }//GEN-LAST:event_t1boxActionPerformed

    private void t1boxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1boxMouseClicked
        
    }//GEN-LAST:event_t1boxMouseClicked

    private void logoutlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabMouseClicked
        int checkm = JOptionPane.showConfirmDialog(null, "Do you want log out ....!");
        
        if (checkm == 0){
            open1 m43 = new open1();
            m43.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutlabMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try {
            int tr = ctable.getSelectedRow();
            String id = ctable.getValueAt(tr, 0).toString();
            
            String sql = "DELETE FROM cattable WHERE id = '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            tableload();
            JOptionPane.showMessageDialog(null, "Deleted...");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_deletebtnActionPerformed
    

    
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
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbtn;
    private javax.swing.JLabel blab;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField cnamebox;
    private javax.swing.JTextField cnomberbox;
    private javax.swing.JTable ctable;
    private javax.swing.JComboBox<String> dbox;
    private javax.swing.JButton deletebtn;
    private javax.swing.JComboBox<String> ibox;
    private javax.swing.JTable itable;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lableu;
    private javax.swing.JLabel logoutlab;
    private javax.swing.JButton printbtn;
    private javax.swing.JComboBox<String> qtybox;
    private javax.swing.JTextField ramuntbox;
    private javax.swing.JTextField t1box;
    private javax.swing.JTextField totbox;
    // End of variables declaration//GEN-END:variables

    private String String(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void um(String uname1) {
        lableu.setText(uname1);
    }
}
