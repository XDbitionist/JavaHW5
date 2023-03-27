package org.example.hw7;
import java.util.ArrayList;
import java.util.List;

interface QueueBehaviour {
    boolean isEmpty();
    void enqueue(Object item);
    Object dequeue();
    Object peek();
}

interface MarketBehaviour {
    void acceptOrder(Order order);
    Order completeOrder();
}

class Order {
    // поля и методы для заказа
}

class Market implements QueueBehaviour, MarketBehaviour {
    private List<Object> queue;
    private List<Order> orders;

    public Market() {
        queue = new ArrayList<>();
        orders = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void enqueue(Object item) {
        queue.add(item);
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    @Override
    public void acceptOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Order completeOrder() {
        if (orders.isEmpty()) {
            return null;
        }
        return orders.remove(0);
    }

    public void update() {
        // обновление состояния магазина, например, принятие заказов из очереди и отдача готовых заказов
    }
}

//Здесь класс Market реализует интерфейсы QueueBehaviour и MarketBehaviour,
// и содержит поля для списка людей в очереди (queue) и списка заказов (orders).
// Методы из интерфейса QueueBehaviour реализуют работу с очередью,
// а методы из интерфейса MarketBehaviour - добавление и получение заказов.
// Метод update() может быть реализован для обновления состояния магазина, например,
// для принятия заказов из очереди и отдачи готовых заказов.
