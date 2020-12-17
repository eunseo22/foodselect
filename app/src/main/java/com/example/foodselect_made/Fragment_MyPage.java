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

public class Fragment_MyPage extends Fragment implements View.OnClickListener{

    private Fragment firstFragment;

    public static Fragment_MyPage newInstance(){
        return new Fragment_MyPage();
    }
    Fragment_Like fragment_like;
    Fragment_Hate fragment_hate;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        fragment_like = new Fragment_Like();
        fragment_hate = new Fragment_Hate();

        firstFragment = new Fragment_Like();
        setDefaultFragment();
    }

    public void setDefaultFragment(){
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.frame_mypage, firstFragment);
        transaction.commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fv = inflater.inflate(R.layout.fragment_mypage, container, false);

        Button btn_mypage_like, btn_mypage_hate;
        btn_mypage_like = (Button) fv.findViewById(R.id.btn_mypage_like);
        btn_mypage_like.setOnClickListener(this);
        btn_mypage_hate = (Button) fv.findViewById(R.id.btn_mypage_hate);
        btn_mypage_hate.setOnClickListener(this);
        return fv;
    }

    @Override
    public void onClick(View view){
        Fragment fg;
        switch (view.getId()){
            case R.id.btn_mypage_like:
                fg = Fragment_Like.newInstance();
                setChildFragment(fg);
                break;
            case R.id.btn_mypage_hate:
                fg = Fragment_Hate.newInstance();
                setChildFragment(fg);
                break;
        }
    }

    private void setChildFragment(Fragment child){
        FragmentTransaction childFt = getChildFragmentManager().beginTransaction();

        if (!child.isAdded()){
            childFt.replace(R.id.frame_mypage, child);
            childFt.commit();
        }
    }

    public void onFragmentChange(int index){
        if(index == 0)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_mypage, fragment_like).commit();
        else if(index == 1)
            getChildFragmentManager().beginTransaction().replace(R.id.frame_mypage, fragment_hate).commit();
    }
}
