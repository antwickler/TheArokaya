package com.antwickler.thearokaya;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Objects;

public class CheckElemental extends AppCompatActivity {

    private Button btCheck;
    private String[] item = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};

//    public int Element_ID = 0;
//    private String[] monthFire = {"มกราคม", "กุมภาพันธ์", "มีนาคม"};    // Element_ID = 4
//    private String[] monthEarth = {"ตุลาคม", "พฤศจิกายน", "ธันวาคม"};  // Element_ID = 3
//    private String[] monthWater = {"กรกฎาคม", "สิงหาคม", "กันยายน"};  // Element_ID = 2
//    private String[] monthWind = {"เมษายน", "พฤษภาคม", "มิถุนายน"};   // Element_ID = 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_elemental);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Fragment earth = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fm_earth);
//        Fragment water = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fm_water);
//        Fragment wind = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fm_wind);
//        Fragment fire = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fm_fire);

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
                                //
                                break;
                            case 1:
                                //
                                break;
                            case 2:
                                //
                                break;

                            // Wind
                            case 3:
                                //
                                break;
                            case 4:
                                //
                                break;
                            case 5:
                                //
                                break;

                            // Water
                            case 6:
                                //
                                break;
                            case 7:
                                //
                                break;
                            case 8:
                                //
                                break;

                            // Earth
                            case 9:
                                //
                                break;
                            case 10:
                                //
                                break;
                            case 11:
                                //
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

//        if(monthFire[0].equals(item) || monthFire[1].equals(item) || monthFire[2].equals(item)){
//            Element_ID = 4;
//        }
//        else if(monthEarth[0].equals(item) || monthEarth[1].equals(item) || monthEarth[2].equals(item)){
//            Element_ID = 3;
//        }
//        else if(monthWater[0].equals(item) || monthWater[1].equals(item) || monthWater[2].equals(item)){
//            Element_ID = 2;
//        }
//        else if(monthWind[0].equals(item) || monthWind[1].equals(item) || monthWind[2].equals(item)){
//            Element_ID = 1;
//        }
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