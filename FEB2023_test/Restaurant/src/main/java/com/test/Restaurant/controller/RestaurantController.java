package com.test.Restaurant.controller;


import com.test.Restaurant.model.Restaurant;
import com.test.Restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant-app")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

    //http://localhost:8080/api/v1/restaurant-app/add-restaurant

    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurants(){
        return restaurantService.findAll();
    }

    @GetMapping("/find-restaurant/name/{name}")
    public Restaurant findByName(@PathVariable String name){
        return restaurantService.findByName(name);
    }

    @DeleteMapping("/delete-restaurant/name/{name}")
    public void deleteRestaurant(@PathVariable String name){
        restaurantService.deleteRestaurant(name);
    }

}
