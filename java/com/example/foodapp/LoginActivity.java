package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.hupfood.R;

public class LoginActivity extends AppCompatActivity {
    ImageView back;
Button face,google,log;
TextView forget_pass,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        back=findViewById(R.id.back_btn);
        face=findViewById(R.id.face_btn);
        google=findViewById(R.id.google_btn);
        log=findViewById(R.id.login_btn);
        forget_pass=findViewById(R.id.forget_pass_txt);
        signup=findViewById(R.id.sign_up_txt);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Connecting Please Wait..."); // Setting Title
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
                Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Connecting Please Wait..."); // Setting Title
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
                Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
                progressDialog.setMessage("Loading..."); // Setting Message
                progressDialog.setTitle("Connecting Please Wait..."); // Setting Title
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
                Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,ResetPasswordActivity.class);
                startActivity(i);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });
    }
}