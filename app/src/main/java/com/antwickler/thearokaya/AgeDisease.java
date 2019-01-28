package com.antwickler.thearokaya;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AgeDisease extends AppCompatActivity {

    private Button btAge;
    private String[] itemAge = {"ปฐมวัย (อายุ 1 วัน - 16 ปี)", "มัชฌิมวัย (อายุ 16 ปี - 30 ปี)", "ปัจฉิมวัย (อายุ 30 ปี เป็นต้นไป)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_disease);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btAge = findViewById(R.id.bt_age);
        btAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AgeDisease.this);
                builder.setTitle("อายุสมุฏฐาน");

                builder.setItems(itemAge, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch(which)
                        {
                            // 0 - 16
                            case 0:
                                Intent int1 = new Intent(AgeDisease.this, AgeEarly.class);
                                startActivity(int1);
                                break;

                            // 16 - 30
                            case 1:
                                Intent int2 = new Intent(AgeDisease.this, AgeMiddle.class);
                                startActivity(int2);
                                break;

                            // 30 - More
                            case 2:
                                Intent int3 = new Intent(AgeDisease.this, AgeEnd.class);
                                startActivity(int3);
                                break;

                            default:
                                System.out.println("No match");
                        }
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
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
        intent = new Intent(AgeDisease.this, MainActivity.class);
        startActivity(intent);

        return true;
    }
}
