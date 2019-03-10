package sample.TaobaoMarket;



public class WallMarket  extends Market{

    @Override
    public void shop() {
        System.out.println(name+"实体店购买"+goods);
    }
}
