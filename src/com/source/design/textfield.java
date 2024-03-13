package com.source.design;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class textfield extends JTextField{

    
    private Boolean MouseOver=false; 
    
    public textfield() {
        setBorder(new EmptyBorder(20,10,10,10));
        addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                MouseOver=true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                MouseOver=false;
                repaint();
            }
     
        });
    }
    
    //warna garis bawah
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
        Graphics2D g2= (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        int Width= getWidth();
        int Height= getHeight();
        if (MouseOver) {
            g2.setColor(new Color(171, 227, 226));
        } 
        else {
            g2.setColor(new Color(67, 151, 164));
        }
        g2.fillRect(2, Height - 1, Width - 4, 1);
        g2.dispose();
    }
    
    
}
