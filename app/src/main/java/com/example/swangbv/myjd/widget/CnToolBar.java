package com.example.swangbv.myjd.widget;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.swangbv.myjd.R;

/**
 * Created by swangbv on 12/6/2015.
 */
public class CnToolBar extends Toolbar{

    private LayoutInflater mInflater;

    TextView tv1;

    public CnToolBar(Context context) {
        this(context, null);
    }

    public CnToolBar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CnToolBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();

    }

    private void initView(){
        View mView = mInflater.inflate(R.layout.toolbar,null);
        tv1 = (TextView)mView.findViewById(R.id.tv1);

        LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL);
        addView(mView,lp);
    }
}
