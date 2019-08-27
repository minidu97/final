package com.example.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.material.animation.AnimationUtils;

public class Activity_Login extends AppCompatActivity {

    Button btnLogin;
    RelativeLayout rellay1,rellay2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
            Animation an2;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        rellay1 =(RelativeLayout)findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout)findViewById(R.id.rellay2);
        btnLogin=findViewById(R.id.btn_login);

        handler.postDelayed(runnable,2000);
        getSupportActionBar().hide();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ActivityMainPage=new Intent(getApplicationContext(), main_page.class);
                startActivity(ActivityMainPage);
            }
        });
    }
}
