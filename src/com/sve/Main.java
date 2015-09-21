package com.sve;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Item test = new Cylinder("Test", "4", "4", "1", "100.00");
        Item bla = new Cylinder("Bla", "12", "11", "15", "25.16");

        Container truck = new Truck("50", "40", "80");

        truck.addItemToContainer(test);
        truck.addItemToContainer(bla);

        Gson gson = new Gson();
        System.out.println(gson.toJson(test));
        System.out.println(gson.toJson(bla));
        System.out.println(gson.toJson(truck));

        System.out.println(truck.getTotalCargoPrice());
    }
}