package ru.netology.PublicApiService.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.netology.OrderContext.model.Order;
import ru.netology.PublicApiService.model.Profile;
import ru.netology.UserContext.model.User;

import java.util.List;

@Service
public class PublicApiService {

    private final RestTemplate restTemplate;

    public PublicApiService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Profile getProfileByUserId(String userId) {
        User user = restTemplate.getForObject(
                "http://localhost:8081/api/users/" + userId,
                User.class);
        List<Order> orders = restTemplate.getForObject(
                "http://localhost:8082/api/orders/by-user/" + userId,
                List.class);

        return new Profile(user, orders);
    }
}
