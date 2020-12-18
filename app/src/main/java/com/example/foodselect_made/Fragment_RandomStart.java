package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragment_RandomStart extends Fragment {

    public static Fragment_RandomStart newInstance(){
        return new Fragment_RandomStart();
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
        View fv = (View) inflater.inflate(R.layout.fragment_randomstart, container, false);

        Button btn_single = fv.findViewById(R.id.btn_single);
        btn_single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(4);
            }
        });

        Button btn_group = fv.findViewById(R.id.btn_group);
        btn_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(2);
            }
        });

        Button btn_more = fv.findViewById(R.id.btn_more);
        btn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(2);
            }
        });
        return fv;
    }


}
