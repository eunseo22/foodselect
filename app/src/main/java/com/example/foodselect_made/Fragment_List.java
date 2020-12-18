package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;

public class Fragment_List extends Fragment {

    public static Fragment_List newInstance(){
        return new Fragment_List();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View fv = inflater.inflate(R.layout.fragment_list, container, false);

        final CheckBox cb_list_rice = (CheckBox)fv.findViewById(R.id.cb_list_rice);
        final CheckBox cb_list_noodle = (CheckBox)fv.findViewById(R.id.cb_list_noodle);
        final CheckBox cb_list_snack = (CheckBox)fv.findViewById(R.id.cb_list_snack);
        final CheckBox cb_list_meat = (CheckBox)fv.findViewById(R.id.cb_list_meat);
        final CheckBox cb_list_seafood = (CheckBox)fv.findViewById(R.id.cb_list_seafood);
        final CheckBox cb_list_fastfood = (CheckBox)fv.findViewById(R.id.cb_list_fastfood);

        Button btn_list_adapt = (Button)fv.findViewById(R.id.btn_list_adapt);
        btn_list_adapt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb_list_rice.isChecked() == true){
                    
                }
            }
        });

        return fv;
    }
}
