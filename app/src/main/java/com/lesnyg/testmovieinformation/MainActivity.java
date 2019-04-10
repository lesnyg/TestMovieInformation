package com.lesnyg.testmovieinformation;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements MovieInfoFragment.OnDetailInfoButtonListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onDetailInfoButton(int image, String title) {
        Intent intent = new Intent(this, DetailInfoActivity.class);
        Movie movie = new Movie();
        movie.setMovieImage(image);
        movie.setMovieTitle(title);
        intent.putExtra("movie", movie);
        startActivity(intent);
    }

}
