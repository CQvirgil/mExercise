package com.virgil.study.drawerlayouttest;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class drawerlayoutActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawerlayout);
        drawerLayout = findViewById(R.id.drawer_layout);
        content = findViewById(R.id.content);
        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            drawerLayout.openDrawer(GravityCompat.END);
            }
        });
    }
}
