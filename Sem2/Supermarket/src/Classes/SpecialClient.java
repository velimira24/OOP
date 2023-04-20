package Classes;

public class SpecialClient extends Actor {
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVIP() {
        return idVIP;
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
