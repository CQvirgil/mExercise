package com.virgil.study.propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView helloworld;
    boolean isopen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloworld = findViewById(R.id.helloworld);
        helloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator;
                if (!isopen) {
                    objectAnimator = ObjectAnimator.ofFloat(
                            helloworld,
                            "translationY",
                            200F
                    );
                    isopen = true;
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(
                            helloworld,
                            "translationY",
                            -200F
                    );
                    isopen = false;
                }

                AnimatorSet set = new AnimatorSet();
                set.setDuration(200);
                set.setInterpolator(new BounceInterpolator());
                set.playTogether(objectAnimator);
                set.start();
            }
        });

    }
}
