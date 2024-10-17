package Admin;

import UILogin.UserProfile;
import UILogin.login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import UILogin.Koneksi;


public class DashAdm_Akun extends javax.swing.JFrame {

    UserProfile u;
    
    
    /**
     * Creates new form OwnerPage
     */
    public DashAdm_Akun() {
        initComponents();
    }
    
    public DashAdm_Akun(UserProfile up) {
        initComponents();
        
        this.u = up;
        txtNamaProfile.setText(u.getFullname());
        txtLevel.setText(u.getLevel());
//        txtTextNama.setText(u.getFullname());
        viewdata("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSLabelVerticalDBeanInfo1 = new rojerusan.RSLabelVerticalDBeanInfo();
        PanelUtama = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNamaProfile = new javax.swing.JLabel();
        txtLevel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        btnProduk = new rojeru_san.complementos.RSButtonHover();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnAkun = new rojeru_san.complementos.RSButtonHover();
        btnLogout1 = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        buttonEdit = new rojeru_san.complementos.RSButtonHover();
        buttonTambah = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Owner");

        PanelUtama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(12, 139, 139));
        header.setAlignmentX(0.0F);
        header.setAlignmentY(0.0F);
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("OnlineShop");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 17, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        txtNamaProfile.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtNamaProfile.setForeground(new java.awt.Color(240, 240, 240));
        txtNamaProfile.setText("Nama");

        txtLevel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtLevel.setForeground(new java.awt.Color(240, 240, 240));
        txtLevel.setText("Role");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PROFILE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtNamaProfile))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtLevel)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNamaProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLevel)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        header.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 420, 80));

        PanelUtama.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1380, 90));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProduk.setBackground(new java.awt.Color(51, 51, 51));
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

        btnAkun.setBackground(new java.awt.Color(102, 102, 102));
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NO", "Fullname", "Username", "Password", "Role"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PanelUtama.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 207, 1120, 370));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SEARCH-25.png"))); // NOI18N
        PanelUtama.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 110, -1, -1));

        txtSearch.setBackground(new java.awt.Color(242, 242, 242));
        txtSearch.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtSearch.setText("Search..");
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        PanelUtama.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 270, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelUtama.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 220, -1));

        buttonEdit.setBackground(new java.awt.Color(255, 102, 0));
        buttonEdit.setText("Edit");
        buttonEdit.setColorHover(new java.awt.Color(153, 102, 0));
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        PanelUtama.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 150, -1));

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
        this.setVisible(false);
        DashAdm_Produk l = new DashAdm_Produk(u);
        l.setVisible(true);
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        
    }//GEN-LAST:event_btnAkunActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        Edit e = new Edit();
        e.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        Tambah t = new Tambah();
        t.setVisible(true);
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed

    }//GEN-LAST:event_rSButtonHover3ActionPerformed

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
            java.util.logging.Logger.getLogger(DashAdm_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashAdm_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DashAdm_Akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUtama;
    private rojeru_san.complementos.RSButtonHover btnAkun;
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnLogout1;
    private rojeru_san.complementos.RSButtonHover btnProduk;
    private rojeru_san.complementos.RSButtonHover buttonEdit;
    private rojeru_san.complementos.RSButtonHover buttonTambah;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojerusan.RSLabelVerticalDBeanInfo rSLabelVerticalDBeanInfo1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txtLevel;
    private javax.swing.JLabel txtNamaProfile;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void viewdata(String where) {
        try {
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            m.getDataVector().removeAllElements();
            Connection K = Koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM akun "+where;
            ResultSet R = S.executeQuery(Q);
            int n = 1;
            while (R.next()) {                 
                int id = R.getInt("id");
                String fullname = R.getString("fullname");
                String username = R.getString("username");
                String password = R.getString("password");
                String level = R.getString("level");
                Object[] data = {id, n, fullname, username, password, level};
                m.addRow(data); 
                n++;
            }
            
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
//            
        } catch (Exception e) {
            //error handling
        }
    }
}