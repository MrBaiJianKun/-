package sample.TaobaoMarket;

public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name="沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        //使用派生类对象创建抽象类对象
        market.name = "淘宝";
        market.goods = "韩度衣舍衣裙";
        market.shop();
    }
}
