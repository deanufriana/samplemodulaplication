package com.intala.intalalatihan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.intala.intalalatihan.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class KuningFragment extends Fragment {


    public KuningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kuning, container, false);
    }

}
