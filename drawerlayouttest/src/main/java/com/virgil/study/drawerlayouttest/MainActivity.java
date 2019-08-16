package com.virgil.study.drawerlayouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.drawerlayoutActivity);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.drawerlayoutActivity:
                Intent intent = new Intent(MainActivity.this, drawerlayoutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
