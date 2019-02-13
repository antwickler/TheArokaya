package com.antwickler.thearokaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Member extends AppCompatActivity {

    public ProgressBar progressBar;
    public FirebaseAuth.AuthStateListener authListener;
    public FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        auth = FirebaseAuth.getInstance();

        final Button logout_action = (Button) findViewById(R.id.logout_action);
        logout_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Member.this, "Logged out!", Toast.LENGTH_LONG).show();
                signOut();
            }
        });
    }

    // Logged out
    public void signOut() {
        auth.signOut();
        Intent intent = new Intent(Member.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    // Back arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id != android.R.id.home) {
            return super.onOptionsItemSelected(item);
        }
        Intent intent;
        intent = new Intent(Member.this, MainActivity.class);
        startActivity(intent);

        return true;
    }
}
