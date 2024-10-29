
package Admin;

import UILogin.Koneksi;
import UILogin.UserProfile;
import UILogin.login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class DashAdm_Produk extends javax.swing.JFrame {

    UserProfile u;
    
    
    /**
     * Creates new form OwnerPage
     */
    public DashAdm_Produk() {
        initComponents();
    }
    
    public DashAdm_Produk(UserProfile up) {
        initComponents();
        
        this.u = up;
        txtNamaProfile.setText(u.getFullname());
        txtLevel.setText(u.getLevel());
//        txtTextNama.setText(u.getFullname());
        viewDataProduk("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUtama = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        txtNamaProfile = new javax.swing.JLabel();
        txtLevel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btnProduk = new rojeru_san.complementos.RSButtonHover();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnAkun = new rojeru_san.complementos.RSButtonHover();
        btnLogout1 = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonTambah = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        buttonEdit = new rojeru_san.complementos.RSButtonHover();
        btnRefresh = new rojeru_san.complementos.RSButtonHover();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Owner");

        PanelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(12, 139, 139));
        header.setAlignmentX(0.0F);
        header.setAlignmentY(0.0F);
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNamaProfile.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtNamaProfile.setForeground(new java.awt.Color(240, 240, 240));
        txtNamaProfile.setText("Nama");
        header.add(txtNamaProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 25, -1, 23));

        txtLevel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtLevel.setForeground(new java.awt.Color(240, 240, 240));
        txtLevel.setText("Role");
        header.add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1183, 54, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROFILE.png"))); // NOI18N
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("OnlineShop");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 17, -1, -1));

        PanelUtama.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1380, 90));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProduk.setBackground(new java.awt.Color(102, 102, 102));
        btnProduk.setText("Produk");
        btnProduk.setColorHover(new java.awt.Color(102, 102, 102));
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });
        sidebar.add(btnProduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 50));

        btnHome.setBackground(new java.awt.Color(51, 51, 51));
        btnHome.setText("Home");
        btnHome.setColorHover(new java.awt.Color(102, 102, 102));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        sidebar.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        btnAkun.setBackground(new java.awt.Color(51, 51, 51));
        btnAkun.setText("Akun");
        btnAkun.setColorHover(new java.awt.Color(102, 102, 102));
        btnAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkunActionPerformed(evt);
            }
        });
        sidebar.add(btnAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 50));

        btnLogout1.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout1.setText("LOGOUT");
        btnLogout1.setColorHover(new java.awt.Color(153, 0, 0));
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        sidebar.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 220, -1));

        PanelUtama.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, -1, 940));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PanelUtama.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "No", "produk_kode", "nama", "gambar", "kategori", "produk supplier", "harga jual", "harga beli", "stok", "deskripsi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PanelUtama.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 217, 790, 360));

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        PanelUtama.add(buttonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 150, -1));

        rSButtonHover3.setBackground(new java.awt.Color(255, 0, 0));
        rSButtonHover3.setText("Hapus");
        rSButtonHover3.setColorHover(new java.awt.Color(153, 0, 0));
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        PanelUtama.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 150, -1));

        buttonEdit.setBackground(new java.awt.Color(255, 102, 0));
        buttonEdit.setText("Edit");
        buttonEdit.setColorHover(new java.awt.Color(153, 102, 0));
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        PanelUtama.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 150, -1));

        btnRefresh.setBackground(new java.awt.Color(51, 255, 51));
        btnRefresh.setText("Refresh");
        btnRefresh.setColorHover(new java.awt.Color(153, 102, 0));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        PanelUtama.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SEARCH-25.png"))); // NOI18N
        PanelUtama.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 110, -1, -1));

        txtSearch.setBackground(new java.awt.Color(242, 242, 242));
        txtSearch.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        PanelUtama.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdukActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DashAdm_Home l = new DashAdm_Home(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkunActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DashAdm_Akun l = new DashAdm_Akun(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnAkunActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        TambahProduk t = new TambahProduk();
        t.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_VERT);
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
//        int n = jTable1.getSelectedRow();
//        if(n != -1){
//            int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
//            //            JOptionPane.showMessageDialog(this, id);
//
//            int pilihan = JOptionPane.showConfirmDialog(this,
//                "Apakah Anda yakin untuk menghapus data user ini?",
//                "Hapus Data",JOptionPane.YES_NO_OPTION);
//            if(pilihan == 0){
//                //yes
//                String Q = "DELETE FROM akun WHERE id="+id+" ";
//                try {
//                    Connection K = Koneksi.Go();
//                    Statement S = K.createStatement();
//                    S.executeUpdate(Q);
//                    viewdata("");
//                } catch (Exception e) {
//                }
//            }else {
//                //no
//            }
//
//        }else {
//            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
//
//        }
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
//        int n = jTable1.getSelectedRow();
//        if(n != -1){
//            int id = Integer.parseInt(jTable1.getValueAt(n, 0).toString());
//            String FN = jTable1.getValueAt(n, 2).toString();
//            String UN = jTable1.getValueAt(n, 3).toString();
//            String PS = jTable1.getValueAt(n, 4).toString();
//            String LV = jTable1.getValueAt(n, 5).toString();
//            EditBaru E = new EditBaru(this, true);
//            E.setId(id);
//            E.setFN(FN);
//            E.setUS(UN);
//            E.setPS(PS);
//            E.setLV(LV);
//            E.setVisible(true);
//            //            DISINI DITEMPAT INI ERROR !!!!
//        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
//        // TODO add your handling code here:
//        txtSearch.setText("");
//        viewdata("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
//        String key = txtSearch.getText();
//        String w = "WHERE "
//        + "fullname LIKE '%"+key+"%' "
//        + "OR username LIKE '%"+key+"%' "
//        + "OR password LIKE '%"+key+"%' "
//        + "OR level LIKE '%"+key+"%'";
//        viewdata(w);
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(DashAdm_Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashAdm_Produk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUtama;
    private rojeru_san.complementos.RSButtonHover btnAkun;
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnLogout1;
    private rojeru_san.complementos.RSButtonHover btnProduk;
    private rojeru_san.complementos.RSButtonHover btnRefresh;
    private rojeru_san.complementos.RSButtonHover buttonEdit;
    private rojeru_san.complementos.RSButtonHover buttonTambah;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txtLevel;
    private javax.swing.JLabel txtNamaProfile;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void viewDataProduk(String where) {
        try {
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            m.getDataVector().removeAllElements();
            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM produk "+where;
            ResultSet R = S.executeQuery(Q);
            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("ID");
                
//                String idProfile = R.getString("ID_profile");
                int kodeProduk = R.getInt("produk_kode");
                String namaProduk = R.getString("nama_produk");
                String gambarProduk = R.getString("gambar_produk");
                int produkKategori = R.getInt("produk_kategori");
                int produkSupplier = R.getInt("produk_supplier");
                int hargaBeli = R.getInt("harga_produk_beli");
                int hargaJual = R.getInt("harga_produk_jual");
                int stok = R.getInt("produk_stok");
                String deskripsi = R.getString("deskripsi_produk");
                
                Object[] data = {id, n, kodeProduk, namaProduk, gambarProduk, produkKategori, produkSupplier, hargaBeli, hargaJual, stok, deskripsi};
                m.addRow(data); 
                n++;
            }
            
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
//            
        } catch (Exception e) {
            //error handling
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
