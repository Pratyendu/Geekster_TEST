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

    public void updateRestaurant(String name , Restaurant newRestaurant){
        Restaurant search = findByName(name);

        search.setName(newRestaurant.getName());
        search.setLocation(newRestaurant.getLocation());
        search.setNumber(newRestaurant.getNumber());
        search.setCuisine(newRestaurant.getCuisine());
        search.setBudget(newRestaurant.getBudget());
        search.setTotalStaff(newRestaurant.getTotalStaff());
        search.setRating(newRestaurant.getRating());
    }


}
