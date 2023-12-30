package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



import com.smarteist.hupfood.R;

public class RegisterPhoneActivity extends AppCompatActivity {



    ImageView back;
    EditText edtPhoneNumber;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_phone);




        back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent i = new Intent(RegisterPhoneActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        edtPhoneNumber = findViewById(R.id.phone_field);
        send=findViewById(R.id.send_btn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterPhoneActivity.this, VefificationActivity.class);
                startActivity(i);
            }
        });
    }
}