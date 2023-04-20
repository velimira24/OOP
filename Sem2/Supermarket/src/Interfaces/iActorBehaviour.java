package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /* Сделать заказ */
    void setMakeOrder(boolean makeOrder);

    /* Получить заказ */
    void setTakeOrder(boolean pickUpOrder);

    /* Проверка, сделан ли заказ */
    boolean isMakeOrder();

    /* Проверка, получен ли заказ */
    boolean isTakeOrder();

    /* Вернуть товар */
    void setReturnOrder(boolean makeOrder);

    /* Вернуть деньги за товар */
    void setReturnMoney(boolean pickUpOrder);

    /* Проверка, возвращены ли деньги */
    boolean isReturMoney();

    /* Проверка, возвращен ли товар */
    boolean isReturnOrder();

    Actor getActor();
}