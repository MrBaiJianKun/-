package sample.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition() {
        setTitle("本场口使用流式布局");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        for (int i = 0; i < 10; i++) {
            container.add(new JButton("button" + i));
        }
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
class Poetry extends JFrame {
    public Poetry(){
        setTitle("流布局的使用");
        setResizable(false);
        Container c =getContentPane();
        setLayout( new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel jLabel = new JLabel("以下哪一部小说非天蚕土豆所著？");

        JLabel jLabe2= new JLabel("A.《斗破苍穹》");
        JLabel jLabe3 = new JLabel("B.《武动乾坤》");
        JLabel jLabe4 = new JLabel("C.《元尊》");
        JLabel jLabe5 = new JLabel("D.《大主宰》");
        c.add(jLabel);
        c.add(jLabe2);
        c.add(jLabe3);
        c.add(jLabe4);
        c.add(jLabe5);
        setSize(333,222);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Poetry();
    }
}