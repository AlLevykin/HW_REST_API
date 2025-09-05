package ru.netology.UserService.repository;

import org.springframework.stereotype.Repository;
import ru.netology.UserContext.model.User;

@Repository
public class UserRepository {
    public User getUserById(String id) {
        return new User(
                id,
                "John Doe",
                "john.doe@gmail.com",
                "8(495)123-45-67",
                "Russia, Moscow, Red Square, 1"
        );
    }
}
