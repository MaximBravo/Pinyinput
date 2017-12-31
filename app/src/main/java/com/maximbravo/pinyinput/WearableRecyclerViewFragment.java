package com.maximbravo.pinyinput;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maxim Bravo on 12/29/2017.
 */

@SuppressLint("ValidFragment")
public class WearableRecyclerViewFragment extends Fragment {

    OnLookingListener mCallback;
    private WearableRecyclerView mRecyclerView;
    private String[] parts;
    private int gravity;

    public WearableRecyclerViewFragment(){};
    public WearableRecyclerViewFragment(String[] parts, int gravity) {
        this.parts = parts;
        this.gravity = gravity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.recycler_list, container, false);
        mRecyclerView = rootView.findViewById(R.id.wearable_recycler_view);
        boolean enableCallback = gravity == Gravity.RIGHT;
        LinearLayoutManager layoutManager = new MyWearableLinearLayoutManager(inflater.getContext(), enableCallback);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new WearableListAdapter(inflater.getContext(), parts, gravity));
        SnapHelper snapHelper = new WearableSnapHelper();
        snapHelper.attachToRecyclerView(mRecyclerView);

        //layoutManager.findFirstCompletelyVisibleItemPosition();
        return rootView;
    }


}
