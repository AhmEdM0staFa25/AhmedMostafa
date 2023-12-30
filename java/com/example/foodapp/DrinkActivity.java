package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.foodapp.Adapters.BigRecAdapter;
import com.example.foodapp.Adapters.LargeRecAdapter;
import com.example.foodapp.Model.BigRecModel;
import com.example.foodapp.Model.LargeRecModel;
import com.smarteist.hupfood.R;

import java.util.ArrayList;

public class DrinkActivity extends AppCompatActivity {
    ImageView back;
    RecyclerView largeRec;
    private ArrayList<BigRecModel> largeRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


        largeRec =findViewById(R.id.rec);
        largeRecModelArrayList=new ArrayList<>();
        back=findViewById(R.id.back_btn3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        largeRecModelArrayList.add(new BigRecModel(R.drawable.americano,R.string.drink2,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.late,R.string.drink1,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.chocolate,R.string.drink2,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.capuccino,R.string.drink1,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.latte,R.string.drink2,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.chocolate,R.string.drink1,R.string.free,R.string.time1,R.string.drink,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
    }



}