/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import UILogin.Koneksi;

/**
 *
 * @author FAUZI
 */
public class TambahProduk extends javax.swing.JFrame {

    public TambahProduk() {
        initComponents();
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
        btnBatal = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        txtNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNama1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama2 = new javax.swing.JTextField();
        txtNama3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNama4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNama5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNama6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNama7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        rSButtonHover1.setText("Tambah");
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 71, 253, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Form Tambah Produk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 6, -1, -1));

        txtNama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 71, 253, 40));

        jLabel4.setText("Kode Produk");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 71, 80, 40));

        jLabel5.setText("Nama");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 40));

        txtNama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 253, 40));

        txtNama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 40));

        jLabel6.setText("Kategori");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 40));

        jButton1.setText("Pilih");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 60, 40));

        jLabel7.setText("Gambar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 40));

        jLabel8.setText("Produk Supplier");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 100, 40));

        txtNama4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 253, 40));

        jLabel9.setText("Harga Jual");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 40));

        jLabel10.setText("Harga Jual");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, 40));

        txtNama5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama5ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 253, 40));

        jLabel11.setText("Stok");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 80, 40));

        txtNama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama6ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 253, 40));

        jLabel12.setText("Deskripsi");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 80, 40));

        txtNama7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama7ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 253, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 481, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
//        String name = txtNama.getText();
//        String user = txtUsername.getText();
//        String pass = new String(txtPassword.getPassword());
//        String level = optionRole.getSelectedItem().toString();

        //pengecekan

//        try {
//            Connection K = Koneksi.Go();
//            String Q = "INSERT INTO akun "
//            + "(fullname,username,password,level) "
//            + "VALUES (?,?,?,?)";
//            PreparedStatement PS = K.prepareStatement(Q);
//            PS.setString(1, name);
//            PS.setString(2, user);
//            PS.setString(3, pass);
//            PS.setString(4, level);
//            PS.executeUpdate();
//
//            DashAdm_Akun.viewdata("");
//            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
//            txtNama.requestFocus();
//        }catch (Exception e) {
//
//        }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama1ActionPerformed

    private void txtNama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama2ActionPerformed

    private void txtNama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama4ActionPerformed

    private void txtNama5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama5ActionPerformed

    private void txtNama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama6ActionPerformed

    private void txtNama7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnBatal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNama1;
    private javax.swing.JTextField txtNama2;
    private javax.swing.JTextField txtNama3;
    private javax.swing.JTextField txtNama4;
    private javax.swing.JTextField txtNama5;
    private javax.swing.JTextField txtNama6;
    private javax.swing.JTextField txtNama7;
    // End of variables declaration//GEN-END:variables
}
