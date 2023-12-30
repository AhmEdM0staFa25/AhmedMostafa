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

import com.example.foodapp.Model.BigRecModel;
import com.example.foodapp.BigRecDetailsActivity;
import com.smarteist.hupfood.R;

import java.util.ArrayList;

public class BigRecAdapter extends RecyclerView.Adapter<BigRecAdapter.Viewholder>{
    private Context context;
    private ArrayList<BigRecModel> bigRecModels;

    public BigRecAdapter(Context context, ArrayList<BigRecModel> bigRecModels) {
        this.context = context;
        this.bigRecModels = bigRecModels;
    }

    @NonNull
    @Override
    public BigRecAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.big_rec,parent,false);

        return new BigRecAdapter.Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull BigRecAdapter.Viewholder holder, int position) {
        BigRecModel bigRecModel=bigRecModels.get(position);
        holder.item_image.setImageResource(bigRecModel.getItem_image());
        holder.item_title.setText(bigRecModel.getItem_title());
        holder.item_del_price.setText(bigRecModel.getItem_del_price());
        holder.item_del_time.setText(bigRecModel.getItem_del_time());
        holder.item_type1.setText(bigRecModel.getItem_type1());
        holder.item_type2.setText(bigRecModel.getItem_type2());
        holder.item_rate.setText(bigRecModel.getItem_rate());
        holder.item_price.setText(bigRecModel.getItem_price());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, BigRecDetailsActivity.class);
                i.putExtra("title", bigRecModels.get(position).getItem_title());
                i.putExtra("image", bigRecModels.get(position).getItem_image());
                i.putExtra("del_price",bigRecModels.get(position).getItem_del_price());
                i.putExtra("del_time",bigRecModels.get(position).getItem_del_time());
                i.putExtra("type1",bigRecModels.get(position).getItem_type1());
                i.putExtra("type2",bigRecModels.get(position).getItem_type2());
                i.putExtra("rate",bigRecModels.get(position).getItem_rate());
                i.putExtra("price",bigRecModels.get(position).getItem_price());

                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return bigRecModels.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView item_image;
        private TextView item_title,item_del_price,item_del_time,item_type1,item_type2,item_rate,item_price;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            item_image=itemView.findViewById(R.id.item_img);
            item_title=itemView.findViewById(R.id.item_title);
            item_del_price=itemView.findViewById(R.id.delivery_price);
            item_del_time=itemView.findViewById(R.id.delivery_time);
            item_type1=itemView.findViewById(R.id.chip1);
            item_type2=itemView.findViewById(R.id.chip2);
            item_rate=itemView.findViewById(R.id.item_rate);
            item_price=itemView.findViewById(R.id.item_price);
        }
    }
}
