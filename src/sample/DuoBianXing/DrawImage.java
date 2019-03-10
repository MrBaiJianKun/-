package sample.DuoBianXing;

public interface DrawImage {
    public void draw();
    //定义抽象方法"画"
}
class Rectangle implements DrawImage {
    //矩形类实现了drawTest接口
    @Override
    public void draw() {
        //矩形类中实现draw()方法
        System.out.println("画矩形");
    }
}
class Square implements DrawImage {
    //正方形类实现了drawTest接口
    @Override
    public void draw() {
        //正方形类中实现draw()方法
        System.out.println("画正方形");
    }
}
class Diamond implements DrawImage {
    //菱形类实现了drawTest接口
    @Override
    public void draw() {
        //菱形类中实现draw()方法
        System.out.println("画菱形");
    }
}

