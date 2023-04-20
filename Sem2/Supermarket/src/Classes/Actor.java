package Classes;

import Interfaces.iActorBehaviour;
/*абстрактный класс. Задает шаблон работы 
для других дочерних, не абстрактных классов */

/*Задаем абстрактному классу поведенческий шаблон(интерфейс) */
public abstract class Actor implements iActorBehaviour {
    /* Задаем имя */
    protected String name;
    /* Получен ли заказ? */
    protected boolean isTakeOrder;
    /* Сделан ли заказ? */
    protected boolean isMakeOrder;
    /* Возвращен ли товар? */
    protected boolean isReturnOrder;
    /* Возвращены ли деньги за товар? */
    protected boolean isReturMoney;

    /* Вводим имя */

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}