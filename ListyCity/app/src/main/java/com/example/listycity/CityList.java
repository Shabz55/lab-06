package com.example.listycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This class holds the City type object in a list
 */
public class CityList {


    private List<City> cities = new ArrayList<>();


    /**
     * This method add city object to the cities list
     * @param city
     *          This is a City object we want to add to the list
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city){
        if(cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }


    /**
     * This method sorts the list of cities
     * @return
     *          a sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method checks if City object is in the cities list
     * @param city
     *          This is the city object we want to check if is in the list
     * @return
     *          1 if the city object is in the list and 0 if its not
     */
    public int hasCity(City city){
        if(cities.contains(city))
            return 1;
        else return 0;

    }

    /**
     * This method deletes City object from the cities list
     * @param city
     *      This is the City object we want to delete from the list
     * @throws IllegalArgumentException if City object is not in the list
     */
    public void delete(City city){
        if(hasCity(city) == 1)
            cities.remove(city);
        else throw new IllegalArgumentException();
    }

    /**
     * This method checks how many city objects are in the cities list
     * @return
     *      The number of City objects in the cities list
     */
    public int citiesCount(){
        return cities.size();
    }

}
