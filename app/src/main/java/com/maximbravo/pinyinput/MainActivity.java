package com.maximbravo.pinyinput;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

public class MainActivity extends WearableActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] begginings =
                {"b", "p", "m", "f", "d",
                 "t", "n", "l", "g", "k",
                 "h", "j", "q", "x", "z",
                 "c", "s", "zh", "ch", "sh", "r"};




        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            WearableRecyclerViewFragment fragment = new WearableRecyclerViewFragment(begginings);

            getFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment).commit();
        }
    }
}
