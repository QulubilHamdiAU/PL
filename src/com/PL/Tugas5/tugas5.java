package com.PL.Tugas5;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author Qulubil Hamdi
 * @version 1.3
 * @since 1.0
 */
public class tugas5 extends JPanel {
    public tugas5() {
        this.setPreferredSize(new Dimension(750, 440));
        this.setBackground(Color.white);

    }

    /**
     *
     * @param c untuk memanggil class children paintComponent dan membentuk path grafik
     */
    protected void paintComponent(Graphics c) {
        super.paintComponent(c);
        Graphics2D c2 = (Graphics2D) c;
        GeneralPath cv = new GeneralPath(GeneralPath.WIND_EVEN_ODD);

        cv.moveTo(500, 50);
        cv.moveTo(500, 380);


        cv.moveTo(500,50);
        cv.lineTo(500,50);

        cv.moveTo(30,50);
        cv.lineTo(500,50);
        cv.moveTo(30,290);
        cv.lineTo(500,290);
        cv.moveTo(30,90);
        cv.lineTo(500,90);
        cv.moveTo(30,130);
        cv.lineTo(500,130);
        cv.moveTo(30,170);
        cv.lineTo(500,170);
        cv.moveTo(30,210);
        cv.lineTo(500,210);
        cv.moveTo(30,250);
        cv.lineTo(500,250);
        cv.moveTo(30,330);
        cv.lineTo(500,330);
        cv.moveTo(30,370);
        cv.lineTo(500,370);

        cv.closePath();
        c2.draw(cv);

        c2.drawString("80", 13, 50);
        c2.drawString("70", 13, 90);
        c2.drawString("60", 13, 130);
        c2.drawString("50", 13, 170);
        c2.drawString("40", 13, 210);
        c2.drawString("30", 13, 250);
        c2.drawString("20", 13, 290);
        c2.drawString("10", 13, 330);
        c2.drawString("0", 13, 370);


        c2.drawString("1", 75,395);
        c2.drawString("2", 150,395);
        c2.drawString("3", 225,395);
        c2.drawString("4", 300,395);
        c2.drawString("5", 375,395);
        c2.drawString("6", 450,395);
        c2.drawString("Jumlah Pengunjung (dalam ribu) ", 550,217);

        Shape g1 = new Rectangle2D.Double(60,270,40,100);
        Shape g2 = new Rectangle2D.Double(135,250,40,120);
        Shape g3 = new Rectangle2D.Double(210,190,40,180);
        Shape g4 = new Rectangle2D.Double(285,130,40,240);
        Shape g5 = new Rectangle2D.Double(355,250,40,120);
        Shape g6 = new Rectangle2D.Double(430,210,40,160);
        Shape sampel = new Rectangle2D.Double(540,210,7,7);


        c2.setColor(Color.green);
        c2.fill(g1);
        c2.fill(g2);
        c2.fill(g3);
        c2.fill(g4);
        c2.fill(g5);
        c2.fill(g6);
        c2.fill(sampel);


    }

    /**
     *
     * @param args launch grafik
     *
     */
    public static void main(String[] args) {
        JFrame rame = new JFrame("Data Rekapan Jumlah Pengunjung Mall Surabaya Square 3 per Tahun");

        rame.addWindowFocusListener(new WindowAdapter() {
            public  void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        tugas5 tugas = new tugas5();
        rame.getContentPane().add(tugas);
        rame.pack();
        rame.setVisible(true);
    }

}
