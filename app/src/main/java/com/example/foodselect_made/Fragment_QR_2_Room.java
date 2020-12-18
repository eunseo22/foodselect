package com.example.foodselect_made;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;


public class Fragment_QR_2_Room extends Fragment {

    private ImageView iv;
    private String text;
    public static Fragment_QR_2_Room newInstance(){
        return new Fragment_QR_2_Room();
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
        View fv = inflater.inflate(R.layout.fragment_qr_2_room, container, false);

        Button btn_qr_room = fv.findViewById(R.id.btn_qrcode);
        btn_qr_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(10);
            }
        });

        Button btn_qr_3 = fv.findViewById(R.id.btn_qr_3);
        btn_qr_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(13);
            }
        });
        return fv;
    }
}
