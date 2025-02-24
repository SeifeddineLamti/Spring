package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.RestaurantService;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private RestaurantService restaurantService;
}
