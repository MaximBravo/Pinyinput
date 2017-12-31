package com.maximbravo.pinyinput;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.wear.widget.WearableRecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maxim Bravo on 12/29/2017.
 */

public class WearableListAdapter extends WearableRecyclerView.Adapter {
    private final OnLookingListener mCallback;
    private Context context;
    private String[] parts;
    private int gravity;

    public WearableListAdapter(Context context, String[] parts, int gravity) {
        this.context = context;
        this.parts = parts;
        this.gravity = gravity;
        mCallback = (OnLookingListener) context;
    }

    @Override
    public WearableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        WearableViewHolder viewHolder = new WearableViewHolder(view, gravity);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(WearableRecyclerView.ViewHolder h, int position) {
        WearableViewHolder holder = (WearableViewHolder) h;
        holder.setText(parts[position]);
//        if (gravity == Gravity.RIGHT) {
//            if (position == parts.length-1 || position == 0) {
//                mCallback.onLooking(parts[position]);
//            } else {
//                mCallback.onLooking(parts[position-1]);
//            }
//        }
    }

    @Override
    public int getItemCount() {
        return parts.length;
    }
}
