package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        Country country1 = new Country("China", new BigDecimal("1425855578"));
        Country country2 = new Country("United States", new BigDecimal("338947532"));
        Country country3 = new Country("Nigeria", new BigDecimal("220715286"));
        Country country4 = new Country("Brazil", new BigDecimal("215720292"));
        Country country5 = new Country("Germany", new BigDecimal("83322431"));

        List<Country> asia = new ArrayList<>();
        asia.add(country1);
        List<Country> northAmerica = new ArrayList<>();
        northAmerica.add(country2);
        List<Country> africa = new ArrayList<>();
        africa.add(country3);
        List<Country> southAmerica = new ArrayList<>();
        southAmerica.add(country4);
        List<Country> europe = new ArrayList<>();
        europe.add(country5);

        Continent asia1 = new Continent(asia);
        Continent northAmerica1 = new Continent(northAmerica);
        Continent africa1 = new Continent(africa);
        Continent southAmerica1 = new Continent(southAmerica);
        Continent europe1 = new Continent(europe);

        List<Continent> allContinents = new ArrayList<>();
        allContinents.add(asia1);
        allContinents.add(northAmerica1);
        allContinents.add(africa1);
        allContinents.add(southAmerica1);
        allContinents.add(europe1);
        World world = new World(allContinents);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("2284561119"), totalPopulation);
    }
}
