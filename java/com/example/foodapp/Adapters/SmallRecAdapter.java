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


import com.example.foodapp.BigRecDetailsActivity;
import com.example.foodapp.ItemDetailsActivity;
import com.example.foodapp.Model.LargeRecModel;
import com.example.foodapp.Model.SmallRecModel;
import com.smarteist.hupfood.R;

import java.util.ArrayList;

public class SmallRecAdapter extends RecyclerView.Adapter<SmallRecAdapter.Viewholder> {
    private Context context;
    private ArrayList<SmallRecModel> smallRecModelArrayList;

    public SmallRecAdapter(Context context, ArrayList<SmallRecModel> smallRecModelArrayList) {
        this.context = context;
        this.smallRecModelArrayList = smallRecModelArrayList;
    }

    @NonNull
    @Override
    public SmallRecAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.small_rec,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SmallRecAdapter.Viewholder holder, int position) {
        SmallRecModel smallRecModel = smallRecModelArrayList.get(position);
        holder.item_image.setImageResource(smallRecModel.getItem_image());
        holder.item_name.setText(smallRecModel.getItem_name());
        holder.item_des.setText(smallRecModel.getItem_des());
        holder.item_price.setText(smallRecModel.getItem_price());
        holder.item_rate.setText(smallRecModel.getItem_rate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, ItemDetailsActivity.class);
                i.putExtra("title1", smallRecModelArrayList.get(position).getItem_name());
                i.putExtra("image1", smallRecModelArrayList.get(position).getItem_image());
                i.putExtra("des1",smallRecModelArrayList.get(position).getItem_des());
                i.putExtra("rate1",smallRecModelArrayList.get(position).getItem_rate());
                i.putExtra("price1",smallRecModelArrayList.get(position).getItem_price());

                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return smallRecModelArrayList.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView item_image;
        private TextView item_name,item_des ,item_price ,item_rate;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            item_image=itemView.findViewById(R.id.item_img);
            item_name=itemView.findViewById(R.id.item_title);
            item_price=itemView.findViewById(R.id.item_price);
            item_des=itemView.findViewById(R.id.item_des);
            item_rate=itemView.findViewById(R.id.item_rate);
        }
    }
}
