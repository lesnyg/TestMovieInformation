package com.lesnyg.testmovieinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailInfoActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        Intent intent = getIntent();
        Movie movie = (Movie) intent.getSerializableExtra("movie");


        imageView = findViewById(R.id.image_detail_info);
        imageView.setImageResource(movie.getMovieImage());

        textView = findViewById(R.id.text_title);
        textView.setText(movie.getMovieTitle());
    }

}
