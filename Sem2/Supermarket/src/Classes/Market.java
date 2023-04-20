package Classes;

import java.util.ArrayList;
import java.util.List;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/*Задаем маркету интерфесы поведения клиентов в маркете и интерфес очереди */
public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {
    /* Частный лист поведения в очереди */
    private List<iActorBehaviour> queue;

    /* Создаем список в очереди */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    /* Клиент приходит в магазин */
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    /* Добавление в очередь */
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    /* Киент уходит из магазина */
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    /* обновление в очереди: сделать заказ, получить заказ, покинуть очередь */
    public void update() {
        takeOrder();
        giveOrder();
        returnOrder();
        getMoney();
        releaseFromQueue();
    }

    @Override
    /* Получить заказ */
    public void giveOrder() {
        /* ограничено только теми, кто стоит в очереди */
        for (iActorBehaviour actor : queue) {
            /* если клиент сделал заказ */
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        /* Создаем список клиентов */
        List<Actor> releaseActors = new ArrayList<>();
        /* только для тех, кто в очереди */
        for (iActorBehaviour actor : queue) {
            /* если клиент получил заказ */
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    /* Клиент делает заказ */
    public void takeOrder() {
        /* Ограничено теми, кто стоит в очереди */
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    @Override
    /* Вернуть товар продавцу */
    public void returnOrder() {
        /* Ограничено теми, кто стоит в очереди */
        for (iActorBehaviour actor : queue) {
            if (!actor.isReturnOrder()) {
                actor.setReturnOrder(true);
                System.out.println(actor.getActor().getName() + " клиент вернул товар продавцу ");

            }
        }

    }

    @Override
    /* Вернуть деньги за товар клиенту */
    public void getMoney() {
        /* ограничено только теми, кто стоит в очереди */
        for (iActorBehaviour actor : queue) {
            /* если клиент вернул заказ */
            if (actor.isReturnOrder()) {
                actor.setReturnMoney(true);
                System.out.println(actor.getActor().getName() + " клиент получил деньги за товар ");
            }
        }

    }
}