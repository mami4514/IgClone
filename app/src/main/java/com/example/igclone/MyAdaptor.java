package com.example.igclone;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.Myholder> {

    private ArrayList<Fish> fish;

    public MyAdaptor(ArrayList<Fish> fish) {

        this.fish=fish;

    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);


        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.name.setText(fish.get(position).getName());
        holder.typeOf.setText(fish.get(position).getTypeOf());
        holder.logo.setImageResource(fish.get(position).getLogo());

    }

    @Override
    public int getItemCount() {

        return fish.size();
    }

    public class Myholder extends RecyclerView.ViewHolder{

        TextView name,typeOf;
        ImageView logo;


        public Myholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            typeOf=itemView.findViewById(R.id.description);
            logo=itemView.findViewById(R.id.photo);
        }
    }



}
