package org.kks.restaurant.controllers;


import lombok.RequiredArgsConstructor;
import org.kks.restaurant.services.RestaurantTrainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dl")
@RequiredArgsConstructor
public class TrainController {

    private final RestaurantTrainService restaurantTrainService;

    @GetMapping("/train")
    public void train() {
        System.out.println("유입1");
        restaurantTrainService.process();
        System.out.println("유입2");
    }
}
