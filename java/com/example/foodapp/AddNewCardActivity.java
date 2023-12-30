package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.hupfood.R;

public class AddNewCardActivity extends AppCompatActivity {
Button btn;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_card);
        btn=findViewById(R.id.login_btn);
        back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddNewCardActivity.this, "New Payment Card Is Added", Toast.LENGTH_SHORT).show();
                Intent i =new Intent(AddNewCardActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });
    }
}