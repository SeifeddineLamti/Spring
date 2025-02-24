package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.IRestaurantService;

@RestController
@AllArgsConstructor
public class RestaurantController {
    private IRestaurantService restaurantService;
    //implementer les classes et injecter les interfaces
    //idha ken aandy interface wahda bark miselech naamel private RestaurantService restaurantService;
    //ama idha ken aandy barcha interfacet eli yimplimentiw linterface menu
    //waktha nesthak naamel private IRestaurantService restaurantService;
}
