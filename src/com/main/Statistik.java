
package com.main;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections.map.HashedMap;
import java.io.File;
import java.util.Map;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class Statistik extends javax.swing.JFrame {

    JasperReport jreport;
    JasperDesign jdesign;
    JasperPrint Jprint;
    Map<String, Object> param = new HashMap<String, Object>();
  int xMouse,yMouse;
  
  
    public Statistik() {
        initComponents();
        loaddata();
    }

    private void semuadatatahunan(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Pemasukan");
        model.addColumn("ID Client");
        model.addColumn("Nama Client");
        model.addColumn("Nomor Kamar");
        model.addColumn("Rumah Kost");
        model.addColumn("Nominal");
        model.addColumn("Tanggal");
        try {
            int no=1;
            String sql = "SELECT pemasukan.*,client.nama_client,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM pemasukan\n" +
                            "INNER JOIN client ON client.id_client=pemasukan.id_client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                            "WHERE YEAR(tanggal_pemasukan)='"+tahun.getSelectedItem()+"'\n" +
                            "ORDER BY `pemasukan`.`tanggal_pemasukan`  ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                   res.getString("id_pemasukan"),
                   res.getString("id_client"),
                   res.getString("nama_client"),
                   res.getString("nomor_kamar"),
                   res.getString("nama_rumahkost"),
                   res.getString("Nominal"),
                   res.getString("tanggal_pemasukan"),
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar\n"+e.getMessage());
        }
    }
    
    private void semuadatabulanan(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Pemasukan");
        model.addColumn("ID Client");
        model.addColumn("Nama Client");
        model.addColumn("Nomor Kamar");
        model.addColumn("Rumah Kost");
        model.addColumn("Nominal");
        model.addColumn("Tanggal");
        try {
            int no = 1;
            String sql = "SELECT pemasukan.*,client.nama_client,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM pemasukan\n" +
                            "INNER JOIN client ON client.id_client=pemasukan.id_client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                            "WHERE MONTH(tanggal_pemasukan)='"+bulan.getSelectedItem()+"'\n" +
                            "ORDER BY `pemasukan`.`tanggal_pemasukan`  ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                   res.getString("id_pemasukan"),
                   res.getString("id_client"),
                   res.getString("nama_client"),
                   res.getString("nomor_kamar"),
                   res.getString("nama_rumahkost"),
                   res.getString("Nominal"),
                   res.getString("tanggal_pemasukan"),
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar\n"+e.getMessage());
        }
    }
    
    private void semuadatabulan_tahun(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Pemasukan");
        model.addColumn("ID Client");
        model.addColumn("Nama Client");
        model.addColumn("Nomor Kamar");
        model.addColumn("Rumah Kost");
        model.addColumn("Nominal");
        model.addColumn("Tanggal");
        try {
            int no = 1;
            String sql = "SELECT pemasukan.*,client.nama_client,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                            "FROM pemasukan\n" +
                            "INNER JOIN client ON client.id_client=pemasukan.id_client\n" +
                            "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                            "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                            "WHERE MONTH(tanggal_pemasukan)='"+bulan.getSelectedItem()+"' AND YEAR(tanggal_pemasukan)='"+tahun.getSelectedItem()+"'\n" +
                            "ORDER BY `pemasukan`.`tanggal_pemasukan`  ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                   res.getString("id_pemasukan"),
                   res.getString("id_client"),
                   res.getString("nama_client"),
                   res.getString("nomor_kamar"),
                   res.getString("nama_rumahkost"),
                   res.getString("Nominal"),
                   res.getString("tanggal_pemasukan"),
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar\n"+e.getMessage());
        }
    }
            
    private void carinama(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Pemasukan");
        model.addColumn("ID Client");
        model.addColumn("Nama Client");
        model.addColumn("Nomor Kamar");
        model.addColumn("Rumah Kost");
        model.addColumn("Nominal");
        model.addColumn("Tanggal");
        try {
            int no = 1;
            String sql = "SELECT pemasukan.*,client.nama_client,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                        "FROM pemasukan\n" +
                        "INNER JOIN client ON client.id_client=pemasukan.id_client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost\n" +
                        "WHERE client.nama_client LIKE '%"+txt_client.getText()+"%'\n" +
                        "ORDER BY `pemasukan`.`id_pemasukan`  ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                   res.getString("id_pemasukan"),
                   res.getString("id_client"),
                   res.getString("nama_client"),
                   res.getString("nomor_kamar"),
                   res.getString("nama_rumahkost"),
                   res.getString("Nominal"),
                   res.getString("tanggal_pemasukan"),
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukan data dengan benar\n"+e.getMessage());
        }
    }
    
    private void loaddata(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor");
        model.addColumn("ID Pemasukan");
        model.addColumn("ID Client");
        model.addColumn("Nama Client");
        model.addColumn("Nomor Kamar");
        model.addColumn("Rumah Kost");
        model.addColumn("Nominal");
        model.addColumn("Tanggal");
        try {
            int no=1;
            String sql = "SELECT pemasukan.*,client.nama_client,kamar.nomor_kamar,rumah_kost.nama_rumahkost\n" +
                        "FROM pemasukan\n" +
                        "INNER JOIN client ON client.id_client=pemasukan.id_client\n" +
                        "INNER JOIN kamar ON kamar.id_kamar=client.id_kamar\n" +
                        "INNER JOIN rumah_kost ON rumah_kost.id_rumahkost=kamar.id_rumahkost  \n" +
                        "ORDER BY `pemasukan`.`id_pemasukan`  ASC";
            Connection con = (Connection)Koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    no++,
                   res.getString("id_pemasukan"),
                   res.getString("id_client"),
                   res.getString("nama_client"),
                   res.getString("nomor_kamar"),
                   res.getString("nama_rumahkost"),
                   res.getString("Nominal"),
                   res.getString("tanggal_pemasukan"),
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
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
        RumahKosst = new javax.swing.JLabel();
        Client = new javax.swing.JLabel();
        Selected = new javax.swing.JPanel();
        Statistik = new javax.swing.JLabel();
        logout1 = new com.source.button.logout();
        pnlbody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cariclient = new javax.swing.JLabel();
        txt_client = new javax.swing.JTextField();
        btn_cari = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        garis = new javax.swing.JPanel();
        Semuadata = new javax.swing.JLabel();
        btn_semuadata = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        data_bulanan = new javax.swing.JLabel();
        semuabulan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bulan = new javax.swing.JComboBox<>();
        tahun = new javax.swing.JComboBox<>();
        data_bulanan1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bulan_tahun = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        garis1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tahunan = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        CetakPembayaran = new javax.swing.JLabel();
        id_pemasukan = new javax.swing.JTextField();
        IdPemasukan = new javax.swing.JLabel();
        btn_cetak = new javax.swing.JButton();

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

        Statistik.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Statistik.setForeground(new java.awt.Color(67, 151, 164));
        Statistik.setText("Laporan");
        Statistik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Statistik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatistikMouseClicked(evt);
            }
        });
        Selected.add(Statistik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        Navigasi.add(Selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 40));
        Navigasi.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        getContentPane().add(Navigasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, -1, 800));

        pnlbody.setBackground(new java.awt.Color(255, 255, 255));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CARI");
        btn_cari.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 50, 40));

        garis.setBackground(new java.awt.Color(67, 151, 164));
        garis.setPreferredSize(new java.awt.Dimension(4, 217));

        javax.swing.GroupLayout garisLayout = new javax.swing.GroupLayout(garis);
        garis.setLayout(garisLayout);
        garisLayout.setHorizontalGroup(
            garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        garisLayout.setVerticalGroup(
            garisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Semuadata.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Semuadata.setForeground(new java.awt.Color(0, 0, 0));
        Semuadata.setText("Tampilkan semua data pemasukan");

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

        data_bulanan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        data_bulanan.setForeground(new java.awt.Color(0, 0, 0));
        data_bulanan.setText("Pilih waktu terlebih dahulu");

        semuabulan.setBackground(new java.awt.Color(67, 151, 164));
        semuabulan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        semuabulan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semuabulanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                semuabulanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                semuabulanMouseExited(evt);
            }
        });
        semuabulan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TAMPILKAN");
        semuabulan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036" }));

        data_bulanan1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        data_bulanan1.setForeground(new java.awt.Color(0, 0, 0));
        data_bulanan1.setText("Tampilkan semua data pemasukan perbulan");

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
        jTextArea1.setText("Tampilkan semua data pemasukan\n perbulan berdasarkan tahun");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        bulan_tahun.setBackground(new java.awt.Color(67, 151, 164));
        bulan_tahun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bulan_tahun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bulan_tahunMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bulan_tahunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bulan_tahunMouseExited(evt);
            }
        });
        bulan_tahun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TAMPILKAN");
        bulan_tahun.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        garis1.setBackground(new java.awt.Color(67, 151, 164));
        garis1.setPreferredSize(new java.awt.Dimension(4, 217));

        javax.swing.GroupLayout garis1Layout = new javax.swing.GroupLayout(garis1);
        garis1.setLayout(garis1Layout);
        garis1Layout.setHorizontalGroup(
            garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        garis1Layout.setVerticalGroup(
            garis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Tampilkan semua data pemasukan\nberdasarkan tahun");
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        tahunan.setBackground(new java.awt.Color(67, 151, 164));
        tahunan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tahunan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tahunanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tahunanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tahunanMouseExited(evt);
            }
        });
        tahunan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TAMPILKAN");
        tahunan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        CetakPembayaran.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        CetakPembayaran.setForeground(new java.awt.Color(0, 0, 0));
        CetakPembayaran.setText("Cetak Pembayaran ");

        id_pemasukan.setBackground(new java.awt.Color(255, 255, 255));
        id_pemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        id_pemasukan.setForeground(new java.awt.Color(0, 0, 0));

        IdPemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        IdPemasukan.setForeground(new java.awt.Color(0, 0, 0));
        IdPemasukan.setText("ID Pemasukan :");

        btn_cetak.setBackground(new java.awt.Color(67, 151, 164));
        btn_cetak.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_cetak.setForeground(new java.awt.Color(255, 255, 255));
        btn_cetak.setText("CETAK");
        btn_cetak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlbodyLayout = new javax.swing.GroupLayout(pnlbody);
        pnlbody.setLayout(pnlbodyLayout);
        pnlbodyLayout.setHorizontalGroup(
            pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
            .addGroup(pnlbodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlbodyLayout.createSequentialGroup()
                            .addComponent(cariclient)
                            .addGap(79, 79, 79))
                        .addGroup(pnlbodyLayout.createSequentialGroup()
                            .addComponent(txt_client)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CetakPembayaran)
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(IdPemasukan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(garis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(data_bulanan)
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(data_bulanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semuabulan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulan_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(10, 10, 10)
                .addComponent(garis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tahunan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Semuadata)
                    .addComponent(btn_semuadata, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlbodyLayout.setVerticalGroup(
            pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbodyLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(garis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(garis1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addGroup(pnlbodyLayout.createSequentialGroup()
                        .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(data_bulanan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(data_bulanan1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semuabulan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(bulan_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tahunan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Semuadata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_semuadata, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlbodyLayout.createSequentialGroup()
                                .addComponent(cariclient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CetakPembayaran)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IdPemasukan)
                                    .addComponent(id_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cetak)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void KelolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelolaMouseClicked
        this.setVisible(false);
        new Kelola().setVisible(true);
    }//GEN-LAST:event_KelolaMouseClicked

    private void StatistikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatistikMouseClicked
        this.setVisible(false);
        new Statistik().setVisible(true);
    }//GEN-LAST:event_StatistikMouseClicked

    private void RumahKosstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RumahKosstMouseClicked
        this.setVisible(false);
        new RumahKost().setVisible(true);
    }//GEN-LAST:event_RumahKosstMouseClicked

    private void ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientMouseClicked
        this.setVisible(false);
        new Client().setVisible(true);
    }//GEN-LAST:event_ClientMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             int baris = jTable1.rowAtPoint(evt.getPoint());
       if (jTable1.getValueAt(baris, 1)==null){
          id_pemasukan.setText("");
        }else {
            id_pemasukan.setText(jTable1.getValueAt(baris, 1).toString());
           
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
        carinama();
    }//GEN-LAST:event_btn_cariMouseClicked

    private void btn_cariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseEntered
        btn_cari.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_cariMouseEntered

    private void btn_cariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseExited
        btn_cari.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_cariMouseExited

    private void btn_semuadataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_semuadataMouseClicked
        loaddata();
    }//GEN-LAST:event_btn_semuadataMouseClicked

    private void btn_semuadataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_semuadataMouseEntered
        btn_semuadata.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_semuadataMouseEntered

    private void btn_semuadataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_semuadataMouseExited
        btn_semuadata.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_semuadataMouseExited

    private void semuabulanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semuabulanMouseClicked
       semuadatabulanan();
    }//GEN-LAST:event_semuabulanMouseClicked

    private void semuabulanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semuabulanMouseEntered
        semuabulan.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_semuabulanMouseEntered

    private void semuabulanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semuabulanMouseExited
        semuabulan.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_semuabulanMouseExited

    private void bulan_tahunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulan_tahunMouseClicked
        semuadatabulan_tahun();
    }//GEN-LAST:event_bulan_tahunMouseClicked

    private void bulan_tahunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulan_tahunMouseEntered
        bulan_tahun.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_bulan_tahunMouseEntered

    private void bulan_tahunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bulan_tahunMouseExited
        bulan_tahun.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_bulan_tahunMouseExited

    private void tahunanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tahunanMouseClicked
        semuadatatahunan();
    }//GEN-LAST:event_tahunanMouseClicked

    private void tahunanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tahunanMouseEntered
        tahunan.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_tahunanMouseEntered

    private void tahunanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tahunanMouseExited
        tahunan.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_tahunanMouseExited

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try {
            File file = new File("src/com/main/LaporanPembayaran.jrxml");
            jdesign = JRXmlLoader.load(file);
            param.put("id", id_pemasukan.getText());
            jreport = JasperCompileManager.compileReport(jdesign);
            Jprint = JasperFillManager.fillReport(jreport, param, Koneksi.koneksiDB());
            JasperViewer.viewReport(Jprint,false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CetakPembayaran;
    private javax.swing.JLabel Client;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel IdPemasukan;
    private javax.swing.JLabel Kelola;
    private javax.swing.JPanel Navigasi;
    private javax.swing.JLabel RumahKosst;
    private javax.swing.JPanel Selected;
    private javax.swing.JLabel Semuadata;
    private javax.swing.JLabel Statistik;
    private javax.swing.JPanel btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_minimize;
    private javax.swing.JPanel btn_semuadata;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JPanel bulan_tahun;
    private javax.swing.JLabel cariclient;
    private javax.swing.JLabel data_bulanan;
    private javax.swing.JLabel data_bulanan1;
    private javax.swing.JPanel garis;
    private javax.swing.JPanel garis1;
    private javax.swing.JLabel home;
    private javax.swing.JTextField id_pemasukan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private com.source.button.logout logout1;
    private javax.swing.JPanel pnlbody;
    private javax.swing.JPanel semuabulan;
    private javax.swing.JComboBox<String> tahun;
    private javax.swing.JPanel tahunan;
    private javax.swing.JTextField txt_client;
    // End of variables declaration//GEN-END:variables
}
