package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.hupfood.R;

public class SplashActivity extends AppCompatActivity {


    ImageView imageView_splash,textView_splash;
    Animation animationUptoDown , animationDownToUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView_splash = findViewById(R.id.txt_splash);
        imageView_splash = findViewById(R.id.image_splash);
        animationUptoDown = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.uptodownanim);
        animationDownToUp = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.downtotopanim);

        imageView_splash.setAnimation(animationUptoDown);
        textView_splash.setAnimation(animationDownToUp);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, com.example.foodapp.WelcomeActivity.class));
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();
            }
        },4000);
    }
}
