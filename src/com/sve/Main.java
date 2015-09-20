package com.sve;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Item cylinder = new Cylinder("Test", "2", "2", "2", "2");
        Container truck = new Truck("4", "4", "4");
        truck.addItemToContainer(cylinder);
        Gson gson = new Gson();
        System.out.println(gson.toJson(cylinder));
        System.out.println(gson.toJson(truck));
    }
}