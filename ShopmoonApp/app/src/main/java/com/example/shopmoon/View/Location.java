package com.example.shopmoon.View;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.shopmoon.R;

public class Location extends Fragment {
    SharedPreferences luutru;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_location,container,false);
        return view;
    }
    //xử lý bên trong
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        luutru= getActivity().getSharedPreferences("savefile", Context.MODE_PRIVATE);
        Toast.makeText(getContext(),"loi"+luutru.getString("us","chua co gi"),Toast.LENGTH_SHORT).show();
    }
}
