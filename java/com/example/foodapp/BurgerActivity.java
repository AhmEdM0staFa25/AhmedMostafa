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

public class BurgerActivity extends AppCompatActivity {
    ImageView back;
    RecyclerView largeRec;
    private ArrayList<BigRecModel> largeRecModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        largeRec =findViewById(R.id.rec);
        back=findViewById(R.id.back_btn4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new BigRecModel(R.drawable.b1,R.string.b1,R.string.free,R.string.time2,R.string.burger,R.string.fast,R.string.rate2,R.string.price1));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.b2,R.string.b2,R.string.price7,R.string.time2,R.string.burger,R.string.fast,R.string.rate1,R.string.price2));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.b3,R.string.b3,R.string.free,R.string.time2,R.string.burger,R.string.fast,R.string.rate4,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.b4,R.string.b1,R.string.price7,R.string.time3,R.string.burger,R.string.fast,R.string.rate3,R.string.price4));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.mc_burger,R.string.mc1,R.string.price6,R.string.time3,R.string.chicken,R.string.fast,R.string.rate1,R.string.price5));
        largeRecModelArrayList.add(new BigRecModel(R.drawable.mc_chick,R.string.mc2,R.string.free,R.string.time2,R.string.chicken,R.string.fast,R.string.rate1,R.string.price3));

        BigRecAdapter adapte =new BigRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
    }
}