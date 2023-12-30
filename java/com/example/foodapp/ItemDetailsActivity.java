package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LoaderManager;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.smarteist.hupfood.CartActivity;
import com.smarteist.hupfood.R;

public class ItemDetailsActivity extends AppCompatActivity  {
    ImageView item_img,back,like;
    Button add,sub;
    TextView title,rate,pricee,des,quan;
    int i_img,i_title,i_rate,i_price,i_des;
    private RadioGroup radioGroup;
    public Uri mCurrentCartUri;
    boolean hasAllRequiredValues = false;
    Button addToCart;
    int quantity=1;
    int p=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        radioGroup = findViewById(R.id.radioGroup);
        like=findViewById(R.id.like);
        item_img=findViewById(R.id.item_img);
        title=findViewById(R.id.item_title);
        rate=findViewById(R.id.item_rate);
        pricee=findViewById(R.id.item_price);
        des=findViewById(R.id.item_des);
        add=findViewById(R.id.add_icon);
        sub=findViewById(R.id.sub_icon);
        quan=findViewById(R.id.quantity);
        back=findViewById(R.id.back_btn);
        addToCart=findViewById(R.id.add_to_cart_btn);
        Intent intent = getIntent();
        i_img = intent.getIntExtra("image1",R.drawable.burger);
        i_title = intent.getIntExtra("title1",R.string.fast);
        i_des = intent.getIntExtra("des1",R.string.fast);
        i_price = intent.getIntExtra("price1",R.string.fast);
        i_rate = intent.getIntExtra("rate1",R.string.fast);

        item_img.setImageResource(i_img);
        title.setText(i_title);
        des.setText(i_des);
        pricee.setText(i_price);
        rate.setText(i_rate);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }

        });
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent ii=new Intent(ItemDetailsActivity.this, CartActivity.class);
                ii.putExtra("i", i_rate);
                ii.putExtra("t", i_des);
                ii.putExtra("q", quantity);
                ii.putExtra("p", i_price);

                startActivity(ii);



            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity>0){
                    quantity++;
                }
                String s=String.valueOf(quantity);
                quan.setText(s);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity>1){
                    quantity--;
                }
                String s=String.valueOf(quantity);
                quan.setText(s);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p++;
                if(p%2==0){
                like.setImageResource(R.drawable.red_heart);}
                if(p%2==1){
                    like.setImageResource(R.drawable.wite_heart);}
            }
        });
    }



}