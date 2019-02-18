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

public class BasicWind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_wind);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<CustomItem> items = new ArrayList<>();
        items.add(new CustomItem("กุจฉิสยาวาตา", "อาจทำให้ท้องลั่น มีลมในท้องมากลำไส้บีบตัวผิดปกติ ทำให้ท้องร้องท้องลั่น ทำให้อาเจียน ทำให้ถ่ายไม่ออก"));
        items.add(new CustomItem("อังคมังคานุสารีวาตา", "อาจทำให้นัยน์ตาพร่า ให้วิงเวียน ให้เจ็บหน้าขา เจ็บกระดูกสันหลัง อาเจียนแต่ลมเปล่า กินอาหารไม่ได้ สะบัดร้อนสะบัดหนาว หมดสติ"));
        items.add(new CustomItem("อัสสาสะปัสสาสะวาตา", "อาจทำให้หายใจสั้นเข้าจนไม่ออกไม่เข้า และทำให้ตายได้"));
        items.add(new CustomItem("อุทธังคมาวาตา", "อาจทำให้มือเท้าขวักไขว่ ร้อนในท้องทุรนทุราย หาวเรอ หมดความรู้สึกสัมผัส เช่น ไขสันหลังถูกทำลาย"));
        items.add(new CustomItem("อโธคมาวาตา", "อาจทำให้ยกมือและเท้าไม่ไหว ให้เมื่อยขบไปทุกข้อ ทุกกระดูกเคลื่อนไหวร่างกายไม่ได้"));
        items.add(new CustomItem("โกฏฐาสยาวาตา", "อาจทำให้จุกเสียด แน่นหน้าอกอาเจียน ลมในลำไส้ใหญ่มีมากทำให้ผายลมมีกลิ่นเหม็น"));

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
        intent = new Intent(BasicWind.this, BasicDisease.class);
        startActivity(intent);

        return true;
    }
}
