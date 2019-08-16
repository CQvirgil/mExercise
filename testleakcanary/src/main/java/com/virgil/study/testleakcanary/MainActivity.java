package com.virgil.study.testleakcanary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.squareup.leakcanary.RefWatcher;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       RefWatcher refWatcher =  app.getRefWatcher(this);
       refWatcher.watch(this);
       TestSingleton.getInstance(getApplicationContext());
    }

    public void Onclick(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
