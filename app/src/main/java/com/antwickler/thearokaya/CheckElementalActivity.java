package com.antwickler.thearokaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CheckElementalActivity extends AppCompatActivity {

    public int Element_ID = 0;
    String[] monthFire = {"มกราคม", "กุมภาพันธ์", "มีนาคม"};    // Element_ID = 4
    String[] monthEarth = {"ตุลาคม", "พฤศจิกายน", "ธันวาคม"};  // Element_ID = 3
    String[] monthWater = {"กรกฎาคม", "สิงหาคม", "กันยายน"};  // Element_ID = 2
    String[] monthWind = {"เมษายน", "พฤษภาคม", "มิถุนายน"};   // Element_ID = 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_elemental);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        // Spinner element
//        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        spinner.setOnItemSelectedListener(this);
//
//        // Spinner Drop down elements
//        final List<String> month = new ArrayList<String>();
//        month.remove("");
//        month.add("มกราคม");
//        month.add("กุมภาพันธ์");
//        month.add("มีนาคม");
//        month.add("เมษายน");
//        month.add("พฤษภาคม");
//        month.add("มิถุนายน");
//        month.add("กรกฎาคม");
//        month.add("สิงหาคม");
//        month.add("กันยายน");
//        month.add("ตุลาคม");
//        month.add("พฤศจิกายน");
//        month.add("ธันวาคม");
//
//        // Creating adapter for spinner
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, month);
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(dataAdapter);

        Button month = (Button)findViewById(R.id.bt_check);
        month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showItemDialog();
            }
        });
    }

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        // On selecting a spinner item
//        String item = parent.getItemAtPosition(position).toString();
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
//         Showing selected spinner item
//         Toast.makeText(parent.getContext(), "Selected: " + Element_ID, Toast.LENGTH_LONG).show();
//    }
//
//    public void onNothingSelected(AdapterView<?> arg0) {
//        //
//    }

    private void showItemDialog() {
        FragmentManager fm = getSupportFragmentManager();
        final String[] items = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};
        ItemDialog dialog = ItemDialog.newInstance("Please enter your birth month", items);
        dialog.show(fm, null);
        dialog.setOnFinishDialogListener(new ItemDialog.OnFinishDialogListener() {
            @Override
            public void onFinishDialog(int selectedIndex) {
                if(monthFire[0].equals(selectedIndex) || monthFire[1].equals(selectedIndex) || monthFire[2].equals(selectedIndex)){
                    Element_ID = 4;
                }
                else if(monthEarth[0].equals(selectedIndex) || monthEarth[1].equals(selectedIndex) || monthEarth[2].equals(selectedIndex)){
                    Element_ID = 3;
                }
                else if(monthWater[0].equals(selectedIndex) || monthWater[1].equals(selectedIndex) || monthWater[2].equals(selectedIndex)){
                    Element_ID = 2;
                }
                else if(monthWind[0].equals(selectedIndex) || monthWind[1].equals(selectedIndex) || monthWind[2].equals(selectedIndex)){
                    Element_ID = 1;
                }
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
        intent = new Intent(CheckElementalActivity.this, MainActivity.class);
        startActivity(intent);

        return true;
    }
}