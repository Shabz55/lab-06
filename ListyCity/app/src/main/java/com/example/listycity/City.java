package com.example.listycity;

/**
 * this class represents city
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCity(){
        return this.city;
    }
    String getProvince(){
        return this.province;
    }
    public void setProvince(String province){
        this.province = province;
    }


    /**
     * this methods compares City objects based on their city
     * @param o the object to be compared
     * @return 0, -1 or 1 if two values are equal, less than, or greater than
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCity());
    }
}
