package sample.TaobaoMarket;

public class TaobaoMarket  extends Market{

    @Override
    public void shop() {
        System.out.println(name+"实体店购买"+goods);
    }
}
