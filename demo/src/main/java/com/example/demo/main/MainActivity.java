package com.example.demo.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.demo.R;
import com.example.demo.one.OneActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        rv_content = findViewById(R.id.rv_content);
        List<MainFuncBean> list = mockList();
        MainAdapter mainAdapter = new MainAdapter(this, list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv_content.setLayoutManager(linearLayoutManager);
        rv_content.setAdapter(mainAdapter);
    }

    private List<MainFuncBean> mockList() {
        ArrayList<MainFuncBean> list = new ArrayList<>();
        list.add(new MainFuncBean(OneActivity.class, "MVP演示", "MVP简易示例"));
        list.add(new MainFuncBean(OneActivity.class, "MVP演示", "MVP简易示例"));

        return list;
    }
}
