package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Fragment_QR_1 extends Fragment {

    public static Fragment_QR_1 newInstance(){
        return new Fragment_QR_1();
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
        View fv = inflater.inflate(R.layout.fragment_qr_1, container, false);

        Button btn_qr_2_make = fv.findViewById(R.id.btn_qr_2_make);
        btn_qr_2_make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(10);
            }
        });
        Button btn_qr_2_find = fv.findViewById(R.id.btn_qr_2_find);
        btn_qr_2_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(11);
            }
        });
        return fv;
    }
}
