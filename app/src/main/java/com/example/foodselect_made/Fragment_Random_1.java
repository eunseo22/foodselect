package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Fragment_Random_1 extends Fragment {

    public static Fragment_Random_1 newInstance(){
        return new Fragment_Random_1();
    }
    Fragment_Home fragment_home;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        fragment_home = (Fragment_Home) getParentFragment();
    }

    @Override
    public void onDetach(){
        super.onDetach();
        fragment_home = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){
        View fv = inflater.inflate(R.layout.fragment_random_1, container, false);

        Button btn_hslist = fv.findViewById(R.id.btn_hslist);
        btn_hslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(5);
            }
        });

        Button btn_hsnow = fv.findViewById(R.id.btn_hsnow);
        btn_hsnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(5);
            }
        });

        Button btn_hsnot = fv.findViewById(R.id.btn_hsnot);
        btn_hsnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(5);
            }
        });
        return fv;
    }
}
