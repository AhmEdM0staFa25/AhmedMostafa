package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.foodapp.Adapters.BigRecAdapter;
import com.example.foodapp.Adapters.LargeRecAdapter;
import com.example.foodapp.Model.BigRecModel;
import com.example.foodapp.Model.LargeRecModel;
import com.smarteist.hupfood.R;

import java.util.ArrayList;

public class HotdogActivity extends AppCompatActivity {
    ImageView back;
    RecyclerView largeRec;
    private ArrayList<BigRecModel> largeRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotdog);
        largeRec =findViewById(R.id.rec);
        back=findViewById(R.id.back_btn2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.hot1,R.string.hot,R.string.price7,R.string.time2,R.string.h,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.hot2,R.string.hot2,R.string.free,R.string.time3,R.string.h,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.hot3,R.string.hot3,R.string.price6,R.string.time2,R.string.h,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.hot4,R.string.hot,R.string.free,R.string.time1,R.string.h,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.hot5,R.string.hot2,R.string.price7,R.string.time2,R.string.h,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.hot6,R.string.hot3,R.string.free,R.string.time1,R.string.h,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
    }
}