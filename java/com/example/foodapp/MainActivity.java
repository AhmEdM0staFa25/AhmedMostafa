package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.hupfood.R;

public class MainActivity extends AppCompatActivity {

    int x =1;
    TextView txt1,txt2;
    ImageView nxt,imggg;
    int[] images = {R.drawable.cap1, R.drawable.cop2,R.drawable.cop3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nxt=findViewById(R.id.nxt);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x++;
                if(x==2){
                    txt1.setText(R.string.txt1_2);
                    txt2.setText(R.string.txt2_2);
                }
                if(x==3){
                    txt1.setText(R.string.txt1_3);
                    txt2.setText(R.string.txt2_3);
                }
                if(x==4){
                    Intent i = new Intent(MainActivity.this, RegisterPhoneActivity.class);
                    startActivity(i);

                }

            }
        });






}}
