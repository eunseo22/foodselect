package com.example.foodselect_made;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment_List extends Fragment {

    public static Fragment_List newInstance(){
        return new Fragment_List();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View fv = inflater.inflate(R.layout.fragment_list, container, false);
        return fv;
    }
}
