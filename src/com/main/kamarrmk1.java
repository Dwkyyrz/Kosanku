
package com.main;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatPropertiesLaf;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class kamarrmk1 extends javax.swing.JFrame {

    public kamarrmk1() {
        initComponents();
        loadrmk();
    }
int xMouse;
int yMouse;

private void loadrmk(){
     try {
       String sql = "Select nama_rumahkost FROM rumah_kost WHERE id_rumahkost='1'"; 
       Connection con=(Connection)Koneksi.koneksiDB();
       Statement stm = con.createStatement();
       ResultSet rs = stm.executeQuery(sql);
       while(rs.next()){
           txt_rmk.setText(rs.getString("nama_rumahkost"));
       }
     } 
     catch (Exception e) {
    }
}

private void clear(){
            id_kmr.setText("");
        deskripsi_kmr.setText("");
        deskripsi_rmk.setText("");
        txt_harga.setText("");  
        
                txt_client.setText("");
                txt_nomor.setText("");
                txt_pekerjaan.setText("");
                txt_tgl.setText("");
                txt_tagihan.setText("");
                txt_nokmr.setText("");
                txt_alamat.setText("");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btn_minimize = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Navigasi = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        Selected = new javax.swing.JPanel();
        RumahKosst = new javax.swing.JLabel();
        Kelola = new javax.swing.JLabel();
        Client = new javax.swing.JLabel();
        Statistik = new javax.swing.JLabel();
        logout1 = new com.source.button.logout();
        pnlbody = new javax.swing.JPanel();
        infokmr = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deskripsi_kmr = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        id_kmr = new javax.swing.JLabel();
        des_kmr = new javax.swing.JLabel();
        des_rmk = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        deskripsi_rmk = new javax.swing.JTextArea();
        harga = new javax.swing.JLabel();
        txt_harga = new javax.swing.JLabel();
        form_client = new javax.swing.JPanel();
        nama_client = new javax.swing.JLabel();
        txt_client = new javax.swing.JLabel();
        no_hp = new javax.swing.JLabel();
        txt_nomor = new javax.swing.JLabel();
        pekerjaan = new javax.swing.JLabel();
        txt_pekerjaan = new javax.swing.JLabel();
        tglmasuk = new javax.swing.JLabel();
        txt_tgl = new javax.swing.JLabel();
        tagihan = new javax.swing.JLabel();
        txt_tagihan = new javax.swing.JLabel();
        no_kamar = new javax.swing.JLabel();
        txt_nokmr = new javax.swing.JLabel();
        no_kamar1 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kmrscrl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_rmk = new javax.swing.JLabel();
        btn_kembali = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kmr1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        kmr2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        kmr3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        kmr4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        kmr_5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        kmr_6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        kmr_7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        kmr_8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        kmr_9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        kmr10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        kmr_11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        kmr_12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        kmr_13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        kmr_14 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        kmr_15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        kmr_16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        kmr_17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        kmr_18 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        kmr_19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        kmr_20 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1381, 830));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_minimize.setBackground(new java.awt.Color(67, 151, 164));
        btn_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimize.setPreferredSize(new java.awt.Dimension(100, 24));
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setMaximumSize(new java.awt.Dimension(14, 37));
        jLabel3.setMinimumSize(new java.awt.Dimension(14, 37));
        jLabel3.setPreferredSize(new java.awt.Dimension(14, 37));

        javax.swing.GroupLayout btn_minimizeLayout = new javax.swing.GroupLayout(btn_minimize);
        btn_minimize.setLayout(btn_minimizeLayout);
        btn_minimizeLayout.setHorizontalGroup(
            btn_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(btn_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_minimizeLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        btn_minimizeLayout.setVerticalGroup(
            btn_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btn_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_minimizeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 35, 30));

        btn_exit.setBackground(new java.awt.Color(67, 151, 164));
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.setPreferredSize(new java.awt.Dimension(100, 24));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setMaximumSize(new java.awt.Dimension(14, 37));
        jLabel1.setMinimumSize(new java.awt.Dimension(14, 37));
        jLabel1.setPreferredSize(new java.awt.Dimension(14, 37));

        javax.swing.GroupLayout btn_exitLayout = new javax.swing.GroupLayout(btn_exit);
        btn_exit.setLayout(btn_exitLayout);
        btn_exitLayout.setHorizontalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_exitLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        btn_exitLayout.setVerticalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_exitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1346, 0, 35, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(67, 151, 164));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("K O S A N K U");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Navigasi.setBackground(new java.awt.Color(67, 151, 164));
        Navigasi.setMinimumSize(new java.awt.Dimension(212, 830));
        Navigasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        Navigasi.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        Selected.setBackground(new java.awt.Color(255, 255, 255));

        RumahKosst.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        RumahKosst.setForeground(new java.awt.Color(67, 151, 164));
        RumahKosst.setText("Rumah Kost");

        javax.swing.GroupLayout SelectedLayout = new javax.swing.GroupLayout(Selected);
        Selected.setLayout(SelectedLayout);
        SelectedLayout.setHorizontalGroup(
            SelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(SelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SelectedLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RumahKosst, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        SelectedLayout.setVerticalGroup(
            SelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(SelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SelectedLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RumahKosst)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Navigasi.add(Selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 40));

        Kelola.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Kelola.setForeground(new java.awt.Color(255, 255, 255));
        Kelola.setText("Kelola");
        Kelola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kelola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KelolaMouseClicked(evt);
            }
        });
        Navigasi.add(Kelola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 30));

        Client.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Client.setForeground(new java.awt.Color(255, 255, 255));
        Client.setText("Client");
        Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientMouseClicked(evt);
            }
        });
        Navigasi.add(Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 30));

        Statistik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Statistik.setForeground(new java.awt.Color(255, 255, 255));
        Statistik.setText("Laporan");
        Statistik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Statistik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatistikMouseClicked(evt);
            }
        });
        Navigasi.add(Statistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 30));
        Navigasi.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        getContentPane().add(Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 830));

        pnlbody.setBackground(new java.awt.Color(255, 255, 255));
        pnlbody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infokmr.setBackground(new java.awt.Color(255, 255, 255));
        infokmr.setForeground(new java.awt.Color(0, 0, 0));
        infokmr.setFocusable(false);
        infokmr.setPreferredSize(new java.awt.Dimension(800, 794));
        infokmr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form.setBackground(new java.awt.Color(243, 243, 243));

        deskripsi_kmr.setEditable(false);
        deskripsi_kmr.setBackground(new java.awt.Color(243, 243, 243));
        deskripsi_kmr.setColumns(20);
        deskripsi_kmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsi_kmr.setForeground(new java.awt.Color(0, 0, 0));
        deskripsi_kmr.setRows(5);
        jScrollPane2.setViewportView(deskripsi_kmr);

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("ID Kamar: ");

        id_kmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        id_kmr.setForeground(new java.awt.Color(0, 0, 0));

        des_kmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        des_kmr.setForeground(new java.awt.Color(0, 0, 0));
        des_kmr.setText("Deskripsi kamar");

        des_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        des_rmk.setForeground(new java.awt.Color(0, 0, 0));
        des_rmk.setText("Deskripsi rumah kost");

        deskripsi_rmk.setEditable(false);
        deskripsi_rmk.setBackground(new java.awt.Color(243, 243, 243));
        deskripsi_rmk.setColumns(20);
        deskripsi_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsi_rmk.setForeground(new java.awt.Color(0, 0, 0));
        deskripsi_rmk.setRows(5);
        jScrollPane3.setViewportView(deskripsi_rmk);

        harga.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(0, 0, 0));
        harga.setText("Harga sewa :");

        txt_harga.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_harga.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(des_kmr)
                            .addComponent(des_rmk))
                        .addGap(308, 308, 308))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addGroup(formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(harga)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id_kmr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_kmr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(des_kmr, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(des_rmk, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(353, Short.MAX_VALUE))
        );

        infokmr.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        form_client.setBackground(new java.awt.Color(243, 243, 243));

        nama_client.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nama_client.setForeground(new java.awt.Color(0, 0, 0));
        nama_client.setText("Nama Penyewa: ");

        txt_client.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_client.setForeground(new java.awt.Color(0, 0, 0));

        no_hp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        no_hp.setForeground(new java.awt.Color(0, 0, 0));
        no_hp.setText("Nomor HP :");

        txt_nomor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_nomor.setForeground(new java.awt.Color(0, 0, 0));

        pekerjaan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pekerjaan.setForeground(new java.awt.Color(0, 0, 0));
        pekerjaan.setText("Pekerjaan :");

        txt_pekerjaan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_pekerjaan.setForeground(new java.awt.Color(0, 0, 0));

        tglmasuk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tglmasuk.setForeground(new java.awt.Color(0, 0, 0));
        tglmasuk.setText("Tanggal masuk : ");

        txt_tgl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_tgl.setForeground(new java.awt.Color(0, 0, 0));

        tagihan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tagihan.setForeground(new java.awt.Color(0, 0, 0));
        tagihan.setText("Tagihan :");

        txt_tagihan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_tagihan.setForeground(new java.awt.Color(0, 0, 0));

        no_kamar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        no_kamar.setForeground(new java.awt.Color(0, 0, 0));
        no_kamar.setText("Nomor Kamar : ");

        txt_nokmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_nokmr.setForeground(new java.awt.Color(0, 0, 0));

        no_kamar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        no_kamar1.setForeground(new java.awt.Color(0, 0, 0));
        no_kamar1.setText("Alamat :");

        txt_alamat.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout form_clientLayout = new javax.swing.GroupLayout(form_client);
        form_client.setLayout(form_clientLayout);
        form_clientLayout.setHorizontalGroup(
            form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_clientLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(nama_client)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(no_hp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(pekerjaan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(tglmasuk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(tagihan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(no_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nokmr, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(no_kamar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        form_clientLayout.setVerticalGroup(
            form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_clientLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_client, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(form_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(txt_nokmr, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(form_clientLayout.createSequentialGroup()
                        .addComponent(no_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_kamar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        infokmr.add(form_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 640, 220));

        pnlbody.add(infokmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1160, 430));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1170, 360));

        kmrscrl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Kamar");

        txt_rmk.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txt_rmk.setForeground(new java.awt.Color(0, 0, 0));

        btn_kembali.setBackground(new java.awt.Color(255, 255, 255));
        btn_kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/source/img/shape.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Kembali");

        javax.swing.GroupLayout btn_kembaliLayout = new javax.swing.GroupLayout(btn_kembali);
        btn_kembali.setLayout(btn_kembaliLayout);
        btn_kembaliLayout.setHorizontalGroup(
            btn_kembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_kembaliLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        btn_kembaliLayout.setVerticalGroup(
            btn_kembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_kembaliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btn_kembaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(310, 310, 310))
        );

        kmr1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr1.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr1MouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(67, 151, 164));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kamar 1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr1Layout = new javax.swing.GroupLayout(kmr1);
        kmr1.setLayout(kmr1Layout);
        kmr1Layout.setHorizontalGroup(
            kmr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        kmr1Layout.setVerticalGroup(
            kmr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(64, 64, 64)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr2.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr2MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(67, 151, 164));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kamar 2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr2Layout = new javax.swing.GroupLayout(kmr2);
        kmr2.setLayout(kmr2Layout);
        kmr2Layout.setHorizontalGroup(
            kmr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr2Layout.setVerticalGroup(
            kmr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr2Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr3.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr3MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(67, 151, 164));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kamar 3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr3Layout = new javax.swing.GroupLayout(kmr3);
        kmr3.setLayout(kmr3Layout);
        kmr3Layout.setHorizontalGroup(
            kmr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr3Layout.setVerticalGroup(
            kmr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr3Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr4.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr4MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(67, 151, 164));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kamar 4");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr4Layout = new javax.swing.GroupLayout(kmr4);
        kmr4.setLayout(kmr4Layout);
        kmr4Layout.setHorizontalGroup(
            kmr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr4Layout.setVerticalGroup(
            kmr4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr4Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_5.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_5MouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(67, 151, 164));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kamar 5");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_5Layout = new javax.swing.GroupLayout(kmr_5);
        kmr_5.setLayout(kmr_5Layout);
        kmr_5Layout.setHorizontalGroup(
            kmr_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_5Layout.setVerticalGroup(
            kmr_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_5Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_6.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_6MouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(67, 151, 164));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kamar 6");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_6Layout = new javax.swing.GroupLayout(kmr_6);
        kmr_6.setLayout(kmr_6Layout);
        kmr_6Layout.setHorizontalGroup(
            kmr_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_6Layout.setVerticalGroup(
            kmr_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_6Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_7.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_7MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(67, 151, 164));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kamar 7");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_7Layout = new javax.swing.GroupLayout(kmr_7);
        kmr_7.setLayout(kmr_7Layout);
        kmr_7Layout.setHorizontalGroup(
            kmr_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_7Layout.setVerticalGroup(
            kmr_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_7Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_8.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_8MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(67, 151, 164));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kamar 8");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_8Layout = new javax.swing.GroupLayout(kmr_8);
        kmr_8.setLayout(kmr_8Layout);
        kmr_8Layout.setHorizontalGroup(
            kmr_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_8Layout.setVerticalGroup(
            kmr_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_8Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_9.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_9MouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(67, 151, 164));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Kamar 9");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_9Layout = new javax.swing.GroupLayout(kmr_9);
        kmr_9.setLayout(kmr_9Layout);
        kmr_9Layout.setHorizontalGroup(
            kmr_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_9Layout.setVerticalGroup(
            kmr_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_9Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr10.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr10MouseClicked(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(67, 151, 164));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Kamar 10");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr10Layout = new javax.swing.GroupLayout(kmr10);
        kmr10.setLayout(kmr10Layout);
        kmr10Layout.setHorizontalGroup(
            kmr10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr10Layout.setVerticalGroup(
            kmr10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr10Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_11.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_11MouseClicked(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(67, 151, 164));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Kamar 11");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_11Layout = new javax.swing.GroupLayout(kmr_11);
        kmr_11.setLayout(kmr_11Layout);
        kmr_11Layout.setHorizontalGroup(
            kmr_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_11Layout.setVerticalGroup(
            kmr_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_11Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_12.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_12MouseClicked(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(67, 151, 164));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Kamar 12");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_12Layout = new javax.swing.GroupLayout(kmr_12);
        kmr_12.setLayout(kmr_12Layout);
        kmr_12Layout.setHorizontalGroup(
            kmr_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_12Layout.setVerticalGroup(
            kmr_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_12Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_13.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_13MouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(67, 151, 164));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Kamar 13");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_13Layout = new javax.swing.GroupLayout(kmr_13);
        kmr_13.setLayout(kmr_13Layout);
        kmr_13Layout.setHorizontalGroup(
            kmr_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_13Layout.setVerticalGroup(
            kmr_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_13Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_14.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_14MouseClicked(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(67, 151, 164));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Kamar 14");
        jLabel20.setToolTipText("");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_14Layout = new javax.swing.GroupLayout(kmr_14);
        kmr_14.setLayout(kmr_14Layout);
        kmr_14Layout.setHorizontalGroup(
            kmr_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_14Layout.setVerticalGroup(
            kmr_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_14Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_15.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_15MouseClicked(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(67, 151, 164));

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Kamar 15");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_15Layout = new javax.swing.GroupLayout(kmr_15);
        kmr_15.setLayout(kmr_15Layout);
        kmr_15Layout.setHorizontalGroup(
            kmr_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_15Layout.setVerticalGroup(
            kmr_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_15Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_16.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_16MouseClicked(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(67, 151, 164));

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Kamar 16");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_16Layout = new javax.swing.GroupLayout(kmr_16);
        kmr_16.setLayout(kmr_16Layout);
        kmr_16Layout.setHorizontalGroup(
            kmr_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_16Layout.setVerticalGroup(
            kmr_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_16Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_17.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_17MouseClicked(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(67, 151, 164));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Kamar 17");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_17Layout = new javax.swing.GroupLayout(kmr_17);
        kmr_17.setLayout(kmr_17Layout);
        kmr_17Layout.setHorizontalGroup(
            kmr_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_17Layout.setVerticalGroup(
            kmr_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_17Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_18.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_18MouseClicked(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(67, 151, 164));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Kamar 18");
        jLabel24.setToolTipText("");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_18Layout = new javax.swing.GroupLayout(kmr_18);
        kmr_18.setLayout(kmr_18Layout);
        kmr_18Layout.setHorizontalGroup(
            kmr_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_18Layout.setVerticalGroup(
            kmr_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_18Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_19.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_19MouseClicked(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(67, 151, 164));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Kamar 19");
        jLabel25.setToolTipText("");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_19Layout = new javax.swing.GroupLayout(kmr_19);
        kmr_19.setLayout(kmr_19Layout);
        kmr_19Layout.setHorizontalGroup(
            kmr_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_19Layout.setVerticalGroup(
            kmr_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_19Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kmr_20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kmr_20.setPreferredSize(new java.awt.Dimension(230, 140));
        kmr_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmr_20MouseClicked(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(67, 151, 164));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Kamar 20");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        javax.swing.GroupLayout kmr_20Layout = new javax.swing.GroupLayout(kmr_20);
        kmr_20.setLayout(kmr_20Layout);
        kmr_20Layout.setHorizontalGroup(
            kmr_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kmr_20Layout.setVerticalGroup(
            kmr_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kmr_20Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout kmrscrlLayout = new javax.swing.GroupLayout(kmrscrl);
        kmrscrl.setLayout(kmrscrlLayout);
        kmrscrlLayout.setHorizontalGroup(
            kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(txt_rmk, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(kmr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(kmr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(kmr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kmr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(kmr_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(kmr_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(kmr_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kmr_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(kmr_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(kmr10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(kmr_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kmr_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(kmr_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(kmr_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(kmr_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kmr_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(kmr_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(kmr_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(kmr_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kmr_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kmrscrlLayout.setVerticalGroup(
            kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kmrscrlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_rmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kmrscrlLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(kmr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kmr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kmr_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kmr_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kmr_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(kmrscrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kmr_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmr_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setViewportView(kmrscrl);

        pnlbody.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        getContentPane().add(pnlbody, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 40, 1155, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setExtendedState(RumahKost.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void btn_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseEntered
        btn_minimize.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_minimizeMouseEntered

    private void btn_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseExited
        btn_minimize.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_minimizeMouseExited

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_exitMouseExited

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void kmr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr1MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,rumah_kost.deskripsi_rmk "
                    + "FROM kamar JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost "
                    + "WHERE kamar.nomor_kamar='1' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,client.*,rumah_kost.* FROM kamar INNER JOIN client ON client.id_kamar=kamar.id_kamar INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar=1 AND rumah_kost.id_rumahkost=1";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                //Data Kamar
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
            }
            while(res1.next()){
//Data Client
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_kmr1MouseClicked

    private void btn_kembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseExited
        btn_kembali.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_kembaliMouseExited

    private void btn_kembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseEntered
        btn_kembali.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_btn_kembaliMouseEntered

    private void btn_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseClicked
        this.setVisible(false);
        new RumahKost().setVisible(true);
    }//GEN-LAST:event_btn_kembaliMouseClicked

    private void kmr2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr2MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='2' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='2'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr2MouseClicked

    private void kmr3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr3MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='3' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='3'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) 
            {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
            }
            while (res1.next()){
                
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_kmr3MouseClicked

    private void kmr4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr4MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='4' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='4'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr4MouseClicked

    private void kmr_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_5MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='5' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='5'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_5MouseClicked

    private void kmr_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_6MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='6' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='6'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_6MouseClicked

    private void kmr_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_8MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='8' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='8'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_8MouseClicked

    private void kmr_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_7MouseClicked
       clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='7' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='7'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_7MouseClicked

    private void kmr_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_9MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='9' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='9'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_9MouseClicked

    private void kmr10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr10MouseClicked
       clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='10' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='10'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr10MouseClicked

    private void kmr_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_11MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='11' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='11'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_11MouseClicked

    private void kmr_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_12MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='12' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='12'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_12MouseClicked

    private void kmr_13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_13MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='13' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='13'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_13MouseClicked

    private void kmr_14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_14MouseClicked
       clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='14' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='14'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_14MouseClicked

    private void kmr_15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_15MouseClicked
       clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='15' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='15'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_15MouseClicked

    private void kmr_16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_16MouseClicked
       clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='16' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='16'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_16MouseClicked

    private void kmr_17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_17MouseClicked
       clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='17' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='17'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_17MouseClicked

    private void kmr_18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_18MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='18' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='18'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_18MouseClicked

    private void kmr_19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_19MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='19' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='19'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_19MouseClicked

    private void kmr_20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmr_20MouseClicked
        clear();
        try {
            String sql = "SELECT kamar.*,rumah_kost.nama_rumahkost,"
                    + "rumah_kost.deskripsi_rmk FROM kamar JOIN rumah_kost "
                    + "ON rumah_kost.id_rumahkost=kamar.id_rumahkost WHERE kamar.nomor_kamar='20' AND kamar.id_rumahkost='1'";
            String sql1 = "SELECT kamar.*,\n" +
                            "client.*,\n" +
                            "rumah_kost.* \n" +
                            "FROM kamar \n" +
                            "INNER JOIN client ON client.id_kamar = kamar.id_kamar \n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost \n" +
                            "WHERE kamar.nomor_kamar='20'AND rumah_kost.id_rumahkost='1'";
            Connection conn= (Connection)Koneksi.koneksiDB();
            java.sql.Statement stm =  conn.createStatement();
            java.sql.Statement stm1 =  conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res1 = stm1.executeQuery(sql1);
            while (res.next()) {
                id_kmr.setText(res.getString("id_kamar"));
                deskripsi_kmr.setText(res.getString("deskripsi_kmr"));
                deskripsi_rmk.setText(res.getString("deskripsi_rmk"));
                txt_harga.setText(res.getString("harga"));  
                }
            while(res1.next()){
                txt_client.setText(res1.getString("nama_client"));
                txt_nomor.setText(res1.getString("nohp_client"));
                txt_pekerjaan.setText(res1.getString("pekerjaan"));
                txt_tgl.setText(res1.getString("tanggal_masuk"));
                txt_tagihan.setText(res1.getString("harga"));
                txt_nokmr.setText(res1.getString("nomor_kamar"));
                txt_alamat.setText(res1.getString("Alamat"));
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kmr_20MouseClicked

    private void ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientMouseClicked
        this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_ClientMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void KelolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelolaMouseClicked
        this.setVisible(false);
        new Kelola().setVisible(true);
    }//GEN-LAST:event_KelolaMouseClicked

    private void StatistikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatistikMouseClicked
        this.setVisible(false);
        new Statistik().setVisible(true);
    }//GEN-LAST:event_StatistikMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            UIManager.setLookAndFeel(new FlatDarculaLaf() {
            });
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kamarrmk1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Client;
    private javax.swing.JLabel Kelola;
    private javax.swing.JPanel Navigasi;
    private javax.swing.JLabel RumahKosst;
    private javax.swing.JPanel Selected;
    private javax.swing.JLabel Statistik;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_kembali;
    private javax.swing.JPanel btn_minimize;
    private javax.swing.JLabel des_kmr;
    private javax.swing.JLabel des_rmk;
    private javax.swing.JTextArea deskripsi_kmr;
    private javax.swing.JTextArea deskripsi_rmk;
    private javax.swing.JPanel form;
    private javax.swing.JPanel form_client;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id_kmr;
    private javax.swing.JPanel infokmr;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel kmr1;
    private javax.swing.JPanel kmr10;
    private javax.swing.JPanel kmr2;
    private javax.swing.JPanel kmr3;
    private javax.swing.JPanel kmr4;
    private javax.swing.JPanel kmr_11;
    private javax.swing.JPanel kmr_12;
    private javax.swing.JPanel kmr_13;
    private javax.swing.JPanel kmr_14;
    private javax.swing.JPanel kmr_15;
    private javax.swing.JPanel kmr_16;
    private javax.swing.JPanel kmr_17;
    private javax.swing.JPanel kmr_18;
    private javax.swing.JPanel kmr_19;
    private javax.swing.JPanel kmr_20;
    private javax.swing.JPanel kmr_5;
    private javax.swing.JPanel kmr_6;
    private javax.swing.JPanel kmr_7;
    private javax.swing.JPanel kmr_8;
    private javax.swing.JPanel kmr_9;
    private javax.swing.JPanel kmrscrl;
    private com.source.button.logout logout1;
    private javax.swing.JLabel nama_client;
    private javax.swing.JLabel no_hp;
    private javax.swing.JLabel no_kamar;
    private javax.swing.JLabel no_kamar1;
    private javax.swing.JLabel pekerjaan;
    private javax.swing.JPanel pnlbody;
    private javax.swing.JLabel tagihan;
    private javax.swing.JLabel tglmasuk;
    private javax.swing.JLabel txt_alamat;
    private javax.swing.JLabel txt_client;
    private javax.swing.JLabel txt_harga;
    private javax.swing.JLabel txt_nokmr;
    private javax.swing.JLabel txt_nomor;
    private javax.swing.JLabel txt_pekerjaan;
    private javax.swing.JLabel txt_rmk;
    private javax.swing.JLabel txt_tagihan;
    private javax.swing.JLabel txt_tgl;
    // End of variables declaration//GEN-END:variables
}
