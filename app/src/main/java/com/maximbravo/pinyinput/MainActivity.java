package com.maximbravo.pinyinput;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends WearableActivity implements OnLookingListener {


    private WearableRecyclerViewFragment fragmentInitial;
    private WearableRecyclerViewFragment fragmentFinal;
    private String[] initials =
            {"b", "p", "m", "f", "d",
            "t", "n", "l", "g", "k",
            "h", "j", "q", "x", "z",
            "c", "s", "zh", "ch", "sh", "r"};
    private String[] finals =
            {"a", "o", "e", "i", "u",
            "ǖ", "ai", "ei", "ui", "ao",
            "ou", "iu", "ie", "ǖe", "er",
            "an", "en", "in", "un", "ün",
            "ang", "eng", "ing", "ong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.initial_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            fragmentInitial = new WearableRecyclerViewFragment(initials, Gravity.RIGHT);

            getFragmentManager().beginTransaction()
                    .add(R.id.initial_container, fragmentInitial).commit();
        }
        if (findViewById(R.id.final_container) != null) {
            if (savedInstanceState != null) {
                return;
            }

            fragmentFinal = new WearableRecyclerViewFragment(finals, Gravity.LEFT);

            getFragmentManager().beginTransaction()
                    .add(R.id.final_container, fragmentFinal).commit();
        }
    }


    @Override
    public void onLooking(int current) {
        if(current != -1) {
            Log.e("LOLOLOLOLOLOLOLOLO", initials[current]);
        }//Toast.makeText(this, ""+current, Toast.LENGTH_SHORT).show();
    }
}
