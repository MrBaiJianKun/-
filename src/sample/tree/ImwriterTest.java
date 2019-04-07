package sample.tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class ImgWriter extends JFrame implements ActionListener {

    JButton btn1;
    JButton btn2;
    JPanel mianban1;
    JPanel bootomPanel;
    JButton chooserBtn;
    JPanel centerPanel;
    JLabel imgLabel;
    Icon icon;


    public ImgWriter() {

        mianban1 = new JPanel();
        mianban1.setSize(200, 500);
        mianban1.setBackground(new Color(113, 234, 28));
        mianban1.setLocation(200, 500);


        mianban1.setLayout(new GridLayout(6, 1, 5, 5));


        bootomPanel = new JPanel();
        bootomPanel.setBackground(new Color(113, 234, 28));
        chooserBtn = new JButton("选择图片");
        btn1 = new JButton();
        btn2 = new JButton();


        bootomPanel.add(chooserBtn);
        centerPanel = new JPanel();
        centerPanel.setBackground(new Color(13, 234, 226));

        btn1.setSize(20, 40);
        this.add(mianban1, BorderLayout.WEST);
        this.add(bootomPanel, BorderLayout.SOUTH);
        this.add(centerPanel);
        //this.add(btn2);
        chooserBtn.addActionListener(this);

        this.setTitle("图片预览");
        setSize(1200, 1000);
        this.setLocation(400, 10);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);


    }

    public static void main(String[] args) {

        new ImgWriter();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooserBtn) {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("D:/"));
            fileChooser.setMultiSelectionEnabled(true);
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File[] files = fileChooser.getSelectedFiles();
                for (File f : files) {
                    System.out.println(f.getAbsolutePath());

                    try {
                        InputStream inputStream = new FileInputStream(f);
                        byte[] bytes = new byte[(int) f.length()];

                        inputStream.read(bytes);

                        icon = new ImageIcon(bytes);


                        imgLabel = new JLabel();
                        imgLabel.setIcon(icon);
                        centerPanel.add(imgLabel);
                        imgLabel.setSize(50, 100);

                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "IO异常");
                    }

                }
            }
        }

    }
}
