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

public class BasicEarth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_earth);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final  ArrayList<CustomItem> items = new ArrayList<>();
        items.add(new CustomItem("กรีสัง", "อาจทำให้อุจจาระไม่ปกติ ธาตุเสียมักจะเนื่องมาแต่ตานขโมย และเป็นโรค เช่นริดสีดวง ถ้าไม่ถูกขับถ่ายออกอาจจะได้รับสารพิษทำให้มีอาการปวดและมึนศีรษะ"));
        items.add(new CustomItem("ตโจ", "อาจทำให้คันตามผิวหนัง ผิวหนังสากชาแสบร้อนตามผิวกาย เป็นโรคผิวหนัง เป็นผื่น แพ้ อักเสบ ลมพิษ กลาก เกลื้อน"));
        items.add(new CustomItem("กิโลมกัง", "อาจทำให้อวัยวะเสียหน้าที่ เช่น ปอดถูกทำลาย ให้มีอกแห้ง กระหายน้ำ หอบ ถ้าเกิดที่ลำไส้ ทำให้จุกเสียด ปวดท้อง ภายนอกให้ข้อติด"));
        items.add(new CustomItem("ทันตา", "อาจทำให้เป็นรำมะนาด เป็นฝีกราม ให้ปวดรากฟัน แมงกินฟัน ฟันโยก ฟันคลอน ฟันหลุด มีเลือดออก"));
        items.add(new CustomItem("นขา", "อาจทำให้ปวดที่โคนเล็บ ให้เล็บถอดเป็นหนองที่โคนเล็บ ให้เล็บเขียว เล็บดำ ทำให้ฟกบวม ห้อเลือด"));
        items.add(new CustomItem("นหารู", "อาจทำให้รู้สึกตึงรัดดวงใจ ให้มีอาการสวิงสวายและอ่อนแรง ทำให้กระสับกระส่าย ทำให้ปวด ให้ร้อนและเย็น เมื่อยและเสียวทั่วร่างกาย เป็นไข้สะบัดร้อนสะบัดหนาว ปวดศีรษะมาก"));
        items.add(new CustomItem("ปับผาสัง", "อาจทำให้กระหายน้ำ ให้ร้อนอก ให้หอบ ให้กาฬขึ้นปอด ปอดบวม ปอดแฟบ ปอดอักเสบ ไอเรื้อรัง"));
        items.add(new CustomItem("ปิหกัง", "อาจทำให้ขัดในอก ให้แน่นในอก ให้ท้องพอง ให้อ่อนเพลีย กำลังน้อย ไตวาย ความดันโลหิตสูง เลือดจาง เป็นนิ่วที่ไต ไตอักเสบ"));
        items.add(new CustomItem("มังสัง", "อาจทำให้เป็นผื่นแดงช้ำ อักเสบ เจ็บเสียว บวม เคลื่อนไหวไม่ได้ เป็นอัมพาต แข็งเกร็ง ฝ่อลีบ ลมพิษ เป็นหัด เหือด เป็นไฝ หูด เป็นพรายย้ำ"));
        items.add(new CustomItem("มัตถเกมัตถลุงคัง", "อาจทำให้หูตึง ให้ตามัว ให้ลิ้นกระด้าง คางแข็ง สมองบวม ปวดศีรษะเหมือนจะแตก หมดสติ เส้นเลือดสมองตีบและแตก เป็นอัมพาต"));
        items.add(new CustomItem("ยกนัง", "อาจทำให้ตับโต ตับย้อย เป็นฝีที่ตับ ตับช้ำ ตับทรุด ถ่ายอุจจาระเป็นเลือดสด เป็นมูกเลือด เป็นเลือดเน่า เพ้อไม่มีสติ โรคที่เกิดกับตับต่าง ๆ ปากเขียว ไอเป็นเลือด เท้าบวม การย่อยไม่ดี เป็นนิ่ว เป็นเบาหวาน"));
        items.add(new CustomItem("วักกัง", "อาจทำให้เป็นไข้หนาวสั่น ไข้เรื้อรัง ม้ามโตและหย่อน เป็นป้าง เจ็บม้าม ซีด ไม่มีภูมิคุ้มกัน"));
        items.add(new CustomItem("หทยัง", "อาจทำให้เกิดโรคหัวใจ ขี้โกรธ ให้หิวระส่ำระส่ายคลั่งไคล้ดุจเป็นบ้า ทำให้อ่อนเพลียไม่มีแรง"));
        items.add(new CustomItem("อัฐมิญชัง", "อาจทำให้มีอาการเป็นเหน็บชา ปวดกระดูก เลือดจาง ไม่มีภูมิคุ้มกัน ซีด ปวดศีรษะมาก ปวดกระบอกตา"));
        items.add(new CustomItem("อัฐิ", "อาจทำให้เจ็บปวดในแท่งกระดูก ปวดเมื่อยทุกข้อกระดูก กระดูกผิดรูป"));
        items.add(new CustomItem("อันตคุณัง", "อาจทำให้เรอ ให้หาว ให้อุจจาระเป็นโลหิต เป็นหนอง ให้เมื่อยบั่นเอว จุกเสียดสองราวข้าง ให้ร้อนท้องร้อนคอ ให้ลำไส้ตีบและอุดตัน ท้องอืด ลำไส้อักเสบ"));
        items.add(new CustomItem("อันตัง", "อาจทำให้ลงท้องเป็นกำลัง ให้แน่นในท้อง ปวดท้อง ท้องอืด ให้ลำไส้ตีบ กระเพาะอักเสบ เป็นแผล กรดไหลย้อน ทำให้ถ่ายอุจจาระเป็นมูกเลือด ผะอืดผะอม ริดสีดวงทวาร ท้องผูก"));
        items.add(new CustomItem("อุทริยัง", "อาจทำให้ลงท้องเหมือนกินยาถ่าย ให้จุกเสียด ให้พะอืดพะอม ให้สะอึก ให้ร้อนท้อง"));
        items.add(new CustomItem("เกสา", "อาจทำให้ ชา คัน และเจ็บตามหนังศีรษะ ผมร่วง ผมหงอก เป็นรังแค"));
        items.add(new CustomItem("โลมา", "อาจทำให้เจ็บตามผิวหนังและเจ็บทั่วทุกขุมขน ทำให้ขนร่วง ขนลุกขนชันทั้งตัว"));

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
        intent = new Intent(BasicEarth.this, BasicDisease.class);
        startActivity(intent);

        return true;
    }
}
