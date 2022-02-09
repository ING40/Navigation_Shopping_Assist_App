package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingAndHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_and_help);

        //选中后 -> 语速为慢
        Button slowSpeed = (Button) findViewById(R.id.b_slow); //定位Button: b_slow
        //功能未做-不会做

        //选中后 -> 语速为中
        Button midSpeed = (Button) findViewById(R.id.b_mid); //定位Button: b_mid
        //功能未做-不会做

        //选中后 -> 语速为快
        Button fastSpeed = (Button) findViewById(R.id.b_fast); //定位Button: b_fast
        //功能未做-不会做

        //选中后 -> 语音为标准女声
        Button womanVoiceOutput = (Button) findViewById(R.id.b_woman); //定位Button: b_woman
        //功能未做-不会做

        //选中后 -> 语音为标准男声
        Button manVoiceOutput = (Button) findViewById(R.id.b_man); //定位Button: b_man
        //功能未做-不会做

        //选中后 -> 调出“摄像头权限” (?)
        Button failToRead = (Button) findViewById(R.id.b_fail_to_read); //定位Button: b_fail_to_read
        //功能未做-不会做

        //跳转到?页面
        Button suggestion = (Button) findViewById(R.id.b_suggestion); //定位Button: b_suggestion
        //功能未做-不会做

        //跳转到?页面
        Button customerService = (Button) findViewById(R.id.b_customer_service); //定位Button: b_customer_service
        //功能未做-不会做

        //检查更新
        Button update = (Button) findViewById(R.id.b_update); //定位Button: b_update
        //功能未做-不会做

        //目前：返回主页面 期望：返回到跳转到此页面的页面（标记？）
        Button back = (Button) findViewById(R.id.b_setting_back); //定位Button: b_setting_back
        back.setOnClickListener(v -> {
            Intent intent=new Intent();
            intent.setClass(SettingAndHelp.this,MainActivity.class); //跳转至MainActivity
            startActivity(intent);
        });

    }

}