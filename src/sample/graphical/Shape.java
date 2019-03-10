package  sample.graphical;

/**
 * 图形类
 * @author 白建坤
 * 2019.3.10
 */
public abstract class Shape {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();
}
