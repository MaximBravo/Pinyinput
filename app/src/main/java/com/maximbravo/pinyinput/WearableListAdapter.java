package com.maximbravo.pinyinput;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maxim Bravo on 12/29/2017.
 */

public class WearableListAdapter extends WearableRecyclerView.Adapter {

    private Context context;
    private String[] parts;

    public WearableListAdapter(Context context, String[] parts) {
        this.context = context;
        this.parts = parts;
    }

    @Override
    public WearableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        WearableViewHolder viewHolder = new WearableViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(WearableRecyclerView.ViewHolder h, int position) {
        WearableViewHolder holder = (WearableViewHolder) h;
        holder.setText(parts[position]);
    }

    @Override
    public int getItemCount() {
        return parts.length;
    }
}
