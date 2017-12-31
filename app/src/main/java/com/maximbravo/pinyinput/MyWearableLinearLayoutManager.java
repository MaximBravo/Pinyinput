package com.maximbravo.pinyinput;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.wear.widget.WearableLinearLayoutManager;

/**
 * Created by Maxim Bravo on 12/30/2017.
 */

class MyWearableLinearLayoutManager extends WearableLinearLayoutManager {
    private final OnLookingListener mCallback;
    private boolean enableCallback;

    public MyWearableLinearLayoutManager(Context context, boolean enableCallback) {
        super(context);
        mCallback = (OnLookingListener) context;
        this.enableCallback = enableCallback;
    }

    @Override
    public int findFirstVisibleItemPosition() {
        int position = super.findFirstVisibleItemPosition();
        if (enableCallback) {
            mCallback.onLooking(position);
        }
        return position;
    }
}
