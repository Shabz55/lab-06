package com.example.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CityListTest {
    public City mockCity(){
            return new City("Edmonton","AB");
    }

    public CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1,cityList.getCities().size());
        City c = new City("Regina","SK");
        cityList.add(c);
        assertEquals(2,cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));

    }
    @Test
    public void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(0)));
        City c = new City("Charlottetown","PEI");
        cityList.add(c);
        assertEquals(0,c.compareTo(cityList.getCities().get(0)));
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(1)));
    }
    @Test
    public void testAddException(){
        CityList cityList = mockCityList();
        City c = new City("Yelloknife", "NWT");
        cityList.add(c);
        assertThrows(IllegalArgumentException.class,()->{cityList.add(c);});

    }
    @Test
    public void testHasCity(){
        CityList cityList = mockCityList();
        City c = new City("Toronto","OT");
        assertEquals(0,cityList.hasCity(c));
        cityList.add(c);
        assertEquals(1,cityList.hasCity(c));
    }

    @Test
    public void testDeleteCity(){
        CityList cityList = mockCityList();
        City c = new City("New York","NY");
        cityList.add(c);
        assertEquals(1,cityList.hasCity(c));
        cityList.delete(c);
        assertEquals(0,cityList.hasCity(c));
    }

    @Test
    public void testDeleteException(){
        CityList cityList = mockCityList();
        City c = new City("London", "ENG");
        assertThrows(IllegalArgumentException.class,()->{cityList.delete(c);});
    }

    @Test
    public void testCitiesCount(){
        CityList cityList = mockCityList();
        City c = new City("Seoul","KOR");
        assertEquals(1,cityList.citiesCount());
        cityList.add(c);
        assertEquals(2,cityList.citiesCount());

    }
}

