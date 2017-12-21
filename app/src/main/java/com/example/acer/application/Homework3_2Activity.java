package com.example.acer.application;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homework3_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3_2);
        //百度一下
        Button button = (Button) findViewById(R.id.button_bd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
                startActivity(it);
            }
        });
        //联系人
        Button button2 = (Button) findViewById(R.id.button_call);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));
                startActivity(it);
            }
        });
        //1008611
        Button button3 = (Button) findViewById(R.id.button_10861);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:1008611"));
                startActivity(it);
            }
        });
    }
}
