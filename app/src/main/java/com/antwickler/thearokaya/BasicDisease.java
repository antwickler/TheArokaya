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

public class BasicDisease extends AppCompatActivity {

    private Button btDisease;
    private String[] itemDisease = {"ปถวีธาตุ (ธาตุดิน)", "อาโปธาตุ (ธาตุน้ำ)", "วาโยธาตุ (ธาตุลม)", "เตโชธาตุ (ธาตุไฟ)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_disease);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btDisease = findViewById(R.id.bt_disease);
        btDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(BasicDisease.this);
                builder.setTitle("ธาตุสมุฏฐาน");

                builder.setItems(itemDisease, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch(which)
                        {
                            // Earth
                            case 0:
                                Intent int1 = new Intent(BasicDisease.this, BasicEarth.class);
                                startActivity(int1);
                                break;

                            // Water
                            case 1:
                                Intent int2 = new Intent(BasicDisease.this, BasicWater.class);
                                startActivity(int2);
                                break;

                            // Wind
                            case 2:
                                Intent int3 = new Intent(BasicDisease.this, BasicWind.class);
                                startActivity(int3);
                                break;

                            // Fire
                            case 3:
                                Intent int4 = new Intent(BasicDisease.this, BasicFire.class);
                                startActivity(int4);
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
        intent = new Intent(BasicDisease.this, MainActivity.class);
        startActivity(intent);

        return true;
    }
}
