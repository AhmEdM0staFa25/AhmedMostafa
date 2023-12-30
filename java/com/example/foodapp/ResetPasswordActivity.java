package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.smarteist.hupfood.R;

public class ResetPasswordActivity extends AppCompatActivity {
ImageView back;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        back=findViewById(R.id.back_btn);
        send=findViewById(R.id.send_btn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(ResetPasswordActivity.this);
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
                Intent i = new Intent(ResetPasswordActivity.this, VefificationActivity.class);
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}