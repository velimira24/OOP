package Classes;

public class PromotionalClient extends Actor {
    /* Номер акционного клиента */
    private int idSales;
    private String promotion;

    public PromotionalClient(String name, String promotion, int idSales) {
        super(name);
        /* номер клиента в акции */
        this.idSales = idSales;
        /* название акции */
        this.promotion = promotion;
    }

    /* возврат названия акции */
    public String getPromotion() {
        return promotion;
    }

    /* возврат номера клиента в акции */
    public int getIdSales() {
        return idSales;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    /* Возврат товара */
    @Override
    /* Проверяем, возвращены ли деньги */
    public boolean isReturMoney() {
        return super.isReturMoney;
    }

    @Override
    /* Проверяем, возвращен ли заказ */
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    @Override
    /* Возвращаем товар */
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }

    @Override
    /* Возвращаем деньги */
    public void setReturnMoney(boolean pickUpMoney) {
        super.isReturnOrder = pickUpMoney;
    }

    @Override
    public Actor getActor() {
        return this;
    }

}
