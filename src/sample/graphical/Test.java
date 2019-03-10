package sample.graphical;

/**
 * @author 白建坤
 * 2019.3.10
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.name = "圆形";
        System.out.println(circle.name + "面积：" + circle.getArea());
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.name = "矩形";
        System.out.println(rectangle.name + "面积：" + rectangle.getArea());
    }
}

