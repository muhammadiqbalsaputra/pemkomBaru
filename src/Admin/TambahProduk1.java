/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Admin;

/**
 *
 * @author FAUZI
 */
public class TambahProduk1 extends javax.swing.JDialog {

    /**
     * Creates new form TambahProduk1
     */
    public TambahProduk1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama2 = new javax.swing.JTextField();
        txtNama3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNama6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNama5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNama4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNama7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        btnBatal = new rojeru_san.complementos.RSButtonHover();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Form Tambah Produk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        txtNama.setEditable(false);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 30));

        jLabel4.setText("Kode Produk");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 20));

        jLabel5.setText("Nama");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 20));

        txtNama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 253, 30));

        txtNama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, 30));

        jLabel7.setText("Gambar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        jLabel8.setText("Produk Supplier");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 40));

        jButton1.setText("Pilih");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 60, 30));

        txtNama6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama6ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 253, 30));

        jLabel11.setText("Stok");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, -1));

        txtNama5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama5ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 253, 30));

        jLabel10.setText("Harga Jual");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 80, 20));

        txtNama4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama4ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 253, 30));

        jLabel9.setText("Harga Jual");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 80, 20));

        txtNama7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama7ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 250, 80));

        jLabel12.setText("Deskripsi");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 80, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        jLabel6.setText("Kategori");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 20));

        rSButtonHover1.setText("Tambah");
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 680, 10));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtNama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama2ActionPerformed

    private void txtNama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNama6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama6ActionPerformed

    private void txtNama5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama5ActionPerformed

    private void txtNama4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama4ActionPerformed

    private void txtNama7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama7ActionPerformed

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
            java.util.logging.Logger.getLogger(TambahProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahProduk1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahProduk1 dialog = new TambahProduk1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
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
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNama2;
    private javax.swing.JTextField txtNama3;
    private javax.swing.JTextField txtNama4;
    private javax.swing.JTextField txtNama5;
    private javax.swing.JTextField txtNama6;
    private javax.swing.JTextField txtNama7;
    // End of variables declaration//GEN-END:variables
}
