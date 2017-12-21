package com.example.acer.application;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Homework2Activity extends AppCompatActivity {
    private List<Dog> dogList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework2);
        initDogs();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        DogAdapter adapter=new DogAdapter(dogList);
        recyclerView.setAdapter(adapter);
    }

    private void initDogs() {
        for(int i=0;i<6;i++)
        {
            Dog dog1=new Dog("比熊犬",R.drawable.bixiongquan);
            dogList.add(dog1);
            Dog dog2=new Dog("边境牧羊犬",R.drawable.bianjingmuyangquan);
            dogList.add(dog2);
            Dog dog3=new Dog("串串(小型)",R.drawable.chuanchuan);
            dogList.add(dog3);
            Dog dog4=new Dog("哈士奇",R.drawable.hashiqi);
            dogList.add(dog4);
            Dog dog5=new Dog("荷兰牧羊犬",R.drawable.helanmuyangquan);
            dogList.add(dog5);
            Dog dog6=new Dog("柯基",R.drawable.keji);
            dogList.add(dog6);
            Dog dog7=new Dog("秋田犬",R.drawable.qiutianquan);
            dogList.add(dog7);
            Dog dog8=new Dog("萨摩耶犬",R.drawable.samoyequan);
            dogList.add(dog8);
            Dog dog9=new Dog("西伯利亚雪橇犬",R.drawable.xiboliyaquan);
            dogList.add(dog9);
        }
    }
}
