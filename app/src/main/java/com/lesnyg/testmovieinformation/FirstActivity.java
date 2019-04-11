package com.lesnyg.testmovieinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lesnyg.testmovieinformation.test12.MainActivity;
import com.lesnyg.testmovieinformation.test3.Test3Activity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void button1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(this, Test3Activity.class);
        startActivity(intent);

    }
}
