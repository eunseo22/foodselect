package com.example.foodselect_made;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;


public class Fragment_QR_3 extends Fragment {
    
    public static Fragment_QR_3 newInstance(){
        return new Fragment_QR_3();
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
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_qr_3, container, false);

        final CheckBox cb_qr_rice = (CheckBox)fv.findViewById(R.id.cb_qr_rice);
        final CheckBox cb_qr_noodle = (CheckBox)fv.findViewById(R.id.cb_qr_noodle);
        final CheckBox cb_qr_snack = (CheckBox)fv.findViewById(R.id.cb_qr_snack);
        final CheckBox cb_qr_meat = (CheckBox)fv.findViewById(R.id.cb_qr_meat);
        final CheckBox cb_qr_seafood = (CheckBox)fv.findViewById(R.id.cb_qr_seafood);
        final CheckBox cb_qr_fastfood = (CheckBox)fv.findViewById(R.id.cb_qr_fastfood);

        Button btn_qr_4 = (Button)fv.findViewById(R.id.btn_qr_4);
        btn_qr_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb_qr_rice.isChecked() == true){

                }
            }
        });

        return fv;
    }
}
