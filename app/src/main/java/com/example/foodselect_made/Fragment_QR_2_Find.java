package com.example.foodselect_made;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.BarcodeEncoder;


public class Fragment_QR_2_Find extends Fragment {

    public static Fragment_QR_2_Find newInstance(){
        return new Fragment_QR_2_Find();
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
        View fv = inflater.inflate(R.layout.fragment_qr_2_find, container, false);

        Button btn_qr_room = fv.findViewById(R.id.btn_go_qr1);
        btn_qr_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_home.onFragmentChange(9);
            }
        });

        IntentIntegrator.forSupportFragment(this).initiateScan();
        return fv;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        IntentIntegrator integrator = new IntentIntegrator(getActivity());

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents() == null){
                Log.d("MainActivity", "Cancelled scan");
                Toast.makeText(getActivity(), "cancelled", Toast.LENGTH_LONG).show();
            } else{
                Log.d("MainActivity", "Scanned");
                Toast.makeText(getActivity(), "Scanned: " + result.getContents(), Toast.LENGTH_LONG).show();
            }
        } else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
