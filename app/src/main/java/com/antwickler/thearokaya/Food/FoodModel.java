package com.antwickler.thearokaya.Food;

public class FoodModel {

    private String element, food, herb;

    public FoodModel(String element, String food, String herb) {
        this.element = element;
        this.food = food;
        this.herb = herb;
    }

    public String getElement() {
        return element;
    }

    public String getFood() {
        return food;
    }

    public String getHerb() {
        return herb;
    }
}
