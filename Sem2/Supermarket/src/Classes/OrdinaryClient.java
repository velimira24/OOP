package Classes;

public class OrdinaryClient extends Actor {

    /* Имя клиента */
    public OrdinaryClient(String name) {
        /* super - отсылка к производному классу Actor */
        super(name);
    }

    @Override
    /* Возвращаем имя */
    public String getName() {
        return super.name;
    }

    @Override
    /* Проверяем, сделан ли заказ */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    /* Проверяем, получен ли заказ */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    /* Делаем заказ */
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    /* Получаем заказ */
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
