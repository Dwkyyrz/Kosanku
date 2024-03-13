
package com.main;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kelola extends javax.swing.JFrame {
int xMouse,yMouse;
    public Kelola() {
        initComponents();
        resetautoincrement();
        loadRMKCB();
        
        
    }
   
    
    private void loadRMKCB(){
        try {
            String sql = "SELECT DISTINCT nama_rumahkost FROM rumah_kost";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Pilihan_rmk.addItem(rs.getString("nama_rumahkost"));
                LoadRMK_Kamar.addItem(rs.getString("nama_rumahkost"));
                LoadRMK_CLient.addItem(rs.getString("nama_rumahkost"));
                LoadRMK_Pemasukan.addItem(rs.getString("nama_rumahkost"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
        } 
        catch (Exception e) {
        }
    }
    
    private void pemasukan(){
        try {
         String sql2 = "ALTER TABLE pemasukan AUTO_INCREMENT=1";
         String sql = "INSERT INTO pemasukan \n" +
                        "VALUES (null,'"+IDclientttt.getText()+"','"+Nominal.getText()+"','"+tanggall_pemasukan.getText()+"')";
         
         Connection con=(Connection)Koneksi.koneksiDB();
         PreparedStatement pst = con.prepareStatement(sql2);
         PreparedStatement pst1 = con.prepareStatement(sql);
         pst.execute();
         pst1.execute();
         JOptionPane.showMessageDialog(null, "Data Pemasukan berhasil ditambah");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void hpspemasukan(){
        try {
            String sql = "DELETE FROM pemasukan WHERE id_pemasukan='"+idpemasukan.getText()+"'";
            String sql1 = "ALTER TABLE pemasukan AUTO_INCREMENT=1";
            Connection con=(Connection)Koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst.execute();
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Penghapusan Data Berhasil");
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    
    
    private void tmbhclient(){
        try {
         String sql2 = "ALTER TABLE client AUTO_INCREMENT=1";
         String sql = "INSERT INTO client \n" +
                        "VALUES (null,'"+idkmrrclient.getText()+"','"+Namaclnt.getText()+"','"
                     + Nohp.getText()+"','"+pekerjaan.getText()+"','"+alamat.getText()+"','"
                     + tglmasuk.getText()+"',(tanggal_masuk+INTERVAL 1 MONTH),datediff(tanggal_bayar,CURRENT_DATE))";
         
         Connection con=(Connection)Koneksi.koneksiDB();
         PreparedStatement pst = con.prepareStatement(sql2);
         PreparedStatement pst1 = con.prepareStatement(sql);
         pst.execute();
         pst1.execute();
         JOptionPane.showMessageDialog(null, "Data Client berhasil ditambah");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void hpsclnt(){
        try {
            String sql = "DELETE FROM client WHERE id_client='"+idclient.getText()+"'";
            String sql1 = "ALTER TABLE client AUTO_INCREMENT=1";
            Connection con=(Connection)Koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst.execute();
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Penghapusan Data Berhasil");
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    
    
    private void tmbhkmr(){
        try {
         String sql = "INSERT INTO kamar VALUES (null,'"+Id_rmk_kmr.getText()+"','"
                 +nomorkamar.getText()+"','"+deskripsi_kmr.getText()+"','"+hargakmr.getText()+"')";
         String sql2 = "ALTER TABLE kamar AUTO_INCREMENT=1";
         Connection con=(Connection)Koneksi.koneksiDB();
         PreparedStatement pst = con.prepareStatement(sql);
         PreparedStatement pst1 = con.prepareStatement(sql2);
         pst.execute();
         pst1.execute();
         JOptionPane.showMessageDialog(null, "Data Kamar berhasil ditambah");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void hpskmr(){
        try {
            String sql = "DELETE FROM kamar WHERE id_kamar='"+id_kmr.getText()+"'";
            String sql1 = "ALTER TABLE kamar AUTO_INCREMENT=1";
            Connection con=(Connection)Koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst.execute();
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Penghapusan Data Berhasil");
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }
    
    private void clear(){
        nama_rmk.setText("");
        alamat_rmk.setText("");
        id_pemilik_rmk.setText("");
        deskripsi_rmk.setText("");
    }
    
    private void tmbhrumahkost(){
        try {
            String sql1 = "ALTER TABLE rumah_kost AUTO_INCREMENT=1";
            String sql = "INSERT INTO rumah_kost VALUES (null,'"+nama_rmk.getText()+"','"+alamat_rmk.getText()+"','"
                    +id_pemilik_rmk.getText()+"','"+deskripsi_rmk.getText()+"')";
            Connection con=(Connection)Koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst.execute();
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data rumah kost Berhasil");
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }
 
    
    private void resetautoincrement(){
        try {
            String sql1 = "ALTER TABLE profil AUTO_INCREMENT=1";
            String sql2 = "ALTER TABLE rumah_kost AUTO_INCREMENT=1";
            String sql3 = "ALTER TABLE kamar AUTO_INCREMENT=1";
            String sql4 = "ALTER TABLE client AUTO_INCREMENT=1";
            String sql5 = "ALTER TABLE pemasukan AUTO_INCREMENT=1";
            String sql6 = "ALTER TABLE pengeluaran AUTO_INCREMENT=1";
            
            Connection con = (Connection)Koneksi.koneksiDB();
            PreparedStatement pst1 = con.prepareStatement(sql1);
            PreparedStatement pst2 = con.prepareStatement(sql2);
            PreparedStatement pst3 = con.prepareStatement(sql3);
            PreparedStatement pst4 = con.prepareStatement(sql4);
            PreparedStatement pst5 = con.prepareStatement(sql5);
            PreparedStatement pst6 = con.prepareStatement(sql6);
            pst1.execute();
            pst2.execute();
            pst3.execute();
            pst4.execute();
            pst5.execute();
            pst6.execute();
            
            
        } 
        catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        btn_minimize = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Navigasi = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        RumahKosst = new javax.swing.JLabel();
        Client = new javax.swing.JLabel();
        Selected = new javax.swing.JPanel();
        Kelola = new javax.swing.JLabel();
        logout1 = new com.source.button.logout();
        Statistik = new javax.swing.JLabel();
        RumahKost1 = new javax.swing.JPanel();
        RUMAHKOSST = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tmbh_rmk = new javax.swing.JPanel();
        namarmk1 = new javax.swing.JLabel();
        namarmk = new javax.swing.JLabel();
        nama_rmk = new javax.swing.JTextField();
        alamatrmk = new javax.swing.JLabel();
        alamat_rmk = new javax.swing.JTextField();
        deskripsirmk = new javax.swing.JLabel();
        id_pemilik_rmk = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        deskripsi_rmk = new javax.swing.JTextArea();
        deskripsirmk2 = new javax.swing.JLabel();
        hapus_rmk = new javax.swing.JPanel();
        namarmk2 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Pilihan_rmk = new javax.swing.JComboBox<>();
        KAMARKOSSS = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tmbh_kmr = new javax.swing.JPanel();
        tmbhdatakmr = new javax.swing.JLabel();
        idrmk = new javax.swing.JLabel();
        Id_rmk_kmr = new javax.swing.JTextField();
        nomor = new javax.swing.JLabel();
        nomorkamar = new javax.swing.JTextField();
        deskripsikmr = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        deskripsi_kmr = new javax.swing.JTextArea();
        harga = new javax.swing.JLabel();
        hargakmr = new javax.swing.JTextField();
        btn_simpan1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_clear2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        LoadRMK_Kamar = new javax.swing.JComboBox<>();
        hapus_kmr = new javax.swing.JPanel();
        namarmk5 = new javax.swing.JLabel();
        deskripsirmk5 = new javax.swing.JLabel();
        id_kmr = new javax.swing.JTextField();
        btn_hapus1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_clear3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        CLIENTTTT = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        tmbh_CLIIENT = new javax.swing.JPanel();
        tmbhdatakmr1 = new javax.swing.JLabel();
        idkmrrrr = new javax.swing.JLabel();
        idkmrrclient = new javax.swing.JTextField();
        namaa = new javax.swing.JLabel();
        Namaclnt = new javax.swing.JTextField();
        NoHP = new javax.swing.JLabel();
        Nohp = new javax.swing.JTextField();
        pkrjn = new javax.swing.JLabel();
        pekerjaan = new javax.swing.JTextField();
        almt = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        btn_simpan2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btn_clear4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        tglmasuk = new javax.swing.JTextField();
        LoadRMK_CLient = new javax.swing.JComboBox<>();
        LoadKamar = new javax.swing.JComboBox<>();
        hapus_CLIENT = new javax.swing.JPanel();
        namarmk6 = new javax.swing.JLabel();
        deskripsirmk6 = new javax.swing.JLabel();
        idclient = new javax.swing.JTextField();
        btn_hapus2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btn_clear5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        Pemasukan = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        tmbh_pemasukan = new javax.swing.JPanel();
        tmbhdatakmr2 = new javax.swing.JLabel();
        idClienttt = new javax.swing.JLabel();
        IDclientttt = new javax.swing.JTextField();
        Nominallll = new javax.swing.JLabel();
        Nominal = new javax.swing.JTextField();
        tgl_pemasukan = new javax.swing.JLabel();
        tanggall_pemasukan = new javax.swing.JTextField();
        btn_simpan3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btn_clear6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        LoadRMK_Pemasukan = new javax.swing.JComboBox<>();
        LoadClient = new javax.swing.JComboBox<>();
        hapus_pemasukan = new javax.swing.JPanel();
        namarmk7 = new javax.swing.JLabel();
        idpemasukkkan = new javax.swing.JLabel();
        idpemasukan = new javax.swing.JTextField();
        btn_hapus3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btn_clear7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(0, 0));
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

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(btn_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_minimizeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Header.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 35, 30));

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
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_exitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Header.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1346, 0, 35, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(67, 151, 164));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("K O S A N K U");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Navigasi.setBackground(new java.awt.Color(67, 151, 164));
        Navigasi.setMinimumSize(new java.awt.Dimension(0, 0));
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
        Navigasi.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        RumahKosst.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        RumahKosst.setForeground(new java.awt.Color(255, 255, 255));
        RumahKosst.setText("Rumah Kost");
        RumahKosst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RumahKosst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RumahKosstMouseClicked(evt);
            }
        });
        Navigasi.add(RumahKosst, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        Client.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Client.setForeground(new java.awt.Color(255, 255, 255));
        Client.setText("Client");
        Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientMouseClicked(evt);
            }
        });
        Navigasi.add(Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        Selected.setBackground(new java.awt.Color(255, 255, 255));
        Selected.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kelola.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Kelola.setForeground(new java.awt.Color(67, 151, 164));
        Kelola.setText("Kelola");
        Kelola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kelola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KelolaMouseClicked(evt);
            }
        });
        Selected.add(Kelola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        Navigasi.add(Selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 40));
        Navigasi.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        Statistik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Statistik.setForeground(new java.awt.Color(255, 255, 255));
        Statistik.setText("Laporan");
        Statistik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Statistik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatistikMouseClicked(evt);
            }
        });
        Navigasi.add(Statistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 40));

        getContentPane().add(Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, -1, 790));

        RumahKost1.setBackground(new java.awt.Color(204, 204, 204));
        RumahKost1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RUMAHKOSST.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        RUMAHKOSST.setForeground(new java.awt.Color(67, 151, 164));
        RUMAHKOSST.setText("Rumah Kost");
        RumahKost1.add(RUMAHKOSST, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Tambah atau hapus\n data rumah kost");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        RumahKost1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 12, 119, 40));

        tmbh_rmk.setBackground(new java.awt.Color(255, 255, 255));
        tmbh_rmk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namarmk1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namarmk1.setForeground(new java.awt.Color(0, 0, 0));
        namarmk1.setText("Tambah data");
        tmbh_rmk.add(namarmk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 26));

        namarmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namarmk.setForeground(new java.awt.Color(0, 0, 0));
        namarmk.setText("Nama rumah kost");
        tmbh_rmk.add(namarmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 44, -1, 26));

        nama_rmk.setBackground(new java.awt.Color(255, 255, 255));
        nama_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nama_rmk.setForeground(new java.awt.Color(0, 0, 0));
        tmbh_rmk.add(nama_rmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 76, 192, 30));

        alamatrmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        alamatrmk.setForeground(new java.awt.Color(0, 0, 0));
        alamatrmk.setText("Alamat");
        tmbh_rmk.add(alamatrmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 112, -1, 26));

        alamat_rmk.setBackground(new java.awt.Color(255, 255, 255));
        alamat_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        alamat_rmk.setForeground(new java.awt.Color(0, 0, 0));
        tmbh_rmk.add(alamat_rmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 143, 192, 30));

        deskripsirmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsirmk.setForeground(new java.awt.Color(0, 0, 0));
        deskripsirmk.setText("Deskripsi");
        tmbh_rmk.add(deskripsirmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 179, -1, 26));

        id_pemilik_rmk.setBackground(new java.awt.Color(255, 255, 255));
        id_pemilik_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        id_pemilik_rmk.setForeground(new java.awt.Color(0, 0, 0));
        tmbh_rmk.add(id_pemilik_rmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 192, 30));

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

        tmbh_rmk.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, -1));

        btn_clear.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clearMouseExited(evt);
            }
        });
        btn_clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CLEAR");
        btn_clear.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        tmbh_rmk.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 80, -1));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        deskripsi_rmk.setBackground(new java.awt.Color(255, 255, 255));
        deskripsi_rmk.setColumns(20);
        deskripsi_rmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsi_rmk.setForeground(new java.awt.Color(0, 0, 0));
        deskripsi_rmk.setRows(5);
        deskripsi_rmk.setText("\n");
        deskripsi_rmk.setBorder(null);
        jScrollPane3.setViewportView(deskripsi_rmk);

        tmbh_rmk.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 120));

        deskripsirmk2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsirmk2.setForeground(new java.awt.Color(0, 0, 0));
        deskripsirmk2.setText("ID Pemilik");
        tmbh_rmk.add(deskripsirmk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 26));

        RumahKost1.add(tmbh_rmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 58, 245, 460));

        hapus_rmk.setBackground(new java.awt.Color(255, 255, 255));
        hapus_rmk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namarmk2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namarmk2.setForeground(new java.awt.Color(0, 0, 0));
        namarmk2.setText("Hapus data");
        hapus_rmk.add(namarmk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 26));

        btn_hapus.setBackground(new java.awt.Color(67, 151, 164));
        btn_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapusMouseExited(evt);
            }
        });
        btn_hapus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("HAPUS");
        btn_hapus.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        hapus_rmk.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 90, -1));

        Pilihan_rmk.setBackground(new java.awt.Color(67, 151, 164));
        Pilihan_rmk.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Pilihan_rmk.setForeground(new java.awt.Color(255, 255, 255));
        Pilihan_rmk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Rumah Kost-" }));
        Pilihan_rmk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pilihan_rmk.setPreferredSize(new java.awt.Dimension(66, 37));
        Pilihan_rmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Pilihan_rmkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Pilihan_rmkMouseExited(evt);
            }
        });
        hapus_rmk.add(Pilihan_rmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, -1));

        RumahKost1.add(hapus_rmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 245, 160));

        KAMARKOSSS.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        KAMARKOSSS.setForeground(new java.awt.Color(67, 151, 164));
        KAMARKOSSS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KAMARKOSSS.setText("Kamar Kost");
        RumahKost1.add(KAMARKOSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Tambah atau hapus\n data kamar kost");
        jTextArea2.setBorder(null);
        jScrollPane4.setViewportView(jTextArea2);

        RumahKost1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 119, 40));

        tmbh_kmr.setBackground(new java.awt.Color(255, 255, 255));

        tmbhdatakmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tmbhdatakmr.setForeground(new java.awt.Color(0, 0, 0));
        tmbhdatakmr.setText("Tambah data");

        idrmk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idrmk.setForeground(new java.awt.Color(0, 0, 0));
        idrmk.setText("ID Rumah kost");

        Id_rmk_kmr.setEditable(false);
        Id_rmk_kmr.setBackground(new java.awt.Color(255, 255, 255));
        Id_rmk_kmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Id_rmk_kmr.setForeground(new java.awt.Color(0, 0, 0));

        nomor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nomor.setForeground(new java.awt.Color(0, 0, 0));
        nomor.setText("Nomor kamar");

        nomorkamar.setBackground(new java.awt.Color(255, 255, 255));
        nomorkamar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nomorkamar.setForeground(new java.awt.Color(0, 0, 0));

        deskripsikmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsikmr.setForeground(new java.awt.Color(0, 0, 0));
        deskripsikmr.setText("Deskripsi Kamar");

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        deskripsi_kmr.setBackground(new java.awt.Color(255, 255, 255));
        deskripsi_kmr.setColumns(20);
        deskripsi_kmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsi_kmr.setForeground(new java.awt.Color(0, 0, 0));
        deskripsi_kmr.setRows(5);
        deskripsi_kmr.setText("\n");
        deskripsi_kmr.setBorder(null);
        jScrollPane5.setViewportView(deskripsi_kmr);

        harga.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(0, 0, 0));
        harga.setText("Harga");

        hargakmr.setBackground(new java.awt.Color(255, 255, 255));
        hargakmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        hargakmr.setForeground(new java.awt.Color(0, 0, 0));

        btn_simpan1.setBackground(new java.awt.Color(67, 151, 164));
        btn_simpan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpan1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_simpan1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_simpan1MouseExited(evt);
            }
        });
        btn_simpan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SIMPAN");
        btn_simpan1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        btn_clear2.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clear2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clear2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clear2MouseExited(evt);
            }
        });
        btn_clear2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CLEAR");
        btn_clear2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        LoadRMK_Kamar.setBackground(new java.awt.Color(67, 151, 164));
        LoadRMK_Kamar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LoadRMK_Kamar.setForeground(new java.awt.Color(255, 255, 255));
        LoadRMK_Kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Rumah Kost-" }));
        LoadRMK_Kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadRMK_Kamar.setPreferredSize(new java.awt.Dimension(66, 37));
        LoadRMK_Kamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoadRMK_KamarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoadRMK_KamarMouseExited(evt);
            }
        });
        LoadRMK_Kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadRMK_KamarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tmbh_kmrLayout = new javax.swing.GroupLayout(tmbh_kmr);
        tmbh_kmr.setLayout(tmbh_kmrLayout);
        tmbh_kmrLayout.setHorizontalGroup(
            tmbh_kmrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmbh_kmrLayout.createSequentialGroup()
                .addGroup(tmbh_kmrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tmbhdatakmr))
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LoadRMK_Kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(harga))
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tmbh_kmrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tmbh_kmrLayout.createSequentialGroup()
                                .addComponent(idrmk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Id_rmk_kmr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomor)
                            .addComponent(nomorkamar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deskripsikmr)))
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tmbh_kmrLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hargakmr, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        tmbh_kmrLayout.setVerticalGroup(
            tmbh_kmrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmbh_kmrLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tmbhdatakmr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LoadRMK_Kamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tmbh_kmrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id_rmk_kmr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nomorkamar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(deskripsikmr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargakmr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(tmbh_kmrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        RumahKost1.add(tmbh_kmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 245, 480));

        hapus_kmr.setBackground(new java.awt.Color(255, 255, 255));
        hapus_kmr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namarmk5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namarmk5.setForeground(new java.awt.Color(0, 0, 0));
        namarmk5.setText("Hapus data");
        hapus_kmr.add(namarmk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 26));

        deskripsirmk5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsirmk5.setForeground(new java.awt.Color(0, 0, 0));
        deskripsirmk5.setText("ID kamar");
        hapus_kmr.add(deskripsirmk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 26));

        id_kmr.setBackground(new java.awt.Color(255, 255, 255));
        id_kmr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        id_kmr.setForeground(new java.awt.Color(0, 0, 0));
        hapus_kmr.add(id_kmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 192, 30));

        btn_hapus1.setBackground(new java.awt.Color(67, 151, 164));
        btn_hapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapus1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hapus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapus1MouseExited(evt);
            }
        });
        btn_hapus1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("HAPUS");
        btn_hapus1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        hapus_kmr.add(btn_hapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        btn_clear3.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clear3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clear3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clear3MouseExited(evt);
            }
        });
        btn_clear3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CLEAR");
        btn_clear3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        hapus_kmr.add(btn_clear3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, -1));

        RumahKost1.add(hapus_kmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 245, 158));

        CLIENTTTT.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CLIENTTTT.setForeground(new java.awt.Color(67, 151, 164));
        CLIENTTTT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CLIENTTTT.setText("CLIENT");
        RumahKost1.add(CLIENTTTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jScrollPane6.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane6.setBorder(null);
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("Tambah atau hapus\n data client");
        jTextArea3.setBorder(null);
        jScrollPane6.setViewportView(jTextArea3);

        RumahKost1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 119, 40));

        tmbh_CLIIENT.setBackground(new java.awt.Color(255, 255, 255));

        tmbhdatakmr1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tmbhdatakmr1.setForeground(new java.awt.Color(0, 0, 0));
        tmbhdatakmr1.setText("Tambah data");

        idkmrrrr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idkmrrrr.setForeground(new java.awt.Color(0, 0, 0));
        idkmrrrr.setText("ID Kamar");

        idkmrrclient.setEditable(false);
        idkmrrclient.setBackground(new java.awt.Color(255, 255, 255));
        idkmrrclient.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idkmrrclient.setForeground(new java.awt.Color(0, 0, 0));

        namaa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namaa.setForeground(new java.awt.Color(0, 0, 0));
        namaa.setText("Nama");

        Namaclnt.setBackground(new java.awt.Color(255, 255, 255));
        Namaclnt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Namaclnt.setForeground(new java.awt.Color(0, 0, 0));

        NoHP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        NoHP.setForeground(new java.awt.Color(0, 0, 0));
        NoHP.setText("Nomor HP");

        Nohp.setBackground(new java.awt.Color(255, 255, 255));
        Nohp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Nohp.setForeground(new java.awt.Color(0, 0, 0));

        pkrjn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pkrjn.setForeground(new java.awt.Color(0, 0, 0));
        pkrjn.setText("Pekerjaan");

        pekerjaan.setBackground(new java.awt.Color(255, 255, 255));
        pekerjaan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pekerjaan.setForeground(new java.awt.Color(0, 0, 0));

        almt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        almt.setForeground(new java.awt.Color(0, 0, 0));
        almt.setText("Alamat");

        alamat.setBackground(new java.awt.Color(255, 255, 255));
        alamat.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        alamat.setForeground(new java.awt.Color(0, 0, 0));

        btn_simpan2.setBackground(new java.awt.Color(67, 151, 164));
        btn_simpan2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpan2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_simpan2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_simpan2MouseExited(evt);
            }
        });
        btn_simpan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SIMPAN");
        btn_simpan2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        btn_clear4.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clear4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clear4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clear4MouseExited(evt);
            }
        });
        btn_clear4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CLEAR");
        btn_clear4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        tgl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tgl.setForeground(new java.awt.Color(0, 0, 0));
        tgl.setText("Tanggal Masuk (YYYY/MM/DD)");

        tglmasuk.setBackground(new java.awt.Color(255, 255, 255));
        tglmasuk.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tglmasuk.setForeground(new java.awt.Color(0, 0, 0));

        LoadRMK_CLient.setBackground(new java.awt.Color(67, 151, 164));
        LoadRMK_CLient.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LoadRMK_CLient.setForeground(new java.awt.Color(255, 255, 255));
        LoadRMK_CLient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Rumah Kost-" }));
        LoadRMK_CLient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadRMK_CLient.setPreferredSize(new java.awt.Dimension(66, 27));
        LoadRMK_CLient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoadRMK_CLientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoadRMK_CLientMouseExited(evt);
            }
        });
        LoadRMK_CLient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadRMK_CLientActionPerformed(evt);
            }
        });

        LoadKamar.setBackground(new java.awt.Color(67, 151, 164));
        LoadKamar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LoadKamar.setForeground(new java.awt.Color(255, 255, 255));
        LoadKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Nomor Kamar-" }));
        LoadKamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadKamar.setPreferredSize(new java.awt.Dimension(66, 27));
        LoadKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoadKamarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoadKamarMouseExited(evt);
            }
        });
        LoadKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadKamarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tmbh_CLIIENTLayout = new javax.swing.GroupLayout(tmbh_CLIIENT);
        tmbh_CLIIENT.setLayout(tmbh_CLIIENTLayout);
        tmbh_CLIIENTLayout.setHorizontalGroup(
            tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tmbhdatakmr1))
                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LoadRMK_CLient, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LoadKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Namaclnt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NoHP)
                                    .addComponent(namaa)
                                    .addComponent(pkrjn)
                                    .addComponent(almt)
                                    .addComponent(tgl)
                                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                                        .addComponent(idkmrrrr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idkmrrclient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                                        .addComponent(btn_simpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_clear4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(125, 125, 125))
        );
        tmbh_CLIIENTLayout.setVerticalGroup(
            tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmbh_CLIIENTLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tmbhdatakmr1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LoadRMK_CLient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoadKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idkmrrrr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idkmrrclient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(namaa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Namaclnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(NoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pkrjn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(almt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tmbh_CLIIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_simpan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RumahKost1.add(tmbh_CLIIENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 245, 530));

        hapus_CLIENT.setBackground(new java.awt.Color(255, 255, 255));
        hapus_CLIENT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namarmk6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namarmk6.setForeground(new java.awt.Color(0, 0, 0));
        namarmk6.setText("Hapus data");
        hapus_CLIENT.add(namarmk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 26));

        deskripsirmk6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deskripsirmk6.setForeground(new java.awt.Color(0, 0, 0));
        deskripsirmk6.setText("ID Client");
        hapus_CLIENT.add(deskripsirmk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 26));

        idclient.setBackground(new java.awt.Color(255, 255, 255));
        idclient.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idclient.setForeground(new java.awt.Color(0, 0, 0));
        hapus_CLIENT.add(idclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 192, 30));

        btn_hapus2.setBackground(new java.awt.Color(67, 151, 164));
        btn_hapus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapus2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hapus2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapus2MouseExited(evt);
            }
        });
        btn_hapus2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("HAPUS");
        btn_hapus2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        hapus_CLIENT.add(btn_hapus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        btn_clear5.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clear5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clear5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clear5MouseExited(evt);
            }
        });
        btn_clear5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CLEAR");
        btn_clear5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        hapus_CLIENT.add(btn_clear5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, -1));

        RumahKost1.add(hapus_CLIENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 245, 158));

        Pemasukan.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Pemasukan.setForeground(new java.awt.Color(67, 151, 164));
        Pemasukan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Pemasukan.setText("Pemasukan");
        RumahKost1.add(Pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jScrollPane7.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane7.setBorder(null);
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea4.setRows(5);
        jTextArea4.setText("Tambah atau hapus\n data pemasukan");
        jTextArea4.setBorder(null);
        jScrollPane7.setViewportView(jTextArea4);

        RumahKost1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 119, 40));

        tmbh_pemasukan.setBackground(new java.awt.Color(255, 255, 255));

        tmbhdatakmr2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tmbhdatakmr2.setForeground(new java.awt.Color(0, 0, 0));
        tmbhdatakmr2.setText("Tambah data");

        idClienttt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idClienttt.setForeground(new java.awt.Color(0, 0, 0));
        idClienttt.setText("ID Client");

        IDclientttt.setBackground(new java.awt.Color(255, 255, 255));
        IDclientttt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        IDclientttt.setForeground(new java.awt.Color(0, 0, 0));

        Nominallll.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Nominallll.setForeground(new java.awt.Color(0, 0, 0));
        Nominallll.setText("Nominal");

        Nominal.setBackground(new java.awt.Color(255, 255, 255));
        Nominal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Nominal.setForeground(new java.awt.Color(0, 0, 0));

        tgl_pemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tgl_pemasukan.setForeground(new java.awt.Color(0, 0, 0));
        tgl_pemasukan.setText("Tanggal Pemasukan (YYYY/MM/DD)");

        tanggall_pemasukan.setBackground(new java.awt.Color(255, 255, 255));
        tanggall_pemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tanggall_pemasukan.setForeground(new java.awt.Color(0, 0, 0));

        btn_simpan3.setBackground(new java.awt.Color(67, 151, 164));
        btn_simpan3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpan3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_simpan3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_simpan3MouseExited(evt);
            }
        });
        btn_simpan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("SIMPAN");
        btn_simpan3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        btn_clear6.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clear6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clear6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clear6MouseExited(evt);
            }
        });
        btn_clear6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CLEAR");
        btn_clear6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        LoadRMK_Pemasukan.setBackground(new java.awt.Color(67, 151, 164));
        LoadRMK_Pemasukan.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LoadRMK_Pemasukan.setForeground(new java.awt.Color(255, 255, 255));
        LoadRMK_Pemasukan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Rumah Kost-" }));
        LoadRMK_Pemasukan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadRMK_Pemasukan.setPreferredSize(new java.awt.Dimension(66, 27));
        LoadRMK_Pemasukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoadRMK_PemasukanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoadRMK_PemasukanMouseExited(evt);
            }
        });
        LoadRMK_Pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadRMK_PemasukanActionPerformed(evt);
            }
        });

        LoadClient.setBackground(new java.awt.Color(67, 151, 164));
        LoadClient.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        LoadClient.setForeground(new java.awt.Color(255, 255, 255));
        LoadClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Nama Penghuni-" }));
        LoadClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoadClient.setPreferredSize(new java.awt.Dimension(66, 27));
        LoadClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoadClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoadClientMouseExited(evt);
            }
        });
        LoadClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tmbh_pemasukanLayout = new javax.swing.GroupLayout(tmbh_pemasukan);
        tmbh_pemasukan.setLayout(tmbh_pemasukanLayout);
        tmbh_pemasukanLayout.setHorizontalGroup(
            tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                .addGroup(tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tmbhdatakmr2))
                    .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoadRMK_Pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoadClient, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgl_pemasukan)
                            .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                                        .addComponent(btn_simpan3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_clear6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tanggall_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Nominallll)
                            .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                                .addComponent(idClienttt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDclientttt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(128, 128, 128))
        );
        tmbh_pemasukanLayout.setVerticalGroup(
            tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmbh_pemasukanLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tmbhdatakmr2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoadRMK_Pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoadClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDclientttt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idClienttt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nominallll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggall_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tmbh_pemasukanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_simpan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        RumahKost1.add(tmbh_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 245, 350));

        hapus_pemasukan.setBackground(new java.awt.Color(255, 255, 255));
        hapus_pemasukan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namarmk7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        namarmk7.setForeground(new java.awt.Color(0, 0, 0));
        namarmk7.setText("Hapus data");
        hapus_pemasukan.add(namarmk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 26));

        idpemasukkkan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idpemasukkkan.setForeground(new java.awt.Color(0, 0, 0));
        idpemasukkkan.setText("ID Pemasukan");
        hapus_pemasukan.add(idpemasukkkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 26));

        idpemasukan.setBackground(new java.awt.Color(255, 255, 255));
        idpemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        idpemasukan.setForeground(new java.awt.Color(0, 0, 0));
        hapus_pemasukan.add(idpemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 192, 30));

        btn_hapus3.setBackground(new java.awt.Color(67, 151, 164));
        btn_hapus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapus3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hapus3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapus3MouseExited(evt);
            }
        });
        btn_hapus3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("HAPUS");
        btn_hapus3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));

        hapus_pemasukan.add(btn_hapus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        btn_clear7.setBackground(new java.awt.Color(67, 151, 164));
        btn_clear7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clear7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clear7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clear7MouseExited(evt);
            }
        });
        btn_clear7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("CLEAR");
        btn_clear7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        hapus_pemasukan.add(btn_clear7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, -1));

        RumahKost1.add(hapus_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 245, 158));

        getContentPane().add(RumahKost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 1160, 790));

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

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void KelolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelolaMouseClicked
        this.setVisible(false);
        new Kelola().setVisible(true);
    }//GEN-LAST:event_KelolaMouseClicked

    private void RumahKosstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RumahKosstMouseClicked
        this.setVisible(false);
        new RumahKost().setVisible(true);
    }//GEN-LAST:event_RumahKosstMouseClicked

    private void ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientMouseClicked
        this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_ClientMouseClicked

    private void StatistikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatistikMouseClicked
        this.setVisible(false);
        new Statistik().setVisible(true);
    }//GEN-LAST:event_StatistikMouseClicked

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
       tmbhrumahkost();
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void btn_simpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseEntered
        btn_simpan.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_simpanMouseEntered

    private void btn_simpanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseExited
        btn_simpan.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_simpanMouseExited

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        clear();
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseEntered
        btn_clear.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clearMouseEntered

    private void btn_clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseExited
        btn_clear.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clearMouseExited

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        try {
            String sql = "DELETE FROM rumah_kost WHERE nama_rumahkost='"+Pilihan_rmk.getSelectedItem()+"'";
            String sql1 = "ALTER TABLE rumah_kost AUTO_INCREMENT=1";
            Connection con=(Connection)Koneksi.koneksiDB();
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst.execute();
            pst1.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            resetautoincrement();
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void btn_hapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseEntered
        btn_hapus.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_hapusMouseEntered

    private void btn_hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseExited
        btn_hapus.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_hapusMouseExited

    private void btn_simpan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan1MouseClicked
        tmbhkmr();
    }//GEN-LAST:event_btn_simpan1MouseClicked

    private void btn_simpan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan1MouseEntered
        btn_simpan1.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_simpan1MouseEntered

    private void btn_simpan1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan1MouseExited
        btn_simpan1.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_simpan1MouseExited

    private void btn_clear2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear2MouseClicked
        Id_rmk_kmr.setText("");
        nomorkamar.setText("");
        deskripsi_kmr.setText("");
        hargakmr.setText("");
        
    }//GEN-LAST:event_btn_clear2MouseClicked

    private void btn_clear2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear2MouseEntered
        btn_clear2.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clear2MouseEntered

    private void btn_clear2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear2MouseExited
        btn_clear2.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clear2MouseExited

    private void btn_hapus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus1MouseClicked
       hpskmr();
    }//GEN-LAST:event_btn_hapus1MouseClicked

    private void btn_hapus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus1MouseEntered
       btn_hapus1.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_hapus1MouseEntered

    private void btn_hapus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus1MouseExited
        btn_hapus1.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_hapus1MouseExited

    private void btn_clear3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear3MouseClicked
        id_kmr.setText("");
    }//GEN-LAST:event_btn_clear3MouseClicked

    private void btn_clear3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear3MouseEntered
        btn_clear3.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clear3MouseEntered

    private void btn_clear3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear3MouseExited
        btn_clear3.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clear3MouseExited

    private void btn_simpan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan2MouseClicked
        tmbhclient();
    }//GEN-LAST:event_btn_simpan2MouseClicked

    private void btn_simpan2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan2MouseEntered
        btn_simpan2.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_simpan2MouseEntered

    private void btn_simpan2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan2MouseExited
        btn_simpan2.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_simpan2MouseExited

    private void btn_clear4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear4MouseClicked
        idkmrrclient.setText("");
        Namaclnt.setText("");
        Nohp.setText("");
        pekerjaan.setText("");
        alamat.setText("");
        tglmasuk.setText("");
        
    }//GEN-LAST:event_btn_clear4MouseClicked

    private void btn_clear4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear4MouseEntered
       btn_clear4.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clear4MouseEntered

    private void btn_clear4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear4MouseExited
        btn_clear4.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clear4MouseExited

    private void btn_hapus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus2MouseClicked
       hpsclnt();
    }//GEN-LAST:event_btn_hapus2MouseClicked

    private void btn_hapus2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus2MouseEntered
        btn_hapus2.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_hapus2MouseEntered

    private void btn_hapus2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus2MouseExited
         btn_hapus2.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_hapus2MouseExited

    private void btn_clear5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear5MouseClicked
        idclient.setText("");
    }//GEN-LAST:event_btn_clear5MouseClicked

    private void btn_clear5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear5MouseEntered
        btn_clear5.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clear5MouseEntered

    private void btn_clear5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear5MouseExited
         btn_clear5.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clear5MouseExited

    private void btn_simpan3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan3MouseClicked
       pemasukan();
    }//GEN-LAST:event_btn_simpan3MouseClicked

    private void btn_simpan3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan3MouseEntered
        btn_simpan3.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_simpan3MouseEntered

    private void btn_simpan3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan3MouseExited
        btn_simpan3.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_simpan3MouseExited

    private void btn_clear6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear6MouseClicked
        IDclientttt.setText("");
        Nominal.setText("");
        tanggall_pemasukan.setText("");
    }//GEN-LAST:event_btn_clear6MouseClicked

    private void btn_clear6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear6MouseEntered
       btn_clear6.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clear6MouseEntered

    private void btn_clear6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear6MouseExited
        btn_clear6.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clear6MouseExited

    private void btn_hapus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus3MouseClicked
       hpspemasukan();
    }//GEN-LAST:event_btn_hapus3MouseClicked

    private void btn_hapus3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus3MouseEntered
        btn_hapus3.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_hapus3MouseEntered

    private void btn_hapus3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus3MouseExited
        btn_hapus3.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_hapus3MouseExited

    private void btn_clear7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear7MouseClicked
        idpemasukan.setText("");
    }//GEN-LAST:event_btn_clear7MouseClicked

    private void btn_clear7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear7MouseEntered
       btn_clear7.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_clear7MouseEntered

    private void btn_clear7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clear7MouseExited
        btn_clear7.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_clear7MouseExited

    private void Pilihan_rmkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pilihan_rmkMouseEntered
        Pilihan_rmk.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_Pilihan_rmkMouseEntered

    private void Pilihan_rmkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pilihan_rmkMouseExited
        Pilihan_rmk.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_Pilihan_rmkMouseExited

    private void LoadRMK_KamarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadRMK_KamarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadRMK_KamarMouseEntered

    private void LoadRMK_KamarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadRMK_KamarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadRMK_KamarMouseExited

    private void LoadRMK_KamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadRMK_KamarActionPerformed
       try {
            String sql = "SELECT rumah_kost.id_rumahkost FROM rumah_kost WHERE nama_rumahkost='"+LoadRMK_Kamar.getSelectedItem()+"'";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()){
                Id_rmk_kmr.setText(rs.getString(1));
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal load data"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_LoadRMK_KamarActionPerformed

    private void LoadRMK_CLientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadRMK_CLientMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadRMK_CLientMouseEntered

    private void LoadRMK_CLientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadRMK_CLientMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadRMK_CLientMouseExited

    private void LoadRMK_CLientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadRMK_CLientActionPerformed
        LoadKamar.removeAllItems();
        try {
            String sql = "SELECT * FROM `kamar`\n" +
                        "JOIN rumah_kost on rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                        "WHERE rumah_kost.nama_rumahkost='"+LoadRMK_CLient.getSelectedItem()+"'"
                        + "ORDER BY kamar.nomor_kamar ASC";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                LoadKamar.addItem(rs.getString("nomor_kamar"));
                
            }
           
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal load data"+e.getMessage());
        }
        
    }//GEN-LAST:event_LoadRMK_CLientActionPerformed

    private void LoadKamarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadKamarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadKamarMouseEntered

    private void LoadKamarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadKamarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadKamarMouseExited

    private void LoadKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadKamarActionPerformed
        try {
            String sql = "SELECT * FROM `kamar`\n" +
                        "JOIN rumah_kost on rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                        "WHERE rumah_kost.nama_rumahkost='"+LoadRMK_CLient.getSelectedItem()+"'"
                        + "AND kamar.nomor_kamar='"+LoadKamar.getSelectedItem()+"'";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()){
                idkmrrclient.setText(rs.getString("id_kamar"));
            }
           
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal load data"+e.getMessage());
        }
        
    }//GEN-LAST:event_LoadKamarActionPerformed

    private void LoadRMK_PemasukanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadRMK_PemasukanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadRMK_PemasukanMouseEntered

    private void LoadRMK_PemasukanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadRMK_PemasukanMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadRMK_PemasukanMouseExited

    private void LoadRMK_PemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadRMK_PemasukanActionPerformed
        LoadClient.removeAllItems();
        try {
            String sql = "SELECT * FROM client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                        "WHERE rumah_kost.nama_rumahkost='"+LoadRMK_Pemasukan.getSelectedItem()+"'";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                LoadClient.addItem(rs.getString("nama_client"));
                
            }
           
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal load data"+e.getMessage());
        }
    }//GEN-LAST:event_LoadRMK_PemasukanActionPerformed

    private void LoadClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadClientMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadClientMouseEntered

    private void LoadClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadClientMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadClientMouseExited

    private void LoadClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadClientActionPerformed
        try {
            String sql = "SELECT * FROM client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                        "WHERE rumah_kost.nama_rumahkost='"+LoadRMK_Pemasukan.getSelectedItem()+"'"
                        + "AND client.nama_client='"+LoadClient.getSelectedItem()+"'";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                IDclientttt.setText(rs.getString("id_client"));
                
            }
           
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal load data"+e.getMessage());
        }
    }//GEN-LAST:event_LoadClientActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

 
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf() {
            });
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLIENTTTT;
    private javax.swing.JLabel Client;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField IDclientttt;
    private javax.swing.JTextField Id_rmk_kmr;
    private javax.swing.JLabel KAMARKOSSS;
    private javax.swing.JLabel Kelola;
    private javax.swing.JComboBox<String> LoadClient;
    private javax.swing.JComboBox<String> LoadKamar;
    private javax.swing.JComboBox<String> LoadRMK_CLient;
    private javax.swing.JComboBox<String> LoadRMK_Kamar;
    private javax.swing.JComboBox<String> LoadRMK_Pemasukan;
    private javax.swing.JTextField Namaclnt;
    private javax.swing.JPanel Navigasi;
    private javax.swing.JLabel NoHP;
    private javax.swing.JTextField Nohp;
    private javax.swing.JTextField Nominal;
    private javax.swing.JLabel Nominallll;
    private javax.swing.JLabel Pemasukan;
    private javax.swing.JComboBox<String> Pilihan_rmk;
    private javax.swing.JLabel RUMAHKOSST;
    private javax.swing.JLabel RumahKosst;
    private javax.swing.JPanel RumahKost1;
    private javax.swing.JPanel Selected;
    private javax.swing.JLabel Statistik;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField alamat_rmk;
    private javax.swing.JLabel alamatrmk;
    private javax.swing.JLabel almt;
    private javax.swing.JPanel btn_clear;
    private javax.swing.JPanel btn_clear2;
    private javax.swing.JPanel btn_clear3;
    private javax.swing.JPanel btn_clear4;
    private javax.swing.JPanel btn_clear5;
    private javax.swing.JPanel btn_clear6;
    private javax.swing.JPanel btn_clear7;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_hapus;
    private javax.swing.JPanel btn_hapus1;
    private javax.swing.JPanel btn_hapus2;
    private javax.swing.JPanel btn_hapus3;
    private javax.swing.JPanel btn_minimize;
    private javax.swing.JPanel btn_simpan;
    private javax.swing.JPanel btn_simpan1;
    private javax.swing.JPanel btn_simpan2;
    private javax.swing.JPanel btn_simpan3;
    private javax.swing.JTextArea deskripsi_kmr;
    private javax.swing.JTextArea deskripsi_rmk;
    private javax.swing.JLabel deskripsikmr;
    private javax.swing.JLabel deskripsirmk;
    private javax.swing.JLabel deskripsirmk2;
    private javax.swing.JLabel deskripsirmk5;
    private javax.swing.JLabel deskripsirmk6;
    private javax.swing.JPanel hapus_CLIENT;
    private javax.swing.JPanel hapus_kmr;
    private javax.swing.JPanel hapus_pemasukan;
    private javax.swing.JPanel hapus_rmk;
    private javax.swing.JLabel harga;
    private javax.swing.JTextField hargakmr;
    private javax.swing.JLabel home;
    private javax.swing.JLabel idClienttt;
    private javax.swing.JTextField id_kmr;
    private javax.swing.JTextField id_pemilik_rmk;
    private javax.swing.JTextField idclient;
    private javax.swing.JTextField idkmrrclient;
    private javax.swing.JLabel idkmrrrr;
    private javax.swing.JTextField idpemasukan;
    private javax.swing.JLabel idpemasukkkan;
    private javax.swing.JLabel idrmk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private com.source.button.logout logout1;
    private javax.swing.JTextField nama_rmk;
    private javax.swing.JLabel namaa;
    private javax.swing.JLabel namarmk;
    private javax.swing.JLabel namarmk1;
    private javax.swing.JLabel namarmk2;
    private javax.swing.JLabel namarmk5;
    private javax.swing.JLabel namarmk6;
    private javax.swing.JLabel namarmk7;
    private javax.swing.JLabel nomor;
    private javax.swing.JTextField nomorkamar;
    private javax.swing.JTextField pekerjaan;
    private javax.swing.JLabel pkrjn;
    private javax.swing.JTextField tanggall_pemasukan;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel tgl_pemasukan;
    private javax.swing.JTextField tglmasuk;
    private javax.swing.JPanel tmbh_CLIIENT;
    private javax.swing.JPanel tmbh_kmr;
    private javax.swing.JPanel tmbh_pemasukan;
    private javax.swing.JPanel tmbh_rmk;
    private javax.swing.JLabel tmbhdatakmr;
    private javax.swing.JLabel tmbhdatakmr1;
    private javax.swing.JLabel tmbhdatakmr2;
    // End of variables declaration//GEN-END:variables
}
