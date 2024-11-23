/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Admin;

//import static Admin.DashAdm_Produk.viewDataProduk;
import static Admin.GenerateCode.generateCode;
import UILogin.Koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        
         viewCategory("produk_kategori", jComboBox1);
         viewCategory("supplier", jComboBox2);
         generateCode();
    }

    TambahProduk1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jPanel2 = new javax.swing.JPanel();

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
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
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
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 70, 20));

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
        String kodeProduk = txtNama.getText(); // Pastikan ini adalah JTextField untuk kode produk
        String nama = txtNama2.getText();
        String gambar = txtNama3.getText();
        String produkSupplier = jComboBox2.getSelectedItem().toString();
        String produkKategori = jComboBox1.getSelectedItem().toString();
        int hargaJual;
        int hargaBeli;
        int stok;
        String deskripsi = txtNama7.getText();

        // Validasi input
        if (kodeProduk.isEmpty() || nama.isEmpty() || gambar.isEmpty() || produkSupplier.isEmpty() || produkKategori.isEmpty() || deskripsi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;  
        }

        // Cek apakah input harga dan stok berupa angka
        try {
            hargaJual = Integer.parseInt(txtNama4.getText());
            hargaBeli = Integer.parseInt(txtNama5.getText());
            stok = Integer.parseInt(txtNama6.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Pastikan harga dan stok diisi dengan angka yang valid.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;  
        }

        try {
            Connection K = Koneksi.Go();
            String Q = "INSERT INTO produk (produk_kode, nama_produk, gambar_produk, produk_supplier, produk_kategori, harga_produk_jual, harga_produk_beli, produk_stok, deskripsi_produk) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement PS = K.prepareStatement(Q);
            PS.setString(1, kodeProduk);  // Kode produk sebagai VARCHAR
            PS.setString(2, nama);
            PS.setString(3, gambar);
            PS.setString(4, produkSupplier);
            PS.setString(5, produkKategori);
            PS.setInt(6, hargaJual);
            PS.setInt(7, hargaBeli);
            PS.setInt(8, stok);
            PS.setString(9, deskripsi);

            PS.executeUpdate();
            DashAdm_Produk.viewDataProduk("");
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

            // Format tanggal
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s z");
            String tanggal = sdf.format(d);

            Function.logActivity("\n["+tanggal+"] Penambahan produk baru berhasil "); 
            txtNama2.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    public static javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNama2;
    private javax.swing.JTextField txtNama3;
    private javax.swing.JTextField txtNama4;
    private javax.swing.JTextField txtNama5;
    private javax.swing.JTextField txtNama6;
    private javax.swing.JTextField txtNama7;
    // End of variables declaration//GEN-END:variables

private void viewCategory(String tableName, JComboBox cmb){
    try {
        cmb.removeAllItems();
        Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM "+tableName;
            ResultSet R = S.executeQuery(Q);
//            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("ID");                 	 	 	 	 	 	 	 	
                String name = R.getString("nama");
//                String desc = R.getString("description");
                cmb.addItem(id+"-"+name);                 
            }
    } catch (SQLException e) {
        System.err.println("ErrorCode: 1123"+e.getMessage());
    }
}


}
