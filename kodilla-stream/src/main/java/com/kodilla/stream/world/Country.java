package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String country;
    private final BigDecimal population;

    public Country(String country, BigDecimal population) {
        this.country = country;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity(){
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country) && Objects.equals(population, country1.population);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, population);
    }
}
