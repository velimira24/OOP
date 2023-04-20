package Interfaces;

public interface iReturnOrder {
    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void returnOrder();

    void getMoney();

}
