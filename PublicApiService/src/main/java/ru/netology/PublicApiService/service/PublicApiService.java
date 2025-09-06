package ru.netology.PublicApiService.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.netology.OrderContext.model.Order;
import ru.netology.PublicApiService.model.Profile;
import ru.netology.UserContext.model.User;

import java.util.List;

@Service
public class PublicApiService {

    @Value("${api.user.service.url}")
    private String apiUserServiceUrl;
    @Value("${api.order.service.url}")
    private String apiOrderServiceUrl;

    private final RestTemplate restTemplate;

    public PublicApiService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Profile getProfileByUserId(String userId) {
        User user = restTemplate.getForObject(
                apiUserServiceUrl + userId,
                User.class);
        List<Order> orders = restTemplate.getForObject(
                apiOrderServiceUrl + userId,
                List.class);

        return new Profile(user, orders);
    }
}
