package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.hupfood.R;

public class PaymentActivity extends AppCompatActivity {
ImageView apple,pp,oo,changed,back;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        apple=findViewById(R.id.imageView3 );
        oo=findViewById(R.id.imageView4 );
        pp=findViewById(R.id.imageView5 );
        changed=findViewById(R.id.imageView7 );
        button=findViewById(R.id.button);
        back=findViewById(R.id.imageView);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ProgressDialog progressDialog = new ProgressDialog(PaymentActivity.this);
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
                Intent i =new Intent(PaymentActivity.this,HomeActivity.class);
                startActivity(i);
                Toast.makeText(PaymentActivity.this, "You Order is Confirmed Pleas Wait We Will Contact with you", Toast.LENGTH_SHORT).show();

            }
        });
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changed.setImageResource(R.drawable.aa);
            }
        });
        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changed.setImageResource(R.drawable.oo);
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changed.setImageResource(R.drawable.pp);
            }
        });
    }
}