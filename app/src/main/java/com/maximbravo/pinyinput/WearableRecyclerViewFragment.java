package com.maximbravo.pinyinput;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.SnapHelper;
import android.support.wear.widget.WearableLinearLayoutManager;
import android.support.wear.widget.WearableRecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maxim Bravo on 12/29/2017.
 */

@SuppressLint("ValidFragment")
public class WearableRecyclerViewFragment extends Fragment {

    private WearableRecyclerView mRecyclerView;
    private String[] parts;
    private int gravity;

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
        mRecyclerView.setLayoutManager(new WearableLinearLayoutManager(inflater.getContext()));
        mRecyclerView.setAdapter(new WearableListAdapter(inflater.getContext(), parts, gravity));

//        SnapHelper snapHelper = new LinearSnapHelper();
//        snapHelper.attachToRecyclerView(mRecyclerView);
        return rootView;
    }
}
