package com.virgil.study.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.virgil.study.mvp.R;
import com.virgil.study.mvp.presenter.IMainActivityPresenter;
import com.virgil.study.mvp.presenter.IMainActivityPresenterCompl;
import com.virgil.study.mvp.presenter.IMainActivityPresenterView;

public class MainActivity extends AppCompatActivity implements IMainActivityPresenterView {
    private TextView text;
    private IMainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new IMainActivityPresenterCompl(this);
        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setText("这是MVP模式");
    }

    private void initView(){
        text = findViewById(R.id.text);
    }

    @Override
    public void setText(String text){
        this.text.setText(text);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter = null;
    }
}
