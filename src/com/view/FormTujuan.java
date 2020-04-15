/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;
import com.controller.ControllerTujuan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.*;



/**
 *
 * @author Raisya Rahma
 */
public class FormTujuan extends javax.swing.JFrame {
    ControllerTujuan cbt;
    public FormTujuan() {
        initComponents();
        
        cbt = new ControllerTujuan(this);
        cbt.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        sidepan = new javax.swing.JPanel();
        Foto = new javax.swing.JPanel();
        Nama = new javax.swing.JLabel();
        travel = new javax.swing.JPanel();
        namatravel = new javax.swing.JLabel();
        supir = new javax.swing.JPanel();
        isisupir = new javax.swing.JLabel();
        riwayat = new javax.swing.JPanel();
        isiriwayat = new javax.swing.JLabel();
        isiriwayat1 = new javax.swing.JLabel();
        isilogout = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        tujuan = new javax.swing.JLabel();
        txtTujuan = new javax.swing.JTextField();
        harga = new javax.swing.JLabel();
        TxtHarga = new javax.swing.JTextField();
        txtJam = new javax.swing.JLabel();
        setJam = new javax.swing.JComboBox();
        txtCari = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepan.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout FotoLayout = new javax.swing.GroupLayout(Foto);
        Foto.setLayout(FotoLayout);
        FotoLayout.setHorizontalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        FotoLayout.setVerticalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Nama.setBackground(new java.awt.Color(255, 255, 255));
        Nama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nama.setForeground(new java.awt.Color(204, 204, 204));
        Nama.setText("Pegawai");

        travel.setBackground(new java.awt.Color(102, 0, 0));

        namatravel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        namatravel.setForeground(new java.awt.Color(204, 204, 204));
        namatravel.setText("PEGAWAI");

        supir.setBackground(new java.awt.Color(102, 0, 0));
        supir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supirMouseClicked(evt);
            }
        });

        isisupir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isisupir.setForeground(new java.awt.Color(204, 204, 204));
        isisupir.setText("SUPIR");

        riwayat.setBackground(new java.awt.Color(102, 0, 0));

        isiriwayat.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isiriwayat.setForeground(new java.awt.Color(204, 204, 204));
        isiriwayat.setText("TUJUAN");

        isiriwayat1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isiriwayat1.setForeground(new java.awt.Color(204, 204, 204));
        isiriwayat1.setText("MOBIL");

        isilogout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isilogout.setForeground(new java.awt.Color(204, 204, 204));
        isilogout.setText("LOGOUT");
        isilogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isilogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout riwayatLayout = new javax.swing.GroupLayout(riwayat);
        riwayat.setLayout(riwayatLayout);
        riwayatLayout.setHorizontalGroup(
            riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayatLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isilogout)
                    .addComponent(isiriwayat1)
                    .addComponent(isiriwayat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        riwayatLayout.setVerticalGroup(
            riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, riwayatLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(isiriwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(isiriwayat1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(isilogout, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout supirLayout = new javax.swing.GroupLayout(supir);
        supir.setLayout(supirLayout);
        supirLayout.setHorizontalGroup(
            supirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(riwayat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(supirLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(isisupir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        supirLayout.setVerticalGroup(
            supirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isisupir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout travelLayout = new javax.swing.GroupLayout(travel);
        travel.setLayout(travelLayout);
        travelLayout.setHorizontalGroup(
            travelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(travelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(namatravel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        travelLayout.setVerticalGroup(
            travelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(travelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namatravel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidepanLayout = new javax.swing.GroupLayout(sidepan);
        sidepan.setLayout(sidepanLayout);
        sidepanLayout.setHorizontalGroup(
            sidepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nama)
                .addGap(76, 76, 76))
            .addGroup(sidepanLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addComponent(travel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidepanLayout.setVerticalGroup(
            sidepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nama)
                .addGap(45, 45, 45)
                .addComponent(travel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(102, 0, 0));
        id.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        tujuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tujuan.setForeground(new java.awt.Color(102, 0, 0));
        tujuan.setText("Tujuan");

        harga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        harga.setForeground(new java.awt.Color(102, 0, 0));
        harga.setText("Harga");

        TxtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHargaActionPerformed(evt);
            }
        });

        txtJam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtJam.setForeground(new java.awt.Color(102, 0, 0));
        txtJam.setText("Jam");

        setJam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "12.00", "14.00" }));

        txtCari.setText("jTextField4");
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        buttonCari.setBackground(new java.awt.Color(102, 0, 0));
        buttonCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tujuan", "Harga", "Jam"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelData);
        if (tabelData.getColumnModel().getColumnCount() > 0) {
            tabelData.getColumnModel().getColumn(0).setResizable(false);
            tabelData.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelData.getColumnModel().getColumn(1).setResizable(false);
            tabelData.getColumnModel().getColumn(1).setPreferredWidth(10);
            tabelData.getColumnModel().getColumn(2).setResizable(false);
            tabelData.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabelData.getColumnModel().getColumn(3).setResizable(false);
            tabelData.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        buttonInsert.setBackground(new java.awt.Color(102, 0, 0));
        buttonInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonInsert.setText("Tambah");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonUpdate.setBackground(new java.awt.Color(102, 0, 0));
        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonUpdate.setText("Edit");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(102, 0, 0));
        buttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonDelete.setText("Hapus");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(111, 0, 0));
        jLabel1.setText("TUJUAN");

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(sidepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BgLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCari))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BgLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(BgLayout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(BgLayout.createSequentialGroup()
                                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(harga)
                                            .addGroup(BgLayout.createSequentialGroup()
                                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(BgLayout.createSequentialGroup()
                                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(284, 284, 284))
                                                    .addGroup(BgLayout.createSequentialGroup()
                                                        .addComponent(TxtHarga)
                                                        .addGap(206, 206, 206)))
                                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tujuan)
                                                    .addComponent(txtJam)
                                                    .addComponent(setJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(BgLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(56, 56, 56))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga)
                    .addComponent(txtJam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete))
                .addGap(21, 75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        cbt.update();
        cbt.isiTable();
        cbt.reset();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        cbt.delete();
        cbt.isiTable();
        cbt.reset();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonCariActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        // TODO add your handling code here:
        System.out.println(getTxtHarga());
        cbt.insert();
        cbt.isiTable();
        cbt.reset();
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void TxtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHargaActionPerformed

    private void supirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supirMouseClicked
        // TODO add your handling code here:
        new FormSupir().setVisible(true);
        dispose();
    }//GEN-LAST:event_supirMouseClicked

    private void isilogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isilogoutMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_isilogoutMouseClicked

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
            java.util.logging.Logger.getLogger(FormTujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTujuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel id;
    private javax.swing.JLabel isilogout;
    private javax.swing.JLabel isiriwayat;
    private javax.swing.JLabel isiriwayat1;
    private javax.swing.JLabel isisupir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namatravel;
    private javax.swing.JPanel riwayat;
    private javax.swing.JComboBox setJam;
    private javax.swing.JPanel sidepan;
    private javax.swing.JPanel supir;
    private javax.swing.JTable tabelData;
    private javax.swing.JPanel travel;
    private javax.swing.JLabel tujuan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtJam;
    private javax.swing.JTextField txtTujuan;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtID(){
        return txtID;
    }
    
    public JTextField getTxtTujuan(){
        return txtTujuan;
    }
    
    public JTextField getTxtHarga(){
        return TxtHarga;
    }
    
    public JComboBox getTxtJam(){
        return setJam;
    }
    
    public JTable getTabelData(){
        return tabelData;
    }
    
    public JButton getButtonInsert(){
        return buttonInsert;
    }
    
    public JButton getButtonUpdate(){
        return buttonUpdate;
    } 
    
    public JButton getButtonDelete(){
        return buttonDelete;
    }
        
    public JButton getButtonCari(){
        return buttonCari;
    }
    
    public JTextField getTxtCariId(){
        return txtCari;
    }
}
