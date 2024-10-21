
package Admin;

import UILogin.UserProfile;
import UILogin.login;
import javax.swing.JFrame;

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
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

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

        jLabel3.setText("menu produk");
        PanelUtama.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

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
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txtLevel;
    private javax.swing.JLabel txtNamaProfile;
    // End of variables declaration//GEN-END:variables
}
