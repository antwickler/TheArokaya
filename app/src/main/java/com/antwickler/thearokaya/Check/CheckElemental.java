package com.antwickler.thearokaya.Check;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.antwickler.thearokaya.MainActivity;
import com.antwickler.thearokaya.R;

public class CheckElemental extends AppCompatActivity {

    private Button btCheck;
    private String[] item = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_elemental);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btCheck = findViewById(R.id.bt_check);
        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CheckElemental.this);
                builder.setTitle("กรุณาระบุเดือนเกิด");

                builder.setItems(item, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch(which)
                        {
                            // Fire
                            case 0:
                                Intent int1 = new Intent(CheckElemental.this, CheckFire.class);
                                startActivity(int1);
                                break;
                            case 1:
                                Intent int2 = new Intent(CheckElemental.this, CheckFire.class);
                                startActivity(int2);
                                break;
                            case 2:
                                Intent int3 = new Intent(CheckElemental.this, CheckFire.class);
                                startActivity(int3);
                                break;

                            // Wind
                            case 3:
                                Intent int4 = new Intent(CheckElemental.this, CheckWind.class);
                                startActivity(int4);
                                break;
                            case 4:
                                Intent int5 = new Intent(CheckElemental.this, CheckWind.class);
                                startActivity(int5);
                                break;
                            case 5:
                                Intent int6 = new Intent(CheckElemental.this, CheckWind.class);
                                startActivity(int6);
                                break;

                            // Water
                            case 6:
                                Intent int7 = new Intent(CheckElemental.this, CheckWater.class);
                                startActivity(int7);
                                break;
                            case 7:
                                Intent int8 = new Intent(CheckElemental.this, CheckWater.class);
                                startActivity(int8);
                                break;
                            case 8:
                                Intent int9 = new Intent(CheckElemental.this, CheckWater.class);
                                startActivity(int9);
                                break;

                            // Earth
                            case 9:
                                Intent int10 = new Intent(CheckElemental.this, CheckEarth.class);
                                startActivity(int10);
                                break;
                            case 10:
                                Intent int11 = new Intent(CheckElemental.this, CheckEarth.class);
                                startActivity(int11);
                                break;
                            case 11:
                                Intent int12 = new Intent(CheckElemental.this, CheckEarth.class);
                                startActivity(int12);
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
        intent = new Intent(CheckElemental.this, MainActivity.class);
        startActivity(intent);

        return true;
    }
}