package com.antwickler.thearokaya;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

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
    }

    // Overflow menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem item;
        SpannableStringBuilder builder;
        Drawable drawable;
        ImageSpan imageSpan;
        ForegroundColorSpan itemColor = new ForegroundColorSpan(Color.parseColor("#00000A"));

        for(int i = 0; i < menu.size(); i++) {
            item = menu.getItem(i);
            builder = new SpannableStringBuilder().append("   ").append(item.getTitle(), itemColor, 0);

            if(item.getIcon() != null && item.getIcon().getConstantState() != null) {
                drawable = item.getIcon().getConstantState().newDrawable();
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                imageSpan = new ImageSpan(drawable);
                builder.setSpan(imageSpan, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                item.setTitle(builder);
            }
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Back arrow
            case android.R.id.home:
                Intent back = new Intent(Member.this, MainActivity.class);
                startActivity(back);
                break;

            // My posts
            case R.id.action_post:
                break;

            // Logged out
            case R.id.action_logout:
                auth.signOut();
                Intent intent = new Intent(Member.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
