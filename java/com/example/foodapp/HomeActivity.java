package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.foodapp.Adapters.LargeRecAdapter;
import com.example.foodapp.Adapters.SmallRecAdapter;
import com.example.foodapp.Model.LargeRecModel;
import com.example.foodapp.Model.SmallRecModel;
import com.google.android.material.navigation.NavigationView;
/*
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

 */
import com.smarteist.hupfood.ContactUsMainActivity;
import com.smarteist.hupfood.HelpActivity;
import com.smarteist.hupfood.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ImageView burger,donut,hotdog,pizza,drinks,filter;
    public DrawerLayout drawerLayout;
    public NavigationView navigation_menu;
    /*SliderView sliderView;*/
    int[] images = {R.drawable.meal1, R.drawable.meal2,R.drawable.memo};
    RecyclerView largeRec,smallRec;
    private ArrayList<LargeRecModel> largeRecModelArrayList;
    private ArrayList<SmallRecModel> smallRecModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        navigation_menu =(NavigationView) findViewById(R.id.nav_view);
       /* sliderView = findViewById(R.id.imageSlider);
        */
        largeRec = findViewById(R.id.large_rec1);
        smallRec = findViewById(R.id.small_rec);
        burger=findViewById(R.id.burger_icon);
        donut=findViewById(R.id.dounut_icon);
        hotdog=findViewById(R.id.hotdog_icon);
        pizza=findViewById(R.id.pizza_icon);
        drinks=findViewById(R.id.drink_icon);
        filter=findViewById(R.id.filter_icon);
        ////////////////////////////////////////////////////////////////////////////////////////////////
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, BurgerActivity.class);
                startActivity(i);
            }

        });
        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, DonutActivity.class);
                startActivity(i);
            }

        });
        hotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, HotdogActivity.class);
                startActivity(i);
            }

        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, PizzaActivity.class);
                startActivity(i);
            }

        });
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, DrinkActivity.class);
                startActivity(i);
            }

        });
        ////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////



        navigation_menu.getMenu().getItem(0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this,MyOrdersActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this,ProfileActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(2).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this,DeliveryActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this,PaymentActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(4).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this, ContactUsMainActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(6).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this, HelpActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(5).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this,ProfileActivity.class);
                startActivity(i);
                return false;
            }
        });
        navigation_menu.getMenu().getItem(7).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i =new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(i);
                return false;
            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        largeRecModelArrayList=new ArrayList<>();

        largeRecModelArrayList.add(new LargeRecModel(R.drawable.kintaki,R.string.kintaki_title,R.string.free,R.string.time3,R.string.chicken,R.string.burger,R.string.fast,R.string.rate2));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.mc_burger,R.string.mc_title,R.string.price6,R.string.time1,R.string.chicken,R.string.burger,R.string.fast,R.string.rate1));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.dominos,R.string.dominos_title,R.string.price7,R.string.time2,R.string.pizza,R.string.nulll,R.string.fast,R.string.rate4));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.pizza_hut2,R.string.hut_title,R.string.price7,R.string.time2,R.string.pizza,R.string.nulll,R.string.fast,R.string.rate3));
        largeRecModelArrayList.add(new LargeRecModel(R.drawable.late,R.string.star_title,R.string.free,R.string.time1,R.string.drink,R.string.nulll,R.string.fast,R.string.rate1));

////////////////////////////////////////////////////////////////////////////////////////////////////
        LargeRecAdapter adapte =new LargeRecAdapter(this,largeRecModelArrayList);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        largeRec.setLayoutManager(layoutManager);
        largeRec.setAdapter(adapte);
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        smallRecModelArrayList=new ArrayList<>();
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k1,R.string.kintaki_title,R.string.k1_des,R.string.price1,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k2,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.mc_chick,R.string.mc_title,R.string.mc1,R.string.price4,R.string.rate4));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.latte,R.string.star_title,R.string.drink1,R.string.price5,R.string.rate3));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.k5,R.string.kintaki_title,R.string.k2_des,R.string.price2,R.string.rate2));
        smallRecModelArrayList.add(new SmallRecModel(R.drawable.dominos,R.string.dominos_title,R.string.hut1,R.string.price3,R.string.rate1));
////////////////////////////////////////////////////////////////////////////////////////////////////
        SmallRecAdapter sadapte =new SmallRecAdapter(this,smallRecModelArrayList);
        LinearLayoutManager layoutManager2= new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        smallRec.setLayoutManager(layoutManager2);
        smallRec.setAdapter(sadapte);
    }
}