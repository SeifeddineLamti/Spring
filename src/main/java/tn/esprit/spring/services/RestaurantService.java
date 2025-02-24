package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Restaurant;
import tn.esprit.spring.repositories.RestaurantRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService{
    private RestaurantRepository restaurantRepository;

//    public RestaurantService(RestaurantRepository restaurantRepository) {
//        this.restaurantRepository = restaurantRepository;
//    }

    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant e) {
        return restaurantRepository.save(e);
    }

    @Override
    public Restaurant retrieveRestaurant(Long idRestaurant) {
        Optional<Restaurant> restaurant = restaurantRepository.findById(idRestaurant);
        return restaurant.orElse(null); // Retourne null si le restaurant n'existe pas
    }

    @Override
    public void removeRestaurant(Long idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }
}
