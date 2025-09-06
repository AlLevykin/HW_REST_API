package ru.netology.OrderService.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.OrderContext.model.Order;
import ru.netology.OrderService.repository.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> getOrdersByUserId(String userId) {
        return orderRepository.getOrdersByUserId(userId);
    }
}
