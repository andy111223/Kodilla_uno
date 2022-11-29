package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> continentList;

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPopulation = continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .collect(Collectors.toSet()).stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        return totalPopulation;
    }
}
