package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.smarteist.hupfood.R;

public class VefificationActivity extends AppCompatActivity {
Button sub;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vefification);
        sub=findViewById(R.id.submit_btn);
        back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(VefificationActivity.this);
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
                Intent i = new Intent(VefificationActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
    }
}