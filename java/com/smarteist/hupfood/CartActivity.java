package com.smarteist.hupfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodapp.DeliveryActivity;

public class CartActivity extends AppCompatActivity {
    ImageView back;
    TextView image,quantity,price,des;
    Button check_out;
    int i_img,i_title,i_price,i_quan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        image=findViewById(R.id.img);
        back=findViewById(R.id.imageView);
        quantity=findViewById(R.id.quan);
        des=findViewById(R.id.des);
        price=findViewById(R.id.price);
        check_out=findViewById(R.id.button);


        Intent intent = getIntent();
        i_img = intent.getIntExtra("i",R.drawable.burger);
        i_title = intent.getIntExtra("t",R.string.fast);
        i_quan = intent.getIntExtra("q",R.string.fast);
        i_price = intent.getIntExtra("p",R.string.fast);
        String s = Integer.toString(i_quan);
back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        finish();
    }
});
        check_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CartActivity.this, DeliveryActivity.class);
                startActivity(i);
            }
        });

        image.setText(i_img);
        price.setText(i_price);
        des.setText(i_title);
        quantity.setText(s);

    }
}