package com.antwickler.thearokaya.Post;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.antwickler.thearokaya.MainActivity;
import com.antwickler.thearokaya.Post.fragment.MyPostsFragment;
import com.antwickler.thearokaya.Post.fragment.MyTopPostsFragment;
import com.antwickler.thearokaya.Post.fragment.RecentPostsFragment;
import com.antwickler.thearokaya.R;
import com.google.firebase.auth.FirebaseAuth;

public class Question extends Base {

    private static final String TAG = "Question";

    private FragmentPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create the adapter that will return a fragment for each section
        mPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            private final Fragment[] mFragments = new Fragment[] {
                    new RecentPostsFragment(),
                    new MyPostsFragment(),
                    new MyTopPostsFragment(),
            };
            private final String[] mFragmentNames = new String[] {
                    getString(R.string.heading_recent),
                    getString(R.string.heading_my_posts),
                    getString(R.string.heading_my_top_posts)
            };
            @Override
            public Fragment getItem(int position) {
                return mFragments[position];
            }
            @Override
            public int getCount() {
                return mFragments.length;
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return mFragmentNames[position];
            }
        };
        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // Button launches NewPost
        findViewById(R.id.fabNewPost).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Question.this, NewPost.class));
            }
        });
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
                Intent back = new Intent(Question.this, MainActivity.class);
                startActivity(back);
                break;

            case R.id.action_profile:
                Intent pf = new Intent(Question.this, Profile.class);
                startActivity(pf);
                break;

            case R.id.action_logout:
                FirebaseAuth.getInstance().signOut();
                Intent back2 = new Intent(Question.this, MainActivity.class);
                startActivity(back2);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
