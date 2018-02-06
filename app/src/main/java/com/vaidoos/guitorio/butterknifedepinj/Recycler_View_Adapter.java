package com.vaidoos.guitorio.butterknifedepinj;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by Guitorio on 2/6/2018.
 */

public class Recycler_View_Adapter extends RecyclerView.Adapter<View_Holder>{

    List<Data> list = Collections.emptyList();
    Context context;

    public Recycler_View_Adapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override

    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        View_Holder holder = new View_Holder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {

        holder.title.setText(list.get(position).title);
        holder.imageView.setImageResource(list.get(position).imageId);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    /*@Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }*/
}
