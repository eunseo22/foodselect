package com.example.foodselect_made;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Fragment_Home extends Fragment implements View.OnClickListener{

    private Fragment firstFragment;

    public static Fragment_Home newInstance(){
        return new Fragment_Home();
    }
    Fragment_RandomStart fragment_random_start;
    Fragment_RandomSingle fragment_randomsingle;
    Fragment_RandomMore_1 fragment_randommore_1;
    Fragment_RandomMore_2 fragment_randommore_2;
    Fragment_Random_1 fragment_random_1;
    Fragment_Random_2 fragment_random_2;
    Fragment_SingleLevel fragment_singleLevel;
    Fragment_Recommend fragment_recommend;
    Fragment_Map fragment_map;
    Fragment_QR_1 fragment_qr_1;
    Fragment_QR_2_Make fragment_qr_2_make;
    Fragment_QR_2_Find fragment_qr_2_find;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        fragment_randomsingle = new Fragment_RandomSingle();
        fragment_random_start = new Fragment_RandomStart();
        fragment_randommore_1 = new Fragment_RandomMore_1();
        fragment_randommore_2 = new Fragment_RandomMore_2();
        fragment_random_1 = new Fragment_Random_1();
        fragment_random_2 = new Fragment_Random_2();
        fragment_singleLevel = new Fragment_SingleLevel();
        fragment_recommend = new Fragment_Recommend();
        fragment_map = new Fragment_Map();
        fragment_qr_1 = new Fragment_QR_1();
        fragment_qr_2_make = new Fragment_QR_2_Make();
        fragment_qr_2_find = new Fragment_QR_2_Find();

        firstFragment = new Fragment_RandomStart();
        setDefaultFragment();
    }

    public void setDefaultFragment(){
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.frame_home, firstFragment);
        transaction.commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_home, container, false);

        Button btn_random, btn_list;
        btn_random = (Button) fv.findViewById(R.id.btn_random);
        btn_random.setOnClickListener(this);
        btn_list = (Button) fv.findViewById(R.id.btn_list);
        btn_list.setOnClickListener(this);
        return fv;
    }

    @Override
    public void onClick(View view){
        Fragment fg;
        switch (view.getId()){
            case R.id.btn_random:
                fg = Fragment_RandomStart.newInstance();
                setChildFragment(fg);
                break;
            case R.id.btn_list:
                fg = Fragment_List.newInstance();
                setChildFragment(fg);
                break;
        }
    }

    private void setChildFragment(Fragment child){
        FragmentTransaction childFt = getChildFragmentManager().beginTransaction();

        if (!child.isAdded()){
            childFt.replace(R.id.frame_home, child);
            childFt.commit();
        }
    }

    public void onFragmentChange(int index){
        if(index == 0)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_random_start).commit();
        else if(index == 1)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_randomsingle).commit();
        else if(index == 2)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_randommore_1).commit();
        else if(index == 3)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_randommore_2).commit();
        else if(index == 4)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_random_1).commit();
        else if(index == 5)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_random_2).commit();
        else if(index == 6)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_singleLevel).commit();
        else if(index == 7)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_recommend).commit();
        else if(index == 8)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_map).commit();
        else if(index == 9)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_qr_1).commit();
        else if(index == 10)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_qr_2_make).commit();
        else if(index == 11)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_home, fragment_qr_2_find).commit();
    }
}
