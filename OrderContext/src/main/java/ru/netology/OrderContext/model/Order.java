package ru.netology.OrderContext.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private String id;
    private String userId;
    private Float sum;
    private List<String> items;
}
