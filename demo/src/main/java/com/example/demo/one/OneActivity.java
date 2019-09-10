package com.example.demo.one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.demo.R;

public class OneActivity extends AppCompatActivity implements OneContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        TextView tv_content = findViewById(R.id.tv_content);
        tv_content.setText("MVP演示");
    }


    @Override
    public void onBtnClicked() {

    }
}
