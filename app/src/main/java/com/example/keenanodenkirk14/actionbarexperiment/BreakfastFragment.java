package com.example.keenanodenkirk14.actionbarexperiment;

/**
 * Created by keenanodenkirk14 on 3/19/2018.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BreakfastFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_breakfast,container,false);
    }
}
