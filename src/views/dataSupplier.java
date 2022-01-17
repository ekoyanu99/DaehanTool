/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static views.DashboardAdmin.maximixed;

/**
 *
 * @author ekoya
 */
public class dataSupplier extends javax.swing.JFrame {

    /**
     * Creates new form dataSupplier
     */
    public dataSupplier() {
        initComponents();
    }

    dataSupplier(DashboardAdmin aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        header = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnMaximize = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPilihTanggal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txtKodeSupplier = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNoTelepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNamaSupplier = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtAlamat = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        informasi = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPencarian = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(120, 122, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(24, 104, 174));

        btnClose.setBackground(new java.awt.Color(24, 104, 174));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_30px_4.png"))); // NOI18N
        btnClose.setContentAreaFilled(false);
        btnClose.setOpaque(true);
        btnClose.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_30px_5.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnMaximize.setBackground(new java.awt.Color(102, 102, 102));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Maximize_Window_30px.png"))); // NOI18N
        btnMaximize.setContentAreaFilled(false);
        btnMaximize.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Maximize_Window_30px_1.png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseClicked(evt);
            }
        });
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(204, 204, 204));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Minimize_Window_30px.png"))); // NOI18N
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Minimize_Window_30px_1.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Data Supplier");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 853, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 50));

        jLabel1.setBackground(new java.awt.Color(24, 104, 174));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tanggal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        btnPilihTanggal.setDateFormatString("dd-MM-yyyy");
        btnPilihTanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPilihTanggal.setMaximumSize(new java.awt.Dimension(2147400000, 2147400000));
        btnPilihTanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihTanggalMouseClicked(evt);
            }
        });
        btnPilihTanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPilihTanggalKeyPressed(evt);
            }
        });
        jPanel1.add(btnPilihTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kode Supplier");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        jPanel1.add(txtKodeSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Supplier");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        jPanel1.add(txtNoTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nomer Telepon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        jPanel1.add(txtNamaSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1160, 300));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable3);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1160, 300));

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, 150));

        btnSimpan.setBackground(new java.awt.Color(186, 255, 180));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 80, 30));

        btnUbah.setBackground(new java.awt.Color(255, 253, 162));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 80, 30));

        btnClear.setBackground(new java.awt.Color(255, 171, 118));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 80, 30));

        btnHapus.setBackground(new java.awt.Color(255, 99, 99));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Info_30px_6.png"))); // NOI18N
        jLabel6.setText("Informasi");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 320, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n   * Form ini digunakan untuk menyimpan data\n      barang baru\n   * Tekan TAMBAH untuk menyimpan data\n   * Tekan UBAH untuk mengedit data\n   * Tekan CLEAR untuk membersihkan field\n   * Tekan HAPUS untuk menghapus data");
        informasi.setViewportView(jTextArea1);

        jPanel1.add(informasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 320, 140));
        jPanel1.add(jPencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 210, -1));

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 330, -1, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setBackground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setBackground(new Color(24,104,174));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        String ObjButton[] = {"YES","NO"};
        int pilihan = JOptionPane.showOptionDialog(null,"Apakah Anda yakin ingin keluar...?","Message", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null,ObjButton,ObjButton[1]);
        if(pilihan == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseClicked
        if(maximixed){
            dataSupplier.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            dataSupplier.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximixed = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximixed = true;
        }
    }//GEN-LAST:event_btnMaximizeMouseClicked

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaximizeActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnPilihTanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihTanggalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihTanggalMouseClicked

    private void btnPilihTanggalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPilihTanggalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihTanggalKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(dataSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    private com.toedter.calendar.JDateChooser btnPilihTanggal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane informasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPencarian;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtKodeSupplier;
    private javax.swing.JTextField txtNamaSupplier;
    private javax.swing.JTextField txtNoTelepon;
    // End of variables declaration//GEN-END:variables
}