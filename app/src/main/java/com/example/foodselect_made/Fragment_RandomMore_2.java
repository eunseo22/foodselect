package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Fragment_RandomMore_2 extends Fragment {

    public static Fragment_RandomMore_2 newInstance(){
        return new Fragment_RandomMore_2();
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
        View fv = inflater.inflate(R.layout.fragment_randommore_2, container, false);

        Button btn_meal = fv.findViewById(R.id.btn_meal);
        btn_meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(4);
            }
        });

        Button btn_drink = fv.findViewById(R.id.btn_drink);
        btn_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(4);
            }
        });

        Button btn_md = fv.findViewById(R.id.btn_md);
        btn_md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(4);
            }
        });
        return fv;
    }
}
