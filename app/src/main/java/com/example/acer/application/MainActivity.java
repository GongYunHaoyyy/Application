package com.example.acer.application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((EditText) findViewById(R.id.editText)).getText().toString();
                String psd = ((EditText) findViewById(R.id.editText2)).getText().toString();
                if (name.equals("yyy1yyy") && psd.equals("5201520")) {
                    Intent it = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(it);
                }
                else {
                    count++;
                    if (count < 2)
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("提示")
                                .setMessage("你输入的用户名或密码不正确\n" + "还有" + (3 - count) + "次机会哦")
                                .setPositiveButton("确定", null).show();
                    if (count == 3) {
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("提示")
                                .setMessage("输入错误3次，即将退出")
                                .setPositiveButton("确定",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                finish();
                                            }
                                        }
                                ).show();
                    }
                }
            }
        });
    }
}
