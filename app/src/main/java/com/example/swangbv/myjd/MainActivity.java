package com.example.swangbv.myjd;

import android.media.Image;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.swangbv.myjd.bean.Tab;
import com.example.swangbv.myjd.fragment.CouponFragment;
import com.example.swangbv.myjd.fragment.HomeFragment;
import com.example.swangbv.myjd.fragment.NewsFragment;
import com.example.swangbv.myjd.fragment.RedempFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private FragmentTabHost mTabHost;
    private LayoutInflater mInflater;
    private List<Tab> mTabs = new ArrayList<>(4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initToolbar();
        initTab();

    }

    //TODO: Init Tool Bar
    private void initToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void initTab(){
        Tab home = new Tab(HomeFragment.class,R.string.home,R.drawable.selector_icon_home);
        Tab coupon = new Tab(CouponFragment.class,R.string.coupon,R.drawable.selector_icon_coupon);
        Tab redemp = new Tab(RedempFragment.class,R.string.redemp,R.drawable.selector_icon_redemp);
        Tab news = new Tab(NewsFragment.class,R.string.news,R.drawable.selector_icon_news);
        mTabs.add(home);
        mTabs.add(coupon);
        mTabs.add(redemp);
        mTabs.add(news);

        mInflater = getLayoutInflater().from(this);
        mTabHost = (FragmentTabHost)this.findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        for (Tab tab: mTabs){
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicator(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(),null);
        }
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mTabHost.setCurrentTab(0);
    }

    private View buildIndicator(Tab tab){
        View view = mInflater.inflate(R.layout.tab_indicator,null);
        ImageView img = (ImageView) view.findViewById(R.id.icon_tab);
//        TextView text = (TextView) view.findViewById(R.id.txt_tab);
        img.setBackgroundResource(tab.getIcon());
//        text.setText(tab.getTitle());
        return view;
    }
}
