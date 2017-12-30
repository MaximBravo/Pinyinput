package com.maximbravo.pinyinput;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.Gravity;

public class MainActivity extends WearableActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] initials =
                {"b", "p", "m", "f", "d",
                 "t", "n", "l", "g", "k",
                 "h", "j", "q", "x", "z",
                 "c", "s", "zh", "ch", "sh", "r"};
        String[] finals =
                {"a", "o", "e", "i", "u",
                 "ǖ", "ai", "ei", "ui", "ao",
                 "ou", "iu", "ie", "ǖe", "er",
                 "an", "en", "in", "un", "ün",
                 "ang", "eng", "ing", "ong"};

        if (findViewById(R.id.initial_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            WearableRecyclerViewFragment fragment = new WearableRecyclerViewFragment(initials, Gravity.RIGHT);

            getFragmentManager().beginTransaction()
                    .add(R.id.initial_container, fragment).commit();
        }
        if (findViewById(R.id.final_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            WearableRecyclerViewFragment fragment = new WearableRecyclerViewFragment(finals, Gravity.LEFT);

            getFragmentManager().beginTransaction()
                    .add(R.id.final_container, fragment).commit();
        }
    }
}
