package com.antwickler.thearokaya;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ElementFragment extends Fragment {

    public int Element_ID = 0;
    String[] monthFire = {"มกราคม", "กุมภาพันธ์", "มีนาคม"};    // Element_ID = 4
    String[] monthEarth = {"ตุลาคม", "พฤศจิกายน", "ธันวาคม"};  // Element_ID = 3
    String[] monthWater = {"กรกฎาคม", "สิงหาคม", "กันยายน"};  // Element_ID = 2
    String[] monthWind = {"เมษายน", "พฤษภาคม", "มิถุนายน"};   // Element_ID = 1

    public ElementFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_element, container, false);

        Button dialog = (Button) rootView.findViewById(R.id.bt_check);
        dialog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

        return rootView;
    }
}
