package com.antwickler.thearokaya.Food;

import java.util.ArrayList;

public class GetFoodModelData {

    public static ArrayList<FoodModel> getFoodModelData() {
        ArrayList<FoodModel> arrayList = new ArrayList<>();

        // Earth
        arrayList.add(new FoodModel("ธาตุดิน", "ผักกูดผัดน้ำมันงา", "ผักกูด"));
        arrayList.add(new FoodModel("ธาตุดิน", "ดอกงิ้วทอดไข่", "ดอกงิ้ว"));
        arrayList.add(new FoodModel("ธาตุดิน", "แกงป่ากล้วยดิบ", "กล้วยดิบ"));
        arrayList.add(new FoodModel("ธาตุดิน", "คั่วขนุน", "ขนุน"));
        arrayList.add(new FoodModel("ธาตุดิน", "สะตอผัดกุ้ง", "สะตอ"));
        arrayList.add(new FoodModel("ธาตุดิน", "สมอไทยผัดน้ำมันหอย", "สมอไทย"));

        // Water
        arrayList.add(new FoodModel("ธาตุน้ำ", "แกงขี้เหล็กปลาย่าง", "ขี้เหล็ก"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "แกงส้มดอกแค", "ดอกแค"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "แกงอ่อมมะระขี้นก", "มะระขี้นก"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "ผัดมะระใส่ไข่", "มะระ"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "ห่อหมกใบยอ", "ใบยอ"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "แกงป่าสะเดาใส่ปลาหมอ", "สะเดา"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "แกงป่าสะเดาปิ้ง", "สะเดา"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "ต้มโคล้งยอดมะขาม", "ยอดมะขาม"));
        arrayList.add(new FoodModel("ธาตุน้ำ", "ใบยอผัดน้ำมันหอยใส่หมูบด", "ใบยอ"));

        // Wind
        arrayList.add(new FoodModel("ธาตุลม", "แกงปลาดุกใส่กะทือ", "กะทือ"));
        arrayList.add(new FoodModel("ธาตุลม", "ต้มข่าไก่", "ข่า"));
        arrayList.add(new FoodModel("ธาตุลม", "ต้มยำกุ้ง", "ตะไคร้"));
        arrayList.add(new FoodModel("ธาตุลม", "แกงหอยขมใส่ใบช้าพลู", "ใบช้าพลู"));
        arrayList.add(new FoodModel("ธาตุลม", "สมอไทยทุบผัดกับน้ำมัน", "สมอไทย"));
        arrayList.add(new FoodModel("ธาตุลม", "สมอไทยจิ้มน้ำพริก", "สมอไทย"));

        // Fire
        arrayList.add(new FoodModel("ธาตุไฟ", "ผัดผักบุ้ง", "ผักบุ้ง"));
        arrayList.add(new FoodModel("ธาตุไฟ", "แกงจืดตำลึง", "ตำลึง"));
        arrayList.add(new FoodModel("ธาตุไฟ", "ผัดสายบัวใส่พริก", "สายบัว"));
        arrayList.add(new FoodModel("ธาตุไฟ", "แกงส้มมะรุม", "มะรุม"));
        arrayList.add(new FoodModel("ธาตุไฟ", "แกงคูน", "คูน"));
        arrayList.add(new FoodModel("ธาตุไฟ", "แกงจืดมะระ", "มะระ"));
        arrayList.add(new FoodModel("ธาตุไฟ", "แกงส้มหยวกกล้วยใส่ปลาช่อน", "หยวกกล้วย"));
        arrayList.add(new FoodModel("ธาตุไฟ", "ยำผักกระเฉด", "กระเฉด"));
        arrayList.add(new FoodModel("ธาตุไฟ", "ผักหนามผัดน้ำมันหอย", "ผักหนาม"));

        return arrayList;
    }
}
