package com.example.foodapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.DominosActivity;
import com.example.foodapp.HomeActivity;
import com.example.foodapp.McActivity;
import com.example.foodapp.KintakiActivity;
import com.example.foodapp.Model.LargeRecModel;
import com.example.foodapp.PizzaHutActivity;
import com.example.foodapp.StarbucksActivity;
import com.smarteist.hupfood.R;

import java.util.ArrayList;

public class LargeRecAdapter extends RecyclerView.Adapter<LargeRecAdapter.Viewholder> {
    private Context context;
    private ArrayList<LargeRecModel> largeRecArrayList;


    public LargeRecAdapter(Context context, ArrayList<LargeRecModel> largeRecArrayList) {
        this.context = context;
        this.largeRecArrayList = largeRecArrayList;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.large_rec,parent,false);

        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        LargeRecModel largeRecModel = largeRecArrayList.get(position);
        holder.item_image.setImageResource(largeRecModel.getItem_image());
        holder.item_name.setText(largeRecModel.getItem_name());
        holder.item_del.setText(largeRecModel.getItem_del());
        holder.item_del_time.setText(largeRecModel.getItem_del_time());
        holder.item_type1.setText(largeRecModel.getItem_type1());
        holder.item_type2.setText(largeRecModel.getItem_type2());
        holder.item_type3.setText(largeRecModel.getItem_type3());
        holder.item_rate.setText(largeRecModel.getItem_rate());
        switch (position) {
            case 0:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, KintakiActivity.class);
                    context.startActivity(intent);
                });
                break;

            case 1:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, McActivity.class);
                    context.startActivity(intent);
                });
                break;

            case 2:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, DominosActivity.class);
                    context.startActivity(intent);
                });
                break;
            case 3:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, PizzaHutActivity.class);
                    context.startActivity(intent);
                });
                break;
            case 4:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, StarbucksActivity.class);
                    context.startActivity(intent);
                });
                break;
            default:
                holder.itemView.setOnClickListener(v -> {
                    Intent intent = new Intent(context, HomeActivity.class);
                    context.startActivity(intent);
                });
        }

    }

    @Override
    public int getItemCount() {
        return  largeRecArrayList.size();
    }
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView item_image;
        private TextView item_name,item_del,item_del_time,item_type1,item_type2,item_type3,item_rate;

    public Viewholder(@NonNull View itemView) {
        super(itemView);
        item_image = itemView.findViewById(R.id.item_img);
        item_name=itemView.findViewById(R.id.item_title);
        item_del=itemView.findViewById(R.id.delivery_price);
        item_del_time=itemView.findViewById(R.id.delivery_time);
        item_type1 = itemView.findViewById(R.id.chip1);
        item_type2 = itemView.findViewById(R.id.chip2);
        item_type3 = itemView.findViewById(R.id.chip3);
        item_rate = itemView.findViewById(R.id.item_rate);



    }
}}





