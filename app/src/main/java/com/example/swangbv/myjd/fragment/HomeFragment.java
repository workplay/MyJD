package com.example.swangbv.myjd.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.swangbv.myjd.R;

/**
 * Created by swangbv on 12/5/2015.
 */
public class HomeFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        TextView tv1 = (TextView) view.findViewById(R.id.tv1);
        tv1.setText("Homepage");
        return view;
    }
}
