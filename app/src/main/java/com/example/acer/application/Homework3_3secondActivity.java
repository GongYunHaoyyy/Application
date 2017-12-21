package com.example.acer.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Homework3_3secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3_3second);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        assert bundle != null;
        String date=bundle.getString("Date");
        TextView show=(TextView) findViewById(R.id.textView2);
        show.setText(date);

        Button button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String date=((EditText)findViewById(R.id.editText)).getText().toString();
                Intent intent=new Intent();
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
