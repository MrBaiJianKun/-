package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImgWriterTest extends JFrame implements ActionListener {

    JButton btn1,btn2,btn3,chooserBtn;
    JPanel centerPanel,bootomPanel,mianban1,cardpane1;
    JLabel imgLabel,imgLable2;
    Icon icon;
    private CardLayout cardLayout;


    public ImgWriterTest() {

        mianban1 = new JPanel();
        mianban1.setSize(200,500);
        mianban1.setBackground(new Color(113,234,28));
        mianban1.setLocation(200,500);
        mianban1.setLayout(new GridLayout(6, 1,5,5));



        cardpane1 = new JPanel();
        cardpane1.setSize(200,500);
        cardpane1.setBackground(new Color(243,150,23));
        cardpane1.setLocation(200,500);
        cardpane1.setLayout(new GridLayout(6, 1,5,5));


        bootomPanel = new JPanel();
        bootomPanel.setBackground(new Color(113,234,28));
        chooserBtn = new JButton("选择图片");
        btn1 = new JButton("上一张");
        btn2 = new JButton("下一张");
        btn3=new JButton("最后一张");
        bootomPanel.add(chooserBtn);
        bootomPanel.add(btn1);
        bootomPanel.add(btn2);
        bootomPanel.add(btn3);
        chooserBtn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);




        centerPanel = new JPanel();
        //cardLayout=new CardLayout();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground(new Color(13,234,226));
        //add(centPane1)


        cardpane1=new JPanel();
        cardLayout=new CardLayout();
        //cardpane1.setLayout(cardLayout);
        cardpane1.setBackground(new Color(243,150,23));
        //add(cardpane1);

        this.add(mianban1, BorderLayout.WEST);
        this.add(bootomPanel, BorderLayout.SOUTH);
        this.add(centerPanel,BorderLayout.WEST);
        this.add(cardpane1,BorderLayout.EAST);
        //this.add(btn2);

        this.setTitle("图片预览");
        setSize(1200, 1000);
        this.setLocation(400, 10);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);





    }

    public static void main(String[] args) {

        new ImgWriterTest();

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
                        imgLable2 = new JLabel();
                        imgLabel.setIcon(icon);
                        imgLable2.setIcon(icon);
                        centerPanel.add(imgLabel);
                        cardpane1.add(imgLable2);
                        imgLabel.setSize(50, 100);

                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "IO异常");

                    }
                   // if (e.getSource()==btn1){
                        cardLayout.previous(cardpane1);

                    }
                   // if (e.getSource()==btn3){
                        cardLayout.next(cardpane1);
                    }
                   // if (e.getSource()==btn2){
                        cardLayout.next(cardpane1);
                    }


                }
            }
      //  }

   // }
//}