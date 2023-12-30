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

public class DonutActivity extends AppCompatActivity {
    ImageView back;
    RecyclerView largeRec;
    private ArrayList<BigRecModel> largeRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut);

        largeRec =findViewById(R.id.rec);
        back=findViewById(R.id.back_btn6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do2,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do3,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do4,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do5,R.string.d1,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.do1,R.string.d2,R.string.free,R.string.time1,R.string.d,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
    }
}