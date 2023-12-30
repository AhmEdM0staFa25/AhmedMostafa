package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.smarteist.hupfood.R;

public class BigRecDetailsActivity extends AppCompatActivity {
    ImageView item_img;
    TextView title,rate,pricee,des;
    int i_img,i_title,i_rate,i_price,i_des;
    private RadioGroup radioGroup;
    public Uri mCurrentCartUri;
    boolean hasAllRequiredValues = false;
    Button addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_rec_details);
        item_img=findViewById(R.id.item_img);
        title=findViewById(R.id.item_title);
        rate=findViewById(R.id.item_rate);
        pricee=findViewById(R.id.item_price);
        des=findViewById(R.id.item_des);
        Intent intent = getIntent();
        i_img = intent.getIntExtra("image",R.drawable.burger);
        i_title = intent.getIntExtra("type1",R.string.fast);
        i_des = intent.getIntExtra("title",R.string.fast);
        i_price = intent.getIntExtra("price",R.string.fast);
        i_rate = intent.getIntExtra("rate",R.string.fast);

        item_img.setImageResource(i_img);
        title.setText(i_title);
        des.setText(i_des);
        pricee.setText(i_price);
        rate.setText(i_rate);


    }
}