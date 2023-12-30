package com.example.foodapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.hupfood.R;

public class WelcomeActivity extends AppCompatActivity {
ImageView g , f;
Button start,skip;
TextView sign;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        f=findViewById(R.id.face);
        g=findViewById(R.id.gmail);
        start=findViewById(R.id.start);
        sign=findViewById(R.id.txtsignup);
        skip = findViewById(R.id.skip);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(WelcomeActivity.this);
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Connecting With Facebook Account"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(10000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progressDialog.dismiss();
                    }
                }).start();
                Intent i = new Intent(WelcomeActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(WelcomeActivity.this);
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Connecting With Google Account"); // Setting Title
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(10000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        progressDialog.dismiss();
                    }
                }).start();
                Intent i = new Intent(WelcomeActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this, SignUpActivity.class);
                startActivity(i);
            }

        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }



}