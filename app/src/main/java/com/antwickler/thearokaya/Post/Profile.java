package com.antwickler.thearokaya.Post;

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
import android.widget.TextView;

import com.antwickler.thearokaya.MainActivity;
import com.antwickler.thearokaya.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profile extends AppCompatActivity {

    private static final String TAG = "Profile";

    private DatabaseReference mProfileReference;

    private TextView mNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mProfileReference = FirebaseDatabase.getInstance().getReference()
                .child("users");

        mNameView = findViewById(R.id.profile_name);
    }

    // Overflow menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem item;
        SpannableStringBuilder builder;
        Drawable drawable;
        ImageSpan imageSpan;
        ForegroundColorSpan itemColor = new ForegroundColorSpan(Color.parseColor("#FFFFFF"));

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
                Intent back = new Intent(Profile.this, Question.class);
                startActivity(back);
                break;

            case R.id.action_profile:
                break;

            case R.id.action_logout:
                FirebaseAuth.getInstance().signOut();
                Intent back2 = new Intent(Profile.this, MainActivity.class);
                startActivity(back2);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
