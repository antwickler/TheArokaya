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

public class BasicFire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_fire);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<CustomItem> items = new ArrayList<>();
        items.add(new CustomItem("ชิรณัคคี", "อาจทำให้กายไม่รู้สึกสัมผัส ชิวหาไม่รู้รส หูตึง หน้าผากตึง อาการเหล่านี้เปลี่ยนไปเปลี่ยนมาได้"));
        items.add(new CustomItem("ปริณามัคคี", "อาจทำให้ขัดข้อมือ และข้อเท้า เป็นมองคร่อ คือ ปอดเป็นหวัด ให้ไอ ให้ปวดฝ่ามือ ฝ่าเท้า ให้ท้องแข็ง ให้ผะอืดผะอม"));
        items.add(new CustomItem("ปริทัยหัคคี", "อาจทำให้ร้อนภายใน แต่ภายนอกเย็น มือเย็นเท้าเย็น เหงื่อออก ชีพจรเดินไม่สะดวก"));
        items.add(new CustomItem("สันตัปปัคคี", "อาจทำให้กายเย็นชืด ถ้าขาดพลังงานจะทำให้ชีวิตอยู่ไม่ได้ หัวใจเต้นอ่อนลงเนื่องจากขาดพลังงาน"));

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
        intent = new Intent(BasicFire.this, BasicDisease.class);
        startActivity(intent);

        return true;
    }
}
