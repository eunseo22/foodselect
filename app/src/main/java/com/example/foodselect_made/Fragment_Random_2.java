package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;

public class Fragment_Random_2 extends Fragment {

    public static Fragment_Random_2 newInstance(){
        return new Fragment_Random_2();
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
        View fv = inflater.inflate(R.layout.fragment_random_2, container, false);

        final CheckBox cb_random_rice = (CheckBox)fv.findViewById(R.id.cb_random_rice);
        final CheckBox cb_random_noodle = (CheckBox)fv.findViewById(R.id.cb_random_noodle);
        final CheckBox cb_random_snack = (CheckBox)fv.findViewById(R.id.cb_random_snack);
        final CheckBox cb_random_meat = (CheckBox)fv.findViewById(R.id.cb_random_meat);
        final CheckBox cb_random_seafood = (CheckBox)fv.findViewById(R.id.cb_random_seafood);
        final CheckBox cb_random_soup = (CheckBox)fv.findViewById(R.id.cb_random_soup);
        final CheckBox cb_random_fastfood = (CheckBox)fv.findViewById(R.id.cb_random_fastfood);

        Button btn_next_random2 = fv.findViewById(R.id.btn_next_random2);
        btn_next_random2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb_random_rice.isChecked() == true){

                }
                fragment_home.onFragmentChange(7);
            }
        });
        return fv;
    }
}
