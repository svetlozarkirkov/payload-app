package com.sve;

import com.google.gson.Gson;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Container testContainer = new Container(
                new BigDecimal(2),
                new BigDecimal(4),
                new BigDecimal(6));

        Item box = new Box(
                "Test Item",
                new BigDecimal(2),
                new BigDecimal(4),
                new BigDecimal(6),
                new BigDecimal("158.12"));

        Item cylinder = new Cylinder(
                "Cylinder",
                new BigDecimal(2),
                new BigDecimal(4),
                new BigDecimal("15.43"));

        testContainer.addItemToContainer(box);
        testContainer.addItemToContainer(cylinder);

        Gson gson = new Gson();

        System.out.println(gson.toJson(box));
        System.out.println(gson.toJson(cylinder));
        System.out.println(gson.toJson(testContainer));

        System.out.println(testContainer.getTotalCargoPrice());

        System.out.println(box.getVolume());
        System.out.println(box.getPrice());

        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getPrice());
    }
}