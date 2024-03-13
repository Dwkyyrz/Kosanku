
package com.main;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.UIManager;


public class Register extends javax.swing.JFrame {

 int xMouse,yMouse;
    public Register() {
        initComponents();
        resetautoincrement();
        
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
    
    
class gradientJPanel extends JPanel{
    protected void paintComponent(Graphics q){
        Graphics2D g2d =(Graphics2D) q;
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color (171, 227, 226);
        Color c2 = new Color (67, 151, 164);
        GradientPaint gp = new GradientPaint(0,0, c1, 180,h, c2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h );
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Design = new gradientJPanel();
        icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Table_form = new javax.swing.JPanel();
        bg_btn = new javax.swing.JPanel();
        btn_daftar = new javax.swing.JPanel();
        daftart = new javax.swing.JLabel();
        btn_masuk = new javax.swing.JPanel();
        masuk = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        txt_nama = new com.source.design.textfield();
        nomor = new javax.swing.JLabel();
        txt_nomor = new com.source.design.textfield();
        email = new javax.swing.JLabel();
        txt_email = new com.source.design.textfield();
        password = new javax.swing.JLabel();
        txt_password = new com.source.design.textfield();
        daftar = new com.source.button.Daftar();
        close1 = new com.source.button.close();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1381, 810));
        setMinimumSize(new java.awt.Dimension(1381, 810));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1381, 810));
        setSize(new java.awt.Dimension(1381, 810));
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

        Design.setBackground(new java.awt.Color(0, 153, 153));
        Design.setPreferredSize(new java.awt.Dimension(685, 830));
        Design.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/source/img/Illustration.png"))); // NOI18N
        Design.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 102));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selamat Datang");
        Design.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KOSANKU");
        Design.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, -1, -1));

        getContentPane().add(Design, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Table_form.setBackground(new java.awt.Color(255, 255, 255));
        Table_form.setPreferredSize(new java.awt.Dimension(620, 750));

        bg_btn.setBackground(new java.awt.Color(67, 151, 164));
        bg_btn.setForeground(new java.awt.Color(67, 151, 164));
        bg_btn.setPreferredSize(new java.awt.Dimension(620, 55));

        btn_daftar.setBackground(new java.awt.Color(54, 138, 151));
        btn_daftar.setToolTipText("");
        btn_daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_daftar.setPreferredSize(new java.awt.Dimension(310, 55));
        btn_daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarMouseExited(evt);
            }
        });
        btn_daftar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        daftart.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        daftart.setForeground(new java.awt.Color(255, 255, 255));
        daftart.setText("DAFTAR");
        btn_daftar.add(daftart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btn_masuk.setBackground(new java.awt.Color(67, 151, 164));
        btn_masuk.setToolTipText("");
        btn_masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_masuk.setPreferredSize(new java.awt.Dimension(310, 55));
        btn_masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_masukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_masukMouseExited(evt);
            }
        });
        btn_masuk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masuk.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        masuk.setForeground(new java.awt.Color(255, 255, 255));
        masuk.setText("MASUK");
        btn_masuk.add(masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        javax.swing.GroupLayout bg_btnLayout = new javax.swing.GroupLayout(bg_btn);
        bg_btn.setLayout(bg_btnLayout);
        bg_btnLayout.setHorizontalGroup(
            bg_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_btnLayout.createSequentialGroup()
                .addComponent(btn_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bg_btnLayout.setVerticalGroup(
            bg_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_btnLayout.createSequentialGroup()
                .addGroup(bg_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form.setBackground(new java.awt.Color(255, 255, 255));

        nama.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(67, 151, 164));
        nama.setText("Nama");

        txt_nama.setBackground(new java.awt.Color(255, 255, 255));
        txt_nama.setBorder(null);
        txt_nama.setForeground(new java.awt.Color(67, 151, 164));
        txt_nama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nama.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        nomor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nomor.setForeground(new java.awt.Color(67, 151, 164));
        nomor.setText("Nomor");

        txt_nomor.setBackground(new java.awt.Color(255, 255, 255));
        txt_nomor.setBorder(null);
        txt_nomor.setForeground(new java.awt.Color(67, 151, 164));
        txt_nomor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nomor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        email.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(67, 151, 164));
        email.setText("Email");

        txt_email.setBackground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(null);
        txt_email.setForeground(new java.awt.Color(67, 151, 164));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        password.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(67, 151, 164));
        password.setText("Password");

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(null);
        txt_password.setForeground(new java.awt.Color(67, 151, 164));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomor)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(nama)
                    .addContainerGap(510, Short.MAX_VALUE)))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1079, Short.MAX_VALUE))
            .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(nama)
                    .addContainerGap(470, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Table_formLayout = new javax.swing.GroupLayout(Table_form);
        Table_form.setLayout(Table_formLayout);
        Table_formLayout.setHorizontalGroup(
            Table_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Table_formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        Table_formLayout.setVerticalGroup(
            Table_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Table_formLayout.createSequentialGroup()
                .addComponent(bg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Table_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 80, -1, -1));
        getContentPane().add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1254, 12, 87, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_daftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMouseEntered
        btn_daftar.setBackground(new Color(42,  126,  139));
    }//GEN-LAST:event_btn_daftarMouseEntered

    private void btn_daftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMouseExited
        btn_daftar.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_daftarMouseExited

    private void btn_masukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseEntered
        btn_masuk.setBackground(new Color(54,  138,  151));
    }//GEN-LAST:event_btn_masukMouseEntered

    private void btn_masukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseExited
        btn_masuk.setBackground(new Color(67, 151, 164));
    }//GEN-LAST:event_btn_masukMouseExited

    private void btn_masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_masukMouseClicked

    private void daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseClicked
        try {
            String sql= "INSERT INTO profil (username,email,password,nohp) VALUES ('"+txt_nama.getText()+"','"
            +txt_email.getText()+"','"+txt_password.getText()+"','"
            +txt_nomor.getText()+"')";
            Connection con=(Connection)Koneksi.koneksiDB();
            PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil mendaftar");
            this.setVisible(false);
            new Login().setVisible(true);
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Isikan data dengan benar");
        }
    }//GEN-LAST:event_daftarMouseClicked

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
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Design;
    private javax.swing.JPanel Table_form;
    private javax.swing.JPanel bg_btn;
    private javax.swing.JPanel btn_daftar;
    private javax.swing.JPanel btn_masuk;
    private com.source.button.close close1;
    private com.source.button.Daftar daftar;
    private javax.swing.JLabel daftart;
    private javax.swing.JLabel email;
    private javax.swing.JPanel form;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel masuk;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nomor;
    private javax.swing.JLabel password;
    private com.source.design.textfield txt_email;
    private com.source.design.textfield txt_nama;
    private com.source.design.textfield txt_nomor;
    private com.source.design.textfield txt_password;
    // End of variables declaration//GEN-END:variables
}
