package com.latest.status.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.latest.status.R;

/**
 * Created by admin on 04/06/2018.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProViewHolder>{
    private String[] data;
    public ProgrammingAdapter(String[] data)
    {
        this.data=data;
    }
    @Override
    public ProViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ProViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProViewHolder holder, int position) {
    String title=data[position];
    holder.text.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        public ProViewHolder(View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.info_text1);
        }
    }
}
