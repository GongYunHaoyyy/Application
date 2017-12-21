package com.example.acer.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Homework3_3Activity extends AppCompatActivity {

    TextView show=(TextView) findViewById(R.id.textView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3_3);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String date=((EditText)findViewById(R.id.editText)).getText().toString();
                Intent intent = new Intent(Homework3_3Activity.this, Homework3_3secondActivity.class);
                intent.putExtra("Date",date);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent date){
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String returnedDate=date.getStringExtra("return_date");
                    show.setText(returnedDate);
                }
        }
    }
}
