package com.antwickler.thearokaya.Food;

import java.util.ArrayList;

public class GetFoodModelData {

    public static ArrayList<FoodModel> getFoodModelData() {
        ArrayList<FoodModel> arrayList = new ArrayList<>();

        arrayList.add(new FoodModel("ธาตุดิน", "ผักกูดผัดน้ำมันงา", "ผักกูด"));
        arrayList.add(new FoodModel("ธาตุดิน", "ดอกงิ้วทอดไข่", "ดอกงิ้ว"));
        arrayList.add(new FoodModel("ธาตุดิน", "แกงป่ากล้วยดิบ", "กล้วยดิบ"));
        arrayList.add(new FoodModel("ธาตุดิน", "คั่วขนุน", "ขนุน"));
        arrayList.add(new FoodModel("ธาตุดิน", "สะตอผัดกุ้ง", "สะตอ"));
        arrayList.add(new FoodModel("ธาตุดิน", "สมอไทยผัดน้ำมันหอย", "สมอไทย"));

        return arrayList;
    }
}
