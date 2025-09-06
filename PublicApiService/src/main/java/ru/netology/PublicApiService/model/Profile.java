package ru.netology.PublicApiService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.OrderContext.model.Order;
import ru.netology.UserContext.model.User;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Profile {
    private User user;
    private List<Order> orders;
}
