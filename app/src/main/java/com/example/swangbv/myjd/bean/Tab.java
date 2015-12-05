package com.example.swangbv.myjd.bean;

/**
 * Created by swangbv on 12/5/2015.
 */
public class Tab {
    private int title;
    private int icon;
    private Class fragment;

    public Tab(Class fragment , int title, int icon ) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }




}

