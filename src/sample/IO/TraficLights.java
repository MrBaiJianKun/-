package sample.IO;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class TraficLights extends JFrame {
    private JPanel contentPane;
    private JLabel lblImage;

    public static void main(String[] args) {
        TraficLights frame = new TraficLights();
        frame.setVisible(true);
    }


    public TraficLights() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 250, 278);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setContentPane(contentPane);
        JPanel imagePane = new JPanel();
        imagePane.setBackground(Color.WHITE);
        imagePane.setBorder(new TitledBorder(null, "交通灯", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(imagePane);
        imagePane.setLayout(new BorderLayout(0, 0));
        lblImage = new JLabel("");
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Green.jpg")));
        imagePane.add(lblImage, BorderLayout.CENTER);

        Thread thread = new TurnColor(lblImage);
        thread.start();
    }
}

class TurnColor extends Thread {
    private JLabel lblImage;

    public TurnColor(JLabel lblImage) {
        this.lblImage = lblImage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Yellow.jpg")));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Red.jpg")));
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Green.jpg")));
        }
    }
}