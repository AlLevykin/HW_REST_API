package ru.netology.OrderService.repository;

import org.springframework.stereotype.Repository;
import ru.netology.OrderContext.model.Order;

import java.util.List;

@Repository
public class OrderRepository {
    public List<Order> getOrdersByUserId(String userId) {
        List<Order> orders = List.of(
                new Order(
                        "1",
                        userId,
                        1000.00F,
                        List.of("Хлеб", "Молоко", "Картофель")),
                new Order(
                        "2",
                        userId,
                        5000.00F,
                        List.of("Сыр", "Масло", "Молоко"))
        );
        return orders;
    }
}
