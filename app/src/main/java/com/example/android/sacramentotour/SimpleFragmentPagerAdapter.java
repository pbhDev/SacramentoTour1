package com.example.android.sacramentotour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Sightseeing();
        } else if (position == 1){
            return new Businesses();
        } else {
            return new LocalEvents();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Sightseeing";
            case 1:
                return "Places";
            case 2:
                return "Events";
            default:
                return null;

        }

    }
}
