package com.test.Restaurant.service;

import com.test.Restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    static{
        restaurants.add(new Restaurant("Beijing", "China Town" , 784949456,"Chinese",100,4.6,1000));
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
    public List<Restaurant> findAll(){
        return restaurants;
    }

    public Restaurant findByName(String name){
        for(Restaurant search : restaurants){
            if(search.getName().equals(name)) return search;
        }
        return null;
    }

    public void deleteRestaurant(String name){
        for(int idx = 0 ; idx < restaurants.size() ; idx++){
            if(restaurants.get(idx).getName().equals(name)) restaurants.remove(idx);
        }
    }


}
