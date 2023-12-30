package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.smarteist.hupfood.R;

public class SignUpActivity extends AppCompatActivity {
Button f,g,signup;
TextView log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText password = findViewById(R.id.pass_field);
        f=findViewById(R.id.face_btn);
        g=findViewById(R.id.google_btn);
        signup=findViewById(R.id.signup_btn);
        log =findViewById(R.id.login_txt);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(SignUpActivity.this);
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
                Intent i=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(SignUpActivity.this);
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
                Intent i=new Intent(SignUpActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(SignUpActivity.this);
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
                Intent i=new Intent(SignUpActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

    }


}