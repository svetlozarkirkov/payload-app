package com.sve;

import com.google.gson.Gson;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Container testContainer = new ContainerImplementation(
                new BigDecimal(2),
                new BigDecimal(4),
                new BigDecimal(6));

        Item box = new BoxImplementation(
                "Test Item",
                new BigDecimal(2),
                new BigDecimal(4),
                new BigDecimal(6),
                new BigDecimal("158.12"));

        Item cylinder = new CylinderImplementation(
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
    }
}