package com.eucario.padro.mitareaapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment implements View.OnClickListener {
    Button button;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.btn);

    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
    @Nullable
//    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onClick(View v) {
//        Fragment fragment = null;
//        switch (v.getId()) {
//            case R.id.nav_info:
//                fragment = new HomeFragment();
//                break;
//        }
//        getActivity().getSupportFragmentManager().beginTransaction()
//                .replace(R.id.content_frame, fragment)
//                .addToBackStack(null)
//                .commit();
    }
}

