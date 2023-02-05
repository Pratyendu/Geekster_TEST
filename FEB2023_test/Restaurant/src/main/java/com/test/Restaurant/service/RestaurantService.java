package com.test.Restaurant.service;

import com.test.Restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
    public List<Restaurant> findAll(){
        return restaurants;
    }

    public Restaurant findByName(String name){
        for(Restaurant search : restaurants){
            if(search.getName() == name) return search;
        }
        return null;
    }


}
