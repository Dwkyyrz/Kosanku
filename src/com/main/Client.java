
package com.main;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.net.URI;
import java.net.URL;


public class Client extends javax.swing.JFrame {
    
    
    int xMouse,yMouse;
    public Client() {
        initComponents();
        loadtable();
        sisawaktu();
        loadRMKCB();
    }
    
    private void telatRMK(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Client");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        try {
            int no=1;
            String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                            "WHERE NOW()>tanggal_bayar AND rumah_kost.nama_rumahkost='"+Pilihan_rmk.getSelectedItem()+"'\n" +
                            "ORDER BY client.id_client ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void telat(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Client");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        try {
            int no=1;
            String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                        "FROM client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                        "WHERE NOW()>tanggal_bayar\n" +
                        "ORDER BY client.id_client ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void sisawaktu(){
        try {
            String sql = "UPDATE client SET sisa_waktu=datediff(tanggal_bayar,CURRENT_DATE)";
            Connection con = (Connection)Koneksi.koneksiDB();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }
    
    private void carinama(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Client");
        
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        try {
            int no=1;
            String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                        "FROM client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                        "WHERE client.nama_client LIKE '%"+txt_client.getText()+"%'";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(2),
                   
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
        }
    }
    private void loadtable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Client");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        
        try {
            int no=1;
            String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                            "ORDER BY client.id_client ASC";
            String sql1 = "UPDATE client SET sisa_waktu=datediff(tanggal_bayar,CURRENT_DATE)";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            PreparedStatement pstm = con.prepareStatement(sql1);
            ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                   
                });
                jTable1.setModel(model);
            }
            pstm.execute();
        } catch (Exception e) {
        }
        
    }
    
    private void data10hariRMK(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Client");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        try {
            int no=1;
            String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                            "WHERE sisa_waktu<=10 AND rumah_kost.nama_rumahkost = '"+Pilihan_rmk.getSelectedItem()+"'" +
                            "ORDER BY client.id_client ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih rumah kost terlebih dahulu");
        }
        
    }
    
    private void data10harisemua(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Client");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        try {
            int no=1;
            String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                            "WHERE sisa_waktu<=10\n" +
                            "ORDER BY client.id_client ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih rumah kost terlebih dahulu");
        }
        
    }
    
    
    private void loadRMKCB(){
        try {
            String sql = "SELECT * FROM rumah_kost";
            Connection con = (Connection) Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Pilihan_rmk.addItem(rs.getString("nama_rumahkost"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
        } 
        catch (Exception e) {
        }
    }
    
    private void dataRMK(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nomor");
        model.addColumn("ID Client");
        model.addColumn("Nama");
        model.addColumn("No HP");
        model.addColumn("Pekerjaan");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Masuk");
        model.addColumn("Tanggal Bayar");
        model.addColumn("Sisa Waktu");
        model.addColumn("tagihan");
        model.addColumn("Nomor Kamar");
        model.addColumn("Lokasi Kost");
        
        try {
            int no=1;
           String sql = "SELECT client.*, kamar.harga,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                        "FROM client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar = client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost = kamar.id_rumahkost\n" +
                        "WHERE rumah_kost.nama_rumahkost = '"+Pilihan_rmk.getSelectedItem()+"'";
           Connection con = (Connection)Koneksi.koneksiDB();
           Statement stm = con.createStatement();
           ResultSet res = stm.executeQuery(sql);
           while (res.next()) {
                model.addRow(new Object[]{
                   no++,
                   res.getString(1),
                   res.getString(3),
                   res.getString(4),
                   res.getString(5),
                   res.getString(6),
                   res.getString(7),
                   res.getString(8),
                   res.getString(9),
                   res.getString(10),  
                   res.getString(11),
                   res.getString(12)
                });
                jTable1.setModel(model);
            }
           
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Data kost tidak ditemukan"+e.getMessage());
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
        Kelola = new javax.swing.JLabel();
        Selected = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Statistik = new javax.swing.JLabel();
        logout1 = new com.source.button.logout();
        RumahKosst = new javax.swing.JLabel();
        pnlbody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dataterpilih = new javax.swing.JLabel();
        sisawktu1 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tglbayar = new javax.swing.JLabel();
        tgl_byr = new javax.swing.JTextField();
        sisawktu = new javax.swing.JLabel();
        sisa_waktu = new javax.swing.JTextField();
        ket2 = new javax.swing.JLabel();
        btn_update = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        garis = new javax.swing.JPanel();
        semuadata = new javax.swing.JLabel();
        tglbayar1 = new javax.swing.JLabel();
        tgl_byrsemua = new javax.swing.JTextField();
        btn_updatesemua = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        garis1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_10harirmk = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Semuadata = new javax.swing.JLabel();
        btn_semuadata = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PilihanRMK = new javax.swing.JLabel();
        btn_pilihanrmk = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Pilihan_rmk = new javax.swing.JComboBox<>();
        Semuadata1 = new javax.swing.JLabel();
        kirimreminder = new javax.swing.JButton();
        cariclient = new javax.swing.JLabel();
        txt_client = new javax.swing.JTextField();
        btn_cari = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_10harisemua = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ket3 = new javax.swing.JLabel();
        semuadata1 = new javax.swing.JLabel();
        tglbayar2 = new javax.swing.JLabel();
        tgl_byrsemua1 = new javax.swing.JTextField();
        btn_updatekurangdari10hari = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btn_telatKos = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_telatSEMUA = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        Selected.setBackground(new java.awt.Color(255, 255, 255));
        Selected.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(67, 151, 164));
        jLabel4.setText("Client");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Selected.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Navigasi.add(Selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 40));

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

        getContentPane().add(Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, -1, 800));

        pnlbody.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        dataterpilih.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dataterpilih.setForeground(new java.awt.Color(0, 0, 0));
        dataterpilih.setText("Update data yang terpilih ");

        sisawktu1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sisawktu1.setForeground(new java.awt.Color(0, 0, 0));
        sisawktu1.setText("Nama :");

        nama.setEditable(false);
        nama.setBackground(new java.awt.Color(255, 255, 255));
        nama.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 0));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        tglbayar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tglbayar.setForeground(new java.awt.Color(0, 0, 0));
        tglbayar.setText("Tanggal bayar :");

        tgl_byr.setBackground(new java.awt.Color(255, 255, 255));
        tgl_byr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tgl_byr.setForeground(new java.awt.Color(0, 0, 0));
        tgl_byr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_byrActionPerformed(evt);
            }
        });

        sisawktu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sisawktu.setForeground(new java.awt.Color(0, 0, 0));
        sisawktu.setText("Sisa waktu");

        sisa_waktu.setEditable(false);
        sisa_waktu.setBackground(new java.awt.Color(255, 255, 255));
        sisa_waktu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sisa_waktu.setForeground(new java.awt.Color(0, 0, 0));
        sisa_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisa_waktuActionPerformed(evt);
            }
        });

        ket2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ket2.setForeground(new java.awt.Color(0, 0, 0));
        ket2.setText("*Sisa waktu otomatis berubah setelah tombol update ditekan");

        btn_update.setBackground(new java.awt.Color(67, 151, 164));
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_updateMouseExited(evt);
            }
        });
        btn_update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UPDATE");
        btn_update.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        garis.setBackground(new java.awt.Color(67, 151, 164));
        garis.setMinimumSize(new java.awt.Dimension(0, 0));
        garis.setPreferredSize(new java.awt.Dimension(4, 250));

        javax.swing.GroupLayout garisLayout = new javax.swing.GroupLayout(garis);
        garis.setLayout(garisLayout);
        garisLayout.setHorizontalGroup(
            garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        garisLayout.setVerticalGroup(
            garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        semuadata.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        semuadata.setForeground(new java.awt.Color(0, 0, 0));
        semuadata.setText("Update semua data berdasarkan rumah kost");

        tglbayar1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tglbayar1.setForeground(new java.awt.Color(0, 0, 0));
        tglbayar1.setText("Tanggal bayar :");

        tgl_byrsemua.setBackground(new java.awt.Color(255, 255, 255));
        tgl_byrsemua.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tgl_byrsemua.setForeground(new java.awt.Color(0, 0, 0));
        tgl_byrsemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_byrsemuaActionPerformed(evt);
            }
        });

        btn_updatesemua.setBackground(new java.awt.Color(67, 151, 164));
        btn_updatesemua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updatesemua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updatesemuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updatesemuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_updatesemuaMouseExited(evt);
            }
        });
        btn_updatesemua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UPDATE");
        btn_updatesemua.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        garis1.setBackground(new java.awt.Color(67, 151, 164));
        garis1.setPreferredSize(new java.awt.Dimension(4, 285));

        javax.swing.GroupLayout garis1Layout = new javax.swing.GroupLayout(garis1);
        garis1.setLayout(garis1Layout);
        garis1Layout.setHorizontalGroup(
            garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        garis1Layout.setVerticalGroup(
            garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Tampilkan data sisa waktu \nkurang dari 10 hari berdasarkan \nrumah kost / semua data");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        btn_10harirmk.setBackground(new java.awt.Color(67, 151, 164));
        btn_10harirmk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_10harirmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_10harirmkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_10harirmkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_10harirmkMouseExited(evt);
            }
        });
        btn_10harirmk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TERTENTU");
        btn_10harirmk.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        Semuadata.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Semuadata.setForeground(new java.awt.Color(0, 0, 0));
        Semuadata.setText("Tampilkan semua data");

        btn_semuadata.setBackground(new java.awt.Color(67, 151, 164));
        btn_semuadata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_semuadata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_semuadataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_semuadataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_semuadataMouseExited(evt);
            }
        });
        btn_semuadata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TAMPILKAN");
        btn_semuadata.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        PilihanRMK.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        PilihanRMK.setForeground(new java.awt.Color(0, 0, 0));
        PilihanRMK.setText("Tampilkan semua data berdasarkan nama rumah kost");

        btn_pilihanrmk.setBackground(new java.awt.Color(67, 151, 164));
        btn_pilihanrmk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pilihanrmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pilihanrmkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pilihanrmkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pilihanrmkMouseExited(evt);
            }
        });
        btn_pilihanrmk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TAMPILKAN");
        btn_pilihanrmk.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        Pilihan_rmk.setBackground(new java.awt.Color(67, 151, 164));
        Pilihan_rmk.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Pilihan_rmk.setForeground(new java.awt.Color(255, 255, 255));
        Pilihan_rmk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
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

        Semuadata1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Semuadata1.setForeground(new java.awt.Color(0, 0, 0));
        Semuadata1.setText("Ingatkan client untuk segera membayar ");

        kirimreminder.setBackground(new java.awt.Color(67, 151, 164));
        kirimreminder.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        kirimreminder.setForeground(new java.awt.Color(255, 255, 255));
        kirimreminder.setText("Whatsapp");
        kirimreminder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kirimreminder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimreminderActionPerformed(evt);
            }
        });

        cariclient.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cariclient.setForeground(new java.awt.Color(0, 0, 0));
        cariclient.setText("Cari client berdasarkan nama ");

        txt_client.setBackground(new java.awt.Color(255, 255, 255));
        txt_client.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_client.setForeground(new java.awt.Color(0, 0, 0));

        btn_cari.setBackground(new java.awt.Color(67, 151, 164));
        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cariMouseExited(evt);
            }
        });
        btn_cari.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CARI");
        btn_cari.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        btn_10harisemua.setBackground(new java.awt.Color(67, 151, 164));
        btn_10harisemua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_10harisemua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_10harisemuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_10harisemuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_10harisemuaMouseExited(evt);
            }
        });
        btn_10harisemua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SEMUA");
        btn_10harisemua.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        ket3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ket3.setForeground(new java.awt.Color(0, 0, 0));
        ket3.setText("Format tanggal = YYYY/MM/DD");

        semuadata1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        semuadata1.setForeground(new java.awt.Color(0, 0, 0));
        semuadata1.setText("Update semua data berdasarkan sisa waktu kurang dari 10 hari");

        tglbayar2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tglbayar2.setForeground(new java.awt.Color(0, 0, 0));
        tglbayar2.setText("Tanggal bayar :");

        tgl_byrsemua1.setBackground(new java.awt.Color(255, 255, 255));
        tgl_byrsemua1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tgl_byrsemua1.setForeground(new java.awt.Color(0, 0, 0));
        tgl_byrsemua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_byrsemua1ActionPerformed(evt);
            }
        });

        btn_updatekurangdari10hari.setBackground(new java.awt.Color(67, 151, 164));
        btn_updatekurangdari10hari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updatekurangdari10hari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updatekurangdari10hariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_updatekurangdari10hariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_updatekurangdari10hariMouseExited(evt);
            }
        });
        btn_updatekurangdari10hari.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UPDATE");
        btn_updatekurangdari10hari.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("Tampilkan data melebihi\ntanggal bayar / telat\n(semua / berdasar Rumah \nkost)");
        jTextArea3.setBorder(null);
        jScrollPane4.setViewportView(jTextArea3);

        btn_telatKos.setBackground(new java.awt.Color(67, 151, 164));
        btn_telatKos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_telatKos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_telatKosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_telatKosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_telatKosMouseExited(evt);
            }
        });
        btn_telatKos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("TERTENTU");
        btn_telatKos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        btn_telatSEMUA.setBackground(new java.awt.Color(67, 151, 164));
        btn_telatSEMUA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_telatSEMUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_telatSEMUAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_telatSEMUAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_telatSEMUAMouseExited(evt);
            }
        });
        btn_telatSEMUA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SEMUA");
        btn_telatSEMUA.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        javax.swing.GroupLayout pnlbodyLayout = new javax.swing.GroupLayout(pnlbody);
        pnlbody.setLayout(pnlbodyLayout);
        pnlbodyLayout.setHorizontalGroup(
            pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pnlbodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataterpilih)
                    .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlbodyLayout.createSequentialGroup()
                            .addComponent(tglbayar)
                            .addGap(3, 3, 3)
                            .addComponent(tgl_byr))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlbodyLayout.createSequentialGroup()
                            .addComponent(sisawktu)
                            .addGap(4, 4, 4)
                            .addComponent(sisa_waktu))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlbodyLayout.createSequentialGroup()
                            .addComponent(sisawktu1)
                            .addGap(4, 4, 4)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ket2)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ket3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(garis, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbodyLayout.createSequentialGroup()
                        .addComponent(tglbayar1)
                        .addGap(4, 4, 4)
                        .addComponent(tgl_byrsemua)
                        .addGap(15, 15, 15)
                        .addComponent(btn_updatesemua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbodyLayout.createSequentialGroup()
                        .addComponent(tglbayar2)
                        .addGap(4, 4, 4)
                        .addComponent(tgl_byrsemua1)
                        .addGap(15, 15, 15)
                        .addComponent(btn_updatekurangdari10hari, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semuadata)
                            .addComponent(cariclient)
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(semuadata1)
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(Semuadata1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kirimreminder)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(garis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PilihanRMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pilihan_rmk, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_telatSEMUA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_10harisemua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_telatKos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_10harirmk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_pilihanrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(Semuadata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_semuadata, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        pnlbodyLayout.setVerticalGroup(
            pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbodyLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(PilihanRMK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_pilihanrmk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pilihan_rmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_10harisemua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_10harirmk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_telatKos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_telatSEMUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_semuadata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Semuadata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(dataterpilih)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sisawktu1)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tglbayar)
                                    .addComponent(tgl_byr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sisawktu)
                                    .addComponent(sisa_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ket2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ket3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(semuadata)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tglbayar1))
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tgl_byrsemua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btn_updatesemua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(semuadata1)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tglbayar2))
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tgl_byrsemua1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlbodyLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btn_updatekurangdari10hari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cariclient)
                                .addGap(2, 2, 2)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kirimreminder)
                                    .addComponent(Semuadata1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(garis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(garis, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(834, 834, 834))))
        );

        getContentPane().add(pnlbody, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 1160, 790));

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

    private void RumahKosstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RumahKosstMouseClicked
        this.setVisible(false);
        new RumahKost().setVisible(true);
    }//GEN-LAST:event_RumahKosstMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int baris = jTable1.rowAtPoint(evt.getPoint());
       if (jTable1.getValueAt(baris, 2&7&8)==null){
           nama.setText("");
           tgl_byr.setText("");
            sisa_waktu.setText("");
        }else {
            nama.setText(jTable1.getValueAt(baris, 2).toString());
            tgl_byr.setText(jTable1.getValueAt(baris, 7).toString());
            tgl_byrsemua.setText(jTable1.getValueAt(baris, 7).toString());
            tgl_byrsemua1.setText(jTable1.getValueAt(baris, 7).toString());
            sisa_waktu.setText(jTable1.getValueAt(baris, 8).toString());
       }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked
        try {
                String sql = "UPDATE client SET tanggal_bayar='"+tgl_byr.getText()+"',"
                        + "sisa_waktu=datediff(tanggal_bayar,CURRENT_DATE) "
                        + "WHERE nama_client= '"+nama.getText()+"'";
                Connection con= (Connection)Koneksi.koneksiDB();
                PreparedStatement pstm= con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil di Update");
        } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di Update\n"+e.getMessage());
            }
            loadtable();
        
    }//GEN-LAST:event_btn_updateMouseClicked

    private void tgl_byrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_byrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_byrActionPerformed

    private void sisa_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisa_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sisa_waktuActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void btn_updatesemuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updatesemuaMouseClicked
        try {
            String sql = "UPDATE client SET tanggal_bayar='"+tgl_byrsemua.getText()+"',"
                    + "sisa_waktu=datediff(tanggal_bayar,CURRENT_DATE) ";
            Connection con= (Connection)Koneksi.koneksiDB();
            PreparedStatement pstm= con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil di Update");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di Update\n"+e.getMessage());
        }
        loadtable();
    }//GEN-LAST:event_btn_updatesemuaMouseClicked

    private void btn_10harirmkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10harirmkMouseClicked
        data10hariRMK();
    }//GEN-LAST:event_btn_10harirmkMouseClicked

    private void btn_semuadataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_semuadataMouseClicked
        loadtable();
    }//GEN-LAST:event_btn_semuadataMouseClicked

    private void btn_pilihanrmkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pilihanrmkMouseClicked
        dataRMK();
    }//GEN-LAST:event_btn_pilihanrmkMouseClicked

    private void KelolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelolaMouseClicked
        this.setVisible(false);
        new Kelola().setVisible(true);
    }//GEN-LAST:event_KelolaMouseClicked

    private void StatistikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatistikMouseClicked
        this.setVisible(false);
        new Statistik().setVisible(true);
    }//GEN-LAST:event_StatistikMouseClicked

    private void btn_updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseEntered
        btn_update.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_updateMouseEntered

    private void btn_updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseExited
        btn_update.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_updateMouseExited

    private void btn_updatesemuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updatesemuaMouseEntered
        btn_updatesemua.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_updatesemuaMouseEntered

    private void btn_updatesemuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updatesemuaMouseExited
        btn_updatesemua.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_updatesemuaMouseExited

    private void btn_10harirmkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10harirmkMouseEntered
        btn_10harirmk.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_10harirmkMouseEntered

    private void btn_10harirmkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10harirmkMouseExited
        btn_10harirmk.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_10harirmkMouseExited

    private void btn_semuadataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_semuadataMouseEntered
        btn_semuadata.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_semuadataMouseEntered

    private void btn_semuadataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_semuadataMouseExited
       btn_semuadata.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_semuadataMouseExited

    private void Pilihan_rmkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pilihan_rmkMouseEntered
       Pilihan_rmk.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_Pilihan_rmkMouseEntered

    private void Pilihan_rmkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pilihan_rmkMouseExited
        Pilihan_rmk.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_Pilihan_rmkMouseExited

    private void btn_pilihanrmkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pilihanrmkMouseEntered
        btn_pilihanrmk.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_pilihanrmkMouseEntered

    private void btn_pilihanrmkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pilihanrmkMouseExited
        btn_pilihanrmk.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_pilihanrmkMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void tgl_byrsemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_byrsemuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_byrsemuaActionPerformed

    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
       carinama();
    }//GEN-LAST:event_btn_cariMouseClicked

    private void btn_cariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseEntered
        btn_cari.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_cariMouseEntered

    private void btn_cariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseExited
        btn_cari.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_cariMouseExited

    private void kirimreminderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimreminderActionPerformed
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URL("https://api.whatsapp.com/send?phone&text=Permisi,%20sekedar%20mengingatkan%20bahwa%20dalam%20beberapa%20hari%20kedepan%20sudah%20memasuki%20waktu%20tenggat%20pembayaran%20sewa%20kost.%20Terima%20kasih%0ABy%3A%20AdminKost").toURI());
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_kirimreminderActionPerformed

    private void btn_10harisemuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10harisemuaMouseClicked
        data10harisemua();
    }//GEN-LAST:event_btn_10harisemuaMouseClicked

    private void btn_10harisemuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10harisemuaMouseEntered
        btn_10harisemua.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_10harisemuaMouseEntered

    private void btn_10harisemuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_10harisemuaMouseExited
        btn_10harisemua.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_10harisemuaMouseExited

    private void tgl_byrsemua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_byrsemua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_byrsemua1ActionPerformed

    private void btn_updatekurangdari10hariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updatekurangdari10hariMouseClicked
        try {
            String sql = "UPDATE client SET tanggal_bayar='"+tgl_byrsemua1.getText()+"',"
                    + "sisa_waktu=datediff(tanggal_bayar,CURRENT_DATE) "
                    + "WHERE sisa_waktu<10";
            Connection con= (Connection)Koneksi.koneksiDB();
            PreparedStatement pstm= con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil di Update");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di Update\n"+e.getMessage());
        }
        loadtable();
    }//GEN-LAST:event_btn_updatekurangdari10hariMouseClicked

    private void btn_updatekurangdari10hariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updatekurangdari10hariMouseEntered
        btn_updatekurangdari10hari.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_updatekurangdari10hariMouseEntered

    private void btn_updatekurangdari10hariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updatekurangdari10hariMouseExited
       btn_updatekurangdari10hari.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_updatekurangdari10hariMouseExited

    private void btn_telatSEMUAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_telatSEMUAMouseClicked
        telat();
    }//GEN-LAST:event_btn_telatSEMUAMouseClicked

    private void btn_telatSEMUAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_telatSEMUAMouseEntered
        btn_telatSEMUA.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_telatSEMUAMouseEntered

    private void btn_telatSEMUAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_telatSEMUAMouseExited
       btn_telatSEMUA.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_telatSEMUAMouseExited

    private void btn_telatKosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_telatKosMouseClicked
        telatRMK();
    }//GEN-LAST:event_btn_telatKosMouseClicked

    private void btn_telatKosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_telatKosMouseEntered
        btn_telatKos.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_telatKosMouseEntered

    private void btn_telatKosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_telatKosMouseExited
        btn_telatKos.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_telatKosMouseExited

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
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Kelola;
    private javax.swing.JPanel Navigasi;
    private javax.swing.JLabel PilihanRMK;
    private javax.swing.JComboBox<String> Pilihan_rmk;
    private javax.swing.JLabel RumahKosst;
    private javax.swing.JPanel Selected;
    private javax.swing.JLabel Semuadata;
    private javax.swing.JLabel Semuadata1;
    private javax.swing.JLabel Statistik;
    private javax.swing.JPanel btn_10harirmk;
    private javax.swing.JPanel btn_10harisemua;
    private javax.swing.JPanel btn_cari;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_minimize;
    private javax.swing.JPanel btn_pilihanrmk;
    private javax.swing.JPanel btn_semuadata;
    private javax.swing.JPanel btn_telatKos;
    private javax.swing.JPanel btn_telatSEMUA;
    private javax.swing.JPanel btn_update;
    private javax.swing.JPanel btn_updatekurangdari10hari;
    private javax.swing.JPanel btn_updatesemua;
    private javax.swing.JLabel cariclient;
    private javax.swing.JLabel dataterpilih;
    private javax.swing.JPanel garis;
    private javax.swing.JPanel garis1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel ket2;
    private javax.swing.JLabel ket3;
    private javax.swing.JButton kirimreminder;
    private com.source.button.logout logout1;
    private javax.swing.JTextField nama;
    private javax.swing.JPanel pnlbody;
    private javax.swing.JLabel semuadata;
    private javax.swing.JLabel semuadata1;
    private javax.swing.JTextField sisa_waktu;
    private javax.swing.JLabel sisawktu;
    private javax.swing.JLabel sisawktu1;
    private javax.swing.JTextField tgl_byr;
    private javax.swing.JTextField tgl_byrsemua;
    private javax.swing.JTextField tgl_byrsemua1;
    private javax.swing.JLabel tglbayar;
    private javax.swing.JLabel tglbayar1;
    private javax.swing.JLabel tglbayar2;
    private javax.swing.JTextField txt_client;
    // End of variables declaration//GEN-END:variables
}
