
package com.main;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatFileChooserUI;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.PreparedStatement;

public class RumahKost extends javax.swing.JFrame {
    int xMouse,yMouse;
    public RumahKost() {
        initComponents();
        rmk1();
        rmk2();
        rmk3();
        rmk4();
    }
    
private void clear(){
    id.setText("");
    almt.setText("");
    sisakmrr.setText("");
    deskripsi.setText("");
    edit_idrmk.setText("");
}
   
    
    
private void rmk1(){
    try {
            
            String sql = "select nama_rumahkost from rumah_kost where id_rumahkost='1'";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()){
              txt_namarmk.setText(res.getString("nama_rumahkost"));
            }
        }
        catch (Exception e) {
        }
}
private void rmk2(){
    try {
            
            String sql = "select nama_rumahkost from rumah_kost where id_rumahkost='2'";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()){
              txt_namarmk2.setText(res.getString("nama_rumahkost"));
            }
        }
        catch (Exception e) {
        }
}

private void rmk3(){
    try {
            
            String sql = "select nama_rumahkost from rumah_kost where id_rumahkost='3'";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()){
              txt_namarmk3.setText(res.getString("nama_rumahkost"));
            }
        }
        catch (Exception e) {
        }
}

private void rmk4(){
    try {
            
            String sql = "select nama_rumahkost from rumah_kost where id_rumahkost='4'";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()){
              txt_namarmk4.setText(res.getString("nama_rumahkost"));
            }
        }
        catch (Exception e) {
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        formscroll = new javax.swing.JPanel();
        rmk1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txt_namarmk = new javax.swing.JLabel();
        fotormk = new javax.swing.JLabel();
        rmk2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txt_namarmk2 = new javax.swing.JLabel();
        fotormk1 = new javax.swing.JLabel();
        rmk3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txt_namarmk3 = new javax.swing.JLabel();
        fotormk2 = new javax.swing.JLabel();
        rmk4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txt_namarmk4 = new javax.swing.JLabel();
        fotormk3 = new javax.swing.JLabel();
        pnlrmk = new javax.swing.JPanel();
        rmk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        almt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        sisa = new javax.swing.JLabel();
        sisakmrr = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        deskripsi = new javax.swing.JTextArea();
        sisa1 = new javax.swing.JLabel();
        formEdit = new javax.swing.JPanel();
        idrmmk = new javax.swing.JLabel();
        edit_idrmk = new javax.swing.JTextField();
        nm = new javax.swing.JLabel();
        edit_nmrmk = new javax.swing.JTextField();
        nm1 = new javax.swing.JLabel();
        edit_alamtrrmk = new javax.swing.JTextField();
        nm2 = new javax.swing.JLabel();
        des_rmk = new javax.swing.JScrollPane();
        deskripsi_rmk = new javax.swing.JTextArea();
        btn_simpan = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_morekmr1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel2.setLabelFor(jPanel3);
        jLabel2.setText("K O S A N K U");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Navigasi.setBackground(new java.awt.Color(67, 151, 164));
        Navigasi.setMinimumSize(new java.awt.Dimension(212, 846));
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
        RumahKosst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RumahKosst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RumahKosstMouseClicked(evt);
            }
        });

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

        jPanel1.add(Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, 846));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        formscroll.setBackground(new java.awt.Color(255, 255, 255));
        formscroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formscrollMouseClicked(evt);
            }
        });

        rmk1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rmk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rmk1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rmk1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rmk1MouseExited(evt);
            }
        });
        rmk1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(67, 151, 164));
        jPanel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        txt_namarmk.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_namarmk.setForeground(new java.awt.Color(255, 255, 255));
        txt_namarmk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_namarmk.setText("No data");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_namarmk, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_namarmk, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        rmk1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 186, 270, -1));

        fotormk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotormk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/source/img/Home Apps.png"))); // NOI18N
        fotormk.setMaximumSize(new java.awt.Dimension(271, 190));
        fotormk.setMinimumSize(new java.awt.Dimension(271, 190));
        fotormk.setPreferredSize(new java.awt.Dimension(271, 190));
        rmk1.add(fotormk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        rmk2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rmk2.setPreferredSize(new java.awt.Dimension(291, 243));
        rmk2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rmk2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rmk2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rmk2MouseExited(evt);
            }
        });
        rmk2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(67, 151, 164));
        jPanel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        txt_namarmk2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_namarmk2.setForeground(new java.awt.Color(255, 255, 255));
        txt_namarmk2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_namarmk2.setText("No data");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_namarmk2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_namarmk2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        rmk2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, -1, -1));

        fotormk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotormk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/source/img/Home Apps.png"))); // NOI18N
        rmk2.add(fotormk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 190));

        rmk3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rmk3.setPreferredSize(new java.awt.Dimension(291, 243));
        rmk3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rmk3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rmk3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rmk3MouseExited(evt);
            }
        });
        rmk3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(67, 151, 164));
        jPanel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        txt_namarmk3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_namarmk3.setForeground(new java.awt.Color(255, 255, 255));
        txt_namarmk3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_namarmk3.setText("No data");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_namarmk3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_namarmk3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        rmk3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, -1, -1));

        fotormk2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotormk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/source/img/Home Apps.png"))); // NOI18N
        rmk3.add(fotormk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 190));

        rmk4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rmk4.setPreferredSize(new java.awt.Dimension(291, 243));
        rmk4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rmk4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rmk4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rmk4MouseExited(evt);
            }
        });
        rmk4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(67, 151, 164));
        jPanel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        txt_namarmk4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txt_namarmk4.setForeground(new java.awt.Color(255, 255, 255));
        txt_namarmk4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_namarmk4.setText("No data");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_namarmk4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txt_namarmk4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        rmk4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 185, -1, -1));

        fotormk3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotormk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/source/img/Home Apps.png"))); // NOI18N
        rmk4.add(fotormk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 190));

        javax.swing.GroupLayout formscrollLayout = new javax.swing.GroupLayout(formscroll);
        formscroll.setLayout(formscrollLayout);
        formscrollLayout.setHorizontalGroup(
            formscrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formscrollLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rmk1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rmk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rmk3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(rmk4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(933, Short.MAX_VALUE))
        );
        formscrollLayout.setVerticalGroup(
            formscrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formscrollLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formscrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rmk3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rmk2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rmk1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rmk4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(formscroll);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 1130, 270));

        pnlrmk.setBackground(new java.awt.Color(67, 151, 164));
        pnlrmk.setForeground(new java.awt.Color(204, 204, 204));

        rmk.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        rmk.setForeground(new java.awt.Color(255, 255, 255));
        rmk.setText("Rumah Kost");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat :");

        almt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        almt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id rumah :");

        id.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));

        sisa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sisa.setForeground(new java.awt.Color(255, 255, 255));
        sisa.setText("Sisa kamar:");

        sisakmrr.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sisakmrr.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        deskripsi.setEditable(false);
        deskripsi.setBackground(new java.awt.Color(67, 151, 164));
        deskripsi.setColumns(20);
        deskripsi.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        deskripsi.setForeground(new java.awt.Color(255, 255, 255));
        deskripsi.setRows(10);
        deskripsi.setTabSize(10);
        deskripsi.setBorder(null);
        jScrollPane3.setViewportView(deskripsi);

        sisa1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sisa1.setForeground(new java.awt.Color(255, 255, 255));
        sisa1.setText("Edit data: ");

        formEdit.setBackground(new java.awt.Color(255, 255, 255));
        formEdit.setPreferredSize(new java.awt.Dimension(464, 353));

        idrmmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idrmmk.setForeground(new java.awt.Color(0, 0, 0));
        idrmmk.setText("ID rumah:");

        edit_idrmk.setEditable(false);
        edit_idrmk.setBackground(new java.awt.Color(255, 255, 255));
        edit_idrmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        edit_idrmk.setForeground(new java.awt.Color(0, 0, 0));
        edit_idrmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_idrmkActionPerformed(evt);
            }
        });

        nm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nm.setForeground(new java.awt.Color(0, 0, 0));
        nm.setText("Nama :");

        edit_nmrmk.setBackground(new java.awt.Color(255, 255, 255));
        edit_nmrmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        edit_nmrmk.setForeground(new java.awt.Color(0, 0, 0));

        nm1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nm1.setForeground(new java.awt.Color(0, 0, 0));
        nm1.setText("Alamat: ");

        edit_alamtrrmk.setBackground(new java.awt.Color(255, 255, 255));
        edit_alamtrrmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        edit_alamtrrmk.setForeground(new java.awt.Color(0, 0, 0));

        nm2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nm2.setForeground(new java.awt.Color(0, 0, 0));
        nm2.setText("Deskripsi:");

        des_rmk.setBackground(new java.awt.Color(255, 255, 255));
        des_rmk.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        des_rmk.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        des_rmk.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        deskripsi_rmk.setBackground(new java.awt.Color(255, 255, 255));
        deskripsi_rmk.setColumns(20);
        deskripsi_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsi_rmk.setForeground(new java.awt.Color(0, 0, 0));
        deskripsi_rmk.setRows(5);
        deskripsi_rmk.setText("\n");
        deskripsi_rmk.setBorder(null);
        des_rmk.setViewportView(deskripsi_rmk);

        btn_simpan.setBackground(new java.awt.Color(67, 151, 164));
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_simpanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_simpanMouseExited(evt);
            }
        });
        btn_simpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SIMPAN");
        btn_simpan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        javax.swing.GroupLayout formEditLayout = new javax.swing.GroupLayout(formEdit);
        formEdit.setLayout(formEditLayout);
        formEditLayout.setHorizontalGroup(
            formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm1)
                    .addComponent(nm2)
                    .addComponent(idrmmk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(des_rmk, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(edit_alamtrrmk)
                    .addComponent(edit_nmrmk)
                    .addComponent(edit_idrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formEditLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        formEditLayout.setVerticalGroup(
            formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idrmmk)
                    .addComponent(edit_idrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm)
                    .addComponent(edit_nmrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm1)
                    .addComponent(edit_alamtrrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(formEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nm2)
                    .addComponent(des_rmk, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        btn_morekmr1.setBackground(new java.awt.Color(255, 255, 255));
        btn_morekmr1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_morekmr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_morekmr1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_morekmr1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_morekmr1MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 151, 164));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lihat Kamar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_morekmr1Layout = new javax.swing.GroupLayout(btn_morekmr1);
        btn_morekmr1.setLayout(btn_morekmr1Layout);
        btn_morekmr1Layout.setHorizontalGroup(
            btn_morekmr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_morekmr1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_morekmr1Layout.setVerticalGroup(
            btn_morekmr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlrmkLayout = new javax.swing.GroupLayout(pnlrmk);
        pnlrmk.setLayout(pnlrmkLayout);
        pnlrmkLayout.setHorizontalGroup(
            pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlrmkLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rmk)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlrmkLayout.createSequentialGroup()
                        .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlrmkLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(sisa)
                                .addGap(6, 6, 6)
                                .addComponent(sisakmrr, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlrmkLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addComponent(btn_morekmr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sisa1)
                    .addComponent(formEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnlrmkLayout.setVerticalGroup(
            pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlrmkLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlrmkLayout.createSequentialGroup()
                        .addComponent(sisa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlrmkLayout.createSequentialGroup()
                        .addComponent(rmk)
                        .addGap(3, 3, 3)
                        .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlrmkLayout.createSequentialGroup()
                                .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sisa)
                                    .addComponent(sisakmrr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(pnlrmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_morekmr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1.add(pnlrmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 1130, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1381, 830));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setExtendedState(RumahKost.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void btn_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseEntered
       btn_minimize.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_minimizeMouseEntered

    private void btn_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseExited
        btn_minimize.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_minimizeMouseExited

    private void formscrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formscrollMouseClicked
        
    }//GEN-LAST:event_formscrollMouseClicked

    private void rmk2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk2MouseEntered
        rmk2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_rmk2MouseEntered

    private void rmk2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk2MouseExited
         rmk2.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_rmk2MouseExited

    private void rmk3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk3MouseEntered
        rmk3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_rmk3MouseEntered

    private void rmk3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk3MouseExited
        rmk3.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_rmk3MouseExited

    private void rmk4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk4MouseEntered
      rmk4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_rmk4MouseEntered

    private void rmk4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk4MouseExited
        rmk4.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_rmk4MouseExited

    private void rmk2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk2MouseClicked
       clear();
        try {
            String sql = "SELECT * FROM rumah_kost where id_rumahkost='2'";
            String sql1 = "SELECT COUNT(client.id_kamar)\n" +
            "FROM client\n" +
            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
            "WHERE rumah_kost.id_rumahkost=2;";
            String sql2 = "SELECT COUNT(nomor_kamar) FROM kamar\n" +
                            "WHERE id_rumahkost=2;";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            Statement stm1 = con.createStatement();
            Statement stm2 = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            ResultSet res1= stm1.executeQuery(sql1);
            ResultSet res2= stm2.executeQuery(sql2);
            while (res.next()){
                rmk.setText(res.getString("nama_rumahkost"));
                id.setText(res.getString("id_rumahkost"));
                almt.setText(res.getString("alamat_rumahkost"));
                deskripsi.setText(res.getString("deskripsi_rmk"));
                edit_idrmk.setText(res.getString("id_rumahkost"));
            }

            if(res1.next()&&res2.next()){
                String total_client_dikamar = res1.getString(1);
                String total_kamar = res2.getString(1);
                int a = Integer.parseInt(total_client_dikamar);
                int b = Integer.parseInt(total_kamar);
                b = b - a;

                sisakmrr.setText(String.valueOf(b));
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_rmk2MouseClicked

    private void rmk3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk3MouseClicked
       clear();
        try {
            String sql = "SELECT * FROM rumah_kost where id_rumahkost='3'";
            String sql1 = "SELECT COUNT(client.id_kamar)\n" +
            "FROM client\n" +
            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
            "WHERE rumah_kost.id_rumahkost=3";
            String sql2 = "SELECT COUNT(nomor_kamar) FROM kamar\n" +
                            "WHERE id_rumahkost=3";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            Statement stm1 = con.createStatement();
            Statement stm2 = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            ResultSet res1= stm1.executeQuery(sql1);
            ResultSet res2= stm2.executeQuery(sql2);
            while (res.next()){
                rmk.setText(res.getString("nama_rumahkost"));
                id.setText(res.getString("id_rumahkost"));
                almt.setText(res.getString("alamat_rumahkost"));
                deskripsi.setText(res.getString("deskripsi_rmk"));
                edit_idrmk.setText(res.getString("id_rumahkost"));
            }

            if(res1.next()&&res2.next()){
                String total_client_dikamar = res1.getString(1);
                String total_kamar = res2.getString(1);
                int a = Integer.parseInt(total_client_dikamar);
                int b = Integer.parseInt(total_kamar);
                b = b - a;

                sisakmrr.setText(String.valueOf(b));
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_rmk3MouseClicked

    private void rmk4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk4MouseClicked
       clear();
        try {
            String sql = "SELECT * FROM rumah_kost where id_rumahkost='4'";
            String sql1 = "SELECT COUNT(client.id_kamar)\n" +
            "FROM client\n" +
            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
            "WHERE rumah_kost.id_rumahkost=4";
            String sql2 = "SELECT COUNT(nomor_kamar) FROM kamar\n" +
                            "WHERE id_rumahkost=4";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            Statement stm1 = con.createStatement();
            Statement stm2 = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            ResultSet res1= stm1.executeQuery(sql1);
            ResultSet res2= stm2.executeQuery(sql2);
            while (res.next()){
                rmk.setText(res.getString("nama_rumahkost"));
                id.setText(res.getString("id_rumahkost"));
                almt.setText(res.getString("alamat_rumahkost"));
                deskripsi.setText(res.getString("deskripsi_rmk"));
                edit_idrmk.setText(res.getString("id_rumahkost"));
            }

            if(res1.next()&&res2.next()){
                String total_client_dikamar = res1.getString(1);
                String total_kamar = res2.getString(1);
                int a = Integer.parseInt(total_client_dikamar);
                int b = Integer.parseInt(total_kamar);
                b = b - a;

                sisakmrr.setText(String.valueOf(b));
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_rmk4MouseClicked

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

    private void edit_idrmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_idrmkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_idrmkActionPerformed

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked

        try {
            String sql = "UPDATE rumah_kost SET nama_rumahkost='"+edit_nmrmk.getText()+"',"
                    + "alamat_rumahkost='"+edit_alamtrrmk.getText()+"',deskripsi_rmk='"+deskripsi_rmk.getText()+"'"
                    +  "WHERE id_rumahkost='"+id.getText()+"'";
            Connection con = (Connection)Koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil di edit");
            rmk1();
            rmk2();
            rmk3();
            rmk4();
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengedit"+e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void btn_simpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseEntered
        btn_simpan.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_simpanMouseEntered

    private void btn_simpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseExited
        btn_simpan.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_simpanMouseExited

    private void rmk1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk1MouseExited
        rmk1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_rmk1MouseExited

    private void rmk1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk1MouseEntered
        rmk1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_rmk1MouseEntered

    private void rmk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rmk1MouseClicked
        clear();
        try {
            String sql = "SELECT * FROM rumah_kost where id_rumahkost='1'";
            String sql1 = "SELECT COUNT(client.id_kamar)\n" +
            "FROM client\n" +
            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
            "WHERE rumah_kost.id_rumahkost=1;";
            String sql2 = "SELECT COUNT(nomor_kamar) FROM kamar\n" +
                            "WHERE id_rumahkost=1;";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            Statement stm1 = con.createStatement();
            Statement stm2 = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            ResultSet res1= stm1.executeQuery(sql1);
            ResultSet res2= stm2.executeQuery(sql2);
            while (res.next()){
                rmk.setText(res.getString("nama_rumahkost"));
                id.setText(res.getString("id_rumahkost"));
                edit_idrmk.setText(res.getString("id_rumahkost"));
                almt.setText(res.getString("alamat_rumahkost"));
                deskripsi.setText(res.getString("deskripsi_rmk"));
            }

            if(res1.next()&&res2.next()){
                String total_client_dikamar = res1.getString(1);
                String total_kamar = res2.getString(1);
                int a = Integer.parseInt(total_client_dikamar);
                int b = Integer.parseInt(total_kamar);
                b = b - a;

                sisakmrr.setText(String.valueOf(b));
            }
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_rmk1MouseClicked

    private void btn_morekmr1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_morekmr1MouseExited
        btn_morekmr1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_morekmr1MouseExited

    private void btn_morekmr1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_morekmr1MouseEntered
        btn_morekmr1.setBackground(new Color(222,222,222));
    }//GEN-LAST:event_btn_morekmr1MouseEntered

    private void btn_morekmr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_morekmr1MouseClicked
        
        switch (id.getText()){
            case "1":
                this.setVisible(false);
                new kamarrmk1().setVisible(true);
                break;
            case "2":
                this.setVisible(false);
                new kamarrmk2().setVisible(true);
                break;
            case "3":
                this.setVisible(false);
                new kamarrmk3().setVisible(true);
                break;
            case "4":
                this.setVisible(false);
                new kamarrmk4().setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilih rumah kost terlebih dahulu");
        }
        
    }//GEN-LAST:event_btn_morekmr1MouseClicked

    private void RumahKosstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RumahKosstMouseClicked
        this.setVisible(false);
        new RumahKost().setVisible(true);
    }//GEN-LAST:event_RumahKosstMouseClicked

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
            UIManager.setLookAndFeel(new FlatDarkLaf() {
            });
        } catch (Exception e) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RumahKost().setVisible(true);
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
    private javax.swing.JLabel almt;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_minimize;
    private javax.swing.JPanel btn_morekmr1;
    private javax.swing.JPanel btn_simpan;
    private javax.swing.JScrollPane des_rmk;
    private javax.swing.JTextArea deskripsi;
    private javax.swing.JTextArea deskripsi_rmk;
    private javax.swing.JTextField edit_alamtrrmk;
    private javax.swing.JTextField edit_idrmk;
    private javax.swing.JTextField edit_nmrmk;
    private javax.swing.JPanel formEdit;
    private javax.swing.JPanel formscroll;
    private javax.swing.JLabel fotormk;
    private javax.swing.JLabel fotormk1;
    private javax.swing.JLabel fotormk2;
    private javax.swing.JLabel fotormk3;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idrmmk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private com.source.button.logout logout1;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel nm1;
    private javax.swing.JLabel nm2;
    private javax.swing.JPanel pnlrmk;
    private javax.swing.JLabel rmk;
    private javax.swing.JPanel rmk1;
    private javax.swing.JPanel rmk2;
    private javax.swing.JPanel rmk3;
    private javax.swing.JPanel rmk4;
    private javax.swing.JLabel sisa;
    private javax.swing.JLabel sisa1;
    private javax.swing.JLabel sisakmrr;
    private javax.swing.JLabel txt_namarmk;
    private javax.swing.JLabel txt_namarmk2;
    private javax.swing.JLabel txt_namarmk3;
    private javax.swing.JLabel txt_namarmk4;
    // End of variables declaration//GEN-END:variables
}
