package org.skypro.marketplase.controller;


import org.skypro.marketplase.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * HTTP методы
 * GET - получение ресурса или создание ресурса
 * POST - создание русурсов
 * PUT - модификация  русурсов
 * PATCH - Частичная модификация  русурсов
 * DELETE - удаление  русурсов
 */

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("id") List<Integer> idsToAdd) {
        this.orderService.addToCart(idsToAdd);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return this.orderService.getItems();
    }

}
