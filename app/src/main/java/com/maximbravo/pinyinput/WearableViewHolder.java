package com.maximbravo.pinyinput;

import android.support.wear.widget.WearableRecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Maxim Bravo on 12/29/2017.
 */

class WearableViewHolder extends WearableRecyclerView.ViewHolder {

    private TextView textView;

    public WearableViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.text);
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
