package com.antwickler.thearokaya.Check;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.antwickler.thearokaya.R;

public class CheckEarth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_earth);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // Back arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id != android.R.id.home) {
            return super.onOptionsItemSelected(item);
        }
        Intent intent;
        intent = new Intent(CheckEarth.this, CheckElemental.class);
        startActivity(intent);

        return true;
    }
}
