package com.antwickler.thearokaya.Basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.antwickler.thearokaya.R;

import java.util.ArrayList;

public class BasicWater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_water);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<CustomItem> items = new ArrayList<>();
        items.add(new CustomItem("บุพโพ", "อาจทำให้ไอเบื่ออาหาร ให้รูปร่างซูบผอม กินอาหารมารู้รส เป็นหืด หนองแตกไหลออกมา"));
        items.add(new CustomItem("ปิตตัง", "น้ำดีในฝักอาจทำให้มีอาการคลุ้มคลั่งเป็นบ้า มีไข้สูง มีอาการให้ตกใจง่าย น้ำดีนอกฝักอาจทำให้ปวดศีรษะ ตัวร้อน สะท้านร้อนสะท้านหนาว ตาเหลือง ทำให้มีปัสสาวะและอุจจาระเหลือง"));
        items.add(new CustomItem("มูตตัง", "อาจทำให้ปัสสาวะสีขาว สีเหลือง สีดำ สีแดง เป็นนิ่ว ปวดท้อง ให้ขัดเบาเป็นอาการของนิ่วปัสสาวะ"));
        items.add(new CustomItem("ลสิกา", "อาจทำให้เจ็บตามข้อ และปวดในแท่งกระดูกทั่วตัว ทำให้ขัดและตึงทุกข้อของร่างกาย"));
        items.add(new CustomItem("วสา", "อาจทำให้ผิวเหลือง ให้ตาเหลือง ให้ลงท้อง อาเจียน มือและเท้าบวม"));
        items.add(new CustomItem("สิงฆานิกา", "อาจทำให้ปวดในสมอง ให้ตามัว ให้น้ำมูกตก ปวดหัว เวียนหัว"));
        items.add(new CustomItem("อัสสุ", "อาจทำให้ตาเป็นฝ้า น้ำตาไหล ตาแฉะ ตาเป็นต้อ ตาแห้ง ตาอักเสบ ตาบวม"));
        items.add(new CustomItem("เขโฬ", "อาจทำให้เจ็บคอเป็นเม็ดในคอและโคนลิ้น ฟันแห้ง ปากคอเปื่อย คอแห้ง"));
        items.add(new CustomItem("เมโท", "อาจทำให้ผิวสากและชา ผิวหนังผุดเป็นแผ่น เป็นวงเป็นดวง ปวดแสบปวดร้อนแตกเป็นน้ำเหลืองไหล"));
        items.add(new CustomItem("เสมหัง", "อาจทำให้ไอเจ็บคอ คอแห้ง เป็นหืด (ศอเสมหะ) ให้ผอมเหลือง เป็นตาน เป็นเถาให้แสบในคอ อกแห้ง (อุระเสมหะ) ให้อุจจาระมีเสมหะโลหิต เช่น มูกเลือด (คูถเสมหะ)"));
        items.add(new CustomItem("เสโท", "อาจทำให้อ่อนเพลีย เชื่อมซึม ตัวเย็น ตัวซีด สวิงสวาย ซูบผอม"));
        items.add(new CustomItem("โลหิตัง", "อาจทำให้ตัวร้อนเป็นไข้ ให้คลั่งเพ้อ ให้ปัสสาวะแดง ให้เป็นเม็ด ตามผิวหนัง เช่นเป็นประดงต่าง ๆ เป็นปานดำ ปานแดง ให้ตัวเย็น"));

        CustomAdapter adapter = new CustomAdapter(this, items);
        RecyclerView rcv = (RecyclerView)findViewById(R.id.recyclerView);
        rcv.setAdapter(adapter);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter.setOnClickListener(new CustomAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View item, int position) {
                String str = items.get(position).textName;
                // Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Back arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id != android.R.id.home) {
            return super.onOptionsItemSelected(item);
        }
        Intent intent;
        intent = new Intent(BasicWater.this, BasicDisease.class);
        startActivity(intent);

        return true;
    }
}
