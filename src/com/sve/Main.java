package com.sve;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Container testContainer = new Container(
                new BigDecimal("2.3285237583578"),
                new BigDecimal("4.75647567"),
                new BigDecimal("6.35723652375"));

        Item box = new Box(
                "Test Item",
                new BigDecimal("2.845638578"),
                new BigDecimal("4.23734623657"),
                new BigDecimal("6.52646"),
                new BigDecimal("158.122113654346"));

        Item cylinder = new Cylinder(
                "Cylinder",
                new BigDecimal("2.1241242525"),
                new BigDecimal("4.5236574576"),
                new BigDecimal("15.432135246262"));

        testContainer.addItemToContainer(box);
        testContainer.addItemToContainer(cylinder);

        System.out.println("Test container total price: " + testContainer.getTotalCargoPrice());
        System.out.println("Test container total volume: " + testContainer.getCargoItemsTotalVolume());

        System.out.println("Box volume: " + box.getVolume());
        System.out.println("Box price: " + box.getPrice());

        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("Cylinder price: " + cylinder.getPrice());
    }
}