package com.antwickler.thearokaya;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CardView m1, m2, m3, m4, m5, m6, m7;
    Intent i1, i2, i3, i4, i5, i6, i7;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ll = (LinearLayout) findViewById(R.id.ll);
        m1 = (CardView) findViewById(R.id.menu_1);
        i1 = new Intent(this, CheckElementalActivity.class);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i1);
            }
        });

        m2 = (CardView) findViewById(R.id.menu_2);
        i2 = new Intent(this, BasicDisease.class);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i2);
            }
        });

        m3 = (CardView) findViewById(R.id.menu_3);
        i3 = new Intent(this, FoodHerbal.class);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i3);
            }
        });

        m4 = (CardView) findViewById(R.id.menu_4);
        i4 = new Intent(this, AgeDisease.class);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i4);
            }
        });

//        m5 = (CardView) findViewById(R.id.menu_5);
//        i5 = new Intent(this, HospitalMap.class);
//        m5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(i5);
//            }
//        });
//
//        m6 = (CardView) findViewById(R.id.menu_6);
//        i6 = new Intent(this, StoreMap.class);
//        m6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(i6);
//            }
//        });
//
//        m7 = (CardView) findViewById(R.id.menu_7);
//        i7 = new Intent(this, User.class);
//        m7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(i6);
//            }
//        });
    }
}
